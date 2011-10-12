/**
 * 
 */
package hu.cubussapiens.modembed;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerInstance {

	/**
	 * Get the device type ID which is connected to
	 * this programmer
	 * @return
	 */
	public String getDeviceType();
	
	/**
	 * Returns true if this programmer is currently connected
	 * and is ready to use.
	 * @return
	 */
	public boolean isConnected();
	
	/**
	 * Return an ID which identifies this programmer.
	 * This feature is optional, this function can return null.
     * In this case the programmer cannot be identified between
     * sessions.
	 * @return
	 */
	public String getID();
	
	/**
	 * Program the hexfile given by path to the device
	 * @param hexfile
	 */
	public void program(File hexfile, IProgressMonitor monitor);
	
	/**
	 * Return the file, which was programmed to this device the last time
	 */
	public File getLastProgrammedFile();
	
	/**
	 * Get the modification time of the hex file which was programmed
	 * the last time, at the time of the programming.
	 * @return
	 */
	public long getLastProgrammedFileModifiedTime();
	
	/**
	 * Let the device start running
	 */
	public void start();
	
	/**
	 * Stop the device
	 */
	public void stop();
	
}
