/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.internal.model.ISymbolManager;

/**
 * @author balazs.grill
 *
 */
public interface IArraySymbol extends ISymbol{

	public ISymbol getElement(ISymbolManager sm, int index); 
	
}
