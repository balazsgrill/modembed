/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetCompound extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement {
	
	public InstructionsetCompound(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetChoice choice, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
