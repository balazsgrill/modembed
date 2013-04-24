/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class InstructionsetContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements hu.modembed.model.textnotations.instructionset.IInstructionsetContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public InstructionsetContextDependentURIFragmentFactory(hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
