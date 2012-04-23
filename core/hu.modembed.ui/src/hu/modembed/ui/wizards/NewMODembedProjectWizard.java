/**
 * 
 */
package hu.modembed.ui.wizards;

import hu.modembed.ui.project.CreateProjectTask;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author balage
 *
 */
public class NewMODembedProjectWizard extends Wizard implements INewWizard {

	NewMODembedProjectWizardPage page1;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page1 = new NewMODembedProjectWizardPage("page1");
		setWindowTitle("New e project");
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		addPage(page1);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final IProject project = page1.getProjectHandle();
		
		try {
			CreateProjectTask task = new CreateProjectTask();
			IProjectDescription pd = project.getWorkspace().newProjectDescription(project.getName());
			if (!page1.useDefaults()){
				pd.setLocationURI(page1.getLocationURI());
			}
			task.setProject(pd, project);
			getContainer().run(true, false, task);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
