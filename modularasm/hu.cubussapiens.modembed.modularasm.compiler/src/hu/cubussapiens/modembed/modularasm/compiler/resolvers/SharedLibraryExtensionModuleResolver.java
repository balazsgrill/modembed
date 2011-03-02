/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class SharedLibraryExtensionModuleResolver implements IModuleResolver {

	private final ResourceSet rs;
	private final String bundle;
	private final String folder;
	
	/**
	 * 
	 */
	public SharedLibraryExtensionModuleResolver(ResourceSet rs, String bundle, String folder) {
		this.rs = rs;
		this.bundle = bundle;
		this.folder = folder;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver#resolveModule(hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID)
	 */
	@Override
	public Module resolveModule(QualifiedID moduleID) {
		String path = "";
		for(String s : moduleID.getSegments()){
			path += "/"+s;
		}
		try {
			URL url = new URL("platform:/plugin/"+bundle+path+".masm");
			
			URI uri = URI.createURI(url.toString());
			Resource r = rs.getResource(uri, true);
			if (r != null){
				for(EObject eo : r.getContents()){
					if (eo instanceof Module){
						return (Module)eo;
					}
				}
			}
		} catch (Exception e) {
			
			//e.printStackTrace();
		}
		
		return null;
	}

}