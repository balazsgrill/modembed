package hu.modembed;

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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.pde.core.plugin.IPlugin;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class MODembedCore extends Plugin {
	
	public static final String PLUGIN_ID = "hu.modembed";
	
	private static MODembedCore plugin = null;

	private ProgrammerRegistry progreg = null;
	
	
	public ProgrammerRegistry getProgrammerRegistry() {
		if (progreg == null){
			progreg = new ProgrammerRegistry();
		}
		return progreg;
	}
	
	public static MODembedCore getDefault(){
		return plugin;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		super.stop(bundleContext);
	}

	public static URI resolveStringReference(URI current, String reference){
		String[] sections = reference.split("/");
		URI uri = current.trimSegments(1);
		for(String s : sections){
			if ("..".equals(s)) uri = uri.trimSegments(1);
			else uri = uri.appendSegment(s);
		}
		return uri;
	}
	
	/**
	 * Collect all plug-ins on which the given plug-in depends 
	 * @param name
	 * @return
	 */
	public static List<String> collectAllDependencies(String name){
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
	
	public static IPlugin getPlugin(String name){
		IPluginModelBase mb = PluginRegistry.findModel(name);
		IPluginModel m = (IPluginModel)mb;
		return m.getPlugin();
	}
	
	public static IPlugin getPlugin(IProject project){
		IPluginModelBase mb = PluginRegistry.findModel(project);
		IPluginModel m = (IPluginModel)mb;
		return m.getPlugin();
	}
	
	public static Collection<URI> getVisibleResources(String pluginname, final String type) throws CoreException{
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
