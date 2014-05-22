/**
 * 
 */
package hu.modembed.disassembler;

import hexfile.Entry;
import hu.modembed.assembler.code.AssemblerObject;
import hu.modembed.assembler.code.CodeFactory;
import hu.modembed.assembler.code.InstructionCall;
import hu.modembed.assembler.code.InstructionCallArgument;
import hu.modembed.assembler.instructionset.InstructionParameter;
import hu.modembed.assembler.instructionset.InstructionSet;
import hu.modembed.disassembler.detectors.DecisionTreeBasedInstructionDetector;
import hu.modembed.disassembler.detectors.IInstructionDetector;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;


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
	
	private List<Diagnostic> errors = null;
	
	public List<Diagnostic> getErrors() {
		if (errors == null){
			errors = new LinkedList<>();
		}
		return errors;
	}
	
	private final IInstructionDetector instructionDetector;
	private final InstructionSet instructionSet;
	
	public Disassembler(InstructionSet instructionSet){
		this.instructionSet = instructionSet;
		
		//instructionDetector = new SimpleInstructionDetector(instructionSet);
		instructionDetector = new DecisionTreeBasedInstructionDetector(instructionSet);
	}
	
	public AssemblerObject disassemble(Entry hexEntry){
		AssemblerObject result = CodeFactory.eINSTANCE.createAssemblerObject();
		result.setInstructionset(instructionSet);
		result.setStartAddress(hexEntry.getAddress());
		
		int index = 0;
		
		byte[] data = hexEntry.getData();
		
		while(index < data.length){
			InstructionCall call = null;

			InstructionInstance ii = instructionDetector.getNextInstance(data, index);

			if (ii != null){
				call = CodeFactory.eINSTANCE.createInstructionCall();
				call.setInstruction(ii.descriptor.instruction);

				for(InstructionParameter param : ii.descriptor.instruction.getParameters()){
					InstructionCallArgument callparam = CodeFactory.eINSTANCE.createInstructionCallArgument();
					callparam.setDefinition(param);
					callparam.setValue(ii.getParameterValue(param));
					call.getArguments().add(callparam);
				}

				//System.out.println(ii.descriptor.instruction.getName());
				index += ii.descriptor.bytelength();
			}
			
			if (call == null){
				//Skip byte
				getErrors().add(new ByteParsingError(data[index], (long)index+hexEntry.getAddress()));
				index++;
			}else{
				result.getInstructions().add(call);
			}
		}
		
		return result;
	}
	
}
