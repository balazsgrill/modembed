/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceProblem implements hu.modembed.model.textnotations.device.IDeviceProblem {
	
	private String message;
	private hu.modembed.model.textnotations.device.DeviceEProblemType type;
	private hu.modembed.model.textnotations.device.DeviceEProblemSeverity severity;
	private java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> quickFixes;
	
	public DeviceProblem(String message, hu.modembed.model.textnotations.device.DeviceEProblemType type, hu.modembed.model.textnotations.device.DeviceEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<hu.modembed.model.textnotations.device.IDeviceQuickFix>emptySet());
	}
	
	public DeviceProblem(String message, hu.modembed.model.textnotations.device.DeviceEProblemType type, hu.modembed.model.textnotations.device.DeviceEProblemSeverity severity, hu.modembed.model.textnotations.device.IDeviceQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public DeviceProblem(String message, hu.modembed.model.textnotations.device.DeviceEProblemType type, hu.modembed.model.textnotations.device.DeviceEProblemSeverity severity, java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<hu.modembed.model.textnotations.device.IDeviceQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public hu.modembed.model.textnotations.device.DeviceEProblemType getType() {
		return type;
	}
	
	public hu.modembed.model.textnotations.device.DeviceEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
