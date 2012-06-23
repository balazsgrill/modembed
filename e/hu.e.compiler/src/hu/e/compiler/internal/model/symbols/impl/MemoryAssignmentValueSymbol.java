/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.ILinkTimeSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.LinkTimeValue;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class MemoryAssignmentValueSymbol implements ILinkTimeSymbol {

	private final MemoryAssignment assignment;
	
	private final int offset;
	
	private final TypeDef type;
	
	/**
	 * 
	 */
	public MemoryAssignmentValueSymbol(MemoryAssignment assignment, int offset, TypeDef type) {
		this.assignment = assignment;
		this.offset = offset;
		this.type = type;
	}

	public MemoryAssignment getAssignment() {
		return assignment;
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
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member){
		return null;
	}

	@Override
	public LinkTimeValue getLinkTimeValue() {
		Reference ref = ListFactory.eINSTANCE.createReference();
		ref.setValue(getAssignment());
		return ref;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAssignment().getName());
		if (offset != 0){
			sb.append("[");
			sb.append(offset);
			sb.append("]");
		}
		return sb.toString();
	}
	
}
