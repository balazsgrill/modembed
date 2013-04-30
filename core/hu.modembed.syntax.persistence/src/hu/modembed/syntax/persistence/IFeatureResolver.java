/**
 * 
 */
package hu.modembed.syntax.persistence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public interface IFeatureResolver {

	public Object resolve(EObject context, EStructuralFeature feature, String terminalName, String value);
	
}
