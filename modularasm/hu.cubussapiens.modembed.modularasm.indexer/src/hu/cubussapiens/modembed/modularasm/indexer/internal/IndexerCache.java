/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer.internal;

import java.util.HashMap;
import java.util.Map;

import hu.cubussapiens.modembed.modularasm.indexer.IProjectIndexer;

import org.eclipse.core.resources.IProject;

/**
 * @author balazs.grill
 *
 */
public class IndexerCache {

	private final Map<IProject, ProjectIndexer> indexers = new HashMap<IProject, ProjectIndexer>();
	
	private SharedModuleIndexer sharedIndexer;
	
	public SharedModuleIndexer getSharedIndexer() {
		if (sharedIndexer == null){
			sharedIndexer = new SharedModuleIndexer();
		}
		return sharedIndexer;
	}
	
	public IProjectIndexer getIndexer(IProject project){
		ProjectIndexer pi = indexers.get(project);
		if (pi == null){
			pi = new ProjectIndexer(project);
			indexers.put(project, pi);
		}
		return pi;
	}
	
}
