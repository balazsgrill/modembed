/**
 * 
 */
package hu.modembed.includedcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public final class IncludedProjectsRegistry {

	private static IncludedProjectsRegistry instance;
	
	public static IncludedProjectsRegistry getInstance() {
		if (instance == null){
			instance = new IncludedProjectsRegistry();
		}
		return instance;
	}
	
	private static final String EPID = "hu.modembed.ui.includedCode";
	
	private final List<IncludedProject> projects = new ArrayList<IncludedProject>();
	
	public List<IncludedProject> getProjects() {
		return Collections.unmodifiableList(projects);
	}
	
	private IncludedProjectsRegistry() {
		for(IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			projects.add(new IncludedProject(ce));
		}
	}
	
}
