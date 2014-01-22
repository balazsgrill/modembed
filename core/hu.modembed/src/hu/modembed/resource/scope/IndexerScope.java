/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class IndexerScope implements IFeatureScope {

	private final Resource resource;
	
	private final EClass eclass;
	
	/**
	 * 
	 */
	public IndexerScope(Resource resource, EClass eclass) {
		this.resource = resource;
		this.eclass = eclass;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<EObject> list = MODembedCore.getDefault().getModelIndex().find(resource, eclass);
		List<IScopeElement> result = new ArrayList<IScopeElement>(list.size());
		for(EObject eo : list){
			if (eo instanceof NamedElement){
				result.add(new NamedScopeElement((NamedElement) eo));
			}
		}
		return result;
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
		EObject eobject = MODembedCore.getDefault().getModelIndex().find(resource, identifier);
		if (eobject instanceof NamedElement){
			return new NamedScopeElement((NamedElement)eobject);
		}
		
		return null;
	}

}
