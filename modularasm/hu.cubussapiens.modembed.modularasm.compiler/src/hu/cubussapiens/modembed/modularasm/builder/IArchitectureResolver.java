/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder;

import org.eclipse.emf.ecore.resource.ResourceSet;

import embedded.assembly.InstructionSet;

/**
 * Implementors of this interface are responsible for resolving
 * the instruction set for an architecture identified by a string.
 * 
 * @author balage
 *
 */
public interface IArchitectureResolver {

	/**
	 * Return the instruction set for the given architecture
	 * @param archid
	 * @param resourceSet TODO
	 * @return
	 */
	public InstructionSet getInstructionSet(String archid, ResourceSet resourceSet);
	
}
