/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			String namespace = ce.getAttribute("rootname");
			resolvers.add(new SharedLibraryExtensionModuleResolver(rs, bundleID, folder, namespace));
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

	@Override
	public String[] getSubPackages(List<String> sections) {
		Set<String> result = new HashSet<String>();
		for(SharedLibraryExtensionModuleResolver r : resolvers){
			result.addAll(Arrays.asList(r.getSubPackages(sections)));
		}
		return result.toArray(new String[result.size()]);
	}

	@Override
	public String[] getModules(List<String> sections) {
		List<String> result = new ArrayList<String>();
		for(SharedLibraryExtensionModuleResolver r : resolvers){
			result.addAll(Arrays.asList(r.getSubPackages(sections)));
		}
		return result.toArray(new String[result.size()]);
	}

}
