/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeUIMetaInformation extends hu.modembed.model.textnotations.type.mopp.TypeMetaInformation {
	
	public hu.modembed.model.textnotations.type.ITypeHoverTextProvider getHoverTextProvider() {
		return new hu.modembed.model.textnotations.type.ui.TypeHoverTextProvider();
	}
	
	public hu.modembed.model.textnotations.type.ui.TypeImageProvider getImageProvider() {
		return hu.modembed.model.textnotations.type.ui.TypeImageProvider.INSTANCE;
	}
	
	public hu.modembed.model.textnotations.type.ui.TypeColorManager createColorManager() {
		return new hu.modembed.model.textnotations.type.ui.TypeColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(hu.modembed.model.textnotations.type.ITypeTextResource,
	 * hu.modembed.model.textnotations.type.ui.TypeColorManager) instead.
	 */
	public hu.modembed.model.textnotations.type.ui.TypeTokenScanner createTokenScanner(hu.modembed.model.textnotations.type.ui.TypeColorManager colorManager) {
		return (hu.modembed.model.textnotations.type.ui.TypeTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public hu.modembed.model.textnotations.type.ui.ITypeTokenScanner createTokenScanner(hu.modembed.model.textnotations.type.ITypeTextResource resource, hu.modembed.model.textnotations.type.ui.TypeColorManager colorManager) {
		return new hu.modembed.model.textnotations.type.ui.TypeTokenScanner(resource, colorManager);
	}
	
	public hu.modembed.model.textnotations.type.ui.TypeCodeCompletionHelper createCodeCompletionHelper() {
		return new hu.modembed.model.textnotations.type.ui.TypeCodeCompletionHelper();
	}
	
}
