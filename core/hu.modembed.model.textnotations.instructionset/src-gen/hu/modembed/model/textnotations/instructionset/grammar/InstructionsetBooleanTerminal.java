/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class InstructionsetBooleanTerminal extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public InstructionsetBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
