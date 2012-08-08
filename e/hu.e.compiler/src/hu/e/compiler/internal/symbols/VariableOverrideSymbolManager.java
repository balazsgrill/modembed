/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class VariableOverrideSymbolManager extends AbstractSymbolManager {

	private final ISymbolManager parent;
	
	public final Map<Variable, ISymbol> overrides = new HashMap<Variable, ISymbol>();
	
	public VariableOverrideSymbolManager(ISymbolManager parent) {
		super(parent.getCodePlatform());
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getSymbol(hu.e.parser.eSyntax.Variable)
	 */
	@Override
	public ISymbol getSymbol(Variable ref) throws ECompilerException {
		if (overrides.containsKey(ref)) return overrides.get(ref);
		return parent.getSymbol(ref);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return parent.getVariableManager();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getOpFinder()
	 */
	@Override
	public OperationFinder getOpFinder() {
		return parent.getOpFinder();
	}

}
