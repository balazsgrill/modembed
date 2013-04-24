/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public DeviceResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new hu.modembed.model.textnotations.device.mopp.DeviceResource(uri);
	}
	
}
