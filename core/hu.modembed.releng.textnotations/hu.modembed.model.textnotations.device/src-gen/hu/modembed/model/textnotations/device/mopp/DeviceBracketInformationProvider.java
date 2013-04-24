/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class DeviceBracketInformationProvider {
	
	public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceBracketPair> getBracketPairs() {
		java.util.Collection<hu.modembed.model.textnotations.device.IDeviceBracketPair> result = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceBracketPair>();
		result.add(new hu.modembed.model.textnotations.device.mopp.DeviceBracketPair("(", ")", true, false));
		result.add(new hu.modembed.model.textnotations.device.mopp.DeviceBracketPair("[", "]", true, false));
		result.add(new hu.modembed.model.textnotations.device.mopp.DeviceBracketPair("{", "}", true, true));
		return result;
	}
	
}
