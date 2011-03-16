package hu.cubussapiens.modembed.pic.ui.config;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.gb.embedded.pic.ui.config.project"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public static final String IMAGE_EXTRACT = PLUGIN_ID+".image.extract";
	public static final String IMAGE_INSERT = PLUGIN_ID+".image.insert";
	public static final String IMAGE_WIZARD = PLUGIN_ID+".image.wizard";
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(IMAGE_EXTRACT, ImageDescriptor.createFromURL(getBundle().getEntry("icons/extract.png")));
		reg.put(IMAGE_INSERT, ImageDescriptor.createFromURL(getBundle().getEntry("icons/insert.png")));
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
