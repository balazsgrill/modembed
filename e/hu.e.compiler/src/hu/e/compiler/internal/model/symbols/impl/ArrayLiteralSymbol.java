/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import java.util.Collections;
import java.util.List;

import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.IArraySymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.Type;

/**
 * @author balazs.grill
 *
 */
public class ArrayLiteralSymbol implements IArraySymbol {

	private final ISymbol[] values;
	private final Type type;
	
	public ArrayLiteralSymbol(ISymbol[] values, Type type) {
		this.values = values;
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.IArraySymbol#getElement(hu.e.compiler.internal.model.ISymbolManager, int)
	 */
	@Override
	public ISymbol getElement(ISymbolManager sm, int index) {
		if (index >= 0 && index < values.length)
			return values[index];
		return null;
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
		return type;
	}

}
