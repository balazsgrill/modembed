/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.ECompilerException;
import hu.e.compiler.internal.model.IProgramStep;
import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TypeDef;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public interface ISymbol {
	
	public boolean isLiteral();
	
	public List<IProgramStep> getSteps();
	
	public TypeDef getType() throws ECompilerException;
	
	public ISymbol getElement(ISymbolManager sm, int index) throws ECompilerException;
	
	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member) throws ECompilerException;
	
}
