/**
 * 
 */
package hu.modembed.ui.internal;

import hu.modembed.MODembedCore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class DynamicECoreRegistry {

	private final ResourceSet resourceSet = MODembedCore.createResourceSet();
	
	public List<EPackage> getPackagesFor(IProject project) throws CoreException{
		List<EPackage> result = new ArrayList<EPackage>();
		
		for (IProject p : project.getDescription().getReferencedProjects()){
			result.addAll(getPackagesFor(p));
		}
		
		result.addAll(doGetPackagesFor(project));
		
		return result;
	}
	
	private List<EPackage> doGetPackagesFor(IProject project) throws CoreException{
		final List<EPackage> result = new ArrayList<EPackage>();
		project.accept(new IResourceVisitor() {
			
			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile){
					if ("ecore".equals(resource.getFileExtension())){
						URI uri = URI.createPlatformResourceURI(resource.getFullPath().toPortableString(), true);
						Resource r = resourceSet.getResource(uri, false);
						if (r != null){
							r.unload();
							try {
								r.load(null);
							} catch (IOException e1) {
								//throw new CoreException(new Status(IStatus.ERROR, , message))
								e1.printStackTrace();
							}
						}else{
							r = resourceSet.getResource(uri, true);
						}
						TreeIterator<EObject> iterator = r.getAllContents();
						while(iterator.hasNext()){
							EObject e = iterator.next();
							if (e instanceof EPackage){
								result.add((EPackage)e);
							}
						}
					}
				}
				return true;
			}
		});
		return result;
	}
	
}
