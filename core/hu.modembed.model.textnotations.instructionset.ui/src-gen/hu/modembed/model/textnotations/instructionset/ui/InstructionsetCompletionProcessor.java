/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.ui;

public class InstructionsetCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private hu.modembed.model.textnotations.instructionset.IInstructionsetResourceProvider resourceProvider;
	private hu.modembed.model.textnotations.instructionset.ui.IInstructionsetBracketHandlerProvider bracketHandlerProvider;
	
	public InstructionsetCompletionProcessor(hu.modembed.model.textnotations.instructionset.IInstructionsetResourceProvider resourceProvider, hu.modembed.model.textnotations.instructionset.ui.IInstructionsetBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		hu.modembed.model.textnotations.instructionset.ui.InstructionsetCodeCompletionHelper helper = new hu.modembed.model.textnotations.instructionset.ui.InstructionsetCodeCompletionHelper();
		hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		hu.modembed.model.textnotations.instructionset.ui.InstructionsetProposalPostProcessor proposalPostProcessor = new hu.modembed.model.textnotations.instructionset.ui.InstructionsetProposalPostProcessor();
		java.util.List<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal> finalProposalList = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal>();
		for (hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (hu.modembed.model.textnotations.instructionset.ui.InstructionsetCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			hu.modembed.model.textnotations.instructionset.ui.IInstructionsetBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
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
