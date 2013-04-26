/**
 * 
 */
package hu.modembed.index;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractGlobalModelIndex {

	protected Collection<IProject> getDependencies(IProject p){
		IProjectDescription pd;
		try {
			pd = p.getDescription();
			return Arrays.asList(pd.getReferencedProjects());
		} catch (CoreException e) {
		}
		return Collections.emptySet();
	}
	
	protected org.eclipse.emf.common.util.URI toURI(IFile file){
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
	
	protected String getName(org.eclipse.emf.common.util.URI uri){
		String name = null;
		try{
			ResourceSet rs = new ResourceSetImpl();
			RootElement r = get(rs, uri);
			if (r != null){
				name = r.getName();
			}
			for(Resource res : rs.getResources()){
				res.unload();
			}
		}catch(Exception e){
			// Don't fail if one file is failed to load
		}
		return name;
	}
	
}
