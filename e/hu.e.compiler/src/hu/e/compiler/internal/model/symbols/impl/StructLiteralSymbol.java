/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;

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
	
	@Override
	public boolean isAssignableAt(SymbolContext context) {
		return SymbolContext.COMPILETIME.isAssignableAt(context);
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
