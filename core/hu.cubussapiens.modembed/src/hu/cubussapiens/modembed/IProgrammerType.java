/**
 * 
 */
package hu.cubussapiens.modembed;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerType {

	/**
	 * Detects Instances of programmers.
	 */
	public IProgrammerInstance[] detectInstances();
	
	public IProgrammerInstance createInstance();
	
	public IProgrammerPropertiesPane createPropertiesPane();
	
	public String getID();
}
