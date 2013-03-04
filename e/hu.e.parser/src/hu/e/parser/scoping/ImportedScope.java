/**
 * 
 */
package hu.e.parser.scoping;


import hu.e.parser.eSyntax.AnnotationDefinition;
import hu.e.parser.eSyntax.CompilationUnit;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
		if (tli instanceof AnnotationDefinition){
			return ((AnnotationDefinition) tli).getName();
		}
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
			Set<Library> visited = new HashSet<Library>();
			Queue<Library> uses = new LinkedList<Library>();
			//uses.addAll(cu.getUse());
			
			while(!uses.isEmpty()){
				Library lib = uses.poll();
				
				if (!visited.contains(lib)){
					visited.add(lib);
					
					for(LibraryItem li : lib.getItems()){
						String name = getName(li);
						if (name != null && clazz.isInstance(li)){
							descs.add(EObjectDescription.create(name, li));
						}
					}
					
					//uses.addAll(lib.getOverrides());
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
