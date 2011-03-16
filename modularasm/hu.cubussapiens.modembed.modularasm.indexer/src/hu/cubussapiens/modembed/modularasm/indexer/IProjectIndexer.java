/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleConfigurationHandler;

import org.eclipse.core.resources.IProject;

/**
 * @author balazs.grill
 *
 */
public interface IProjectIndexer extends IModuleIndexer{

	public IProject getProject();
	
	public void update();
	
	public IModuleConfigurationHandler getConfigHandler();
	
}
