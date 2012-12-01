/**
 * 
 */
package hu.e.compiler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public interface ITaskContext {

	public Resource getInput(String URI);
	
	public Resource getOutput(String URI);
	
	public URI getModelURI(String qualifiedName);
	
}
