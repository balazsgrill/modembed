/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class DevicePlaceholder extends hu.modembed.model.textnotations.device.grammar.DeviceTerminal {
	
	private final String tokenName;
	
	public DevicePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
