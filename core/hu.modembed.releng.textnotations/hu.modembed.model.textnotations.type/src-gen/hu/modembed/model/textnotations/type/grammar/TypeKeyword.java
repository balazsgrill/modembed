/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class TypeKeyword extends hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement {
	
	private final String value;
	
	public TypeKeyword(String value, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
