/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetMetaInformation implements hu.modembed.model.textnotations.instructionset.IInstructionsetMetaInformation {
	
	public String getSyntaxName() {
		return "instructionset";
	}
	
	public String getURI() {
		return "http://modembed.hu/core/instructionset";
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextScanner createLexer() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAntlrScanner(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetLexer());
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetParser().createInstance(inputStream, encoding);
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextPrinter createPrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolverSwitch getReferenceResolverSwitch() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch();
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolverFactory getTokenResolverFactory() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "syntaxDefinitions/instructionset.cs";
	}
	
	public String[] getTokenNames() {
		return hu.modembed.model.textnotations.instructionset.mopp.InstructionsetParser.tokenNames;
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenStyle getDefaultTokenStyle(String tokenName) {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair> getBracketPairs() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResourceFactory();
	}
	
	public hu.modembed.model.textnotations.instructionset.mopp.InstructionsetNewFileContentProvider getNewFileContentProvider() {
		return new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "hu.modembed.model.textnotations.instructionset.ui.launchConfigurationType";
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetNameProvider createNameProvider() {
		return new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAntlrTokenHelper tokenHelper = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
