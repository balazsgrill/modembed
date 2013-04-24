/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetLineBreak extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetFormattingElement {
	
	private final int tabs;
	
	public InstructionsetLineBreak(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, int tabs) {
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
