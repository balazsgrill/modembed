/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeLineBreak extends hu.modembed.model.textnotations.type.grammar.TypeFormattingElement {
	
	private final int tabs;
	
	public TypeLineBreak(hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
