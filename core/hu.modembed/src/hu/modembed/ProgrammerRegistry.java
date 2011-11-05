/**
 * 
 */
package hu.modembed;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * @author balazs.grill
 *
 */
public class ProgrammerRegistry {

	public static final String EPID = "hu.modembed.programmers";
	
	private final Map<String, RegisteredProgrammer> programmers = new HashMap<String, RegisteredProgrammer>();
	
	public RegisteredProgrammer getProgrammer(String id){
		return programmers.get(id);
	}
	
	public RegisteredProgrammer[] listProgrammers(){
		return programmers.values().toArray(new RegisteredProgrammer[programmers.size()]);
	}
	
	ProgrammerRegistry(){
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			try{
				RegisteredProgrammer rp = new RegisteredProgrammer();
				rp.name = ce.getAttribute("name");
				rp.id = ce.getAttribute("id");
				Object o = ce.createExecutableExtension("handler");
				if (o instanceof IProgrammerType){
					rp.handler = (IProgrammerType)o;
					programmers.put(rp.id, rp);
					String image = ce.getAttribute("icon");
					if (image != null){
						Bundle b = Platform.getBundle(ce.getContributor().getName());
						rp.image = b.getEntry(image);
					}
				}
			}catch(CoreException e){
				MODembedCore.getDefault().getLog().log(e.getStatus());
			}
		}
	}
	
}
