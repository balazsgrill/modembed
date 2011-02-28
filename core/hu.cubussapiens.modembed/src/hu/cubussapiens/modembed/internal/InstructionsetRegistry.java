/**
 * 
 */
package hu.cubussapiens.modembed.internal;

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
public class InstructionsetRegistry {

	public static final String EPID = "hu.cubussapiens.modembed.instructionsets";
	
	public final Map<String, URL> models;
	
	public InstructionsetRegistry() {
		Map<String, URL> models = new HashMap<String, URL>();
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			try{
				String id = ce.getAttribute("id");
				Bundle b = Platform.getBundle(ce.getContributor().getName());
				URL url = new URL("platform:/plugin/"+b.getSymbolicName()+"/"+ce.getAttribute("model"));//b.getEntry(ce.getAttribute("model"));
				models.put(id, url);
			}catch(Exception e){
				
			}
		}
		
		this.models = Collections.unmodifiableMap(models);
	}
	
}
