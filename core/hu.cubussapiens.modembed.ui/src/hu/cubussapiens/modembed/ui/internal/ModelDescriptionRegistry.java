/**
 * 
 */
package hu.cubussapiens.modembed.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;

/**
 * @author balazs.grill
 *
 */
public class ModelDescriptionRegistry {

	private static final String EPID = "hu.cubussapiens.modembed.ui.model.descriptors";
	
	private final AdapterFactory[] adapterFactories;
	
	public AdapterFactory[] getAdapterFactories() {
		return adapterFactories;
	}
	
	public ModelDescriptionRegistry() {
		List<AdapterFactory> adapterfactories = new ArrayList<AdapterFactory>();
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			for(IConfigurationElement cce : ce.getChildren()){
				if ("adapterfactory".equals(cce.getName())){
					try {
						Object o = cce.createExecutableExtension("class");
						if (o instanceof AdapterFactory){
							adapterfactories.add((AdapterFactory)o);
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		this.adapterFactories = adapterfactories.toArray(new AdapterFactory[adapterfactories.size()]);
	}
	
}
