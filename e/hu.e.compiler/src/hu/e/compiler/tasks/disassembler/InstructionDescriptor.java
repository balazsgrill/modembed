package hu.e.compiler.tasks.disassembler;

import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionWord;

import java.util.List;

/**
 * Denotes an instruction. Contains data to fast-check if an byte-stream contains a valid instruction
 * @author balazs.grill
 *
 */
public class InstructionDescriptor{
	
	public final Instruction instruction;
	public final long[] wordmasks;
	public final long[] wordvalues;
	public final int[] wordlengths;
	
	public int bytelength(){
		int length = 0;
		for(int i=0;i<wordlengths.length;i++){
			length += ((wordlengths[i]-1)/8)+1;
		}
		return length;
	}
	
	public int maxWordLength(){
		int max = 0;
		for(int i=0;i<wordlengths.length;i++){
			max = Math.max(max, wordlengths[i]);
		}
		return max;
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
				if (section instanceof ConstantSection){
					int sectionvalue = ((ConstantSection) section).getValue();
					mask |= Disassembler.mask(section.getSize(), length);
					value |= ((long)sectionvalue) << length;
				}
				length += section.getSize();
			}
			
			wordmasks[i] = mask;
			wordvalues[i] = value;
			wordlengths[i] = length;
		}
	}
	
}