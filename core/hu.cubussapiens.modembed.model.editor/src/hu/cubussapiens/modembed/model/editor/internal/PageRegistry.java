/**
 * 
 */
package hu.cubussapiens.modembed.model.editor.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public class PageRegistry {

	public static final String EPID = "hu.cubussapiens.modembed.model.editor.pages";
	
	private static PageRegistry instance = null;
	
	public static PageRegistry getInstance() {
		if (instance == null){
			instance = new PageRegistry();
		}
		return instance;
	}
	
	private final List<PageDescriptor> descs = new ArrayList<PageDescriptor>();
	
	public List<PageDescriptor> getDescs() {
		return descs;
	}
	
	private PageRegistry() {
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			PageDescriptor pd = new PageDescriptor(ce);
			descs.add(pd);
		}
	}
	
}
