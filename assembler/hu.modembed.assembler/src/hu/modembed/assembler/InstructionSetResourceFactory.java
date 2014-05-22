/**
 * 
 */
package hu.modembed.assembler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * @author balazs.grill
 *
 */
public class InstructionSetResourceFactory implements Factory {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public Resource createResource(URI uri) {
		return new InstructionSetResource(uri);
	}

}
