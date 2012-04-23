/**
 * 
 */
package hu.modembed.impl;

import hu.modembed.IReferencedResourceProvider;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.pde.core.plugin.IPlugin;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.Bundle;

/**
 * @author balazs.grill
 *
 */
public class PDEReferencedResourceProvider implements
		IReferencedResourceProvider {

	/* (non-Javadoc)
	 * @see hu.modembed.IReferencedResourceProvider#getResources(java.lang.String, java.lang.String)
	 */
	@Override
	public Iterable<URI> getResources(String project, String type) throws CoreException {
		return getAllResources(project, type);
	}

	/**
	 * Collect all plug-ins on which the given plug-in depends 
	 * @param name
	 * @return
	 */
	private static List<String> collectAllDependencies(String name){
		Set<String> all = new HashSet<String>();
		
		Queue<IPlugin> process = new LinkedList<IPlugin>();
		process.add(getPlugin(name));
		
		while(!process.isEmpty()){
			IPlugin plugin = process.poll();
			all.add(plugin.getId());
			for(IPluginImport pi : plugin.getImports()){
				String imported = pi.getId();
				if (!all.contains(imported)){
					process.add(getPlugin(imported));
				}
			}
		}
		
		return new ArrayList<String>(all);
	}
	
	private static IPlugin getPlugin(String name){
		IPluginModelBase mb = PluginRegistry.findModel(name);
		IPluginModel m = (IPluginModel)mb;
		return m.getPlugin();
	}
	
//	private static IPlugin getPlugin(IProject project){
//		IPluginModelBase mb = PluginRegistry.findModel(project);
//		IPluginModel m = (IPluginModel)mb;
//		return m.getPlugin();
//	}
	
	private static Collection<URI> getAllResources(String project, String type) throws CoreException{
		final Collection<URI> result = new ArrayList<URI>();
		List<String> deps = collectAllDependencies(project);

		for(String d : deps){
			result.addAll(getVisibleResources(d,type));
		}
		return result;
	}
	
	private static Collection<URI> getVisibleResources(String pluginname, final String type) throws CoreException{
		IPlugin plugin = getPlugin(pluginname);
		final Collection<URI> result = new ArrayList<URI>();
		
		IResource r = plugin.getPluginModel().getUnderlyingResource();
		if (r != null){
			r = r.getProject();
			r.accept(new IResourceVisitor() {
				
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile){
						if (type.equals(resource.getFileExtension())){
							result.add(URI.createPlatformResourceURI(resource.getFullPath().toString(), true));
						}
						return false;
					}
					return true;
				}
			});
		}else{
			Bundle b = Platform.getBundle(plugin.getId());
			Enumeration<URL> urls = b.findEntries("/", "*."+type, true);

			while(urls.hasMoreElements()){
				URL url = urls.nextElement();
				URI uri = URI.createPlatformPluginURI(pluginname+url.getPath(), true);
				result.add(uri);
				
			}
		}
		
		return result;
		
	}
	
}
