/**
 * 
 */
package hu.modembed.utils.compiler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;
import hu.modembed.model.modembed.core.object.ObjectFactory;

/**
 * @author balazs.grill
 *
 */
public class OperationCompiler {

	private final OperationDefinition opdef;
	private final Map<OperationArgument, SymbolValueAssignment> arguments = new HashMap<OperationArgument, SymbolValueAssignment>();
	//private final AtomicOperationExecution operationCall;
	
	/**
	 * @throws Exception 
	 * 
	 */
	public OperationCompiler(SequenceCompiler sequenceCompiler, OperationDefinition opdef, AtomicOperationExecution operationCall) throws Exception {
		this.opdef = opdef;
		//this.operationCall = operationCall;
		
		List<OperationArgument> args = opdef.getArguments();
		List<String> argValues = operationCall.getArguments();
		if (args.size() != argValues.size()) throw new Exception();
		
		for(int i=0;i<args.size();i++){
			OperationArgument a = args.get(i);
			SymbolValueAssignment sva = sequenceCompiler.getSymbolValue(argValues.get(i)); 
			arguments.put(a, sva);
		}
	}
	
	private long getValue(InstructionParameterMapping ipm) throws Exception{
		long v = 0;
		SymbolValueAssignment value = arguments.get(ipm.getValue());
		if (ipm.getAttribute() != null){
			//TODO
			throw new Exception();
		}else{
			v = value.getValue();
		}
		v = v << ipm.getBitOffset();
		v = v + ipm.getValueOffset();
		return v;
	}
	
	public void compile(List<InstructionCall> callList) throws Exception{
		for(OperationStep step : opdef.getSteps()){
			if (step instanceof InstructionCallOperationStep){
				InstructionCallOperationStep s = (InstructionCallOperationStep)step;
				InstructionCall icall = ObjectFactory.eINSTANCE.createInstructionCall();
				callList.add(icall);
				icall.setInstruction(s.getInstruction());
				int i = 0;
				for(InstructionParameterMapping ipm : s.getArguments()){
					InstructionParameter param = icall.getInstruction().getParameters().get(i);
					InstructionCallParameter icp = ObjectFactory.eINSTANCE.createInstructionCallParameter();
					icp.setDefinition(param);
					icp.setValue(getValue(ipm));
					icall.getParameters().add(icp);
					i++;
				}
			}
		}
	}

}
