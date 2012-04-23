/**
 * 
 */
package hu.e.project;

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
	 */
	public Iterable<URI> getResources(String project, String type);
	
}
