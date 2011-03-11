/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer;

import org.eclipse.core.resources.IFolder;

/**
 * @author balazs.grill
 *
 */
public interface IProjectIndexer extends IModuleIndexer{

	public void refresh(IFolder[] sourcefolders);
	
}
