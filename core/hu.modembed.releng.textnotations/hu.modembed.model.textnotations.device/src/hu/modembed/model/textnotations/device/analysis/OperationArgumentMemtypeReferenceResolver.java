/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

public class OperationArgumentMemtypeReferenceResolver implements hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument, hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> {
	
	private MemoryType find(DeviceAbstraction scope, String name){
		for(MemoryType type : scope.getMemoryTypes()){
			if (name.equals(type.getName())){
				return type;
			}
		}
		if (scope.getAncestor() != null){
			return find(scope.getAncestor(), name);
		}
		return null;
	}
	
	public void resolve(String identifier, hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> result) {
		DeviceAbstraction device = (DeviceAbstraction)container.eContainer().eContainer();
		MemoryType mt = find(device, identifier);
		if (mt != null){
			result.addMapping(identifier, mt);
		}
	}
	
	public String deResolve(hu.modembed.model.modembed.abstraction.memorymodel.MemoryType element, hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
