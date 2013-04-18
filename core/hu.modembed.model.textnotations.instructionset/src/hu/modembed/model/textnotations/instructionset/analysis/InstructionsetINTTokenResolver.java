/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.analysis;

public class InstructionsetINTTokenResolver implements hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver {
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		if (value instanceof Number){
			long v = ((Number) value).longValue();
			return Long.toString(v);
		}
		return null;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolveResult result) {
		Object value = null;

		try{
			long v = Long.parseLong(lexem);
			Class<?> clazz = feature.getEType().getInstanceClass();
			if (long.class.equals(clazz) || Long.class.equals(clazz)){
				value = Long.valueOf(v);
			}
			if (int.class.equals(clazz) || Integer.class.equals(clazz)){
				value = Integer.valueOf((int)v);
			}
		}catch(NumberFormatException e){
			result.setErrorMessage(e.getLocalizedMessage());
		}

		result.setResolvedToken(value);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
	}
	
}