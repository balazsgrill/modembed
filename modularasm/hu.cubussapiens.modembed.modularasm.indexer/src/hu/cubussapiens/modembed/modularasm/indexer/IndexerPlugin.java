package hu.cubussapiens.modembed.modularasm.indexer;

import hu.cubussapiens.modembed.modularasm.indexer.internal.IndexerCache;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class IndexerPlugin extends Plugin {

	private static IndexerPlugin plugin;
	
	public static IndexerPlugin getDefault() {
		return plugin;
	}
	
	private IndexerCache indexers = null;
	
	private IndexerCache getIndexers() {
		if (indexers == null){
			indexers = new IndexerCache();
		}
		return indexers;
	}
	
	public IModuleIndexer getSharedLibraryIndexer(){
		return getIndexers().getSharedIndexer();
	}
	
	public IProjectIndexer getProjectIndexer(IProject project){
		return getIndexers().getIndexer(project);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
}
