/**
 * 
 */
package hu.e.compiler.internal.model.symbols;

import hu.e.compiler.list.ReferableValue;

/**
 * @author balazs.grill
 *
 */
public interface IReferenceSymbol extends ISymbol {

	public ReferableValue getReferableValue();
	
	public int getOffset();
	
}
