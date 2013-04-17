/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle getDynamicTokenStyle(hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource, hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken token, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
