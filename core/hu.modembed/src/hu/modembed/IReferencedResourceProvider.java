/**
 * 
 */
package hu.modembed;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public interface IReferencedResourceProvider {

	/**
	 * Return all resource of the given type which are visible in the scope of the
	 * given project.
	 * 
	 * @param project
	 * @param type
	 * @return
	 * @throws CoreException 
	 */
	public Iterable<URI> getResources(String project, String type) throws CoreException;
	
}
