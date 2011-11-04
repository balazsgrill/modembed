/**
 * 
 */
package hu.cubussapiens.modembed;

import java.util.Properties;

import org.eclipse.core.runtime.IAdaptable;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerPropertiesPane extends IAdaptable{

	public void setProperties(Properties props);
	
	public Properties getProperties();
}
