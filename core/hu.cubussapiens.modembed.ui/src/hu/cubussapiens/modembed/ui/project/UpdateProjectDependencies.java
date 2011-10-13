/**
 * 
 */
package hu.cubussapiens.modembed.ui.project;

import hu.cubussapiens.modembed.MODembedCore;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author balazs.grill
 *
 */
public class UpdateProjectDependencies implements IObjectActionDelegate {

	IProject project = null;
	
	@Override
	public void run(IAction action) {
		if (project != null){
			
			Job job = new Job("Execute transformation script") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					MODembedCore.updateDeps(project);
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) selection).getFirstElement();
			project = (o instanceof IProject) ? (IProject)o : null;
		}
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}



}
