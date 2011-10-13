package hu.cubussapiens.modembed;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
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
