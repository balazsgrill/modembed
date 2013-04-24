/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetSequence extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement {
	
	public InstructionsetSequence(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.explode(getChildren(), " ");
	}
	
}
