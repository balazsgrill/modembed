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
	
	public EObject getContainer() {
		return container;
	}
	
	public EClass getValueClass() {
		return valueClass;
	}
	
	public EReference getContainerReference() {
		return containerReference;
	}
	
	public static EObject findAncestor(EObject context, EClass parentClass){
		EObject current = context;
		while(current != null && !parentClass.isInstance(current)){
			current = current.eContainer();
		}
		return current;
	}
	
	public static IFeatureScope findScope(EObject context, EClass parentClass, EClass valueClass, EReference containerReference){
		EObject current = findAncestor(context, parentClass);
		
		if (current != null){
			return new FlatScope(current, valueClass, containerReference);
		}
		return null;
	}
	
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
				if (valueClass.isInstance(u) && u instanceof NamedElement && identifier.equals(((NamedElement)u).getName())){
					return new NamedScopeElement((NamedElement) u);
				}
			}
		}
		
		if (valueClass.isInstance(o) && o instanceof NamedElement && identifier.equals(((NamedElement)o).getName())){
			return new NamedScopeElement((NamedElement) o);
		}
		
		return null;
	}

}
