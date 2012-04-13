/**
 * 
 */
package hu.e.compiler.internal.model.symbols.impl;

import java.util.Collections;
import java.util.List;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.internal.model.symbols.IReferenceSymbol;
import hu.e.compiler.internal.model.symbols.ISymbol;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ReferableValue;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public class MemoryAssignmentValueSymbol implements IReferenceSymbol {

	private final MemoryAssignment assignment;
	
	private final int offset;
	
	/**
	 * 
	 */
	public MemoryAssignmentValueSymbol(MemoryAssignment assignment, int offset) {
		this.assignment = assignment;
		this.offset = offset;
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
	public List<ProgramStep> getSteps() {
		return Collections.emptyList();
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
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member){
		return null;
	}

	@Override
	public ReferableValue getReferableValue() {
		return getAssignment();
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
