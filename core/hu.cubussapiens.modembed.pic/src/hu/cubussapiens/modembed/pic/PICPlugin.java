package hu.cubussapiens.modembed.pic;

import hu.cubussapiens.modembed.pic.internal.DefinitionsRegistry;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import modembedconfig.Scheme;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.BundleContext;

import pic.PicCPUType;


/**
 * The activator class controls the plug-in life cycle
 */
public class PICPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.gb.embedded.pic"; //$NON-NLS-1$

	// The shared instance
	private static PICPlugin plugin;
	
	private DefinitionsRegistry defsreg = null;
	
	/**
	 * The constructor
	 */
	public PICPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static PICPlugin getDefault() {
		return plugin;
	}

	public Map<URL, String> getDefinitions(){
		if (defsreg == null){
			defsreg = new DefinitionsRegistry();
		}
		return defsreg.models;
	}
	
	public String getArchitecture(Object cpumodel){
		if (defsreg == null){
			defsreg = new DefinitionsRegistry();
		}
		return defsreg.archs.get(cpumodel);
	}
	
	public Resource loadSharedResource(ResourceSet rs, URL modelurl) throws IOException{
		Resource model = rs.createResource(URI.createURI(modelurl.toString()));
		model.load(null);
		return model;
	}
	
	public PicCPUType getCPUType(ResourceSet rs, URL modelurl) throws IOException{
		Resource model = loadSharedResource(rs, modelurl);
		
		for(EObject eo : model.getContents()){
			if (eo instanceof PicCPUType){
				return ((PicCPUType) eo);
			}
		}
		
		return null;
	}
	
	public Scheme getConfigurationScheme(ResourceSet rs, URL modelurl) throws IOException{
		Resource model = loadSharedResource(rs, modelurl);
		
		for(EObject eo : model.getContents()){
			if (eo instanceof PicCPUType){
				return ((PicCPUType) eo).getConfiguration().getScheme();
			}
		}
		
		return null;
	}
	
}
