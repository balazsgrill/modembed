/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.internal.MemoryManager;
import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.list.AnnotationStep;
import hu.e.compiler.list.InstructionArgument;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.LinkTimeConstant;
import hu.e.compiler.list.LinkTimeExpression;
import hu.e.compiler.list.LinkTimeValue;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ReferableValue;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.SequenceStep;
import hu.e.compiler.list.StatusStep;
import hu.e.compiler.optimizer.IFlatProgramOptimizer;
import hu.e.compiler.optimizer.IOptimizer;
import hu.e.compiler.optimizer.IOptimizerContext;
import hu.e.compiler.optimizer.IStructuredProgramOptimizer;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class ProgramListLinker {

	private final ProgramList plist;
	
	private final List<IOptimizer> optimizers;
	
	public ProgramListLinker(ProgramList plist, List<IOptimizer> optimizers) {
		this.plist = plist;
		this.optimizers = optimizers;
	}
	
	private class LinkingContext implements IOptimizerContext{
		
		public final Map<MemoryAssignment, Integer> addresses;
		public final MemoryManager memman;
		public final Map<LabelStep, Integer> labels = new HashMap<LabelStep, Integer>();
		public final ProgramListLogger logger = new ProgramListLogger();
		
		public LinkingContext(
				MemoryManager memman) {
			super();
			this.addresses = new LinkedHashMap<MemoryAssignment, Integer>();
			this.memman = memman;
		}

		@Override
		public long getMappedAddress(MemoryAssignment ma) {
			Integer addr = addresses.get(ma);
			if (addr != null){
				return addr.longValue();
			}
			return -1;
		}
		
		private long getValue(LinkTimeValue lr){
			if (lr instanceof Reference){
				ReferableValue rv = ((Reference)lr).getValue();
				if (rv instanceof LabelStep){
					if (!labels.containsKey(rv)) return -1;
					return labels.get(rv);
				}
				if (rv instanceof MemoryAssignment){
					if (!addresses.containsKey(rv)) return -1;
					return addresses.get(rv);
				}
				
				
				throw new IllegalArgumentException("Could not resolve value of "+rv);
				
			}
			if (lr instanceof LinkTimeConstant){
				return ((LinkTimeConstant) lr).getValue();
			}
			
			if (lr instanceof LinkTimeExpression){
				switch(((LinkTimeExpression) lr).getOperation()){
				case ADD:
					long v = 0;
					for(LinkTimeValue arg : ((LinkTimeExpression) lr).getArguments()){
						v += getValue(arg);
					}
					return v;
				}
			}
			
			throw new IllegalArgumentException("Could not resolve value of "+lr);
		}
		
		@Override
		public long getInstructionValue(InstructionStep s) {
			
			int d = 0;
			d = (int) s.getCode();
			for(InstructionArgument lr : s.getArgs()){
				long v = getValue(lr.getValue());
				
				d += InstructionWordInstance.getItemValue(v, lr.getShift(), lr.getStart(), lr.getSize());
			}
			
			return d;
		}
		
	}
	
	public byte[] link(MemoryManager memman, int startAddr){
		
		/*
		 * Create context
		 */
		LinkingContext context = new LinkingContext(memman);
			
		mapMemory(context, plist.getStep());
		ProgramList plist = this.plist;
		
		for (IOptimizer o : optimizers){
			if (o instanceof IStructuredProgramOptimizer){
				plist = ((IStructuredProgramOptimizer) o).optimize(context, plist);
			}
		}
		
		List<ProgramStep> allsteps = flatten(context, plist.getStep());
		for (IOptimizer o : optimizers){
			if (o instanceof IFlatProgramOptimizer){
				allsteps = ((IFlatProgramOptimizer) o).optimize(context, allsteps);
			}
		}
		
		context.logger.print();
		
		List<InstructionStep> instructions = new ArrayList<InstructionStep>();
		int progsize = 0;
		
		for(ProgramStep ps : allsteps){
			if (ps instanceof InstructionStep){
				instructions.add((InstructionStep)ps);
				int w = ((InstructionStep) ps).getWidth();
				progsize += (w/8) + (((w%8)==0)?0:1); 
			}
			if (ps instanceof LabelStep){
				context.labels.put((LabelStep)ps, instructions.size()+startAddr);
			}
		}
		
		//Produce instruction bytes
		byte[] data = new byte[progsize];
		int i = 0;
		for(InstructionStep s : instructions){
			int w = s.getWidth();
			int wordbytes = (w/8) + (((w%8)==0)?0:1); 
			long d = context.getInstructionValue(s);
			
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
	
	private void mapMemory(LinkingContext context, ProgramStep step){
		if (step instanceof SequenceStep){
			SequenceStep sequence = (SequenceStep)step;
			Set<Integer> as = new HashSet<Integer>();
			
			for(MemoryAssignment ma : sequence.getVariables()){
				int addr = context.memman.allocate(ma.getSize());
				context.addresses.put(ma, addr);
				as.add(addr);
			}

			for(ProgramStep ps : ((SequenceStep) step).getSteps()){
				mapMemory(context, ps);
			}

			for(Integer addr : as){
				context.memman.release(addr);
			}
		}
	}
	
	private List<ProgramStep> flatten(LinkingContext context, ProgramStep step){
		List<ProgramStep> steps = new ArrayList<ProgramStep>();
		
		if (step instanceof AnnotationStep){
			steps.add(step);
		}
		
		if (step instanceof InstructionStep){
			steps.add(step);
		}
		if (step instanceof LabelStep){
			steps.add(step);
		}
		if (step instanceof SequenceStep){
			for(ProgramStep ps : ((SequenceStep) step).getSteps()){
				steps.addAll(flatten(context, ps));
			}
		}
		if (step instanceof StatusStep){
			context.logger.add((StatusStep)step);
		}

		return steps;
	}
	
}
