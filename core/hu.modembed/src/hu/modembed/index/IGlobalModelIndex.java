/**
 * 
 */
package hu.modembed.index;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public interface IGlobalModelIndex {

	public RootElement findRootElement(Resource resource, String qualifiedID);
	
}
