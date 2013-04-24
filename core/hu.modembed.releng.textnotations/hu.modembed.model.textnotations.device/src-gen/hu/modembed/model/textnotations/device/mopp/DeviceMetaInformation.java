/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceMetaInformation implements hu.modembed.model.textnotations.device.IDeviceMetaInformation {
	
	public String getSyntaxName() {
		return "device";
	}
	
	public String getURI() {
		return "http://modembed.hu/abstraction";
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTextScanner createLexer() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceAntlrScanner(new hu.modembed.model.textnotations.device.mopp.DeviceLexer());
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new hu.modembed.model.textnotations.device.mopp.DeviceParser().createInstance(inputStream, encoding);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTextPrinter createPrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
		return new hu.modembed.model.textnotations.device.mopp.DevicePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolverSwitch getReferenceResolverSwitch() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceReferenceResolverSwitch();
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenResolverFactory getTokenResolverFactory() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "syntaxDefinitions/device.cs";
	}
	
	public String[] getTokenNames() {
		return hu.modembed.model.textnotations.device.mopp.DeviceParser.tokenNames;
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenStyle getDefaultTokenStyle(String tokenName) {
		return new hu.modembed.model.textnotations.device.mopp.DeviceTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.device.IDeviceBracketPair> getBracketPairs() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceResourceFactory();
	}
	
	public hu.modembed.model.textnotations.device.mopp.DeviceNewFileContentProvider getNewFileContentProvider() {
		return new hu.modembed.model.textnotations.device.mopp.DeviceNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new hu.modembed.model.textnotations.device.mopp.DeviceResourceFactoryDelegator());
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
		return "hu.modembed.model.textnotations.device.ui.launchConfigurationType";
	}
	
	public hu.modembed.model.textnotations.device.IDeviceNameProvider createNameProvider() {
		return new hu.modembed.model.textnotations.device.analysis.DeviceDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		hu.modembed.model.textnotations.device.mopp.DeviceAntlrTokenHelper tokenHelper = new hu.modembed.model.textnotations.device.mopp.DeviceAntlrTokenHelper();
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
		highlightableTokens.add(hu.modembed.model.textnotations.device.mopp.DeviceTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
