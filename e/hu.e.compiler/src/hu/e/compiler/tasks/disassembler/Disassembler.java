/**
 * 
 */
package hu.e.compiler.tasks.disassembler;

import hu.e.compiler.tasks.disassembler.detectors.DecisionTreeBasedInstructionDetector;
import hu.e.compiler.tasks.disassembler.detectors.IInstructionDetector;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;
import hu.modembed.model.modembed.core.object.ObjectFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * @author balazs.grill
 *
 */
public class Disassembler {

	public static long mask(int size, int start){
		long v = 0;
		for(int i=0;i<size;i++){
			v += 1l<<i;
		}
		v = v<<start;
		return v;
	}
	
	private final IInstructionDetector instructionDetector;
	
	private static String printByte(byte b){
		int d = HexFileResource.byteToInt(b);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=7;i>=0;i--){
			int j = 1<<i;
			if ((d & j) != 0) sb.append("1");
			else sb.append("0");
		}
		sb.append(">");
		return sb.toString();
	}
	
	public Disassembler(InstructionSet instructionSet){
		
		//instructionDetector = new SimpleInstructionDetector(instructionSet);
		instructionDetector = new DecisionTreeBasedInstructionDetector(instructionSet);
	}
	
	public List<InstructionCall> disassemble(byte[] data){
		List<InstructionCall> result = new ArrayList<InstructionCall>();
		int index = 0;
		
		while(index < data.length){
			InstructionCall call = null;

			InstructionInstance ii = instructionDetector.getNextInstance(data, index);

			if (ii != null){
				call = ObjectFactory.eINSTANCE.createInstructionCall();
				call.setInstruction(ii.descriptor.instruction);
				call.setDescription(ii.getHexCode());

				for(InstructionParameter param : ii.descriptor.instruction.getParameters()){
					InstructionCallParameter callparam = ObjectFactory.eINSTANCE.createInstructionCallParameter();
					callparam.setDefinition(param);
					callparam.setValue(ii.getParameterValue(param));
					call.getParameters().add(callparam);
				}

				//System.out.println(ii.descriptor.instruction.getName());
				index += ii.descriptor.bytelength();
			}
			
			if (call == null){
				//Skip byte
				System.err.println("Instruction byte cannot be parsed: "+printByte(data[index]));
				index++;
			}else{
				result.add(call);
			}
		}
		
		return result;
	}
	
}
