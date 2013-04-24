/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceParseResult implements hu.modembed.model.textnotations.device.IDeviceParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	
	private hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap;
	
	private java.util.Collection<hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>> commands = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>>();
	
	public DeviceParseResult() {
		super();
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public hu.modembed.model.textnotations.device.IDeviceLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(hu.modembed.model.textnotations.device.IDeviceLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceCommand<hu.modembed.model.textnotations.device.IDeviceTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
