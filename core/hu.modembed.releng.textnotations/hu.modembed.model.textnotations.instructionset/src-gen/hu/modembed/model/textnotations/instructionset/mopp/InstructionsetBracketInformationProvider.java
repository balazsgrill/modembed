/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class InstructionsetBracketInformationProvider {
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair> getBracketPairs() {
		java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair> result = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair>();
		result.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetBracketPair("(", ")", true, false));
		result.add(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetBracketPair("<", ">", true, false));
		return result;
	}
	
}
