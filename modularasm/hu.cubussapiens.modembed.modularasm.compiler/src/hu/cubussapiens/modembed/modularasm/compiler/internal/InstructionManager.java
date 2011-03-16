/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import hu.cubussapiens.modembed.modularasm.compiler.CompilerException;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.ISymbol;
import hu.cubussapiens.modembed.modularasm.compiler.internal.symbols.LiteralSymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import embedded.assembly.Code;
import embedded.assembly.Field;
import embedded.assembly.Instruction;
import embedded.assembly.InstructionSet;
import embedded.assembly.Parameter;
import embedded.assembly.Section;

/**
 * @author balazs.grill
 *
 */
public class InstructionManager {

	private final InstructionSet instructionSet;
	
	private final Map<String, Instruction> instructions = new HashMap<String, Instruction>();
	
	private static long getMask(int bits){
		long r = 0;
		for(int i=0;i<bits;i++){
			r += 1<<i;
		}
		return r;
	}
	
	public class InstructionWord{
		
		public final Instruction instruction;
		
		public InstructionWord(Instruction instruction) {
			this.instruction = instruction;
		}
		
		private final Map<String, ISymbol> symbols = new HashMap<String, ISymbol>();
		
		public void setParamSymbols(ISymbol[] symbols) throws CompilerException{
			String[] params = getParams();
			if (params.length < symbols.length) throw new CompilerException("Too many arguments at "+instruction.getName());
			for(int i=0;i<params.length;i++){
				if (i<symbols.length){
					//Symbol was given
					this.symbols.put(params[i], symbols[i]);
				}else{
					//Has default value?
					int value = getDefaultValue(params[i]);
					if (value == -1) throw new CompilerException("Not enough arguments for "+instruction.getName());
					this.symbols.put(params[i], new LiteralSymbol(value));
				}
			}
		}
		
		private int getDefaultValue(String param){
			for (Parameter p : instruction.getParameters()){
				if (param.equals(p.getName())) return p.getValue();
			}
			return -1;
		}
		
		public String[] getParams(){
			List<String> params = new ArrayList<String>();
			
			for (Parameter p : instruction.getParameters()){
				params.add(p.getName());
			}
			
			return params.toArray(new String[params.size()]);
		}
		
		public long[] getWords() throws CompilerException{
			int ws = instructionSet.getWordsize();
			int w = getInstructionNumOfWords(instruction);
			long[] result = new long[w];
			for(int i=0;i<result.length;i++) result[i]=0;
			
			for(Section s : instruction.getSections()){
				int index = (result.length-1)-(s.getStart()/ws);
				int shift = s.getStart()%ws;
				result[index] += getSectionValue(s)<<shift;
			}
			return result;
		}
		
		private ISymbol getSymbol(String param) throws CompilerException{
			return symbols.get(param);
		}
		
		private long getSectionValue(Section s) throws CompilerException{
			long value = 0;
			if (s instanceof Code){
				return ((Code) s).getCode();
			}
			if (s instanceof Field){
				Field f = (Field)s;
				if (f.getParameter() == null || "".equals(f.getParameter()))
					return 0;
				ISymbol sy = getSymbol(f.getParameter());
				return getMask(s.getLength())&(sy.getValue()>>f.getParamshift());
			}
			return value;
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
	
	public int getWordSize(){
		return instructionSet.getWordsize();
	}
	
	private int getInstructionNumOfWords(Instruction i){
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
	
	public int getInstructionNumOfWords(String instruction){
		Instruction i = instructions.get(instruction.toLowerCase());
		return getInstructionNumOfWords(i);
	}
	
	
	
}
