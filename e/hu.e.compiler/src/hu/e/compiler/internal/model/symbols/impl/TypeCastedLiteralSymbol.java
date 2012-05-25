/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

import java.math.BigDecimal;

/**
 * @author balazs.grill
 *
 */
public class TypeCastedLiteralSymbol implements ILiteralSymbol {

	private final TypeDef td;
	private final ILiteralSymbol symbol;
	
	public TypeCastedLiteralSymbol(TypeDef td, ILiteralSymbol symbol) {
		this.td = td;
		this.symbol = symbol;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#isLiteral()
	 */
	@Override
	public boolean isLiteral() {
		return symbol.isLiteral();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#addSteps(hu.e.compiler.list.SequenceStep)
	 */
	@Override
	public void addSteps(SequenceStep sequence) throws ECompilerException {
		symbol.addSteps(sequence);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() throws ECompilerException {
		return td;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getElement(hu.e.compiler.internal.model.ISymbolManager, int)
	 */
	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		return symbol.getElement(sm, index);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getMember(hu.e.compiler.internal.model.ISymbolManager, hu.e.parser.eSyntax.StructTypeDefMember)
	 */
	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		return symbol.getMember(sm, member);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ILiteralSymbol#getValue()
	 */
	@Override
	public BigDecimal getValue() throws ECompilerException {
		return symbol.getValue();
	}

}
