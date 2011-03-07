/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
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

	private final ProjectConfig config;
	
	/**
	 * @param editor
	 * @param id
	 * @param title
	 */
	public GeneralSettingsPage(FormEditor editor, ProjectConfig config) {
		super(editor, "generalpage", "General");
		this.config = config;
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.setInput(config);
		
		managedForm.getForm().getBody().setLayout(new GridLayout(2, true));
		SourceDirsFormPart sdirs = new SourceDirsFormPart(managedForm.getForm().getBody(), managedForm.getToolkit(), Section.TITLE_BAR);
		
		sdirs.getSection().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));		
		sdirs.initialize(managedForm);

	}
}
