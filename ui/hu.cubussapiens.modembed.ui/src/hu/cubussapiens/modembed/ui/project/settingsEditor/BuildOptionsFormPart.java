/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import hu.cubussapiens.modembed.ui.widgets.FormUtil;
import hu.cubussapiens.modembed.ui.widgets.TreeTextButtonViewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author balazs.grill
 *
 */
public class BuildOptionsFormPart extends SectionPart {

	private TreeTextButtonViewer output;
	private Text mainm;
	
	/**
	 * @param parent
	 * @param toolkit
	 * @param style
	 */
	public BuildOptionsFormPart(Composite parent, FormToolkit toolkit, int style) {
		super(parent, toolkit, style);
		createContent(getSection(), toolkit);
	}
	
	private void createContent(Section section, FormToolkit tk){
		section.setText("Build options");
		
		Composite c = tk.createComposite(section);
		section.setClient(c);
		
		c.setLayout(new GridLayout(3,false));
		FormUtil.createFieldLabel("Output directory:", c, tk);
		output = new TreeTextButtonViewer(c, tk);
		output.setContentProvider(new DirectoryContentProvider());
		FormUtil.setField(output.getText(), output.getButton());
		
		FormUtil.createFieldLabel("Main module:", c, tk);
		mainm = tk.createText(c, "",SWT.BORDER);
		FormUtil.setOnlyField(mainm);
	}
	
	@Override
	public void initialize(IManagedForm form) {
		super.initialize(form);
		
		Object input = form.getInput();
		if (input instanceof ProjectConfigInput){
			ProjectConfigInput ci = (ProjectConfigInput)input;
			output.setInput(input);
			output.setValue(ci.config.getBuild().getOutput().getPath());
			mainm.setText(ci.config.getBuild().getQualifiedID());
		}
	}
	
}
