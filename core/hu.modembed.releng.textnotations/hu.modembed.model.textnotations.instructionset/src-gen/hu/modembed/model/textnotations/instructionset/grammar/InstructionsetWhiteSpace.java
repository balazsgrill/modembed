/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetWhiteSpace extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement {
	
	private final int amount;
	
	public InstructionsetWhiteSpace(int amount, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality) {
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
