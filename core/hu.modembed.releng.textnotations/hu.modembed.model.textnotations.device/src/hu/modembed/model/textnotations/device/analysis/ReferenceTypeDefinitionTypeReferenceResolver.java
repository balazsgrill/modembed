/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.abstraction.types.Type;
import hu.modembed.model.modembed.infrastructure.RootElement;

public class ReferenceTypeDefinitionTypeReferenceResolver implements hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type> {
	
	public void resolve(String identifier, hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<hu.modembed.model.modembed.abstraction.types.Type> result) {
		RootElement re = MODembedCore.getDefault().getModelIndex().findRootElement(container.eResource(), identifier);
		if (re instanceof Type){
			result.addMapping(identifier, (Type)re);
		}
	}
	
	public String deResolve(hu.modembed.model.modembed.abstraction.types.Type element, hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
