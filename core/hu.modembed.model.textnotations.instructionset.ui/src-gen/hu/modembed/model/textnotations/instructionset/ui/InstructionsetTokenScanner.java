/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class InstructionsetTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTextScanner lexer;
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken currentToken;
	private java.util.List<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager colorManager;
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public InstructionsetTokenScanner(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource, hu.modembed.model.textnotations.instructionset.ui.InstructionsetColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().createLexer();
		this.languageId = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().getSyntaxName();
		hu.modembed.model.textnotations.instructionset.ui.InstructionsetUIPlugin plugin = hu.modembed.model.textnotations.instructionset.ui.InstructionsetUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken>();
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
			hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
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
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle getStaticTokenStyle() {
		hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, hu.modembed.model.textnotations.instructionset.ui.InstructionsetSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle getDynamicTokenStyle(hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle staticStyle) {
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDynamicTokenStyler dynamicTokenStyler = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetDynamicTokenStyler();
		hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle tokeStyle) {
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
		
		java.util.List<hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTaskItem> taskItems = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken> newItems = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken>();
		for (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTextToken(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
