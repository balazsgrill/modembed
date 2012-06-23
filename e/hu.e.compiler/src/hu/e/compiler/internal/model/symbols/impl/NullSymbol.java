/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import java.math.BigDecimal;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class NullSymbol implements ILiteralSymbol {

	@Override
	public boolean isAssignableAt(SymbolContext context) {
		return SymbolContext.COMPILETIME.isAssignableAt(context);
	}

	@Override
	public String toString() {
		return "<NULL>";
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getSteps()
	 */
	@Override
	public void addSteps(SequenceStep sequence) {
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() throws ECompilerException {
		throw new ECompilerException(null, "Null symbol");
	}

	@Override
	public BigDecimal getValue() throws ECompilerException {
		throw new ECompilerException(null, "Null symbol");
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
