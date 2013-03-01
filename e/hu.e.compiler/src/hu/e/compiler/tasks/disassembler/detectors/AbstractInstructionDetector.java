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
public abstract class AbstractInstructionDetector implements IInstructionDetector{

	protected List<Instruction> getListOfInstructions(InstructionSet instructionSet){
		InstructionSet iset = instructionSet;
		List<Instruction> instructions = new ArrayList<Instruction>(0);
		
		while(iset != null){
			instructions.addAll(iset.getInstructions());
			iset = iset.getExtend();
		}
		return instructions;
	}
	
	protected InstructionInstance createInstructionInstance(InstructionDescriptor descriptor, byte[] data, int index){
		InstructionInstance ii = new InstructionInstance(descriptor, data, index);

		if (ii.check()){
			return ii;
		}
		return null;
	}
	
}
