/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

/**
 * The InstructionsetTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class InstructionsetTokenResolverFactory implements hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolverFactory {
	
	private java.util.Map<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver> featureName2CollectInTokenResolver;
	private static hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver defaultResolver = new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetDefaultTokenResolver();
	
	public InstructionsetTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver>();
		registerTokenResolver("IDENTIFIER", new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetIDENTIFIERTokenResolver());
		registerTokenResolver("QUALIFIEDID", new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetQUALIFIEDIDTokenResolver());
		registerTokenResolver("INT", new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetINTTokenResolver());
		registerTokenResolver("BINARY", new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetBINARYTokenResolver());
		registerTokenResolver("TEXT", new hu.modembed.model.textnotations.instructionset.analysis.InstructionsetTEXTTokenResolver());
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver internalCreateResolver(java.util.Map<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver> resolverMap, String key, hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
