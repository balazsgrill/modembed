/**
 * 
 */
package hu.modembed.ui.wizards;

import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.Package;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

/**
 * @author balazs.grill
 *
 */
public class NewModembedFileWizard extends BasicNewResourceWizard{

	private WizardNewFileCreationPage mainPage;
	
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewFileCreationPage("newFilePage1", getSelection());//$NON-NLS-1$
        mainPage.setTitle("New model file");
        mainPage.setDescription("This wizard create a new MODembed model");
        mainPage.setFileExtension("xmi");
        addPage(mainPage);
	}
	
	/* (non-Javadoc)
     * Method declared on IWorkbenchWizard.
     */
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        super.init(workbench, currentSelection);
        setWindowTitle("Create MODembed model");
        setNeedsProgressMonitor(true);
    }

    /* (non-Javadoc)
     * Method declared on BasicNewResourceWizard.
     */
    protected void initializeDefaultPageImageDescriptor() {
//       ImageDescriptor desc = IDEWorkbenchPlugin.getIDEImageDescriptor("wizban/newfile_wiz.png");//$NON-NLS-1$
//	   setDefaultPageImageDescriptor(desc);
    }

    /* (non-Javadoc)
     * Method declared on IWizard.
     */
    public boolean performFinish() {
        IFile file = mainPage.createNewFile();
        if (file == null) {
			return false;
		}
        ResourceSet rs = new ResourceSetImpl();
        Resource r = rs.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
        Package pack = CoreFactory.eINSTANCE.createPackage();
        pack.setName("root");
        r.getContents().add(pack);
        try {
			r.save(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        

        selectAndReveal(file);

        // Open editor on new file.
        IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
        try {
            if (dw != null) {
                IWorkbenchPage page = dw.getActivePage();
                if (page != null) {
                    IDE.openEditor(page, file, true);
                }
            }
        } catch (PartInitException e) {
//            DialogUtil.openError(dw.getShell(), ResourceMessages.FileResource_errorMessage, 
//                    e.getMessage(), e);
        }

        return true;
    }
}
