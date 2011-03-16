/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler;

import modembedconfig.Scheme;
import modembedconfig.instance.Configuration;

/**
 * @author balazs.grill
 *
 */
public interface IModuleConfigurationHandler {

	public void setScheme(String moduleType, String moduleInstance, Scheme scheme);
	
	public Configuration getConfiguration(String moduleInstance);
	
}
