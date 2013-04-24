/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.util;

/**
 * Class InstructionsetTextResourceUtil can be used to perform common tasks on
 * text resources, such as loading and saving resources, as well as, checking them
 * for errors. This class is deprecated and has been replaced by
 * hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.
 */
public class InstructionsetTextResourceUtil {
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResource getResource(org.eclipse.core.resources.IFile file) {
		return new hu.modembed.model.textnotations.instructionset.util.InstructionsetEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResource getResource(org.eclipse.emf.common.util.URI uri) {
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return hu.modembed.model.textnotations.instructionset.util.InstructionsetResourceUtil.getResource(uri, options);
	}
	
}
