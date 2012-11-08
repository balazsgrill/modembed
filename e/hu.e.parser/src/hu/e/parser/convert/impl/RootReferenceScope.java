/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.modembed.model.core.NamedElement;
import hu.modembed.model.core.RootElement;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class RootReferenceScope extends AbstractCrossReferenceScope {

	private final List<RootElement> libraries;
	
	public RootReferenceScope(List<RootElement> libraries) {
		this.libraries = libraries;
	}

	private void search(RootElement re, String id, List<EObject> results){
		for(EObject le : re.eContents()){
			if (le instanceof NamedElement){
				if (id.equals(((NamedElement) le).getName())){
					results.add(le);
				}
			}
		}
	}
	
	@Override
	public List<EObject> resolve(String id) {
		List<EObject> result = new LinkedList<EObject>();
		for(RootElement l : libraries){
			search(l, id, result);
		}
		return result;
	}

}
