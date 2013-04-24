/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

public class ReferenceTypeDefinitionTypeReferenceResolver implements hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type> {
	
	private hu.modembed.model.textnotations.device.analysis.DeviceDefaultResolverDelegate<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type> delegate = new hu.modembed.model.textnotations.device.analysis.DeviceDefaultResolverDelegate<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type>();
	
	public void resolve(String identifier, hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<hu.modembed.model.modembed.abstraction.types.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(hu.modembed.model.modembed.abstraction.types.Type element, hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
