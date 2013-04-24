/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see hu.modembed.model.textnotations.instructionset.IInstructionsetOptions
 */
public interface IInstructionsetDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
