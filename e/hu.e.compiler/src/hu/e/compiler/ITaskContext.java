/**
 * 
 */
package hu.e.compiler;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public interface ITaskContext {

	public URI getFileURI(String path);
	
	public Resource getInput(URI uri);
	
	public Resource getOutput(URI uri);
	
	public URI getModelURI(String qualifiedName);
	
	public void logStatus(IStatus status);
	
	public List<String> getParameterValue(String key);
	
}
