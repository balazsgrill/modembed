package hu.cubussapiens.modembed;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.pde.core.plugin.IPlugin;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.BundleContext;

public class MODembedCore extends Plugin {
	
	public static final String PLUGIN_ID = "hu.cubussapiens.modembed";
	
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
	
	public static Collection<URI> getVisibleResources(String pluginname){
		IPlugin plugin = getPlugin(pluginname);
		final List<URI> result = new ArrayList<URI>();
		
		String install = plugin.getPluginModel().getInstallLocation();
		File root = new File(install);
		Queue<File> queue = new LinkedList<File>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			File f = queue.poll();
			if (f.isDirectory()){
				queue.addAll(Arrays.asList(f.listFiles()));
			}else{
				result.add(getUri(f));
			}
		}
		
		return result;
	}
	
	private static URI getUri(File file) {
		try {
			return URI.createFileURI(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void updateDeps(IProject project){
		IPluginModelBase mb = PluginRegistry.findModel(project);
		IPluginModel m = (IPluginModel)mb;
		for(IPluginImport pi : m.getPlugin().getImports()){
			System.out.println("depends on "+pi.getId());
			IPluginModelBase ipm = PluginRegistry.findModel(pi.getId());
			System.out.println("Installed to "+ipm.getInstallLocation());
		}
		
	}
	
}
