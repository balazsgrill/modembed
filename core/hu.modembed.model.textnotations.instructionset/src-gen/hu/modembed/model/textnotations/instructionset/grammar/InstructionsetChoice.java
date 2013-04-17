/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetChoice extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement {
	
	public InstructionsetChoice(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.explode(getChildren(), "|");
	}
	
}
