/**
 * 
 */
package hu.modembed.ui.launch.core;

import java.util.Properties;

import org.eclipse.swt.widgets.Control;

/**
 * @author balazs.grill
 *
 */
public interface IProgrammerInstanceConfigurationPane {

	public Control getControl();
	
	public void setProperties(Properties props);
	
	public Properties getProperties();
	
}
