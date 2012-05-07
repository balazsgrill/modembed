/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompiler;
import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.IReferenceSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ReferableValue;
import hu.e.compiler.list.ScriptStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

import java.util.Collections;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ScriptedSymbol implements IReferenceSymbol {

	private final ScriptStep va;
	
	/**
	 * 
	 */
	public ScriptedSymbol(String value) {
		va = ListFactory.eINSTANCE.createScriptStep();
		va.setExecute(ECompiler.convertScriptLiteral(value));
	}

	public ScriptStep getScriptedValue() {
		return va;
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
		return Collections.singletonList((ProgramStep)va);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() throws ECompilerException {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getElement(hu.e.compiler.internal.model.ISymbolManager, int)
	 */
	@Override
	public ISymbol getElement(ISymbolManager sm, int index)
			throws ECompilerException {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getMember(hu.e.compiler.internal.model.ISymbolManager, hu.e.parser.eSyntax.StructTypeDefMember)
	 */
	@Override
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member)
			throws ECompilerException {
		return null;
	}

	@Override
	public ReferableValue getReferableValue() {
		return va;
	}

	@Override
	public int getOffset() {
		return 0;
	}

}
