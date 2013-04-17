/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IInstructionsetResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource getResource();
	
}
