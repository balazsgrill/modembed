/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IDeviceExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(hu.modembed.model.textnotations.device.IDeviceExpectedElement follower, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<hu.modembed.model.textnotations.device.util.DevicePair<hu.modembed.model.textnotations.device.IDeviceExpectedElement, hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[]>> getFollowers();
	
}
