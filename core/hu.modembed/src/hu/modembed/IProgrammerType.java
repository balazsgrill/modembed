/**
 * 
 */
package hu.modembed;

import java.util.Properties;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerType {

	/**
	 * Detects Instances of programmers.
	 */
	public IProgrammerInstance[] detectInstances();
	
	public IProgrammerInstance createInstance(Properties props);
	
	public String getID();
}
