/**
 * 
 */
package hu.modembed.utils.compiler;

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
