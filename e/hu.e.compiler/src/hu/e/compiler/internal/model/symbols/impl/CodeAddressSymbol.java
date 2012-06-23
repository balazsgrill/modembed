/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILinkTimeSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.LinkTimeValue;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class CodeAddressSymbol implements ILinkTimeSymbol {

	private final LabelStep step;
	
	private final TypeDef addressType;
	
	public CodeAddressSymbol(LabelStep step, TypeDef addressType) {
		this.step = step;
		this.addressType = addressType;
	}
	
	public LabelStep getStep() {
		return step;
	}
	
	@Override
	public String toString() {
		return "label "+step.toString();
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
	public void addSteps(SequenceStep sequence) {
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() {
		return addressType;
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

	@Override
	public LinkTimeValue getLinkTimeValue() {
		Reference ref = ListFactory.eINSTANCE.createReference();
		ref.setValue(getStep());
		return ref;
	}

	@Override
	public int getOffset() {
		return 0;
	}

}
