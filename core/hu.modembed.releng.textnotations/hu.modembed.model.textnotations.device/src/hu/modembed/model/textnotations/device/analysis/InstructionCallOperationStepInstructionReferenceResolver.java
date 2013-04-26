/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.analysis;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.core.instructionset.Instruction;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;

public class InstructionCallOperationStepInstructionReferenceResolver implements hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep, hu.modembed.model.modembed.core.instructionset.Instruction> {
	
	private Instruction find(InstructionSet iset, String name){
		for(Instruction i : iset.getInstructions()){
			if (name.equals(i.getName())) return i;
		}
		if (iset.getExtend() != null){
			return find(iset.getExtend(), name);
		}
		return null;
	}
	
	private Instruction find(DeviceAbstraction scope, String name){
		if (scope.getInstructionset() != null){
			Instruction i = find(scope.getInstructionset(), name);
			if (i != null) return i;
		}
		if (scope.getAncestor() != null){
			return find(scope.getAncestor(), name);
		}
		return null;
	}
	
	public void resolve(String identifier, hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<hu.modembed.model.modembed.core.instructionset.Instruction> result) {
		DeviceAbstraction device = (DeviceAbstraction)container.eContainer().eContainer();
		Instruction i = find(device, identifier);
		if (i != null){
			result.addMapping(identifier, i);
		}
	}
	
	public String deResolve(hu.modembed.model.modembed.core.instructionset.Instruction element, hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
