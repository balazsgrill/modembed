/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.grammar;

public class TypeContainment extends hu.modembed.model.textnotations.type.grammar.TypeTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public TypeContainment(org.eclipse.emf.ecore.EStructuralFeature feature, hu.modembed.model.textnotations.type.grammar.TypeCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = hu.modembed.model.textnotations.type.util.TypeStringUtil.explode(allowedTypes, ", ", new hu.modembed.model.textnotations.type.ITypeFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
