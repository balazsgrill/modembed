/**
 * 
 */
package hu.modembed.ui.disassemble;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionSet;

/**
 * @author balage
 *
 */
public class Disassembler {

	public String parseInstruction(long op){
		StringBuilder sb = new StringBuilder();
		
		InstructionDescriptor id = getDescriptor(op);
		if (id == null){
			sb.append("Unknown instruction: "+Long.toHexString(op));
		}else{
			sb.append(id.getName());
			for(char p : id.params){
				sb.append(" ");sb.append(p);sb.append("=0x");
				sb.append(Long.toHexString(id.extract(op, p)));
			}
		}
		return sb.toString();
	}
	
	private InstructionDescriptor getDescriptor(long op){
		for(InstructionDescriptor id : inss){
			if (id.check(op)) return id;
		}
		return null;
	}
	
	private final List<InstructionDescriptor> inss;
	
	public Disassembler(InstructionSet iset) {
		inss = new ArrayList<Disassembler.InstructionDescriptor>(iset.getInstructions().size());
		for(Instruction i : iset.getInstructions()){
			inss.add(new InstructionDescriptor(i));
		}
	}
	
	private static class InstructionDescriptor{
		
		private final String mask;
		
		private final String name;
		
		private final char[] params;
		
		public InstructionDescriptor(Instruction i){
			this(i.getName(), i.getCode());
		}
		
		public InstructionDescriptor(String name, String mask) {
			this.mask = mask.trim();
			this.name = name;
			Set<Character> params = new LinkedHashSet<Character>();
			for(char c : mask.toCharArray()){
				if (!Character.isDigit(c)) params.add(c);
			}
			this.params = new char[params.size()];
			int i = 0;
			for(Character c : params){
				this.params[i] = c.charValue();
				i++;
			}
		}
		
		public int getWidth(){
			return mask.length();
		}
		
		public String getName() {
			return name;
		}
		
		public long extract(long op, char c){
			long v = 0;
			long b = 1; 
			long j = 1;
			for(int i=mask.length()-1;i>=0;i--){
				if (c == mask.charAt(i)){
					if ((op&b) != 0) v += j;
					j = j*2;
				}
				b = b*2;
			}
			return v;
		}
		
		/* (non-Javadoc)
		 * @see hu.modembed.pic.simulator.generic.IOperation#check(long)
		 */
		public boolean check(long op) {
			long b = 1;
			for(int i=mask.length()-1;i>=0;i--){
				if ('1' == mask.charAt(i)){
					if ((op&b) == 0) return false;
				}else
				if ('0' == mask.charAt(i)){
					if ((op&b) != 0) return false;
				}
				b = b*2;
			}
			return true;
		}
		
	}
	
	/**
	 * Get the instruction word width in bits
	 * @return
	 */
	public int getInstructionWidth(){
		return inss.get(0).getWidth();
	}
	
}
