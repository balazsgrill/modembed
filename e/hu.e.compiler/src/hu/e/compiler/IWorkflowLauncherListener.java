/**
 * 
 */
package hu.e.compiler;

import hu.modembed.model.core.workflow.WorkflowTask;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public interface IWorkflowLauncherListener {

	public void started();
	
	public void taskStarted(WorkflowTask task);
	
	public void outputSaving(URI document);
	
	public void log(IStatus status);
	
	public void ended();
	
}
