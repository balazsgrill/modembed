/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompilerPart {

	public static SequentialAction label(String labelSymbol){
		CodeSymbolPlacement label = BehaviorFactory.eINSTANCE.createCodeSymbolPlacement();
		label.setSymbol(labelSymbol);
		return label;
	}
	
	public static SequentialAction op(String operation, String...arguments){
		OperationExecution op = BehaviorFactory.eINSTANCE.createOperationExecution();
		op.setOperation(operation);
		for(String arg : arguments){
			op.getArguments().add(arg);
		}
		return op;
	}
	
	private final SequentialBehaviorPart part;
	
	/**
	 * 
	 */
	public ModuleCompilerPart(SequentialBehaviorPart part) {
		this.part = part;
	}

}
