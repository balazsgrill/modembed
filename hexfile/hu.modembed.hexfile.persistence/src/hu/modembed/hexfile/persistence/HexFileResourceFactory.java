/**
 * 
 */
package hu.modembed.hexfile.persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * @author balazs.grill
 *
 */
public class HexFileResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new HexFileResource(uri);
	}
	

}
