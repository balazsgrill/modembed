/**
 * 
 */
package hu.modembed.disassembler.detectors;

import hu.modembed.assembler.instructionset.ConstantSection;
import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionSection;
import hu.modembed.assembler.instructionset.InstructionWord;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class InstructionPattern {

	public final Instruction instruction;
	public final int[] bytes;
	public final int[] mask;
	
	public static long mask(int size, int start){
		long v = 0;
		for(int i=0;i<size;i++){
			v += 1l<<i;
		}
		v = v<<start;
		return v;
	}
	
	public boolean check(byte[] data, int index){
		for(int i=0;i<bytes.length;i++){
			int j = index+i;
			if (data.length > j){
				int b = HexFileResource.byteToInt(data[j]);
				if ((b & mask[i]) != (bytes[i] & mask[i])) return false;
			}else{
				return false;
			}
		}
		return true;
	}
	
	public Boolean getDecisionBit(int bit){
		int by = bit/8;
		int bi = bit%8;
		if (bytes.length > by){
			int m = 1<<bi;
			if((mask[by] & m) != 0){
				return (bytes[by] & m) != 0;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(instruction.getName());
		sb.append("\t");
		for(int i=0;i<mask.length;i++){
			sb.append("<");
			for(int j=7;j>=0;j--){
				int b = 1<<j;
				if ((mask[i] & b) == 0) sb.append("_");
				else{
					if ((bytes[i] & b) == 0)sb.append("0");
					else sb.append("1");
				}
			}
			sb.append(">");
		}
		return sb.toString();
	}
	
	public InstructionPattern(Instruction instruction) {
		this.instruction = instruction;
		
		int numOfWords = instruction.getWords().size();
		long[] wordmasks = new long[numOfWords];
		long[] wordvalues = new long[numOfWords];
		int[] wordlengths = new int[numOfWords];
		
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
					long sectionvalue = ((ConstantSection) section).getValue();
					mask |= mask(section.getSize(), length);
					value |= ((long)sectionvalue) << length;
				}
				length += section.getSize();
			}
			
			wordmasks[i] = mask;
			wordvalues[i] = value;
			wordlengths[i] = length;
		}
		
		int bytelength = 0;
		for(int i=0;i<numOfWords;i++){
			bytelength += ((wordlengths[i]-1)/8)+1;
		}
		
		this.bytes = new int[bytelength];
		this.mask = new int[bytelength];
		
		int l = 0;
		for(int i=0;i<numOfWords;i++){
			int length = ((wordlengths[i]-1)/8)+1;
			for(int j=0;j<length;j++){
				/* Assumed BigEndian byte order! */
				int b = (int)(wordvalues[i]>>(j*8))&0xFF;
				int m = (int)(wordmasks[i]>>(j*8))&0xFF;
				this.bytes[l] = b;
				this.mask[l] = m;
				l++;
			}
		}
	}
	
}
