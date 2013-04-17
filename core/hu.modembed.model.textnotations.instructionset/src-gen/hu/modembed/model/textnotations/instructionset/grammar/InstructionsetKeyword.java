/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class InstructionsetKeyword extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement {
	
	private final String value;
	
	public InstructionsetKeyword(String value, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
