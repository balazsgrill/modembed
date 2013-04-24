/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class DeviceProposalPostProcessor {
	
	public java.util.List<hu.modembed.model.textnotations.device.ui.DeviceCompletionProposal> process(java.util.List<hu.modembed.model.textnotations.device.ui.DeviceCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
