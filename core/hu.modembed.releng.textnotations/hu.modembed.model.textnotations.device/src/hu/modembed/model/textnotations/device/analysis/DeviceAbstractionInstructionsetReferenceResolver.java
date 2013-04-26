/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;
import hu.modembed.model.modembed.infrastructure.RootElement;

public class DeviceAbstractionInstructionsetReferenceResolver implements hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.DeviceAbstraction, hu.modembed.model.modembed.core.instructionset.InstructionSet> {
	
	public void resolve(String identifier, hu.modembed.model.modembed.abstraction.DeviceAbstraction container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionSet> result) {
		RootElement re = MODembedCore.getDefault().getModelIndex().findRootElement(container.eResource(), identifier);
		if (re instanceof InstructionSet){
			result.addMapping(identifier, (InstructionSet)re);
		}
	}
	
	public String deResolve(hu.modembed.model.modembed.core.instructionset.InstructionSet element, hu.modembed.model.modembed.abstraction.DeviceAbstraction container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
