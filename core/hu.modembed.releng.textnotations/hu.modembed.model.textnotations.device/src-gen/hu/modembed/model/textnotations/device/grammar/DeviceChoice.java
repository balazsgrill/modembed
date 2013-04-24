/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceChoice extends hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement {
	
	public DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality, hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.device.util.DeviceStringUtil.explode(getChildren(), "|");
	}
	
}
