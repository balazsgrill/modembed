/**
 * 
 */
package hu.e.compiler.internal.model.symbols;


import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.compiler.list.SequenceStep;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

/**
 * @author balazs.grill
 *
 */
public interface ISymbol {
	
	public boolean isAssignableAt(SymbolContext context);
	
	public void addSteps(SequenceStep sequence) throws ECompilerException;
	
	public TypeDef getType() throws ECompilerException;
	
	public ISymbol getElement(ISymbolManager sm, int index) throws ECompilerException;
	
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) throws ECompilerException;
	
}
