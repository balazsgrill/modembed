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
public class NullSymbol implements ILiteralSymbol {

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
	public TypeDef getType() throws ECompilerException {
		throw new ECompilerException(null, "Null symbol");
	}

	@Override
	public long getValue() throws ECompilerException {
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
