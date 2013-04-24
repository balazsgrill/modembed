/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceResourcePostProcessor implements hu.modembed.model.textnotations.device.IDeviceResourcePostProcessor {
	
	public void process(hu.modembed.model.textnotations.device.mopp.DeviceResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
