/**
 * 
 */
package hu.modembed.resource.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.textualmodeler.parser.scope.IScopeElement;

/**
 * @author balazs.grill
 *
 */
public class NamedScopeElement implements IScopeElement {

	private final NamedElement element;
	
	/**
	 * 
	 */
	public NamedScopeElement(NamedElement element) {
		this.element = element;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IScopeElement#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		return element.getName();
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IScopeElement#getValue(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public EObject getValue(ResourceSet resourceSet) {
		return element;
	}

}
