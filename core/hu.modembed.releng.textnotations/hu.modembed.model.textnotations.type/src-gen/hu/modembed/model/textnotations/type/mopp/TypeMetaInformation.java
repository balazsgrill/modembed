/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeMetaInformation implements hu.modembed.model.textnotations.type.ITypeMetaInformation {
	
	public String getSyntaxName() {
		return "type";
	}
	
	public String getURI() {
		return "http://modembed.hu/abstraction/types";
	}
	
	public hu.modembed.model.textnotations.type.ITypeTextScanner createLexer() {
		return new hu.modembed.model.textnotations.type.mopp.TypeAntlrScanner(new hu.modembed.model.textnotations.type.mopp.TypeLexer());
	}
	
	public hu.modembed.model.textnotations.type.ITypeTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new hu.modembed.model.textnotations.type.mopp.TypeParser().createInstance(inputStream, encoding);
	}
	
	public hu.modembed.model.textnotations.type.ITypeTextPrinter createPrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.type.ITypeTextResource resource) {
		return new hu.modembed.model.textnotations.type.mopp.TypePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new hu.modembed.model.textnotations.type.mopp.TypeSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new hu.modembed.model.textnotations.type.mopp.TypeSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public hu.modembed.model.textnotations.type.ITypeReferenceResolverSwitch getReferenceResolverSwitch() {
		return new hu.modembed.model.textnotations.type.mopp.TypeReferenceResolverSwitch();
	}
	
	public hu.modembed.model.textnotations.type.ITypeTokenResolverFactory getTokenResolverFactory() {
		return new hu.modembed.model.textnotations.type.mopp.TypeTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "syntaxDefinitions/type.cs";
	}
	
	public String[] getTokenNames() {
		return hu.modembed.model.textnotations.type.mopp.TypeParser.tokenNames;
	}
	
	public hu.modembed.model.textnotations.type.ITypeTokenStyle getDefaultTokenStyle(String tokenName) {
		return new hu.modembed.model.textnotations.type.mopp.TypeTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.type.ITypeBracketPair> getBracketPairs() {
		return new hu.modembed.model.textnotations.type.mopp.TypeBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new hu.modembed.model.textnotations.type.mopp.TypeFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new hu.modembed.model.textnotations.type.mopp.TypeResourceFactory();
	}
	
	public hu.modembed.model.textnotations.type.mopp.TypeNewFileContentProvider getNewFileContentProvider() {
		return new hu.modembed.model.textnotations.type.mopp.TypeNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new hu.modembed.model.textnotations.type.mopp.TypeResourceFactoryDelegator());
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
		return "hu.modembed.model.textnotations.type.ui.launchConfigurationType";
	}
	
	public hu.modembed.model.textnotations.type.ITypeNameProvider createNameProvider() {
		return new hu.modembed.model.textnotations.type.analysis.TypeDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		hu.modembed.model.textnotations.type.mopp.TypeAntlrTokenHelper tokenHelper = new hu.modembed.model.textnotations.type.mopp.TypeAntlrTokenHelper();
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
		highlightableTokens.add(hu.modembed.model.textnotations.type.mopp.TypeTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
