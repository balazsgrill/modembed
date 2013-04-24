/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.ui;

public class TypeCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private hu.modembed.model.textnotations.type.ITypeResourceProvider resourceProvider;
	
	public TypeCompletionProcessor(hu.modembed.model.textnotations.type.ITypeResourceProvider resourceProvider) {
		super();
		this.resourceProvider = resourceProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		hu.modembed.model.textnotations.type.ITypeTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		hu.modembed.model.textnotations.type.ui.TypeCodeCompletionHelper helper = new hu.modembed.model.textnotations.type.ui.TypeCodeCompletionHelper();
		hu.modembed.model.textnotations.type.ui.TypeCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		hu.modembed.model.textnotations.type.ui.TypeProposalPostProcessor proposalPostProcessor = new hu.modembed.model.textnotations.type.ui.TypeProposalPostProcessor();
		java.util.List<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal> finalProposalList = new java.util.ArrayList<hu.modembed.model.textnotations.type.ui.TypeCompletionProposal>();
		for (hu.modembed.model.textnotations.type.ui.TypeCompletionProposal proposal : extendedProposalList) {
			if (proposal.isMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (hu.modembed.model.textnotations.type.ui.TypeCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
