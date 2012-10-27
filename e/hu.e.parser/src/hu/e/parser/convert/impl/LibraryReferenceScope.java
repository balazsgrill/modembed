/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class LibraryReferenceScope extends AbstractCrossReferenceScope {

	private final List<Library> libraries;
	
	public LibraryReferenceScope(List<Library> libraries) {
		this.libraries = libraries;
	}

	@Override
	protected List<EObject> resolve(String id) {
		List<EObject> result = new LinkedList<EObject>();
		for(Library l : libraries){
			for(LibraryElement le : l.getContent()){
				if (id.equals(le.getName())){
					result.add(le);
				}
			}
		}
		return result;
	}

}
