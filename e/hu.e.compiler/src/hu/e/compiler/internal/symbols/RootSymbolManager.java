/**
 * 
 */
package hu.e.compiler.internal.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.linking.OperationFinder;
import hu.e.compiler.internal.model.IVariableManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.impl.LiteralSymbol;
import hu.e.compiler.internal.model.symbols.impl.VariableSymbol;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.Variable;

/**
 * @author balazs.grill
 *
 */
public class RootSymbolManager extends AbstractSymbolManager {

	public RootSymbolManager() {
		super(null);
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getSymbol(hu.e.parser.eSyntax.Variable)
	 */
	@Override
	public ISymbol getSymbol(Variable ref) throws ECompilerException {
		if (ref instanceof ConstantVariable){
			ILiteralSymbol lsymbol = (ILiteralSymbol)resolve(((ConstantVariable) ref).getValue());
			return new LiteralSymbol(ref.getType(), lsymbol.getValue());
		}
		if (ref instanceof RegisterVariable){
			return VariableSymbol.create(resolve(((RegisterVariable) ref).getAddr()), ref.getType());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbolManager#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return null;
	}

	@Override
	public OperationFinder getOpFinder() {
		return getCodePlatform().getOperationFinder();
	}
	

}
