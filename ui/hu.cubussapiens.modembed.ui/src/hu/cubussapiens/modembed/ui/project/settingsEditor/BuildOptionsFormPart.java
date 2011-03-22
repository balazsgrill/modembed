/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import hu.cubussapiens.modembed.ui.widgets.FormUtil;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import project.ProjectPackage;

/**
 * @author balazs.grill
 *
 */
public class BuildOptionsFormPart extends SectionPart {

	private Text output;
	private Text mainm;
	private ProjectConfigInput ci;
	
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
		output = tk.createText(c, "", SWT.BORDER);
		FormUtil.setOnlyField(output);
		output.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				markDirty();
			}
		});
		
		FormUtil.createFieldLabel("Main module:", c, tk);
		mainm = tk.createText(c, "",SWT.BORDER);
		FormUtil.setOnlyField(mainm);
		mainm.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				markDirty();
			}
		});
	}
	
	@Override
	public void initialize(IManagedForm form) {
		super.initialize(form);
		
		Object input = form.getInput();
		if (input instanceof ProjectConfigInput){
			ci = (ProjectConfigInput)input;
			IObservableValue outputdir = EMFObservables.observeValue(ci.config.getBuild().getOutput(), ProjectPackage.eINSTANCE.getDirectory_Path());
			ci.context.bindValue(SWTObservables.observeText(output, SWT.Modify), outputdir);
			
			IObservableValue mainmoduleqid = EMFObservables.observeValue(ci.config.getBuild(), ProjectPackage.eINSTANCE.getModule_QualifiedID());
			ci.context.bindValue(SWTObservables.observeText(mainm,SWT.Modify), mainmoduleqid);
		}
	}
	
}
