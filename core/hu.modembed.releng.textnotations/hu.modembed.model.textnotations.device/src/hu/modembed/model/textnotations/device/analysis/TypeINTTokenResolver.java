/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

public class TypeINTTokenResolver implements hu.modembed.model.textnotations.device.IDeviceTokenResolver {
	
	private hu.modembed.model.textnotations.type.analysis.TypeINTTokenResolver importedResolver = new hu.modembed.model.textnotations.type.analysis.TypeINTTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = importedResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, final hu.modembed.model.textnotations.device.IDeviceTokenResolveResult result) {
		importedResolver.resolve(lexem, feature, new hu.modembed.model.textnotations.type.ITypeTokenResolveResult() {
			public String getErrorMessage() {
				return result.getErrorMessage();
			}
			
			public Object getResolvedToken() {
				return result.getResolvedToken();
			}
			
			public void setErrorMessage(String message) {
				result.setErrorMessage(message);
			}
			
			public void setResolvedToken(Object resolvedToken) {
				result.setResolvedToken(resolvedToken);
			}
			
		});
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		importedResolver.setOptions(options);
	}
	
}
