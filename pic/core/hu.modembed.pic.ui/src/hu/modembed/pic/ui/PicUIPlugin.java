package hu.modembed.pic.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PicUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.gb.embedded.pic.ui"; //$NON-NLS-1$

	// The shared instance
	private static PicUIPlugin plugin;
	
	/**
	 * The constructor
	 */
	public PicUIPlugin() {
	}

	public static String IDzeString(String s){
		String q = "";
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			if (i==0 && !Character.isJavaIdentifierStart(c)) q += "_";
			
			if (Character.isJavaIdentifierPart(c)) q += c;
		}
		return q;
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
	public static PicUIPlugin getDefault() {
		return plugin;
	}

}
