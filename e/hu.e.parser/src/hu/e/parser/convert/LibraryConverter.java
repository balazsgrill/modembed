/**
 * 
 */
package hu.e.parser.convert;


import hu.e.parser.convert.impl.ExpressionConverter;
import hu.e.parser.convert.impl.FunctionConverter;
import hu.e.parser.convert.impl.RootReferenceScope;
import hu.e.parser.convert.impl.TypeConverter;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.HeapVariable;
import hu.modembed.model.emodel.LibraryElement;

import java.io.IOException;

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
	
	private LibraryElement convertElement(LibraryItem item, ICrossReferenceScope scope){
		if (item instanceof Type){
			Type from = (Type)item;
			hu.modembed.model.emodel.Type to = EmodelFactory.eINSTANCE.createType();
			
			to.setName(from.getName());
			to.setDefinition(TypeConverter.convertTypeDef(from.getDef(), scope));
			
			return to;
		}
		
		if (item instanceof Operation){
			return FunctionConverter.convert((Operation)item, scope);
		}
		
		if (item instanceof Variable){
			
			if (item instanceof ConstantVariable){
				hu.modembed.model.emodel.ConstantVariable cv = EmodelFactory.eINSTANCE.createConstantVariable();
				cv.setName(item.getName());
				cv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				cv.setValue(ExpressionConverter.convert(((ConstantVariable) item).getValue(), scope));
				return cv;
			}else if (item instanceof RegisterVariable){
				hu.modembed.model.emodel.RegisterVariable rv = EmodelFactory.eINSTANCE.createRegisterVariable();
				rv.setName(item.getName());
				rv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				rv.setAddress(ExpressionConverter.convert(((RegisterVariable) item).getAddr(), scope));
				return rv;
			}else{
				//Heap variable
				HeapVariable hv = EmodelFactory.eINSTANCE.createHeapVariable();
				hv.setName(item.getName());
				hv.setType(TypeConverter.convertTypeDef(((Variable) item).getType(), scope));
				return hv;
			}
			
		}
		
		return null;
	}
	
	
	
	public void convert(Library library){
		hu.modembed.model.emodel.Library result = EmodelFactory.eINSTANCE.createLibrary();
		result.setName(library.getName());
		
		ICrossReferenceScope scope = new RootReferenceScope(project, resourceSet, result, library.getUse());
		
		for(LibraryItem item : library.getItems()){
			LibraryElement le = convertElement(item, scope);
			if (le != null){
				result.getContent().add(le);
			}
		}
		
		scope.resolveReferences();
		
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
