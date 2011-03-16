/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.indexer.internal;

import java.util.ArrayList;
import java.util.List;

import hu.cubussapiens.modembed.modularasm.compiler.IModuleConfigurationHandler;
import hu.cubussapiens.modembed.modularasm.compiler.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.FolderModuleResolver;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.MultipleModuleResolver;
import hu.cubussapiens.modembed.modularasm.indexer.IProjectIndexer;
import hu.cubussapiens.modembed.modularasm.indexer.IndexerPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import project.Directory;
import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class ProjectIndexer extends MultipleModuleResolver implements IProjectIndexer {

	private ResourceSet resourceSet;
	
	private final IProject project;
	
	public ResourceSet getResourceSet() {
		if (resourceSet == null){
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}
	
	private ProjectConfig config = null;
	
	@Override
	public void update() {
		config = null;
		for(Resource r : getResourceSet().getResources()){
			r.unload();
		}
	}
	
	private ProjectConfig getConfig(){
		if (config == null){
			IFile f = project.getFile(PROJECT_CONFIG);
			Resource r = getResourceSet().getResource(URI.createPlatformResourceURI(f.getFullPath().toString(), true), true);
			for(EObject eo : r.getContents()){
				if (eo instanceof ProjectConfig){
					config = (ProjectConfig)eo;
				}
			}
		}
		return config;
	}
	
	private static final String PROJECT_CONFIG = "modembed.project";
	
	private void refreshResolvers(){
		List<IModuleResolver> resolvers = new ArrayList<IModuleResolver>();
		for(Directory d : getConfig().getSourcedirs()){
			IFolder f = project.getFolder(d.getPath());
			if (f.exists()){
				resolvers.add(new FolderModuleResolver(getResourceSet(), f));
			}
		}
		resolvers.add(IndexerPlugin.getDefault().getSharedLibraryIndexer());
		setResolvers(resolvers.toArray(new IModuleResolver[resolvers.size()]));
	}
	
	public ProjectIndexer(IProject project) {
		this.project = project;
		refreshResolvers();
	}

	@Override
	public IProject getProject() {
		return project;
	}

	FolderConfigHandler confighandler = null;
	
	@Override
	public IModuleConfigurationHandler getConfigHandler() {
		if (confighandler == null){
			confighandler = new FolderConfigHandler(project.getFolder("config"), getResourceSet());
		}
		return confighandler;
	}

}
