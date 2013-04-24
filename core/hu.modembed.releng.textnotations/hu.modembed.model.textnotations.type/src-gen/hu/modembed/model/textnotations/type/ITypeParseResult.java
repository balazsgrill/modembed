/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ITypeParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeCommand<hu.modembed.model.textnotations.type.ITypeTextResource>> getPostParseCommands();
	
	/**
	 * Returns a map that can be used to retrieve the position of objects in the
	 * parsed text.
	 */
	public hu.modembed.model.textnotations.type.ITypeLocationMap getLocationMap();
	
}
