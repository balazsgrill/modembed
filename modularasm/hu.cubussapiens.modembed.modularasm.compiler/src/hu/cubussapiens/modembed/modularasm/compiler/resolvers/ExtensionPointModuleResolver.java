/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

/**
 * @author balazs.grill
 *
 */
public class ExtensionPointModuleResolver implements IModuleResolver {

	public static final String EPID = "hu.cubussapiens.modembed.modularasm.sharedLibrary"; 
	
	private final ResourceSet rs = new ResourceSetImpl();
	
	private final List<SharedLibraryExtensionModuleResolver> resolvers = new ArrayList<SharedLibraryExtensionModuleResolver>();
	
	public ExtensionPointModuleResolver() {
		for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
			String bundleID = ce.getContributor().getName();
			String folder = ce.getAttribute("folder");
			resolvers.add(new SharedLibraryExtensionModuleResolver(rs, bundleID, folder));
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver#resolveModule(hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID)
	 */
	@Override
	public Module resolveModule(QualifiedID moduleID) {
		for(SharedLibraryExtensionModuleResolver r : resolvers){
			Module m = r.resolveModule(moduleID);
			if (m != null){
				return m;
			}
		}
		return null;
	}

}
