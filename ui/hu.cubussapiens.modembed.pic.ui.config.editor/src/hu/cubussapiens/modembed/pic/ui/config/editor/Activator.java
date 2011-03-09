package hu.cubussapiens.modembed.pic.ui.config.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.gb.embedded.pic.ui.config.editor"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public static String IMAGE_WIZARD = PLUGIN_ID+".configwizard";
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(IMAGE_WIZARD, ImageDescriptor.createFromURL(getBundle().getEntry("icons/newfile_modembed_wiz.png")));
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
	public static Activator getDefault() {
		return plugin;
	}

}
