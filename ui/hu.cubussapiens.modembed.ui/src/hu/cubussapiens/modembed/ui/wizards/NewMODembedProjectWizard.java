/**
 * 
 */
package hu.cubussapiens.modembed.ui.wizards;

import hu.cubussapiens.modembed.ui.project.CreateProjectTask;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
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
		setWindowTitle("MODembed project creation");
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
			task.setProject(project);
			task.setArchID(page1.getArchID());
			task.setMainModule(page1.getMainModule());
			task.setOutDirName(page1.getOutDirName());
			task.setSrcDirName(page1.getSrcDirName());
			task.setWextensions(page1.getWextensions());
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
