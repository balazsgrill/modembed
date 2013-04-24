/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class DeviceAbstractExpectedElement implements hu.modembed.model.textnotations.device.IDeviceExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>> followers = new java.util.LinkedHashSet<hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>>();
	
	public DeviceAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(hu.modembed.model.textnotations.device.IDeviceExpectedElement follower, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] path) {
		followers.add(new hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
