/**
 * 
 */
package hu.cubussapiens.modembed.ui.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hu.cubussapiens.modembed.ui.IProjectExtension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public class ProjectExtensionRegistry {

	public static final String EPID = "hu.cubussapiens.modembed.ui.project.extensions";
	
	private final Map<String, List<IProjectExtension>> reg = new HashMap<String, List<IProjectExtension>>();
	
	public ProjectExtensionRegistry() {
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			String archID = ce.getAttribute("architectureID").trim();
			try {
				Object o = ce.createExecutableExtension("extensionClass");
				if (o instanceof IProjectExtension){
					List<IProjectExtension> l = reg.get(archID);
					if (l == null){
						l = new ArrayList<IProjectExtension>();
						reg.put(archID, l);
					}
					l.add((IProjectExtension)o);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public IProjectExtension[] getExtensions(String archID){
		List<IProjectExtension> l = reg.get(archID);
		if (l != null){
			return l.toArray(new IProjectExtension[l.size()]);
		}
		return new IProjectExtension[0];
	}
	
}
