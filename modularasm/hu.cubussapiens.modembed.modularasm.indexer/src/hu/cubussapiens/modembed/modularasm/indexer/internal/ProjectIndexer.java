/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer.internal;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import hu.cubussapiens.modembed.modularasm.indexer.IProjectIndexer;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;

/**
 * @author balazs.grill
 *
 */
public class ProjectIndexer implements IProjectIndexer {

	private final ResourceSet resourceSet = new ResourceSetImpl();
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.indexer.IModuleIndexer#getIndexedModule(java.lang.String)
	 */
	@Override
	public Module getIndexedModule(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.indexer.IProjectIndexer#refresh(org.eclipse.core.resources.IFolder[])
	 */
	@Override
	public void refresh(IFolder[] sourcefolders) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> listSubPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> listModules() {
		// TODO Auto-generated method stub
		return null;

	}

}
