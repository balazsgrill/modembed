/**
 * 
 */
package hu.modembed.ui;

import org.eclipse.ui.IStartup;

/**
 * @author Grill Balázs
 *
 */
public class Startup implements IStartup {

	public static final String KEY_BUNDLE_VERSION = "Bundle-Version";
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	@Override
	public void earlyStartup() {
		System.setProperty(MODembedUI.PLUGIN_ID, MODembedUI.getDefault().getBundle().getHeaders().get(KEY_BUNDLE_VERSION).toString());
	}

}
