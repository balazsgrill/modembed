package hu.e.compiler.tasks.disassembler;

import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.instructionset.InstructionSection;
import hu.modembed.model.modembed.core.instructionset.InstructionWord;
import hu.modembed.model.modembed.core.instructionset.ParameterSection;

import java.util.List;

public class InstructionInstance{
	
	public final InstructionDescriptor descriptor;
	public final long words[];
	
	public InstructionInstance(InstructionDescriptor descriptor, byte[] data, int startIndex) {
		this.descriptor = descriptor;
		
		words = new long[descriptor.wordlengths.length];
		int index = startIndex;
		for(int i=0;i<words.length;i++){
			long wordvalue = 0;
			int wordlength = ((descriptor.wordlengths[i]-1)/8)+1; 
			for(int j=0;j<wordlength;j++){
				int bytevalue = HexFileResource.byteToInt(data[index]);
				//wordvalue |= ((long)bytevalue)<<( (wordlength-j-1)*8 ); //LittleEndian byte order
				wordvalue |= ((long)bytevalue)<<( j*8 ); //BigEndian byte order
				index++;
			}
			words[i] = wordvalue;
		}
	}
	
	public long getParameterValue(InstructionParameter p){
		long value = 0;
		for(int i=0;i<words.length;i++){
			InstructionWord iword = descriptor.instruction.getWords().get(i);
			List<InstructionSection> sections = iword.getSections();
			int length = 0;
			for(int j=sections.size()-1;j>=0;j--){
				InstructionSection section = sections.get(j);
				if (section instanceof ParameterSection){
					ParameterSection psection = ((ParameterSection) section); 
					if (p.equals(psection.getParameter())){
						long mask = Disassembler.mask(psection.getSize(), length);
						long psectionvalue = (words[i] & mask);
						psectionvalue = psectionvalue >> length;
						value |= psectionvalue << psection.getShift();
					}
				}
				length += section.getSize();
			}
		}
		return value;
	}
	
	public boolean check(){
		for(int i=0;i<words.length;i++){
			long maskedWord = words[i] & descriptor.wordmasks[i]; 
			if(maskedWord != descriptor.wordvalues[i]) return false;
		}
		return true;
	}
	
	public String getHexCode(){
		StringBuilder sb = new StringBuilder();
		for(long word : words) sb.append(Long.toHexString(word));
		return sb.toString();
	}
	
}