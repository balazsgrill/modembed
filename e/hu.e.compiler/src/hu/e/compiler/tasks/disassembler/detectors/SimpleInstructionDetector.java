/**
 * 
 */
package hu.e.compiler.tasks.disassembler.detectors;

import hu.e.compiler.tasks.disassembler.InstructionDescriptor;
import hu.e.compiler.tasks.disassembler.InstructionInstance;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionSet;

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
