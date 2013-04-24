/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeSequence extends hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement {
	
	public TypeSequence(hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.type.util.TypeStringUtil.explode(getChildren(), " ");
	}
	
}
