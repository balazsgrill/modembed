/**
 * 
 */
package hu.modembed.ui.wizards.included;

import hu.modembed.includedcode.CreateProjectInWorkspaceTask;
import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;
import hu.modembed.ui.MODembedUI;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author balazs.grill
 *
 */
public class ImportIncludedProjectWizard extends Wizard implements
		IImportWizard {

	IncludedProjectsSelectionWizardPage page1;
	ImportProjectListReviewWizardPage page2;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page1 = new IncludedProjectsSelectionWizardPage("page1");
		page2 = new ImportProjectListReviewWizardPage("page2", page1.getSelection());
		setWindowTitle("Import embedded projects");
	}

	@Override
	public void addPages() {
		addPage(page1);
		addPage(page2);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final Object[] selection = page2.getSelection().toArray();
		Job job = new Job("Importing code") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				List<IncludedProject> projects = new ArrayList<IncludedProject>(selection.length);
				for (Object o : selection){
					if (o instanceof IncludedProject){
						projects.add((IncludedProject)o);
					}
				}
				projects = IncludedProjectsRegistry.getInstance().resolveDependencies(projects);
				
				List<CreateProjectInWorkspaceTask> tasks = new ArrayList<CreateProjectInWorkspaceTask>();
				for (IncludedProject o : projects){
					tasks.add(new CreateProjectInWorkspaceTask(o));
				}
				
				monitor.beginTask("Importing projects..", tasks.size()*10);
				
				List<IStatus> statuses = new ArrayList<IStatus>();
				
				for(CreateProjectInWorkspaceTask task : tasks){
					try {
						task.run(new SubProgressMonitor(monitor, 10));
					} catch (CoreException e) {
						statuses.add(e.getStatus());
					}
				}
				
				if (statuses.isEmpty()) return Status.OK_STATUS;
				return new MultiStatus(MODembedUI.PLUGIN_ID, 0, statuses.toArray(new IStatus[statuses.size()]), "Could not import all projects!", null);
			}
		};
		job.setUser(true);
		job.schedule();
		return true;
	}

}
