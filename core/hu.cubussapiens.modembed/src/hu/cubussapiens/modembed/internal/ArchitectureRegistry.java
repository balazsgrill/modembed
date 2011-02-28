/**
 * 
 */
package hu.cubussapiens.modembed.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balage
 *
 */
public class ArchitectureRegistry {

public static final String EPID = "hu.cubussapiens.modembed.architectures";
	
	public final Map<String, String> names = new HashMap<String, String>();
	
	public final Map<String, String> isets = new HashMap<String, String>();
	
	public ArchitectureRegistry() {

		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			try{
				String id = ce.getAttribute("id");
				String name = ce.getAttribute("name");
				String iset = ce.getAttribute("instructionSet");
				
				names.put(id, name);
				isets.put(id, iset);
			}catch(Exception e){
				
			}
		}
		
	}
	
}
