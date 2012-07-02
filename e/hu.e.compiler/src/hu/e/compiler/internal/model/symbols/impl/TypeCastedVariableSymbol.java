/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.TypeDefinitionResolver;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.IVariableSymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class TypeCastedVariableSymbol implements IVariableSymbol {

	private final TypeDef td;
	private final IVariableSymbol symbol;
	
	public TypeCastedVariableSymbol(TypeDef td, IVariableSymbol symbol) {
		this.td = td;
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return TypeDefinitionResolver.getTypeDefString(td)+":"+symbol.toString();
	}
	
	@Override
	public boolean isAssignableAt(SymbolContext context) {
		return symbol.isAssignableAt(context);
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
	 * @see hu.e.compiler.internal.model.symbols.IVariableSymbol#getAddressSymbol()
	 */
	@Override
	public ISymbol getAddressSymbol() throws ECompilerException {
		return symbol.getAddressSymbol();
	}

}
