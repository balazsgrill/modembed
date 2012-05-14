/**
 * 
 */
package hu.modembed.pic.ui.wizard;

import hu.modembed.pic.ui.PicUIPlugin;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
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
		IContainer container = page.getDestinationContainer();
		String filename = PicUIPlugin.getNameOfURL(url)+".e";
		final IFile file = container.getFile(new Path(filename));
		
		Job job = new Job("Importing"){
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					file.create(url.openStream(), true, monitor);
				} catch (CoreException e) {
					return e.getStatus();
				} catch (IOException e) {
					return new Status(IStatus.ERROR, PicUIPlugin.PLUGIN_ID, "Could not create file!",e);
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
		
		return true;
	}

}
