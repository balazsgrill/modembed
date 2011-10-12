/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import java.util.Collections;
import java.util.List;

import hu.e.compiler.internal.model.AddressedStep;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.parser.eSyntax.Type;

/**
 * @author balazs.grill
 *
 */
public class CodeAddressSymbol implements ILiteralSymbol {

	private final AddressedStep step;
	
	public CodeAddressSymbol(AddressedStep step) {
		this.step = step;
	}
	
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
	public Type getType() {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ILiteralSymbol#getValue()
	 */
	@Override
	public int getValue() {
		return step.address;
	}

}
