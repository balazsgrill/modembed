package hu.modembed;

import hu.modembed.impl.PDEReferencedResourceProvider;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
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
	
	IReferencedResourceProvider resourceProvider;
	
	public IReferencedResourceProvider getResourceProvider() {
		if (resourceProvider == null){
			resourceProvider = new PDEReferencedResourceProvider();
		}
		return resourceProvider;
	}
	
}
