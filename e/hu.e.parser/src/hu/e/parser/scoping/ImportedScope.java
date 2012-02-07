/**
 * 
 */
package hu.e.parser.scoping;


import hu.e.parser.eSyntax.CompilationUnit;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * @author balazs.grill
 *
 */
public class ImportedScope extends AbstractScope {

	private final List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
	
	public static String getName(LibraryItem tli){
		if (tli instanceof Type)
			return ((Type) tli).getName();
		if (tli instanceof Variable)
			return ((Variable) tli).getName();
		return null;
	}
	
	private CompilationUnit getUnit(EObject eo){
		if (eo == null) return null;
		if (eo instanceof CompilationUnit){
			return (CompilationUnit)eo;
		}
		return getUnit(eo.eContainer());
	}
	
	/**
	 * @param parent
	 * @param ignoreCase
	 */
	public ImportedScope(EObject element, Class<?> clazz, IScope parent) {
		super(parent, false);
		CompilationUnit cu = getUnit(element);
		if (cu != null){
			List<Library> uses = Collections.emptyList();
			uses = cu.getUse();
			
			for(Library lib : uses){
				for(LibraryItem li : lib.getItems()){
					String name = getName(li);
					if (name != null && clazz.isInstance(li)){
						descs.add(EObjectDescription.create(name, li));
					}
				}
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.AbstractScope#getAllLocalElements()
	 */
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descs;
	}

}
