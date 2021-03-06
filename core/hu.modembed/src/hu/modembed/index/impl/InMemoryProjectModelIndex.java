/**
 * 
 */
package hu.modembed.index.impl;

import hu.modembed.index.AbstractModelIndex;
import hu.modembed.index.IIndexedModel;
import hu.modembed.index.IProjectModelIndex;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
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
	
	private boolean dirty;
	private boolean disposed;
	
	public InMemoryProjectModelIndex(IProject project) throws CoreException {
		this.project = project;
		dirty = true;
		disposed = false;
	}
	
	@Override
	public void initialize() throws CoreException {
		dirty = true;
	}
	
	@Override
	public EObject find(Resource resource, final String qualifiedID) {
		if (disposed) return null;
		final IFile[] file = new IFile[1]; 
		try {
			project.accept(new IResourceVisitor() {
				
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IContainer) return true;
					if (resource instanceof IFile){
						String name = resource.getName();
						if (name.contains(".")){
							name = name.substring(0, name.lastIndexOf('.'));
						}
						if (name.equals(qualifiedID)){
							file[0] = (IFile)resource;
						}
					}
					return false;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (file[0] != null){
			return get(resource.getResourceSet(), toURI(file[0]));
		}
		
//		System.out.println("Query "+qualifiedID+" in "+project.getName());
//		for(IIndexedModel im : models.values()){
//			if (qualifiedID.equals(im.getQualifiedName())){
//				System.out.println("OK");
//				return im.load(resource.getResourceSet());
//			}
//		}
//		System.out.println("FAIL");
		return null;
	}

	@Override
	public List<EObject> find(Resource resource, EClass eclass) {
		if (disposed) return Collections.emptyList();
		try {
			loadIfDiry();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	private void dispose(){
		disposed = true;
		models.clear();
	}
	
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		if (disposed) return false;
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
		dirty = true;
		return false;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
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
	
	private void loadIfDiry() throws CoreException{
		if (dirty) load(project);
		dirty = false;
	}
	
	private void load(IProject resource) throws CoreException {
		if (disposed) return;
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
