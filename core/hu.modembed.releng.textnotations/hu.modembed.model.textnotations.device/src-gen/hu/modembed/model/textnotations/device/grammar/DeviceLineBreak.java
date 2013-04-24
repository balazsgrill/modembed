/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceLineBreak extends hu.modembed.model.textnotations.device.grammar.DeviceFormattingElement {
	
	private final int tabs;
	
	public DeviceLineBreak(hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
