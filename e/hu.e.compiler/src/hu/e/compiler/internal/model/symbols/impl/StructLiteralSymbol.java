/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.IStructSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;

/**
 * @author balazs.grill
 *
 */
public class StructLiteralSymbol implements IStructSymbol {

	private final Map<StructTypeDefMember, ISymbol> symbols;
	private final Type type;
	
	public StructLiteralSymbol(Map<StructTypeDefMember, ISymbol> symbols, Type type) {
		this.symbols = symbols;
		this.type = type;
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
		return type;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.IStructSymbol#getMember(hu.e.compiler.internal.model.ISymbolManager, hu.e.parser.eSyntax.StructTypeDefMember)
	 */
	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) {
		return symbols.get(member);
	}

}
