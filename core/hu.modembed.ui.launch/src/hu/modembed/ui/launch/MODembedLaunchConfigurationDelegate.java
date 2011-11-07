/**
 * 
 */
package hu.modembed.ui.launch;

import hu.modembed.ui.launch.control.ProgrammerConfiguration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.core.model.IProcess;

/**
 * @author balazs.grill
 *
 */
public class MODembedLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate, ILaunchAttribs {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		monitor.beginTask("Launching program..", 3);
		
		//Read configuration
		final List<ProgrammerConfiguration> configs = 
				MODembedLaunchConfigurationTab.readConfiguration(configuration);
		monitor.worked(1);
		
		//Initialize programmers
		Job job = new Job("Programming..") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				List<IStatus> statuses = new ArrayList<IStatus>();
				monitor.beginTask("Initializing devices", configs.size()*100);
				for(ProgrammerConfiguration pc : configs){
					try {
						pc.getInstance().initialize(pc.getProperties(), new SubProgressMonitor(monitor, 100));
					} catch (CoreException e) {
						statuses.add(e.getStatus());
					}
				}
				monitor.done();
				if (!statuses.isEmpty()){
					return new MultiStatus(LaunchPlugin.PLUGIN_ID, 0, statuses.toArray(new IStatus[statuses.size()]),"Errors caught on initializing devices!", null);
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		
		//Start processes
		for(ProgrammerConfiguration pc : configs){
			IProcess p = new ProgrammerProcess(pc.getInstance(), launch, pc.getProperties());
			launch.addProcess(p);
		}
		
		monitor.done();
	}

}
