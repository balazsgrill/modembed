/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.list.LinkTimeValue;

/**
 * @author balazs.grill
 *
 */
public interface ILinkTimeSymbol extends ISymbol {

	public LinkTimeValue getLinkTimeValue();
	
	public int getOffset();
	
}
