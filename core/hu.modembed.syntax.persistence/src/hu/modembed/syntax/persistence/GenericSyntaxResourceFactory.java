/**
 * 
 */
package hu.modembed.syntax.persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * @author balazs.grill
 *
 */
public class GenericSyntaxResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new GenericSyntaxResource(uri);
	}
	
}
