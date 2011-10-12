package hu.cubussapiens.modembed.pic.pk2cmd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class PK2Plugin implements BundleActivator {

	private static BundleContext context;

	public static final String PLUGIN_ID = "hu.cubussapiens.modembed.pic.pk2cmd";
	
	private static PK2Plugin bundle;
	
	static BundleContext getContext() {
		return context;
	}

	private Properties getExecutableName() throws CoreException{
		Enumeration<?> urls = context.getBundle().findEntries("/", "executable.properties", false);
		URL url = null;
		if (urls.hasMoreElements()) url = (URL)urls.nextElement();
		if (url == null) throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!"));
		try {
			File f = new File(FileLocator.resolve(url).toURI());
			InputStream is = new FileInputStream(f);
			Properties props = new Properties();
			props.load(is);
			is.close();
			return props;
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!",e));
		}
	}
	
	private URL executable;
	
	private URL getExecutable() throws CoreException{
		if (executable == null){
			Enumeration<?> urls = context.getBundle().findEntries("/", getExecname(), false);
			URL url = null;
			if (urls.hasMoreElements()) url = (URL)urls.nextElement();
			if (url == null) throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!"));
			try {
				executable = FileLocator.toFileURL(url);
			} catch (IOException e) {
				throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!",e));
			}

			String onload = properties.getProperty("onload");
			if (onload != null){
				try{
					File dir = new File(executable.toURI()).getParentFile();
					Runtime.getRuntime().exec(onload,null,dir);
				}catch(Exception e){
					throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not execute onload: "+onload,e));
				}
			}
			
		}
		return executable;
	}
	
	private URL getDeviceFile() throws CoreException{
		Enumeration<?> urls = context.getBundle().findEntries("/", "PK2DeviceFile.dat", false);
		URL url = null;
		if (urls.hasMoreElements()) url = (URL)urls.nextElement();
		if (url == null) throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!"));
		try {
			return FileLocator.toFileURL(url);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, "Could not load pk2cmd executable!",e));
		}
	}
	
	public PK2CMDExecutable createExecutable() throws CoreException{
		return new PK2CMDExecutable(getExecutable(), getDeviceFile());
	}
	
	private Properties properties = null;
	
	public String getExecname() throws CoreException {
		if (properties == null){
			properties = getExecutableName();
		}
		return properties.getProperty("name");
	}
	
	public static PK2Plugin getDefault() {
		return bundle;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		PK2Plugin.context = bundleContext;
		bundle = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		PK2Plugin.context = null;
	}

}
