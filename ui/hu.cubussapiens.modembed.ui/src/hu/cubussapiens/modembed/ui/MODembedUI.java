package hu.cubussapiens.modembed.ui;

import hu.cubussapiens.modembed.ui.internal.ProjectExtensionRegistry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import project.ProjectConfig;

/**
 * The activator class controls the plug-in life cycle
 */
public class MODembedUI extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.cubussapiens.modembed.ui"; //$NON-NLS-1$

	// The shared instance
	private static MODembedUI plugin;
	
	public static String NatureID = "hu.cubussapiens.modembed.ui.nature";
	
	public static String SettingsFile = "modembed.project";
	
	private ProjectExtensionRegistry pereg;
	
	/**
	 * The constructor
	 */
	public MODembedUI() {
	}

	public IProjectExtension[] getExtensions(String archID){
		if (pereg == null){
			pereg = new ProjectExtensionRegistry();
		}
		return pereg.getExtensions(archID);
	}
	
	public ProjectConfig getProjectConfig(ResourceSet rs, IProject project){
		IFile f = project.getFile(SettingsFile);
		if (f.exists()){
			Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toString(), true), true);
			for(EObject eo : r.getContents()){
				if (eo instanceof ProjectConfig){
					return (ProjectConfig)eo;
				}
			}
		}
		return null;
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
	public static MODembedUI getDefault() {
		return plugin;
	}

}
