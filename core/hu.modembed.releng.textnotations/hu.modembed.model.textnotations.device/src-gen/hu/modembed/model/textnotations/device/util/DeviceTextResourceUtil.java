/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.util;

/**
 * Class DeviceTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * hu.modembed.model.textnotations.device.util.DeviceResourceUtil.
 */
public class DeviceTextResourceUtil {
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.device.mopp.DeviceResource getResource(org.eclipse.core.resources.IFile file) {
		return new hu.modembed.model.textnotations.device.util.DeviceEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.device.mopp.DeviceResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.device.mopp.DeviceResource getResource(org.eclipse.emf.common.util.URI uri) {
		return hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.device.mopp.DeviceResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.device.util.DeviceResourceUtil.getResource(uri, options);
	}
	
}
