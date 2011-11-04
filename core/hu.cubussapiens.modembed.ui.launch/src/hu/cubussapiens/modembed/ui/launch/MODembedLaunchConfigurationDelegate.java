/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.IProgrammerType;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
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
		ILaunchConfigurationDelegate {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		monitor.beginTask("Launching program..", 3);
		
		String hexfile = configuration.getAttribute(LaunchPlugin.A_HEXFILE, "");
		String prog = configuration.getAttribute(LaunchPlugin.A_PROG, "");
		String progid = configuration.getAttribute(LaunchPlugin.A_PROGID, "");
		
		RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(prog);
		if (rp == null) throw new CoreException(new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "Could not found programmer in registry: \""+prog+"\""));
		
		IProgrammerType pt = rp.getHandler();
		final IProgrammerInstance pi = pt.findInstance(progid);
		
		if (pi == null) throw new CoreException(new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "Could not found programmer! Maybe it's not connected?"));
		
		monitor.worked(1);
	
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(hexfile));
		if (!file.exists()) throw new CoreException(new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "Hex file not found! "+hexfile));
		final File f = file.getLocation().toFile().getAbsoluteFile();
		
		
		
		if (needprogram){
			Job job = new Job("Programming..") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					pi.initialize(props, monitor);
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
			try {
				job.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		IProcess p = new ProgrammerProcess(pi, launch);
		launch.addProcess(p);
		
		monitor.done();
	}

}
