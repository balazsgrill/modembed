/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class InstructionsetProposalPostProcessor {
	
	public java.util.List<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal> process(java.util.List<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
