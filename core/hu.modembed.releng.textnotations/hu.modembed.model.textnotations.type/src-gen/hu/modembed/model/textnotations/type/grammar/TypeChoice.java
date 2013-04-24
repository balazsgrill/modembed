/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeChoice extends hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement {
	
	public TypeChoice(hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.type.util.TypeStringUtil.explode(getChildren(), "|");
	}
	
}
