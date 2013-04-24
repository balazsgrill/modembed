/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ITypeResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public hu.modembed.model.textnotations.type.ITypeResourcePostProcessor getResourcePostProcessor();
	
}
