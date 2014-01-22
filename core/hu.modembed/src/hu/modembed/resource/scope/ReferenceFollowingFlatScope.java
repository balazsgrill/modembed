/**
 * 
 */
package hu.modembed.resource.scope;

import hu.textualmodeler.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public class ReferenceFollowingFlatScope extends FlatScope {

	private final EReference parentRefernce;
	
	public static IFeatureScope findScope(EObject context, EClass parentClass, EClass valueClass, EReference containerReference, EReference parentRefernce){
		EObject current = findAncestor(context, parentClass);
		
		if (current != null){
			return new ReferenceFollowingFlatScope(current, valueClass, containerReference, parentRefernce);
		}
		return null;
	}
	
	/**
	 * @param container
	 * @param valueClass
	 * @param containerReference
	 */
	public ReferenceFollowingFlatScope(EObject container, EClass valueClass,
			EReference containerReference, EReference parentRefernce) {
		super(container, valueClass, containerReference);
		this.parentRefernce = parentRefernce;
	}

	@Override
	public IFeatureScope parentScope() {
		Object o = getContainer().eGet(parentRefernce);
		if (o instanceof EObject){
			return new ReferenceFollowingFlatScope((EObject)o, getValueClass(), getContainerReference(), parentRefernce);
		}
		return super.parentScope();
	}
	
}
