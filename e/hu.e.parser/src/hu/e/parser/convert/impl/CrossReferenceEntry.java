/**
 * 
 */
package hu.e.parser.convert.impl;

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
	
}
