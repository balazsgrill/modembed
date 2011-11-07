/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.parser.eSyntax.Type;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class OperatedSymbol implements ILiteralSymbol, IVariableSymbol {

	private final List<IProgramStep> steps;
	private final ISymbol symbol;
	
	public OperatedSymbol(List<IProgramStep> steps, ISymbol symbol) {
		this.steps = steps;
		this.symbol = symbol;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbol#getValue()
	 */
	@Override
	public int getValue() throws ECompilerException {
		return ((ILiteralSymbol)symbol).getValue();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbol#isLiteral()
	 */
	@Override
	public boolean isLiteral() {
		return symbol.isLiteral();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbol#getSteps()
	 */
	@Override
	public List<IProgramStep> getSteps() {
		return steps;
	}

	@Override
	public Type getType() throws ECompilerException {
		return symbol.getType();
	}

	@Override
	public ISymbol getAddressSymbol() {
		return ((IVariableSymbol)symbol).getAddressSymbol();
	}

	@Override
	public String toString() {
		return "{}"+symbol.toString();
	}
	
}
