/**
 * 
 */
package hu.e.parser.scoping;


import hu.e.parser.eSyntax.Package;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * @author balazs.grill
 *
 */
public class ImportedScope extends AbstractScope {

	private final List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
	
//	public static String getName(TopLevelItem tli){
//		if (tli instanceof LinkedBinary)
//			return ((LinkedBinary) tli).getName();
//		if (tli instanceof Operation)
//			return ((Operation) tli).getName();
//		if (tli instanceof Type)
//			return ((Type) tli).getName();
//		if (tli instanceof Variable)
//			return ((Variable) tli).getName();
//		return null;
//	}
	
	/**
	 * @param parent
	 * @param ignoreCase
	 */
	public ImportedScope(EObject element, Class<?> clazz, IScope parent) {
		super(parent, false);
		EObject eo = element.eResource().getContents().get(0);
		if (eo instanceof Package){
			Package pack = (Package)eo;
//			for(Package p : pack.getUses()){
//				for(TopLevelItem tli : p.getItems()){
//					String name = getName(tli);
//					if (name != null && clazz.isInstance(tli)){
//						descs.add(EObjectDescription.create(name, tli));
//						descs.add(EObjectDescription.create(p.getName()+"::"+name, tli));
//					}
//				}
//			}
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
