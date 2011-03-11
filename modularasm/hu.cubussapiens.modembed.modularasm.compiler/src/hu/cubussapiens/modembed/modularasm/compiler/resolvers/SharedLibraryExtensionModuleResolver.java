/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.resolvers;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.Bundle;

/**
 * @author balazs.grill
 *
 */
public class SharedLibraryExtensionModuleResolver implements IModuleResolver {

	private final ResourceSet rs;
	private final String bundle;
	private final String folder;
	private final String[] namespace;
	private final Bundle b;
	
	/**
	 * 
	 */
	public SharedLibraryExtensionModuleResolver(ResourceSet rs, String bundle, String folder, String namespace) {
		this.rs = rs;
		this.bundle = bundle;
		this.folder = folder;
		this.namespace = namespace.split("\\.");
		this.b = Platform.getBundle(bundle);
	}

	private String getPath(List<String> segments){
		String path = "";
		int i=0;
		for(String s : segments){
			if (i<namespace.length){
				if (s.equals(namespace[i])){
					i++;
					if (i == namespace.length) path = "/"+folder;
				}else{
					return null;
				}
			}else{
				path += "/"+s;
			}
		}
		return path;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver#resolveModule(hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID)
	 */
	@Override
	public Module resolveModule(QualifiedID moduleID) {
		String path = getPath(moduleID.getSegments());
		if (path == null) return null;
		
		if (b.getEntry(path+".masm") == null) return null;
		
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

	@Override
	public String[] getSubPackages(List<String> sections) {
		if (sections.size() < namespace.length){
			for(int i=0;i<sections.size();i++){
				if (!namespace[i].equals(sections.get(i))) return new String[0];
			}
			return new String[]{namespace[sections.size()]};
		}
		String path = getPath(sections);
		List<String> result = new ArrayList<String>();
		Enumeration<?> e = b.findEntries(path, "*", false);
		if (e != null){
			while(e.hasMoreElements()){
				Object o = e.nextElement();
				if (o instanceof URL){
					String name = getLastSegment((URL)o);
					if (!name.contains(".masm")){
						result.add(name);
					}
				}
			}
		}
		return result.toArray(new String[result.size()]);
	}

	public String getLastSegment(URL url){
		String[] ss = url.getPath().split("\\/");
		int i = ss.length-1;
		while (i >= 0 && ss[i].isEmpty()) i--;
		if (i < 0) return null;
		return ss[i];
	}
	
	@Override
	public String[] getModules(List<String> sections) {
		if (sections.size() < namespace.length){
			return new String[0];
		}
		String path = getPath(sections);
		List<String> result = new ArrayList<String>();
		Enumeration<?> e = b.findEntries(path, "*", false);
		if (e != null){
			while(e.hasMoreElements()){
				Object o = e.nextElement();
				if (o instanceof URL){
					result.add(getLastSegment((URL) o).replace(".masm", ""));
				}
			}
		}
		return result.toArray(new String[result.size()]);
	}

}
