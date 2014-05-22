/**
 * 
 */
package hu.modembed.disassembler.detectors;

import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionSet;
import hu.modembed.disassembler.InstructionDescriptor;
import hu.modembed.disassembler.InstructionInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class DecisionTreeBasedInstructionDetector extends
		AbstractInstructionDetector {

	private final HashMap<Instruction, InstructionDescriptor> instructions;
	private final DisassemblerDecisionTree decisionTree;

	public DecisionTreeBasedInstructionDetector(InstructionSet instructionSet) {
		List<Instruction> instructions = getListOfInstructions(instructionSet);
		
		List<InstructionPattern> patterns = new ArrayList<InstructionPattern>(instructions.size());
		int maxbitlength = 0;
		
		this.instructions = new HashMap<Instruction, InstructionDescriptor>();
		for(Instruction instruction : instructions){
			InstructionDescriptor desc = new InstructionDescriptor(instruction);
			maxbitlength = Math.max(maxbitlength, desc.maxWordLength());
			this.instructions.put(instruction, desc);
			patterns.add(new InstructionPattern(instruction));
		}
		
		decisionTree = DisassemblerDecisionTree.create(patterns, maxbitlength);
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.tasks.disassembler.detectors.IInstructionDetector#getNextInstance(byte[], int)
	 */
	@Override
	public InstructionInstance getNextInstance(byte[] data, int index) {
		Instruction instruction = decisionTree.getNextInstruction(data, index);
		InstructionDescriptor desc = instructions.get(instruction); 
		if (desc != null){
			return createInstructionInstance(desc, data, index);
		}
		return null;
	}

	@Override
	public String toString() {
		return "===============================\n"+decisionTree;
	}
	
}
