/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.parser.eSyntax.Type;

import java.util.Collections;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class NullSymbol implements ILiteralSymbol {

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#isLiteral()
	 */
	@Override
	public boolean isLiteral() {
		return true;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getSteps()
	 */
	@Override
	public List<IProgramStep> getSteps() {
		return Collections.emptyList();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public Type getType() throws ECompilerException {
		throw new ECompilerException(null, "Null symbol");
	}

	@Override
	public int getValue() throws ECompilerException {
		throw new ECompilerException(null, "Null symbol");
	}

}
