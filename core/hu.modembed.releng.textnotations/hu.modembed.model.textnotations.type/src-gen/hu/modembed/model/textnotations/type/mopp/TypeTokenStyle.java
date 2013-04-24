/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeTokenStyle implements hu.modembed.model.textnotations.type.ITypeTokenStyle {
	
	private int[] colorAsRGB;
	
	private int[] backgroundColorAsRGB;
	
	private boolean bold;
	
	private boolean italic;
	
	private boolean strikethrough;
	
	private boolean underline;
	
	public TypeTokenStyle(int[] colorAsRGB, int[] backgroundColorAsRGB, boolean bold, boolean italic, boolean striketrough, boolean underline) {
		super();
		this.colorAsRGB = colorAsRGB;
		this.backgroundColorAsRGB = backgroundColorAsRGB;
		this.bold = bold;
		this.italic = italic;
		this.strikethrough = striketrough;
		this.underline = underline;
	}
	
	public TypeTokenStyle(hu.modembed.model.textnotations.type.ITypeTokenStyle styleToCopy) {
		this(styleToCopy.getColorAsRGB(), styleToCopy.getBackgroundColorAsRGB(), styleToCopy.isBold(), styleToCopy.isItalic(), styleToCopy.isStrikethrough(), styleToCopy.isUnderline());
	}
	
	public int[] getColorAsRGB() {
		return colorAsRGB;
	}
	
	public int[] getBackgroundColorAsRGB() {
		return backgroundColorAsRGB;
	}
	
	public boolean isBold() {
		return bold;
	}
	
	public boolean isItalic() {
		return italic;
	}
	
	public boolean isStrikethrough() {
		return strikethrough;
	}
	
	public boolean isUnderline() {
		return underline;
	}
	
	public void setColorAsRGB(int[] colorAsRGB) {
		this.colorAsRGB = colorAsRGB;
	}
	
	public void setBackgroundColorAsRGB(int[] backgroundColorAsRGB) {
		this.backgroundColorAsRGB = backgroundColorAsRGB;
	}
	
	public void setBold(boolean bold) {
		this.bold = bold;
	}
	
	public void setItalic(boolean italic) {
		this.italic = italic;
	}
	
	public void setStrikethrough(boolean strikethrough) {
		this.strikethrough = strikethrough;
	}
	
	public void setUnderline(boolean underline) {
		this.underline = underline;
	}
	
}
