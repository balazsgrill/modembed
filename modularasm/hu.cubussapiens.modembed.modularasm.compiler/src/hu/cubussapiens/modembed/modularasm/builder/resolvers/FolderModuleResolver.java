/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.builder.resolvers;

import hu.cubussapiens.modembed.modularasm.builder.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class FolderModuleResolver implements IModuleResolver {

	private final ResourceSet rs;
	private final IContainer folder;
	
	public FolderModuleResolver(ResourceSet rs, IContainer folder) {
		this.rs = rs;
		this.folder = folder;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.modularasm.builder.IModuleResolver#resolveModule(java.lang.String)
	 */
	@Override
	public Module resolveModule(QualifiedID moduleID) {
		List<String> ss = moduleID.getSegments();
		if (ss.isEmpty()) return null;
		IContainer current = folder;
		for(int i=0;i<ss.size()-1;i++){
			if (current instanceof IProject){
				current = ((IProject)current).getFolder(ss.get(i)) ;
			}else
			if (current instanceof IFolder){
				current = ((IFolder)current).getFolder(ss.get(i)) ;
			}else{
				return null;
			}
		}
		String last = ss.get(ss.size()-1);
		IFile file = null;
		if (current instanceof IProject){
			file = ((IProject)current).getFile(last+".masm");
		}else if (current instanceof IFolder){
			file = ((IFolder)current).getFile(last+".masm");
		}else{
			return null;
		}
		if (file.exists()){
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(),true);
			Resource resource = rs.getResource(uri, true);
			for(EObject eo : resource.getContents()){
				if (eo instanceof Module){
					return (Module)eo;
				}
			}
		}
		
		return null;
	}

}
