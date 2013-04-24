/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

/**
 * The DeviceTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class DeviceTokenResolverFactory implements hu.modembed.model.textnotations.device.IDeviceTokenResolverFactory {
	
	private java.util.Map<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver> featureName2CollectInTokenResolver;
	private static hu.modembed.model.textnotations.device.IDeviceTokenResolver defaultResolver = new hu.modembed.model.textnotations.device.analysis.DeviceDefaultTokenResolver();
	
	public DeviceTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver>();
		registerTokenResolver("IDENTIFIER", new hu.modembed.model.textnotations.device.analysis.DeviceIDENTIFIERTokenResolver());
		registerTokenResolver("QUALIFIEDID", new hu.modembed.model.textnotations.device.analysis.DeviceQUALIFIEDIDTokenResolver());
		registerTokenResolver("INT", new hu.modembed.model.textnotations.device.analysis.DeviceINTTokenResolver());
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected hu.modembed.model.textnotations.device.IDeviceTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private hu.modembed.model.textnotations.device.IDeviceTokenResolver internalCreateResolver(java.util.Map<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, hu.modembed.model.textnotations.device.IDeviceTokenResolver> resolverMap, String key, hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
