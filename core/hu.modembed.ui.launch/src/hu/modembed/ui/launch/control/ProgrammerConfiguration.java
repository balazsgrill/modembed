/**
 * 
 */
package hu.modembed.ui.launch.control;

import java.util.Properties;

import hu.modembed.IProgrammerInstance;

/**
 * @author balazs.grill
 *
 */
public class ProgrammerConfiguration {

	private final IProgrammerInstance instance;
	private Properties properties;
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public Properties getProperties() {
		return properties;
	}
	
	public IProgrammerInstance getInstance() {
		return instance;
	}
	
	public ProgrammerConfiguration(IProgrammerInstance instance) {
		this.instance = instance;
		this.properties = new Properties();
		instance.fillDefaults(properties);
	}
	
	public ProgrammerConfiguration(IProgrammerInstance instance, Properties props) {
		this(instance);
		setProperties(props);
	}
	
}
