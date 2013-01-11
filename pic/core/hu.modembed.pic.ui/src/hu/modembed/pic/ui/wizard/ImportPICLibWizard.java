/**
 * 
 */
package hu.modembed.pic.ui.wizard;

import hu.modembed.pic.ui.ImportPICLibraryTask;
import hu.modembed.pic.ui.PicUIPlugin;

import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author balage
 *
 */
public class ImportPICLibWizard extends Wizard implements IImportWizard {

	@Override
	public void addPages() {
		addPage(page);
	}
	
	PICLibSelectionWizardPage page;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import PIC library");
		page = new PICLibSelectionWizardPage("page1", selection);
	}

	@Override
	public boolean performFinish() {
		final URL url = page.getSelection();
		final IContainer container = page.getDestinationContainer();
		
		Job job = new Job("Importing"){
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					new ImportPICLibraryTask(url, container).run(monitor);
					return Status.OK_STATUS;
				} catch (Exception e) {
					return new Status(IStatus.ERROR, PicUIPlugin.PLUGIN_ID, e.getMessage(), e);
				} 
			}
		};
		job.setUser(true);
		job.schedule();
		
		return true;
	}

}
