/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class DeviceExpectedCsString extends hu.modembed.model.textnotations.device.mopp.DeviceAbstractExpectedElement {
	
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword keyword;
	
	public DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof DeviceExpectedCsString) {
			return getValue().equals(((DeviceExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
