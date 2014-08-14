/**
 * 
 */
package hu.modembed.application;

import hu.temon.grammar.Terminal;
import hu.temon.parser.BasicFeatureResolver;
import hu.temon.parser.scope.IFeatureScope;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import application.ApplicationLibrary;
import application.ApplicationPackage;
import application.CompositeModuleImplementation;
import application.InterfaceImplementationMapping;
import application.InterfaceOfModule;
import application.LibraryElement;

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
	
	private ApplicationLibrary findLibrary(String id){
		if (id == null) return null;
		/* First, look in resourceSet */
		for(Resource r : getResourceSet().getResources()){
			for(EObject eo : r.getContents()){
				if (eo instanceof ApplicationLibrary){
					if (id.equals(((ApplicationLibrary) eo).getQualifiedId())){
						return (ApplicationLibrary)eo;
					}
				}
			}
		}
		
		/* If not found, ask for an ILibraryResolver implementation */
		Object o = getResourceSet().getLoadOptions().get(ILibraryResolver.OPTION__LIBRARY_RESOLVER);
		if (o instanceof ILibraryResolver){
			URI uri = ((ILibraryResolver) o).findLibraryResource(id);
			Resource r = getResourceSet().getResource(uri, true);
			for(EObject eo : r.getContents()){
				if (eo instanceof ApplicationLibrary){
					if (id.equals(((ApplicationLibrary) eo).getQualifiedId())){
						return (ApplicationLibrary)eo;
					}
				}
			}
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
		if (ApplicationPackage.eINSTANCE.getApplicationModule_Implementation().equals(feature)){
			return findElement(context, value);
		}
		if (ApplicationPackage.eINSTANCE.getApplicationLibrary_Uses().equals(feature)){
			return findLibrary(value);
		}
		return super.resolve(context, feature, terminal, value);
	}
	
	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		if (ApplicationPackage.eINSTANCE.getDelegatedImplementation_OuterInterface().equals(feature)){
			EObject m = context.eContainer();
			if (m instanceof CompositeModuleImplementation){
				return new OuterInterfaceScope((CompositeModuleImplementation) m);
			}
		}
		if (ApplicationPackage.eINSTANCE.getInterfaceOfModule_Module().equals(feature)){
			EObject m = context.eContainer();
			if (m instanceof InterfaceImplementationMapping){
				m = m.eContainer();
			}
			if (m instanceof CompositeModuleImplementation){
				return new SubModuleScope((CompositeModuleImplementation) m);
			}
		}
		if (ApplicationPackage.eINSTANCE.getInterfaceOfModule_Interface().equals(feature)){
			return new InterfaceOfModuleScope((InterfaceOfModule)context);
		}
		return super.getScope(context, feature, terminal, value);
	}
	
}
