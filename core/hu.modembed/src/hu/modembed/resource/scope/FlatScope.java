/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public class FlatScope implements IFeatureScope {
	
	private final EObject container;
	private final EClass valueClass;
	private final EReference containerReference;
	
	/**
	 * 
	 */
	public FlatScope(EObject container, EClass valueClass, EReference containerReference) {
		this.container = container;
		this.valueClass = valueClass;
		this.containerReference = containerReference;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new LinkedList<IScopeElement>();
		Object o = container.eGet(containerReference);
		
		if (o instanceof List<?>){
			for(Object u : (List<?>)o){
				if (valueClass.isInstance(u) && u instanceof NamedElement){
					list.add(new NamedScopeElement((NamedElement) u));
				}
			}
		}
		
		if (valueClass.isInstance(o) && o instanceof NamedElement){
			list.add(new NamedScopeElement((NamedElement) o));
		}
		
		return list;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		Object o = container.eGet(containerReference);
		
		if (o instanceof List<?>){
			for(Object u : (List<?>)o){
				if (valueClass.isInstance(u) && u instanceof NamedElement){
					return new NamedScopeElement((NamedElement) u);
				}
			}
		}
		
		if (valueClass.isInstance(o) && o instanceof NamedElement){
			return new NamedScopeElement((NamedElement) o);
		}
		
		return null;
	}

}
