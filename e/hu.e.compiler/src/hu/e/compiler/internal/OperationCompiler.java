/**
 * 
 */
package hu.e.compiler.internal;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.LabelStep;
import hu.e.compiler.internal.model.OperationEntryStep;
import hu.e.compiler.internal.model.OperationExitStep;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LabelSymbol;
import hu.e.compiler.internal.symbols.AbstractSymbolManager;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class OperationCompiler {

	private final class WrappedSymbolManager extends AbstractSymbolManager {
		private final ISymbolManager sm;

		private WrappedSymbolManager(ISymbolManager sm) {
			this.sm = sm;
		}

		@Override
		public IVariableManager getVariableManager() {
			return sm.getVariableManager();
		}

		@Override
		public ISymbol getSymbol(Variable ref) {
			if (parameters.containsKey(ref)){
				return parameters.get(ref);
			}
			return sm.getSymbol(ref);
		}
		
		@Override
		public void addLabelSymbol(LabelSymbol ls) {
			sm.addLabelSymbol(ls);
		}
		
		@Override
		public void setLabelAddresses(Map<LabelStep, Integer> addresses) {
			sm.setLabelAddresses(addresses);
		}
		
		@Override
		public void contextAssign(VariableReference vr, int value) {
			sm.contextAssign(vr, value);
		}

		@Override
		public OperationFinder getOpFinder() {
			return new OperationFinder(operation);
		}
	}

	private final Operation operation;
	
	private final Map<Variable, ISymbol> parameters = new HashMap<Variable, ISymbol>();
	
	public void addParameter(Variable v, ISymbol symbol){
		parameters.put(v, symbol);
	}
	
	public OperationCompiler(Operation operation) {
		this.operation = operation;
	}
	
	public List<IProgramStep> compile(final ISymbolManager sm){
		List<IProgramStep> steps = new ArrayList<IProgramStep>();
		steps.add(new OperationEntryStep(operation.getName(), parameters));
		OperationBlock block = operation.getBlock();
		if (block == null){
			throw new ECompilerException(operation, "Null block!");
		}
		BlockCompiler bc = new BlockCompiler(block);
		steps.addAll(bc.compile(new WrappedSymbolManager(sm)));
		steps.add(new OperationExitStep());
		return steps;
	}
	
	public ISymbol getReturns(ISymbolManager sm){
		if (operation.getReturn() != null){
			return new WrappedSymbolManager(sm).resolve(operation.getReturn());
		}
		ECompiler.throwError(operation, "Return value assumed to be not null!");
		return null;
	}
	
}
