/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * A basic implementation of the
 * hu.modembed.model.textnotations.device.IDeviceElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class DeviceElementMapping<ReferenceType> implements hu.modembed.model.textnotations.device.IDeviceElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public DeviceElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
