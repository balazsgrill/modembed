/**
 * 
 */
package hu.cubussapiens.modembed.ui.wizards;

import hu.cubussapiens.modembed.ui.MODembedUI;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * @author balage
 *
 */
public class NewMODembedProjectWizard extends Wizard implements INewWizard {

	WizardNewProjectCreationPage page1;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page1 = new WizardNewProjectCreationPage("page1");
		

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
			getContainer().run(true, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					monitor.beginTask("Creating project", 3);
					
					
					try {
						project.create(new SubProgressMonitor(monitor, 1));
						project.open(new SubProgressMonitor(monitor, 1));
						
						IProjectDescription pd = project.getDescription();
						String[] nids = pd.getNatureIds();
						
						String[] nids2 = new String[nids.length+1];
						System.arraycopy(nids, 0, nids2, 0, nids.length);
						nids2[nids.length] = MODembedUI.NatureID;
						
						pd.setNatureIds(nids2);
						project.setDescription(pd, new SubProgressMonitor(monitor, 1));
						
						monitor.done();
					} catch (CoreException e) {
						e.printStackTrace();
					}
					
				}
			});
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
