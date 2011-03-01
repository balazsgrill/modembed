/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.internal;

import hu.cubussapiens.modembed.modularasm.builder.internal.symbols.ISymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import embedded.assembly.Field;
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
	
	public class InstructionWord{
		
		public final Instruction instruction;
		
		public InstructionWord(Instruction instruction) {
			this.instruction = instruction;
		}
		
		private ISymbol[] symbols;
		
		public void setParamSymbols(ISymbol[] symbols){
			this.symbols = symbols;
		}
		
		public String[] getParams(){
			List<String> params = new ArrayList<String>();
			
			for (Section s : instruction.getSections()){
				if (s instanceof Field){
					Field f = (Field)s;
					if (f.getParameter() != null && f.getParameter().length()>0){
						String p = f.getParameter().trim();
						if (!params.contains(p)){
							params.add(p);
						}
					}
				}
			}
			
			return params.toArray(new String[params.size()]);
		}
		
	}
	
	/**
	 * 
	 */
	public InstructionManager(InstructionSet instructionSet) {
		this.instructionSet = instructionSet;
		for(Instruction i : instructionSet.getInstructions()){
			instructions.put(i.getName().toLowerCase(),i);
		}
	}

	public InstructionWord createInstructionWord(String instruction){
		Instruction i = instructions.get(instruction.toLowerCase());
		if (i == null){
			return null;
		}
		return new InstructionWord(i);
	}
	
	public int getInstructionNumOfWords(String instruction){
		Instruction i = instructions.get(instruction.toLowerCase());
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
