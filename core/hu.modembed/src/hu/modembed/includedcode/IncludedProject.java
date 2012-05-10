/**
 * 
 */
package hu.modembed.includedcode;

import hu.modembed.MODembedCore;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * @author balazs.grill
 *
 */
public final class IncludedProject {

	private final String ID;
	
	private final String name;
	
	private final List<String> deps = new ArrayList<String>(0);
	
	private final Map<URL, String> resources = new LinkedHashMap<URL, String>();
	
	protected IncludedProject(IConfigurationElement ce) {
		ID = ce.getAttribute("id");
		name = ce.getAttribute("name");
		for(IConfigurationElement c : ce.getChildren("dependency")){
			deps.add(c.getAttribute("project"));
		}
		for(IConfigurationElement c : ce.getChildren("resource")){
			String resource = c.getAttribute("resource");
			String path = c.getAttribute("path");
			try {
				URL url = FileLocator.toFileURL(new URL(resource));
				resources.put(url, path);
			} catch (Exception e) {
				MODembedCore.getDefault().getLog().log(new Status(IStatus.ERROR, c.getContributor().getName(), "Could not resolve Resource "+resource));
			}
		}
	}
	
	public List<String> getDependencies() {
		return Collections.unmodifiableList(deps);
	}
	
	public Map<URL, String> getResources() {
		return Collections.unmodifiableMap(resources);
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	
	
}
