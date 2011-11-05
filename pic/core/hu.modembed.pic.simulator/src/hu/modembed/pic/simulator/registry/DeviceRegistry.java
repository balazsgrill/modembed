/**
 * 
 */
package hu.modembed.pic.simulator.registry;

import hu.modembed.pic.simulator.registry.reg.Category;
import hu.modembed.pic.simulator.registry.reg.RegFactory;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author balazs.grill
 *
 */
public class DeviceRegistry {

	public static final String EPID = "hu.cubussapiens.modemed.sim.devices";
	
	public final Category rootcat;
	
	public DeviceRegistry() {
		rootcat = RegFactory.eINSTANCE.createCategory();
		rootcat.setName("root");
		for (IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			
		}
	}
	
}
