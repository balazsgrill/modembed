/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IInstructionsetParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetCommand<hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource>> getPostParseCommands();
	
	/**
	 * Returns a map that can be used to retrieve the position of objects in the
	 * parsed text.
	 */
	public hu.modembed.model.textnotations.instructionset.IInstructionsetLocationMap getLocationMap();
	
}
