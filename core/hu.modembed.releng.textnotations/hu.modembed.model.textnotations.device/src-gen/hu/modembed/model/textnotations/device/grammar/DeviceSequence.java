/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceSequence extends hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement {
	
	public DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality, hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return hu.modembed.model.textnotations.device.util.DeviceStringUtil.explode(getChildren(), " ");
	}
	
}
