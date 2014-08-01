/**
 * 
 */
package hu.modembed.application;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import application.ApplicationLibrary;
import application.ApplicationPackage;
import application.LibraryElement;
import hu.temon.grammar.Terminal;
import hu.temon.parser.BasicFeatureResolver;

/**
 * @author balazs.grill
 *
 */
public class LibraryFeatureResolver extends BasicFeatureResolver {

	/**
	 * @param resource
	 */
	public LibraryFeatureResolver(Resource resource) {
		super(resource);
	}
	
	private static ApplicationLibrary getLibrary(EObject context){
		if (context == null) return null;
		if (context instanceof ApplicationLibrary) return (ApplicationLibrary)context;
		return getLibrary(context.eContainer());
	}
	
	private static LibraryElement findElement(ApplicationLibrary library, String name){
		for(LibraryElement element : library.getElements()){
			if (name.equals(element.getName())) return element;
		}
		for(ApplicationLibrary uses : library.getUses()){
			LibraryElement le = findElement(uses, name);
			if (le != null) return le;
		}
		return null;
	}
	
	private static LibraryElement findElement(EObject context, String name){
		ApplicationLibrary library = getLibrary(context);
		if (library != null){
			return findElement(library, name);
		}
		return null;
	}
	
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		if (ApplicationPackage.eINSTANCE.getData_Type().equals(feature)){
			return findElement(context, value);
		}
		if (ApplicationPackage.eINSTANCE.getApplicationInterface_Type().equals(feature)){
			return findElement(context, value);
		}
		if (ApplicationPackage.eINSTANCE.getApplicationLibrary_Uses().equals(feature)){
			//TODO refer libraries
		}
		return super.resolve(context, feature, terminal, value);
	}
	
}
