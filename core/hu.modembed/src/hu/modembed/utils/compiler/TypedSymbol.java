/**
 * 
 */
package hu.modembed.utils.compiler;

import org.eclipse.core.runtime.Assert;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

/**
 * @author balazs.grill
 *
 */
public class TypedSymbol {

	private final String symbol;
	private final TypeDefinition type;
	
	public TypedSymbol(String symbol, TypeDefinition type) {
		super();
		Assert.isNotNull(type, "Symbol '"+symbol+"' does not have a type definition!");
		this.symbol = symbol;
		this.type = type;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public TypeDefinition getType() {
		return type;
	}
	
}
