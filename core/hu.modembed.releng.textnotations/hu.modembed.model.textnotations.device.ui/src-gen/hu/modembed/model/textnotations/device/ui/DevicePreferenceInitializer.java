/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

/**
 * This class can be used to initialize default preference values.
 */
public class DevicePreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = hu.modembed.model.textnotations.device.ui.DeviceUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(hu.modembed.model.textnotations.device.ui.DevicePreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(hu.modembed.model.textnotations.device.ui.DevicePreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	protected void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = hu.modembed.model.textnotations.device.ui.DeviceUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation());
	}
	
	protected void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, hu.modembed.model.textnotations.device.IDeviceMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets
		hu.modembed.model.textnotations.device.ui.DeviceBracketSet bracketSet = new hu.modembed.model.textnotations.device.ui.DeviceBracketSet();
		final java.util.Collection<hu.modembed.model.textnotations.device.IDeviceBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (hu.modembed.model.textnotations.device.IDeviceBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside(), bracketPair.isCloseAfterEnter());
			}
		}
		store.setDefault(languageId + hu.modembed.model.textnotations.device.ui.DevicePreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.serialize());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = hu.modembed.model.textnotations.device.ui.DeviceUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation());
	}
	
	protected void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			hu.modembed.model.textnotations.device.IDeviceTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	protected void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	protected String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
	
}

