/**
 * 
 */
package hu.modembed.ui.wizards;

import hu.modembed.ui.MODembedUI;

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
		setTitle("New e project");
		setDescription("Create a new embedded code project");
		setImageDescriptor(MODembedUI.getDefault().getImageRegistry().getDescriptor(MODembedUI.IMAGE_NEWPROJWZRD));
	}	
	
}
