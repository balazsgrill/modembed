/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.grammar;

public class InstructionsetContainment extends hu.modembed.model.textnotations.instructionset.grammar.InstructionsetTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public InstructionsetContainment(org.eclipse.emf.ecore.EStructuralFeature feature, hu.modembed.model.textnotations.instructionset.grammar.InstructionsetCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = hu.modembed.model.textnotations.instructionset.util.InstructionsetStringUtil.explode(allowedTypes, ", ", new hu.modembed.model.textnotations.instructionset.IInstructionsetFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
