/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.ProgramStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

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
	public List<ProgramStep> getSteps() {
		return Collections.emptyList();
	}

	@Override
	public TypeDef getType() {
		return null;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		return null;
	}

	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		return null;
	}
	
}
