/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class TypeProposalPostProcessor {
	
	public java.util.List<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal> process(java.util.List<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
