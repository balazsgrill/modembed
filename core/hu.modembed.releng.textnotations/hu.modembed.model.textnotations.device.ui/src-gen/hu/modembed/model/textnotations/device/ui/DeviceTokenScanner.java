/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class DeviceTokenScanner implements hu.modembed.model.textnotations.device.ui.IDeviceTokenScanner {
	
	private hu.modembed.model.textnotations.device.IDeviceTextScanner lexer;
	private hu.modembed.model.textnotations.device.IDeviceTextToken currentToken;
	private java.util.List<hu.modembed.model.textnotations.device.IDeviceTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private hu.modembed.model.textnotations.device.ui.DeviceColorManager colorManager;
	private hu.modembed.model.textnotations.device.IDeviceTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public DeviceTokenScanner(hu.modembed.model.textnotations.device.IDeviceTextResource resource, hu.modembed.model.textnotations.device.ui.DeviceColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation().createLexer();
		this.languageId = new hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation().getSyntaxName();
		hu.modembed.model.textnotations.device.ui.DeviceUIPlugin plugin = hu.modembed.model.textnotations.device.ui.DeviceUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		org.eclipse.jface.text.TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			hu.modembed.model.textnotations.device.IDeviceTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			hu.modembed.model.textnotations.device.IDeviceTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new org.eclipse.jface.text.rules.Token(textAttribute);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenStyle getStaticTokenStyle() {
		hu.modembed.model.textnotations.device.IDeviceTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.device.ui.DeviceSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new hu.modembed.model.textnotations.device.mopp.DeviceTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenStyle getDynamicTokenStyle(hu.modembed.model.textnotations.device.IDeviceTokenStyle staticStyle) {
		hu.modembed.model.textnotations.device.mopp.DeviceDynamicTokenStyler dynamicTokenStyler = new hu.modembed.model.textnotations.device.mopp.DeviceDynamicTokenStyler();
		hu.modembed.model.textnotations.device.IDeviceTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(hu.modembed.model.textnotations.device.IDeviceTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		org.eclipse.swt.graphics.Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		org.eclipse.swt.graphics.Color backgroundColor = null;
		if (backgroundColorArray != null) {
			org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = org.eclipse.swt.SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | org.eclipse.swt.SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | org.eclipse.swt.SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
		}
		return new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		java.util.List<hu.modembed.model.textnotations.device.mopp.DeviceTaskItem> taskItems = new hu.modembed.model.textnotations.device.mopp.DeviceTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<hu.modembed.model.textnotations.device.IDeviceTextToken> newItems = new java.util.ArrayList<hu.modembed.model.textnotations.device.IDeviceTextToken>();
		for (hu.modembed.model.textnotations.device.mopp.DeviceTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new hu.modembed.model.textnotations.device.mopp.DeviceTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new hu.modembed.model.textnotations.device.mopp.DeviceTextToken(hu.modembed.model.textnotations.device.mopp.DeviceTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new hu.modembed.model.textnotations.device.mopp.DeviceTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
