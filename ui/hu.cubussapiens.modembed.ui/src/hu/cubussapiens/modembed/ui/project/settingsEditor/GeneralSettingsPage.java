/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;

/**
 * @author balazs.grill
 *
 */
public class GeneralSettingsPage extends FormPage {

	/**
	 * @param id
	 * @param title
	 */
	public GeneralSettingsPage(String id, String title) {
		super(id, title);
	}

	/**
	 * @param editor
	 * @param id
	 * @param title
	 */
	public GeneralSettingsPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		
		//managedForm.getToolkit().createSection(parent, sectionStyle)
	}
	
}
