/**
 * 
 */
package hu.modembed.index;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public interface IModelIndex {

	public EObject find(Resource resource, String qualifiedID);
	
	public List<EObject> find(Resource resource, EClass eclass);
	
}
