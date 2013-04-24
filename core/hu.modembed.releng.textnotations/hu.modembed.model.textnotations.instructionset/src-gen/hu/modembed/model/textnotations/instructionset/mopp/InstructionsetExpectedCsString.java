/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class InstructionsetExpectedCsString extends hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAbstractExpectedElement {
	
	private hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword keyword;
	
	public InstructionsetExpectedCsString(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof InstructionsetExpectedCsString) {
			return getValue().equals(((InstructionsetExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
