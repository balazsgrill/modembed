package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.core.object.InstructionCall;

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
	
	public SymbolAssignment getSymbolValue(String symbol){
		return moduleCompiler.symbols.get(symbol);
	}
	
	public void compile(List<InstructionCall> callList) throws Exception{
		int startAddress = callList.size();
		
		for(SequentialAction action : sequence.getActions()){
			if (action instanceof OperationExecution){
				String operation = ((OperationExecution) action).getOperation();
				List<String> arguments = ((OperationExecution) action).getArguments();
				TypeSignature[] signature = new TypeSignature[arguments.size()];
				for(int i=0;i<arguments.size();i++){
					SymbolAssignment sva = this.moduleCompiler.symbols.get(arguments.get(i));
					if (sva == null) throw new Exception("Symbol is not defined: "+arguments.get(i));
					//signature[i] = TypeSignature.create(sva);
				}
				
				/*
				 * TODO: check if callee is another SB operation
				 */
				
				OperationDefinition opdef = this.moduleCompiler.findOperation(operation, signature);
				new OperationCompiler(this, opdef, (OperationExecution)action).compile(callList);
			}
			if (action instanceof CodeSymbolPlacement){
				throw new Exception("TODO: labels are not yet supported");
			}
		}
	}
	
}