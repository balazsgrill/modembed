/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceCompound extends hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement {
	
	public DeviceCompound(hu.modembed.model.textnotations.device.grammar.DeviceChoice choice, hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality) {
		super(cardinality, new hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
