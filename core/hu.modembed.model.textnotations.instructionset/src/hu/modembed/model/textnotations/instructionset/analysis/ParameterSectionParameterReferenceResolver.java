/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.analysis;

public class ParameterSectionParameterReferenceResolver implements hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter> {
	
	private hu.modembed.model.textnotations.instructionset.analysis.InstructionsetDefaultResolverDelegate<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter> delegate = new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetDefaultResolverDelegate<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter>();
	
	public void resolve(String identifier, hu.modembed.model.modembed.core.instructionset.ParameterSection container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionParameter> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(hu.modembed.model.modembed.core.instructionset.InstructionParameter element, hu.modembed.model.modembed.core.instructionset.ParameterSection container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
