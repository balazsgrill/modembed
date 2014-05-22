/**
 * 
 */
package hu.modembed.assembler;

import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hexfile.HexfileFactory;
import hu.modembed.assembler.code.AssemblerObject;
import hu.modembed.assembler.code.InstructionCall;
import hu.modembed.assembler.code.InstructionCallArgument;
import hu.modembed.assembler.instructionset.ConstantSection;
import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionParameter;
import hu.modembed.assembler.instructionset.InstructionSection;
import hu.modembed.assembler.instructionset.InstructionWord;
import hu.modembed.assembler.instructionset.ParameterSection;
import hu.modembed.disassembler.Disassembler;
import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class Assembler {

	public HexFile execute(AssemblerObject assem, int startAddress, IProgressMonitor monitor) {

		HexFile hexfile = HexfileFactory.eINSTANCE.createHexFile();
		hexfile.setAddressType(AddressType.EXTENDED_LINEAR);

		List<InstructionCall> calls = assem.getInstructions();

		/*
		 * Pre-calculate addresses of instructionCalls
		 */
		long[] addresses = new long[calls.size()];
		{
			long currentAddress = startAddress;
			for(int i=0;i<addresses.length;i++){
				addresses[i] = currentAddress;
				currentAddress += calls.get(i).getInstruction().getWords().size();
			}
		}
		
		
		List<Integer> bytes = new ArrayList<Integer>();
		int wordlength = 2;
		
		for(InstructionCall call : calls){
			Map<InstructionParameter, Long> paramvalues = new HashMap<InstructionParameter, Long>();
			

			Instruction i = call.getInstruction();
			for(InstructionParameter ip : i.getParameters()){
				paramvalues.put(ip, Long.valueOf(ip.getDefaultValue()));
			}
			for(InstructionCallArgument icp : call.getArguments()){
				long value = icp.getValue();
				if (icp.isLabel()){
					value = addresses[(int)value];
				}
				paramvalues.put(icp.getDefinition(), value);
			}

			List<InstructionWord> words = i.getWords();
			for(InstructionWord w : words){
				long wordvalue = 0;
				int length = 0;
				List<InstructionSection> sections = w.getSections();
				for(int k=sections.size()-1;k>=0;k--){
					InstructionSection s = sections.get(k);
					long svalue = 0;
					if (s instanceof ConstantSection){
						svalue = ((ConstantSection) s).getValue();
					}
					if (s instanceof ParameterSection){
						InstructionParameter iparameter = ((ParameterSection) s).getParameter();
						Long lvalue = paramvalues.get(iparameter);
						if (lvalue == null){
							//context.logStatus(TaskUtils.error("Parameter "+iparameter.getId()+" doesn't have a valid value.", s));
							//TODO handle warnings!
						}else{
							svalue = lvalue.longValue();
						}
					}
					svalue = svalue << length;
					svalue = svalue >> s.getShift();
					long mask = Disassembler.mask(s.getSize(), length);
					length += s.getSize();
					wordvalue |= (svalue & mask);
					
				}

				int bytenum = ((length-1)/8)+1;
				wordlength = Math.max(bytenum, wordlength);
				for(int j=0;j<bytenum;j++){
					bytes.add((int)(wordvalue & 0xFF));
					wordvalue = wordvalue >> 8;
				}
			}
		}


		Entry entry = HexfileFactory.eINSTANCE.createEntry();
		hexfile.getEntries().add(entry);
		entry.setAddress(startAddress*wordlength);

		byte[] data = new byte[bytes.size()];
		for(int i=0;i<bytes.size();i++){
			data[i] = HexFileResource.intToByte(bytes.get(i));
		}
		entry.setData(data);
		
		return hexfile;
	}

	
}
