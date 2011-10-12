/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.parser.eSyntax.Type;

import java.util.Collections;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class LiteralSymbol implements ILiteralSymbol {

	private final int value;
	
	public LiteralSymbol(int value) {
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.ISymbol#getValue()
	 */
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public boolean isLiteral() {
		return true;
	}

	@Override
	public List<IProgramStep> getSteps() {
		return Collections.emptyList();
	}

	@Override
	public Type getType() {
		return null;
	}

	@Override
	public String toString() {
		return ""+value;
	}
	
}
