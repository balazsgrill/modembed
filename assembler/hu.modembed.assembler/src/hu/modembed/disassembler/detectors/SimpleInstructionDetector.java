/**
 * 
 */
package hu.modembed.disassembler.detectors;

import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionSet;
import hu.modembed.disassembler.InstructionDescriptor;
import hu.modembed.disassembler.InstructionInstance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class SimpleInstructionDetector extends AbstractInstructionDetector {

	private final List<InstructionDescriptor> instructions;
	
	public SimpleInstructionDetector(InstructionSet instructionSet) {
		List<Instruction> instructions = getListOfInstructions(instructionSet);
		
		this.instructions = new ArrayList<InstructionDescriptor>();
		for(Instruction instruction : instructions){
			InstructionDescriptor desc = new InstructionDescriptor(instruction);
			this.instructions.add(desc);
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.tasks.disassembler.IInstructionDetector#getNextInstance(byte[], int)
	 */
	@Override
	public InstructionInstance getNextInstance(byte[] data, int index) {
		for(InstructionDescriptor i : instructions){
			if (i.bytelength() <= (data.length-index)){
				//Check if instruction applies
				InstructionInstance ii = createInstructionInstance(i, data, index);

				if (ii != null){
					return ii;
				}
			}
		}
		return null;
	}

}
