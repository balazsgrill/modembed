/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class SourceDirsFormPart extends SectionPart {

	/**
	 * @param parent
	 * @param toolkit
	 * @param style
	 */
	public SourceDirsFormPart(Composite parent, FormToolkit toolkit, int style) {
		super(parent, toolkit, style);
		createContent(getSection(), toolkit);
	}

	private void createContent(Section section, FormToolkit tk){
		section.setText("Source directories");
		Composite c = tk.createComposite(section);
		section.setClient(c);
	}
	
	@Override
	public void initialize(IManagedForm form) {
		super.initialize(form);
		
		Object input = form.getInput();
		if (input instanceof ProjectConfig){
			
		}
	}
	
}
