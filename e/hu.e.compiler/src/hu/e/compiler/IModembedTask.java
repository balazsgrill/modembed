/**
 * 
 */
package hu.e.compiler;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public interface IModembedTask {

	public void execute(ITaskContext context, IProgressMonitor monitor);
	
}
