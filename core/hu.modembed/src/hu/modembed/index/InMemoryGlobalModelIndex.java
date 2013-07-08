/**
 * 
 */
package hu.modembed.index;

import hu.modembed.MODembedCore;
import hu.modembed.index.impl.InMemoryProjectModelIndex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class InMemoryGlobalModelIndex extends AbstractModelIndex implements IGlobalModelIndex{
	
	private final Map<IProject, IProjectModelIndex> parts = new HashMap<IProject, IProjectModelIndex>();
	
	private IProjectModelIndex getPart(IProject project, boolean create){
		IProjectModelIndex part = parts.get(project);
		if (create && part == null){
			try {
				part = new InMemoryProjectModelIndex(project);
				parts.put(project, part);
				part.initialize();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return part;
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
								IProjectModelIndex part = getPart((IProject)delta.getResource(), false);
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
	public EObject find(Resource resource, String qualifiedID) {
		if (resource == null) return null;
		IProject project = MODembedCore.findProject(resource.getURI());
		
		List<EObject> results = new ArrayList<EObject>();
		Set<IProject> visited = new HashSet<IProject>();
		Queue<IProject> queue = new LinkedList<IProject>();
		queue.add(project);
		
		while(!queue.isEmpty()){
			IProject pro = queue.poll();
			if (!visited.contains(pro)){
				visited.add(pro);
				queue.addAll(getDependencies(pro));
				IProjectModelIndex part = getPart(pro, true);
				EObject pr = part.find(resource, qualifiedID);
				if (pr != null) results.add(pr);
			}
		}
		
		if (results.isEmpty()) return null;
		
		return results.get(0);
	}

	@Override
	public List<EObject> find(Resource resource, EClass eclass) {
		if (resource == null) return null;
		IProject project = MODembedCore.findProject(resource.getURI());
		
		List<EObject> results = new ArrayList<EObject>();
		Set<IProject> visited = new HashSet<IProject>();
		Queue<IProject> queue = new LinkedList<IProject>();
		queue.add(project);
		
		while(!queue.isEmpty()){
			IProject pro = queue.poll();
			if (!visited.contains(pro)){
				visited.add(pro);
				queue.addAll(getDependencies(pro));
				IProjectModelIndex part = getPart(pro, true);
				results.addAll(part.find(resource, eclass));
			}
		}
		
		return results;
	}
	
}
