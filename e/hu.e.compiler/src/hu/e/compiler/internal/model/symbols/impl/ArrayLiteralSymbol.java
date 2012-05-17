/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class ArrayLiteralSymbol implements ISymbol {

	private final ISymbol[] values;
	private final TypeDef type;
	
	public ArrayLiteralSymbol(ISymbol[] values, TypeDef type) {
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
	public void addSteps(SequenceStep sequence) {
		
	}

	@Override
	public TypeDef getType() {
		return type;
	}

	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		return null;
	}

}
