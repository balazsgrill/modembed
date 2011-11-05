/**
 * 
 */
package hu.cubussapiens.modembed.ui.wizards;

import hu.cubussapiens.modembed.ui.MODembedUI;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * @author balazs.grill
 *
 */
public class NewMODembedProjectWizardPage extends WizardNewProjectCreationPage {

	/**
	 * @param pageName
	 */
	public NewMODembedProjectWizardPage(String pageName) {
		super(pageName);
		setTitle("New MODembed project");
		setDescription("Create a new model based embedded project");
		setImageDescriptor(MODembedUI.getDefault().getImageRegistry().getDescriptor(MODembedUI.IMAGE_NEWPROJWZRD));
	}	
	
}
