/**
 * 
 */
package hu.cubussapiens.modembed.pic.internal;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * @author balage
 *
 */
public class DefinitionsRegistry {

	public static final String EPID = "hu.cubussapiens.modembed.pic.definitions";
	
	public final Map<URL, String> models;
	
	public DefinitionsRegistry() {
		Map<URL, String> models = new HashMap<URL, String>();
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			try{
				String name = ce.getAttribute("typename");
				Bundle b = Platform.getBundle(ce.getContributor().getName());
				URL url = new URL("platform:/plugin/"+b.getSymbolicName()+"/"+ce.getAttribute("model"));//b.getEntry(ce.getAttribute("model"));
				models.put(url, name);
			}catch(Exception e){
				
			}
		}
		
		this.models = Collections.unmodifiableMap(models);
	}
	
}
