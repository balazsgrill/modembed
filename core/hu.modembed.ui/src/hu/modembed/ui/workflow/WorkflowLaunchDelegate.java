/**
 * 
 */
package hu.modembed.ui.workflow;

import hu.e.compiler.WorkflowLauncherRunnable;
import hu.modembed.ui.MODembedUI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class WorkflowLaunchDelegate implements ILaunchConfigurationDelegate, IWorkflowLaunchAttributes {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			final ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		String wfuri = configuration.getAttribute(WORKFLOW_URI, "");
		try{
			final URI uri = URI.createURI(wfuri);
			
			Job job = new Job("Execute workflow") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						launch.terminate();
					} catch (DebugException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					WorkflowLauncherRunnable runnable = new WorkflowLauncherRunnable(uri);
					return runnable.execute(monitor);
					
				}
			};
			job.setUser(true);
			job.schedule();
			
		}catch(Exception e){
			throw new CoreException(new Status(IStatus.ERROR, MODembedUI.PLUGIN_ID, "Invalid workflow URI", e));
		}
	}

}
