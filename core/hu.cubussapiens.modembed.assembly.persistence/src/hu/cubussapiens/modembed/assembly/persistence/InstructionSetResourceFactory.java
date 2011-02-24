/**
 * 
 */
package hu.cubussapiens.modembed.assembly.persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * @author balage
 *
 */
public class InstructionSetResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new InstructionSetResource(uri);
	}
	
}
