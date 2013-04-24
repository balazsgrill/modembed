/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeWhiteSpace extends hu.modembed.model.textnotations.type.grammar.TypeFormattingElement {
	
	private final int amount;
	
	public TypeWhiteSpace(int amount, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
