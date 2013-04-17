/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IInstructionsetResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public hu.modembed.model.textnotations.instructionset.IInstructionsetResourcePostProcessor getResourcePostProcessor();
	
}
