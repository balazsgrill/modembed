/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class InstructionsetExpectedBooleanTerminal extends hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAbstractExpectedElement {
	
	private hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal booleanTerminal;
	
	public InstructionsetExpectedBooleanTerminal(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof InstructionsetExpectedBooleanTerminal) {
			return getFeature().equals(((InstructionsetExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
