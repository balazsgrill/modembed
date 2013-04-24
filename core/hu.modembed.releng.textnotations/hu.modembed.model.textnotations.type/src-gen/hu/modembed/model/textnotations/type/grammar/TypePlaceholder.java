/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class TypePlaceholder extends hu.modembed.model.textnotations.type.grammar.TypeTerminal {
	
	private final String tokenName;
	
	public TypePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
