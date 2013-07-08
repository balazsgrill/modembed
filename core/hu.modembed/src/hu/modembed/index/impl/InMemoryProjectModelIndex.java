/**
 * 
 */
package hu.modembed.index.impl;

import hu.modembed.index.AbstractModelIndex;
import hu.modembed.index.IIndexedModel;
import hu.modembed.index.IProjectModelIndex;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class InMemoryProjectModelIndex extends AbstractModelIndex implements IProjectModelIndex{

	private final IProject project;
	
	private final Map<URI, IIndexedModel> models = new LinkedHashMap<URI, IIndexedModel>();
	
	public InMemoryProjectModelIndex(IProject project) throws CoreException {
		this.project = project;
	}
	
	@Override
	public void initialize() throws CoreException {
		load(project);
	}
	
	@Override
	public EObject find(Resource resource, String qualifiedID) {
		System.out.println("Query "+qualifiedID+" in "+project.getName());
		for(IIndexedModel im : models.values()){
			if (qualifiedID.equals(im.getQualifiedName())){
				System.out.println("OK");
				return im.load(resource.getResourceSet());
			}
		}
		System.out.println("FAIL");
		return null;
	}

	@Override
	public List<EObject> find(Resource resource, EClass eclass) {
		List<EObject> result = new LinkedList<EObject>();
		for(IIndexedModel im : models.values()){
			if (eclass.isSuperTypeOf(im.getEClass())){
				result.add(im.load(resource.getResourceSet()));
			}
		}
		return result;
	}

	private void put(IIndexedModel descriptor){
		models.put(descriptor.getResourceURI(), descriptor);
	}
	
	private void remove(URI uri){
		models.remove(uri);
	}
	
	private void dispose(){
		models.clear();
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
		load(getProject());
//		if (resource instanceof IContainer) return true;
//		if (resource instanceof IFile){
//			URI uri = toURI((IFile)resource);
//			switch(kind){
//			case IResourceDelta.REMOVED:
//				remove(uri);
//				break;
//			case IResourceDelta.CONTENT:
//			case IResourceDelta.CHANGED:
//			//case IResourceDelta.CHANGED:	this is called when markers are changed
//			case IResourceDelta.REPLACED:
//			case IResourceDelta.ADDED:
//				System.out.println(uri+" changed: "+kind);
//				IIndexedModel desc = getDescriptor(uri);
//				if (desc != null){
//					put(desc);
//				}
//				break;
//				
//			}
//		}
		return false;
	}

	private List<IFile> listAllFiles(IProject project) throws CoreException{
		final List<IFile> result = new LinkedList<IFile>();
		if (project.exists()){
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
		}
		return result;
	}
	
	private void load(IProject resource) throws CoreException {
		if (!resource.isOpen()) return;
		List<IFile> files = listAllFiles(resource);
		int last = -1;
		
		while(last != files.size()){
			last = files.size();
			List<IFile> fails = new LinkedList<IFile>();
			for(IFile file : files){
				URI uri = toURI(file);
				IIndexedModel desc = getDescriptor(uri);
				if (desc != null){
					put(desc);
				}else{
					fails.add(file);
				}
			}
			files = fails;
		}	
	}
	
	@Override
	public IProject getProject() {
		return project;
	}

}
