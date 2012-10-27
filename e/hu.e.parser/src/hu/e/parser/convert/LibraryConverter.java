/**
 * 
 */
package hu.e.parser.convert;


import java.io.IOException;

import hu.e.parser.eSyntax.Library;
import hu.modembed.model.emodel.EmodelFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author balazs.grill
 *
 */
public class LibraryConverter {

	public static final String MODELS_FOLDER = ".models";
	
	private final ResourceSet resourceSet;
	
	private final IProject project;
	
	public LibraryConverter(IProject project) {
		this.resourceSet = new ResourceSetImpl();
		this.project = project;
	}
	
	private URI getLibURI(String name){
		IFolder folder = project.getFolder(MODELS_FOLDER);
		if (!folder.exists()){
			try {
				folder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		IFile file = folder.getFile(name+".xmi");
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}
	
	public void convert(Library library){
		hu.modembed.model.emodel.Library result = EmodelFactory.eINSTANCE.createLibrary();
		result.setName(library.getName());
		
		URI uri = getLibURI(result.getName());
		Resource r = resourceSet.createResource(uri);
		r.getContents().add(result);
		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
