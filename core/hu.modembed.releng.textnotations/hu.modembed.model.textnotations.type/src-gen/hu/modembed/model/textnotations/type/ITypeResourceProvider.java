/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface ITypeResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public hu.modembed.model.textnotations.type.ITypeTextResource getResource();
	
}
