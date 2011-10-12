/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.internal.model.ISymbolManager;
import hu.e.parser.eSyntax.StructTypeDefMember;

/**
 * @author balazs.grill
 *
 */
public interface IStructSymbol extends ISymbol{

	public ISymbol getMember(ISymbolManager sm, StructTypeDefMember member); 
	
}
