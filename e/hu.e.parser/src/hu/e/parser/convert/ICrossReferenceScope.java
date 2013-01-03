/**
 * 
 */
package hu.e.parser.convert;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * @author balazs.grill
 *
 */
public interface ICrossReferenceScope {

	/**
	 * Add a cross reference entry
	 * 
	 * @param referer
	 * @param reference
	 * @param id
	 */
	public void addCrossReference(EObject referer, EReference reference, String id);
	
	/**
	 * Returns true if there are unresolved references left
	 * @return
	 */
	public boolean resolveReferences();
	
	public void addSubScope(ICrossReferenceScope subscope);
	
	public List<EObject> resolve(String id);
	
}
