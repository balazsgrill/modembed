/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public hu.modembed.model.textnotations.device.IDeviceTokenStyle getDynamicTokenStyle(hu.modembed.model.textnotations.device.IDeviceTextResource resource, hu.modembed.model.textnotations.device.IDeviceTextToken token, hu.modembed.model.textnotations.device.IDeviceTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
