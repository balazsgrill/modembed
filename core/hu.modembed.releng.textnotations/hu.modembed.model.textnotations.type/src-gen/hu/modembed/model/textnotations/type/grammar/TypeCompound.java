/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeCompound extends hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement {
	
	public TypeCompound(hu.modembed.model.textnotations.type.grammar.TypeChoice choice, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
