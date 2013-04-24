/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.util;

/**
 * Class TypeTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * hu.modembed.model.textnotations.type.util.TypeResourceUtil.
 */
public class TypeTextResourceUtil {
	
	/**
	 * Use hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.type.mopp.TypeResource getResource(org.eclipse.core.resources.IFile file) {
		return new hu.modembed.model.textnotations.type.util.TypeEclipseProxy().getResource(file);
	}
	
	/**
	 * Use hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.type.mopp.TypeResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.type.mopp.TypeResource getResource(org.eclipse.emf.common.util.URI uri) {
		return hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource(uri);
	}
	
	/**
	 * Use hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.type.mopp.TypeResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.type.util.TypeResourceUtil.getResource(uri, options);
	}
	
}
