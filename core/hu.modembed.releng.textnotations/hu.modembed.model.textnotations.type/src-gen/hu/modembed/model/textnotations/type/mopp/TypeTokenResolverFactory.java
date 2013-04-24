/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

/**
 * The TypeTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class TypeTokenResolverFactory implements hu.modembed.model.textnotations.type.ITypeTokenResolverFactory {
	
	private java.util.Map<String, hu.modembed.model.textnotations.type.ITypeTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, hu.modembed.model.textnotations.type.ITypeTokenResolver> featureName2CollectInTokenResolver;
	private static hu.modembed.model.textnotations.type.ITypeTokenResolver defaultResolver = new hu.modembed.model.textnotations.type.analysis.TypeDefaultTokenResolver();
	
	public TypeTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.type.ITypeTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.type.ITypeTokenResolver>();
		registerTokenResolver("QUALIFIEDID", new hu.modembed.model.textnotations.type.analysis.TypeQUALIFIEDIDTokenResolver());
		registerTokenResolver("INT", new hu.modembed.model.textnotations.type.analysis.TypeINTTokenResolver());
	}
	
	public hu.modembed.model.textnotations.type.ITypeTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public hu.modembed.model.textnotations.type.ITypeTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, hu.modembed.model.textnotations.type.ITypeTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, hu.modembed.model.textnotations.type.ITypeTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected hu.modembed.model.textnotations.type.ITypeTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private hu.modembed.model.textnotations.type.ITypeTokenResolver internalCreateResolver(java.util.Map<String, hu.modembed.model.textnotations.type.ITypeTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, hu.modembed.model.textnotations.type.ITypeTokenResolver> resolverMap, String key, hu.modembed.model.textnotations.type.ITypeTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
