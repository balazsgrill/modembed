/**
 * 
 */
package hu.e.compiler;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public interface IModembedTask {

	public void execute(ITaskContext context, IProgressMonitor monitor, Map<String, String> parameters);
	
}
