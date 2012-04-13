/**
 * 
 */
package hu.e.compiler.internal.linking;

import hu.e.compiler.internal.model.InstructionWordInstance;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.SequenceStep;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class ProgramListLinker {

	private final ProgramList plist;
	
	public ProgramListLinker(ProgramList plist) {
		this.plist = plist;
	}
	
	public byte[] link(int startAddr){
		
		Map<LabelStep, Integer> labels = new HashMap<LabelStep, Integer>();
		
		List<ProgramStep> allsteps = flatten(plist.getStep());
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
				
				int v = labels.get(lr.getValue());
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
	
	private List<ProgramStep> flatten(ProgramStep step){
		List<ProgramStep> steps = new ArrayList<ProgramStep>();
		
		if (step instanceof InstructionStep){
			steps.add(step);
		}
		if (step instanceof LabelStep){
			steps.add(step);
		}
		if (step instanceof SequenceStep){
			for(ProgramStep ps : ((SequenceStep) step).getSteps()){
				steps.addAll(flatten(ps));
			}
		}
		
		return steps;
	}
	
}
