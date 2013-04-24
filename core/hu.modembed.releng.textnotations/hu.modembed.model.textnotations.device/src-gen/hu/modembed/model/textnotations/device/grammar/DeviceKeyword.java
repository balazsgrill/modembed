/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class DeviceKeyword extends hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement {
	
	private final String value;
	
	public DeviceKeyword(String value, hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality) {
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
