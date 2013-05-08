/**
 * 
 */
package hu.modembed.index;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.infrastructure.RootElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class InMemoryGlobalModelIndex extends AbstractGlobalModelIndex implements IGlobalModelIndex{
	
	private final Map<IProject, ProjectModelIndexPart> parts = new HashMap<IProject, InMemoryGlobalModelIndex.ProjectModelIndexPart>();
	
	private ProjectModelIndexPart getPart(IProject project, boolean create){
		ProjectModelIndexPart part = parts.get(project);
		if (create && part == null){
			part = new ProjectModelIndexPart(project);
		}
		return part;
	}
	
	private class ProjectModelIndexPart implements IResourceDeltaVisitor, IGlobalModelIndex{

		private final IProject project;
		private final Map<String, URI> elementsToURI = new HashMap<String, URI>();
		private final Map<URI, String> uriToElements = new HashMap<URI, String>();
		
		public ProjectModelIndexPart(IProject project) {
			this.project = project;
			parts.put(project, this);
			try {
				load(project);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void dispose(){
			elementsToURI.clear();
			uriToElements.clear();
			parts.remove(project);
		}
		
		public void put(URI uri, String qid){
			elementsToURI.put(qid, uri);
			uriToElements.put(uri, qid);
		}
		
		public void remove(URI uri){
			String name = uriToElements.get(uri);
			if (name != null){
				elementsToURI.remove(name);
				uriToElements.remove(uri);
			}
		}
		
		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			int kind = delta.getKind();
			if (resource instanceof IProject){
				if (kind == IResourceDelta.REMOVED){
					dispose();
					return false;
				}else{
					return true;
				}
			}
			if (resource instanceof IContainer) return true;
			if (resource instanceof IFile){
				URI uri = toURI((IFile)resource);
				switch(kind){
				case IResourceDelta.REMOVED:
					remove(uri);
					break;
				case IResourceDelta.CONTENT:
				case IResourceDelta.CHANGED:
				//case IResourceDelta.CHANGED:	this is called when markers are changed
				case IResourceDelta.REPLACED:
				case IResourceDelta.ADDED:
					System.out.println(uri+" changed: "+kind);
					String name = getName(uri);
					if (name != null){
						put(uri, name);
					}
					break;
					
				}
			}
			return false;
		}

		@Override
		public RootElement findRootElement(Resource resource, String qualifiedID) {
			URI uri = elementsToURI.get(qualifiedID);
			if (uri != null){
				return get(resource.getResourceSet(), uri);
			}
			return null;
		}

		private List<IFile> listAllFiles(IProject project) throws CoreException{
			final List<IFile> result = new LinkedList<IFile>();
			project.accept(new IResourceVisitor() {
				
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile){
						result.add((IFile)resource);
						return false;
					}
					return true;
				}
			});
			return result;
		}
		
		private void load(IProject resource) throws CoreException {
			List<IFile> files = listAllFiles(resource);
			int last = -1;
			
			while(last != files.size()){
				last = files.size();
				List<IFile> fails = new LinkedList<IFile>();
				for(IFile file : files){
					URI uri = toURI(file);
					String name = getName(uri);
					if (name != null){
						put(uri, name);
					}else{
						fails.add(file);
					}
				}
				files = fails;
			}	
		}
		
	}
	
	private final IResourceChangeListener listener = new IResourceChangeListener() {
		
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			if (delta != null){
				try {
					delta.accept(new IResourceDeltaVisitor() {
						
						@Override
						public boolean visit(IResourceDelta delta) throws CoreException {
							if (delta.getResource() instanceof IWorkspaceRoot) return true;
							if (delta.getResource() instanceof IProject){
								ProjectModelIndexPart part = getPart((IProject)delta.getResource(), false);
								if (part != null) delta.accept(part);
							}
							return false;
						}
					});
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	public InMemoryGlobalModelIndex() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener);
	}
	
	@Override
	public RootElement findRootElement(Resource resource, String qualifiedID) {
		if (resource == null) return null;
		IProject project = MODembedCore.findProject(resource.getURI());
		
		List<RootElement> results = new ArrayList<RootElement>();
		Set<IProject> visited = new HashSet<IProject>();
		Queue<IProject> queue = new LinkedList<IProject>();
		queue.add(project);
		
		while(!queue.isEmpty()){
			IProject pro = queue.poll();
			if (!visited.contains(pro)){
				visited.add(pro);
				queue.addAll(getDependencies(pro));
				ProjectModelIndexPart part = getPart(pro, true);
				RootElement pr = part.findRootElement(resource, qualifiedID);
				if (pr != null) results.add(pr);
			}
		}
		
		if (results.isEmpty()) return null;
		
		return results.get(0);
	}

	
	
}
