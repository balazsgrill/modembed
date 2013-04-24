/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public InstructionsetResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResource(uri);
	}
	
}
