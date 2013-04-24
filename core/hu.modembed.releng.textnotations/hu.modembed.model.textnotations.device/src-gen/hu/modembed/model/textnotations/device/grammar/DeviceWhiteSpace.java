/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceWhiteSpace extends hu.modembed.model.textnotations.device.grammar.DeviceFormattingElement {
	
	private final int amount;
	
	public DeviceWhiteSpace(int amount, hu.modembed.model.textnotations.device.grammar.DeviceCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
