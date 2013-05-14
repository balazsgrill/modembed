package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorCall;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep;
import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.ObjectFactory;

import java.util.List;

class SequenceCompiler{
	
	/**
	 * 
	 */
	private final ModuleCompiler moduleCompiler;
	private final SequenceCompiler parent;
	private final SequentialBehavior sequence;
	
	public SequenceCompiler(ModuleCompiler moduleCompiler, SequenceCompiler parent, SequentialBehavior sequence) {
		this.moduleCompiler = moduleCompiler;
		this.parent = parent;
		this.sequence = sequence;
	}
	
	public SymbolValueAssignment getSymbolValue(String symbol){
		return moduleCompiler.symbols.get(symbol);
	}
	
	public void compile(List<InstructionCall> callList) throws Exception{
		int startAddress = callList.size();
		
		for(SequentialAction action : sequence.getActions()){
			if (action instanceof AtomicOperationExecution){
				String operation = ((AtomicOperationExecution) action).getOperation();
				List<String> arguments = ((AtomicOperationExecution) action).getArguments();
				TypeSignature[] signature = new TypeSignature[arguments.size()];
				for(int i=0;i<arguments.size();i++){
					SymbolValueAssignment sva = this.moduleCompiler.symbols.get(arguments.get(i));
					if (sva == null) throw new Exception("Symbol is not defined: "+arguments.get(i));
					signature[i] = TypeSignature.create(sva);
				}
				OperationDefinition opdef = this.moduleCompiler.findOperation(operation, signature);
				new OperationCompiler(this, opdef, (AtomicOperationExecution)action).compile(callList);
			}
			if (action instanceof BehaviorCall){
				throw new Exception("TODO: nested behaviors are not yet supported");
			}
			if (action instanceof CodeSymbolPlacement){
				throw new Exception("TODO: labels are not yet supported");
			}
		}
	}
	
}