/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import java.util.HashMap;
import java.util.Map;

import embedded.assembly.Instruction;
import embedded.assembly.InstructionSet;
import embedded.assembly.Section;

/**
 * @author balazs.grill
 *
 */
public class InstructionManager {

	private final InstructionSet instructionSet;
	
	private final Map<String, Instruction> instructions = new HashMap<String, Instruction>();
	
	/**
	 * 
	 */
	public InstructionManager(InstructionSet instructionSet) {
		this.instructionSet = instructionSet;
		for(Instruction i : instructionSet.getInstructions()){
			instructions.put(i.getName(),i);
		}
	}

	public int getInstructionNumOfWords(String instruction){
		Instruction i = instructions.get(instruction);
		int ws = instructionSet.getWordsize();
		if (i != null){
			int length = 0;
			for(Section s : i.getSections()){
				length += s.getLength();
			}
			return (length%ws == 0) ? length/ws : (length/ws)+1;
		}
		return 0;
	}
	
	
	
}
