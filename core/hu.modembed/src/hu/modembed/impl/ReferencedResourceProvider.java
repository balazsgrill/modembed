/**
 * 
 */
package hu.modembed.impl;

import hu.modembed.IReferencedResourceProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class ReferencedResourceProvider implements IReferencedResourceProvider {

	/* (non-Javadoc)
	 * @see hu.modembed.IReferencedResourceProvider#getResources(java.lang.String, java.lang.String)
	 */
	@Override
	public Iterable<URI> getResources(String project, final String type)
			throws CoreException {
		final List<URI> uris = new ArrayList<URI>();
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
		
		Set<IProject> visited = new HashSet<IProject>();
		Queue<IProject> projectqueue = new LinkedList<IProject>();
		projectqueue.add(p);
		
		while(!projectqueue.isEmpty()){
			
			IProject q = projectqueue.poll();
			if (!visited.contains(q)){
				visited.add(q);

				q.accept(new IResourceVisitor() {

					@Override
					public boolean visit(IResource resource) throws CoreException {
						if (resource instanceof IContainer){
							return true;
						}
						if (resource instanceof IFile){
							if (type.equals(resource.getFileExtension())){
								uris.add(URI.createPlatformResourceURI(resource.getFullPath().toString(), true));
							}
						}
						return false;
					}
				});

				for(IProject r : q.getReferencedProjects()){
					if (!visited.contains(r))
						projectqueue.add(r);
				}
			}
		}
		
		
		return uris;
	}
	
}
