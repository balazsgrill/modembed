/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class InstructionsetExpectedStructuralFeature extends hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAbstractExpectedElement {
	
	private hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder;
	
	public InstructionsetExpectedStructuralFeature(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof InstructionsetExpectedStructuralFeature) {
			return getFeature().equals(((InstructionsetExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
