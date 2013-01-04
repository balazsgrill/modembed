/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.UnresolvedCrossReference;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.Origin;
import hu.modembed.model.core.TextOrigin;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public final class CrossReferenceEntry {

	public final EObject referer;
	public final EReference reference;
	public final String id;
	
	public CrossReferenceEntry(EObject referer, EReference reference, String id) {
		this.referer = referer;
		this.reference = reference;
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(referer.eClass().getName()+"/"+reference.getName()+"->"+id);
		return sb.toString();
	}
	
	public UnresolvedCrossReference createUnresolved(){
		if (referer instanceof MODembedElement){
			for(Origin o : ((MODembedElement) referer).getOrigins()){
				if (o instanceof TextOrigin){
					return new UnresolvedCrossReference(id, ((TextOrigin) o));
				}
			}
		}
		return new UnresolvedCrossReference(id, 0);
	}
	
}
