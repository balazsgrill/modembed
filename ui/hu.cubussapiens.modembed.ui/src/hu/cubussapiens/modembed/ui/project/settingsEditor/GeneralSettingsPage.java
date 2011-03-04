/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.Section;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class GeneralSettingsPage extends FormPage {

	/**
	 * @param editor
	 * @param id
	 * @param title
	 */
	public GeneralSettingsPage(FormEditor editor, ProjectConfig config) {
		super(editor, "generalpage", "General");
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {

		managedForm.getForm().getBody().setLayout(new GridLayout());
		SourceDirsFormPart sdirs = new SourceDirsFormPart(managedForm.getForm().getBody(), managedForm.getToolkit(), Section.TITLE_BAR);
		sdirs.initialize(managedForm);
		
	}
	
}
