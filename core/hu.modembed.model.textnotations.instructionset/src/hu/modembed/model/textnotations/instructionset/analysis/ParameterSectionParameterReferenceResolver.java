/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.analysis;

import hu.modembed.model.modembed.core.instructionset.Instruction;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;

public class ParameterSectionParameterReferenceResolver implements hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter> {
	
	public void resolve(String identifier, hu.modembed.model.modembed.core.instructionset.ParameterSection container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionParameter> result) {
		
		InstructionParameter value = null;
		
		Instruction inst = (Instruction)container.eContainer().eContainer();
		for(InstructionParameter ip : inst.getParameters()){
			if (identifier.equals(ip.getName())){
				value = ip;
			}
		}
		
		if (value != null){
			result.addMapping(identifier, value);
		}else{
			result.setErrorMessage("Could not find parameter: "+identifier);
		}
	}
	
	public String deResolve(hu.modembed.model.modembed.core.instructionset.InstructionParameter element, hu.modembed.model.modembed.core.instructionset.ParameterSection container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
