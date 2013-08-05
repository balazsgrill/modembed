/**
 * 
 */
package hu.modembed.index;

import hu.modembed.MODembedCore;
import hu.modembed.index.impl.SimpleIndexedModel;
import hu.modembed.model.modembed.infrastructure.RootElement;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractModelIndex implements IModelIndex{

	protected static Collection<IProject> getDependencies(IProject p){
		IProjectDescription pd;
		try {
			pd = p.getDescription();
			return Arrays.asList(pd.getReferencedProjects());
		} catch (CoreException e) {
		}
		return Collections.emptySet();
	}
	
	protected static org.eclipse.emf.common.util.URI toURI(IFile file){
		return org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), false);
	}
	
	protected RootElement get(ResourceSet rs, org.eclipse.emf.common.util.URI uri){
		try{
			Resource res = rs.getResource(uri, true);
			if (res != null){
				EObject eo = res.getContents().get(0);
				return (eo instanceof RootElement) ? (RootElement)eo : null;
			}else{
				return null;
			}
		}catch(Exception e){
			return null;
		}
	}
	
	protected IIndexedModel getDescriptor(org.eclipse.emf.common.util.URI uri){
		try{
			ResourceSet rs = MODembedCore.createResourceSet();
			RootElement r = get(rs, uri);
			IIndexedModel descriptor = new SimpleIndexedModel(r.getName(), uri, r.eClass());
			for(Resource res : rs.getResources()){
				res.unload();
			}
			return descriptor;
		}catch(Exception e){
			// Don't fail if one file is failed to load
		}
		return null;
	}
	
}
