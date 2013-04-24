/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device;

public interface IDeviceProblem {
	public String getMessage();
	public hu.modembed.model.textnotations.device.DeviceEProblemSeverity getSeverity();
	public hu.modembed.model.textnotations.device.DeviceEProblemType getType();
	public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> getQuickFixes();
}
