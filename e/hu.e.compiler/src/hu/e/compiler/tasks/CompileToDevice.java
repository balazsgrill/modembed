/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.behavior.AtomicOperationExecution;
import hu.modembed.model.behavior.BehaviorCall;
import hu.modembed.model.behavior.CodeSymbolPlacement;
import hu.modembed.model.behavior.SequentialAction;
import hu.modembed.model.behavior.SequentialBehavior;
import hu.modembed.model.behavior.Symbol;
import hu.modembed.model.behavior.SymbolValueAssignment;
import hu.modembed.model.behavior.SymbolValueMap;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.model.core.assembler.code.CodePackage;
import hu.modembed.model.platform.OperationArgument;
import hu.modembed.model.platform.OperationDefinition;
import hu.modembed.model.platform.PlatformDefinition;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class CompileToDevice implements IModembedTask {

	public static final String INPUT = "input";
	public static final String PLATFORM = "platform";
	public static final String SYMBOLMAP = "symmap";
	
	public static final String OUTPUT = "output";
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		
		SequentialBehavior behavior = TaskUtils.getInput(context, INPUT, SequentialBehavior.class);
		PlatformDefinition platform = TaskUtils.getInput(context, PLATFORM, PlatformDefinition.class);
		SymbolValueMap symmap = TaskUtils.getInput(context, SYMBOLMAP, SymbolValueMap.class);

		AssemblerObject output = (AssemblerObject) TaskUtils.createOutput(context, OUTPUT, CodePackage.eINSTANCE.getAssemblerObject());
		
		for(SequentialAction sa : behavior.getActions()){
			if (sa instanceof AtomicOperationExecution){
				String op = ((AtomicOperationExecution) sa).getOperation();
				List<Symbol> symbols = ((AtomicOperationExecution) sa).getArguments();
				SymbolValueAssignment[] values = new SymbolValueAssignment[symbols.size()];
				for(int i=0;i<symbols.size();i++){
					Symbol sy = symbols.get(i);
					values[i] = findAssignment(symmap, sy);
				}
				
				OperationDefinition operation = findOperation(platform, op, values);
				if (operation == null){
					context.logStatus(TaskUtils.error("Could not find definition for "+ printOperationSignature(op, values), sa));
				}else{
					//TODO append instruction calls
				}
			}
			if (sa instanceof CodeSymbolPlacement){
				//TODO assign value
			}
			if (sa instanceof BehaviorCall){
				// Not allowed here
			}
		}
		
	}

	private String printOperationSignature(String op, SymbolValueAssignment[] signature){
		StringBuilder sb = new StringBuilder();
		sb.append(op);
		sb.append("<");
		boolean first = true;
		for(SymbolValueAssignment sva : signature){
			if (first) first = false; else sb.append(", ");
			for(int i=0;i<sva.getIndirectionLevel();i++) sb.append("&");
			sb.append(TaskUtils.printType(sva.getSymbol().getType()));
		}
		sb.append(">");
		return sb.toString();
	}
	
	private SymbolValueAssignment findAssignment(SymbolValueMap map, Symbol symbol){
		for(SymbolValueAssignment sva : map.getValues()){
			if (symbol.equals(sva.getSymbol())) return sva; 
		}
		return null;
	}
	
	private OperationDefinition findOperation(PlatformDefinition pd, String operation, SymbolValueAssignment[] signature){
		for(OperationDefinition od : pd.getOperations()) if (operation.equals(od.getOperation())){
			List<OperationArgument> args = od.getArguments();
			if (args.size() == signature.length){
				boolean ok = true;
				for(int i=0;i<signature.length;i++) if (ok){
					ok = check(args.get(i), signature[i]);
				}
				if (ok) return od;
			}
		}
		return null;
	}
	
	private boolean check(OperationArgument arg, SymbolValueAssignment signature){
		if (arg.getIndirectionLevel() == signature.getIndirectionLevel()){
			TaskUtils.canCast(signature.getSymbol().getType(), arg.getType());
		}
		return false;
	}
	
}
