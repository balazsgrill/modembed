/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer;

import java.util.List;

import hu.cubussapiens.modembed.modularasm.modularASM.Module;

/**
 * @author balazs.grill
 *
 */
public interface IModuleIndexer {

	public Module getIndexedModule(String ID);
	
	public List<String> listSubPackages();
	
	public List<String> listModules();

}
