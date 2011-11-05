/**
 * 
 */
package hu.cubussapiens.modembed;

import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerInstance {
	
	/**
	 * Returns true if this programmer is currently connected
	 * and is ready to use.
	 * @return
	 */
	public boolean isConnected();
	
	/**
	 * Initialize this programmer before running. This may include
	 * programming a hex file to the device.
	 * 
	 * @param props
	 * @param monitor
	 */
	public void initialize(Properties props, IProgressMonitor monitor) throws CoreException;
	
	/**
	 * Let the device start running
	 */
	public void start();
	
	/**
	 * Stop the device
	 */
	public void stop();
	
	/**
	 * Get type
	 * @return
	 */
	public IProgrammerType getType();
	
	/**
	 * Fill any default properties to the given set
	 * @param props
	 */
	public void fillDefaults(Properties props);
	
}
