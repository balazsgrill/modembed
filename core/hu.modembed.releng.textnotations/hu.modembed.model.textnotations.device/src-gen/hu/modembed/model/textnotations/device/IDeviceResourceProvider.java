/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IDeviceResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public hu.modembed.model.textnotations.device.IDeviceTextResource getResource();
	
}
