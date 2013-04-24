/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class TypeExpectedCsString extends hu.modembed.model.textnotations.type.mopp.TypeAbstractExpectedElement {
	
	private hu.modembed.model.textnotations.type.grammar.TypeKeyword keyword;
	
	public TypeExpectedCsString(hu.modembed.model.textnotations.type.grammar.TypeKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public hu.modembed.model.textnotations.type.grammar.TypeSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof TypeExpectedCsString) {
			return getValue().equals(((TypeExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
