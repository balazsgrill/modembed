/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.ProgramStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author balazs.grill
 *
 */
public class StructLiteralSymbol implements ISymbol {

	private final Map<Variable, ISymbol> symbols;
	private final TypeDef type;
	
	public StructLiteralSymbol(Map<Variable, ISymbol> symbols, TypeDef type) {
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
	public List<ProgramStep> getSteps() {
		return Collections.emptyList();
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.IStructSymbol#getMember(hu.e.compiler.internal.model.ISymbolManager, hu.e.parser.eSyntax.StructTypeDefMember)
	 */
	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) {
		return symbols.get(member);
	}

	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		return null;
	}

}
