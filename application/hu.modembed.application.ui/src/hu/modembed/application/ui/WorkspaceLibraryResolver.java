/**
 * 
 */
package hu.modembed.application.ui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import hu.modembed.application.ILibraryResolver;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class WorkspaceLibraryResolver implements ILibraryResolver {

	private final IProject project;
	
	/**
	 * @param project 
	 * 
	 */
	public WorkspaceLibraryResolver(IProject project) {
		this.project = project;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.application.ILibraryResolver#findLibraryResource(java.lang.String)
	 */
	@Override
	public URI findLibraryResource(String libraryID) {
		final String name = libraryID+".mal";
		
		Set<IProject> visited = new HashSet<IProject>();
		Queue<IProject> projects = new LinkedList<IProject>();
		
		projects.add(project);
		
		while(!projects.isEmpty()){
			if (!visited.contains(projects)){
				visited.add(project);
				
				try {
					final URI[] uri = new URI[]{null};
					
					project.accept(new IResourceVisitor() {
						
						@Override
						public boolean visit(IResource resource) throws CoreException {
							if (resource instanceof IContainer) return true;
							if (resource instanceof IFile){
								if (name.equals(resource.getName())){
									uri[0] = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
								}
							}
							return false;
						}
					});
					
					if (uri[0] != null) return uri[0];
					
					projects.addAll(Arrays.asList(project.getDescription().getReferencedProjects()));
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(e.getStatus());
				}
			}
		}
		
		return null;
	}

}
