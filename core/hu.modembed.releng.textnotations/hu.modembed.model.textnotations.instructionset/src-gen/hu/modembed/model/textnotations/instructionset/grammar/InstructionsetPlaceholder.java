/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class InstructionsetPlaceholder extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal {
	
	private final String tokenName;
	
	public InstructionsetPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
