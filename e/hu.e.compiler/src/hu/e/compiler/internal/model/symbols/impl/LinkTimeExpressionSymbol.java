/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILinkTimeSymbol;
import hu.e.compiler.internal.model.symbols.ILiteralSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.internal.model.symbols.SymbolContext;
import hu.e.compiler.list.LinkTimeConstant;
import hu.e.compiler.list.LinkTimeExpression;
import hu.e.compiler.list.LinkTimeOperation;
import hu.e.compiler.list.LinkTimeValue;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balage
 *
 */
public class LinkTimeExpressionSymbol implements ILinkTimeSymbol {

	private final TypeDef type;
	private final LinkTimeOperation op;
	private final ISymbol arguments[];
	
	public LinkTimeExpressionSymbol(TypeDef type, LinkTimeOperation op, ISymbol... arguments) {
		this.type = type;
		this.op = op;
		this.arguments = arguments;
	}
	
	@Override
	public boolean isAssignableAt(SymbolContext context) {
		return SymbolContext.LINKTIME.isAssignableAt(context);
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#addSteps(hu.e.compiler.list.SequenceStep)
	 */
	@Override
	public void addSteps(SequenceStep sequence) throws ECompilerException {

	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ISymbol#getType()
	 */
	@Override
	public TypeDef getType() throws ECompilerException {
		return type;
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

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ILinkTimeSymbol#getLinkTimeValue()
	 */
	@Override
	public LinkTimeValue getLinkTimeValue() throws ECompilerException {
		LinkTimeExpression exp = ListFactory.eINSTANCE.createLinkTimeExpression();
		exp.setOperation(op);
		for(ISymbol s : arguments){
			if (s instanceof ILiteralSymbol){
				LinkTimeConstant c = ListFactory.eINSTANCE.createLinkTimeConstant();
				c.setValue(((ILiteralSymbol) s).getValue().intValue());
				exp.getArguments().add(c);
			}
			if (s instanceof ILinkTimeSymbol){
				exp.getArguments().add(((ILinkTimeSymbol) s).getLinkTimeValue());
			}
		}
		return exp;
	}

	/* (non-Javadoc)
	 * @see hu.e.compiler.internal.model.symbols.ILinkTimeSymbol#getOffset()
	 */
	@Override
	public int getOffset() {
		return 0;
	}

}
