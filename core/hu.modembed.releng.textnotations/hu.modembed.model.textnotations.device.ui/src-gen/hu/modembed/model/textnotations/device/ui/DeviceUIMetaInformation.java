/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

public class DeviceUIMetaInformation extends hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation {
	
	public hu.modembed.model.textnotations.device.IDeviceHoverTextProvider getHoverTextProvider() {
		return new hu.modembed.model.textnotations.device.ui.DeviceHoverTextProvider();
	}
	
	public hu.modembed.model.textnotations.device.ui.DeviceImageProvider getImageProvider() {
		return hu.modembed.model.textnotations.device.ui.DeviceImageProvider.INSTANCE;
	}
	
	public hu.modembed.model.textnotations.device.ui.DeviceColorManager createColorManager() {
		return new hu.modembed.model.textnotations.device.ui.DeviceColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(hu.modembed.model.textnotations.device.IDeviceTextResource,
	 * hu.modembed.model.textnotations.device.ui.DeviceColorManager) instead.
	 */
	public hu.modembed.model.textnotations.device.ui.DeviceTokenScanner createTokenScanner(hu.modembed.model.textnotations.device.ui.DeviceColorManager colorManager) {
		return (hu.modembed.model.textnotations.device.ui.DeviceTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public hu.modembed.model.textnotations.device.ui.IDeviceTokenScanner createTokenScanner(hu.modembed.model.textnotations.device.IDeviceTextResource resource, hu.modembed.model.textnotations.device.ui.DeviceColorManager colorManager) {
		return new hu.modembed.model.textnotations.device.ui.DeviceTokenScanner(resource, colorManager);
	}
	
	public hu.modembed.model.textnotations.device.ui.DeviceCodeCompletionHelper createCodeCompletionHelper() {
		return new hu.modembed.model.textnotations.device.ui.DeviceCodeCompletionHelper();
	}
	
}
