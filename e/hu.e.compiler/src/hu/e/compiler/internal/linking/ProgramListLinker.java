/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ReferableValue;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.ScriptStep;
import hu.e.compiler.list.SequenceStep;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author balazs.grill
 *
 */
public class ProgramListLinker {

	private final ProgramList plist;
	
	public ProgramListLinker(ProgramList plist) {
		this.plist = plist;
	}
	
	private class LinkingContext{
		
		public final Map<MemoryAssignment, Integer> addresses;
		public final MemoryManager memman;
		public final ScriptEngine engine;
		
		public LinkingContext(
				MemoryManager memman, ScriptEngine engine) {
			super();
			this.addresses = new LinkedHashMap<MemoryAssignment, Integer>();
			this.memman = memman;
			this.engine = engine;
		}
		
	}
	
	public byte[] link(MemoryManager memman, int startAddr){
		
		/*
		 * Create context
		 */
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		LinkingContext context = new LinkingContext(memman, engine);
		
		Map<LabelStep, Integer> labels = new HashMap<LabelStep, Integer>();
		
		List<ProgramStep> allsteps = flatten(context, plist.getStep());
		List<InstructionStep> instructions = new ArrayList<InstructionStep>();
		int progsize = 0;
		
		for(ProgramStep ps : allsteps){
			if (ps instanceof InstructionStep){
				instructions.add((InstructionStep)ps);
				int w = ((InstructionStep) ps).getWidth();
				progsize += (w/8) + (((w%8)==0)?0:1); 
			}
			if (ps instanceof LabelStep){
				labels.put((LabelStep)ps, instructions.size()+startAddr);
			}
		}
		
		//Produce instruction bytes
		byte[] data = new byte[progsize];
		int i = 0;
		for(InstructionStep s : instructions){
			int w = s.getWidth();
			int wordbytes = (w/8) + (((w%8)==0)?0:1); 
			int d = 0;
			d = (int) s.getCode();
			for(Reference lr : s.getRefs()){
				int v = -1;
				
				ReferableValue rv = lr.getValue();
				if (rv instanceof LabelStep){
					v = labels.get(rv);
				}
				if (rv instanceof MemoryAssignment){
					v = context.addresses.get(rv);
				}
				
				d += InstructionWordInstance.getItemValue(v, lr.getShift(), lr.getStart(), lr.getSize());
			}
			for(int j=0;j<wordbytes;j++){
				int b = (int)(d&0xFF);
				d = d>>8;
			//Reversed byte order (for now, it seems that 
			// forward byte order should be used)
			//int index = i + (wordbytes-1-j);
			int index = i + j;
			data[index] = HexFileResource.intToByte(b);
			}
			i+=wordbytes;
			
		}
		
		return data;
	}
	
	private List<ProgramStep> flatten(LinkingContext context, ProgramStep step){
		List<ProgramStep> steps = new ArrayList<ProgramStep>();
		
		String condition = step.getCondition();
		boolean ok = true;
		if (condition != null && !condition.isEmpty()){
			try {
				Object o = context.engine.eval(condition);
				ok = false;
				if (o instanceof Boolean){
					ok = ((Boolean) o).booleanValue();
				}	
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (ok){
			if (step instanceof ScriptStep){
				try {
					context.engine.eval(((ScriptStep) step).getExecute());
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (step instanceof InstructionStep){
				steps.add(step);
			}
			if (step instanceof LabelStep){
				steps.add(step);
			}
			if (step instanceof SequenceStep){
				SequenceStep sequence = (SequenceStep)step;
				Set<Integer> as = new HashSet<Integer>();
				Map<String, Object> oldvalues = new HashMap<String, Object>();
				Set<String> variables = new HashSet<String>();
				for(MemoryAssignment ma : sequence.getVariables()){
					int addr = context.memman.allocate(ma.getSize());
					context.addresses.put(ma, addr);
					as.add(addr);
					
					/*
					 * Let variable to be accessed from scripts
					 */
					String vkey = ma.getName();
					Object v = context.engine.get(vkey);
					if (v != null){
						oldvalues.put(vkey, v);
					}
					context.engine.put(vkey, Integer.valueOf(addr));
					variables.add(vkey);
				}

				for(ProgramStep ps : ((SequenceStep) step).getSteps()){
					steps.addAll(flatten(context, ps));
				}

				for(Integer addr : as){
					/*
					 * Restore previous variables
					 */
					for(String vkey : variables){
						if (oldvalues.containsKey(vkey)){
							context.engine.put(vkey, oldvalues.get(vkey));
						}else{
							context.engine.put(vkey, null);
						}
					}
					
					context.memman.release(addr);
				}
			}
		}
		return steps;
	}
	
}
