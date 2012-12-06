/**
 * 
 */
package hu.e.compiler.tasks;

import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.core.assembler.AssemblerFactory;
import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionSet;
import hu.modembed.model.core.assembler.InstructionWord;
import hu.modembed.model.core.assembler.code.CodeFactory;
import hu.modembed.model.core.assembler.code.InstructionCall;

import java.util.ArrayList;
import java.util.List;


/**
 * @author balazs.grill
 *
 */
public class Disassembler {

	/**
	 * Denotes an instruction. Contains data to fast-check if an byte-stream contains a valid instruction
	 * @author balazs.grill
	 *
	 */
	private class InstructionDescriptor{
		
		public final Instruction instruction;
		public final long[] wordmasks;
		public final long[] wordvalues;
		public final int[] wordlengths;
		
		public int bytelength(){
			int length = 0;
			for(int i=0;i<wordlengths.length;i++){
				length += wordlengths[i];
			}
			return length;
		}
		
		public InstructionDescriptor(Instruction instruction) {
			this.instruction = instruction;
			
			int numOfWords = instruction.getWords().size();
			wordmasks = new long[numOfWords];
			wordvalues = new long[numOfWords];
			wordlengths = new int[numOfWords];
			
			for(int i=0;i<numOfWords;i++){
				InstructionWord word = instruction.getWords().get(i);
				long mask = 0;
				long value = 0;
				int length = 0;
				
				List<InstructionSection> sections = word.getSections();
				for(int j=sections.size()-1;j>=0;j--){
					//Sections are listed backwards in the model
					
					InstructionSection section = sections.get(j);
					length += section.getSize();
					if (section instanceof ConstantSection){
						int sectionvalue = ((ConstantSection) section).getValue();
						mask |= mask(section.getSize(), section.getStart());
						value |= ((long)sectionvalue) << section.getStart();
					}
				}
				
				wordmasks[i] = mask;
				wordvalues[i] = value;
				wordlengths[i] = length;
			}
		}
		
	}
	
	private class InstructionInstance{
		
		public final InstructionDescriptor descriptor;
		public final long words[];
		
		public InstructionInstance(InstructionDescriptor descriptor, byte[] data, int startIndex) {
			this.descriptor = descriptor;
			
			words = new long[descriptor.wordlengths.length];
			int index = startIndex;
			for(int i=0;i<words.length;i++){
				long wordvalue = 0;
				int wordlength = descriptor.wordlengths[i]; 
				for(int j=0;j<wordlength;j++){
					int bytevalue = HexFileResource.byteToInt(data[index]);
					//wordvalue |= ((long)bytevalue)<<( (wordlength-j-1)*8 ); //BigEndian byte order
					wordvalue |= ((long)bytevalue)<<( (j)*8 ); //LittleEndian byte order
					index++;
				}
				words[i] = wordvalue;
			}
		}
		
		public boolean check(){
			for(int i=0;i<words.length;i++){
				if((words[i] | descriptor.wordmasks[i]) != descriptor.wordvalues[i]) return false;
			}
			return true;
		}
		
	}
	
	private static long mask(int size, int start){
		long v = 0;
		for(int i=0;i<size;i++){
			v += 1l<<i;
		}
		v = v<<start;
		return v;
	}
	
	private final List<InstructionDescriptor> instructions;
	
	public Disassembler(InstructionSet instructionSet){
		
		InstructionSet iset = instructionSet;
		List<Instruction> instructions = new ArrayList<Instruction>(0);
		
		while(iset != null){
			instructions.addAll(iset.getInstructions());
			iset = iset.getExtend();
		}
		
		this.instructions = new ArrayList<Disassembler.InstructionDescriptor>(instructions.size());
		for(Instruction instruction : instructions){
			this.instructions.add(new InstructionDescriptor(instruction));
		}
	}
	
	public List<InstructionCall> disassemble(byte[] data){
		List<InstructionCall> result = new ArrayList<InstructionCall>();
		int index = 0;
		
		while(index < data.length){
			InstructionCall call = null;
			
			for(InstructionDescriptor i : instructions) if (call == null){
				if (i.bytelength() <= (data.length-index)){
					//Check if instruction applies
					InstructionInstance ii = new InstructionInstance(i, data, index);

					if (ii.check()){
						call = CodeFactory.eINSTANCE.createInstructionCall();
						System.out.println(ii.descriptor.instruction.getName());
						index += ii.descriptor.bytelength();
					}
				}
			}
			
			if (call == null){
				//Skip byte
				System.out.println("UNKOWN");
				index++;
			}
		}
		
		return result;
	}
	
}
