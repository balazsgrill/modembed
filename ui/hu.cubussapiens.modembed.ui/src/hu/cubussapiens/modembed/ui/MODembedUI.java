package hu.cubussapiens.modembed.ui;

import hu.cubussapiens.modembed.ui.internal.ProjectExtensionRegistry;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

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
