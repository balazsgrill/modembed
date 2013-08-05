/**
 * 
 */
package hu.modembed.index;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public interface IIndexedModel {

	public String getQualifiedName();
	
	public URI getResourceURI();
	
	public EClass getEClass();
	
	public EObject load(ResourceSet resourceSet);
	
}
