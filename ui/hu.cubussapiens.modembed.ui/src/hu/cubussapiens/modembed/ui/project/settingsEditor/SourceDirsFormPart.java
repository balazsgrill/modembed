/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import project.Directory;
import project.ProjectFactory;
import project.ProjectPackage;

/**
 * @author balazs.grill
 *
 */
public class SourceDirsFormPart extends SectionPart {

	private ListViewer tv;

	private ProjectConfigInput pci;
	
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
		//tv = new TreeViewer(c, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
		tv = new ListViewer(c, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);

		tk.adapt(tv.getControl(),true, true);
		
		final Composite buttons = tk.createComposite(c);
		buttons.setLayout(new RowLayout(SWT.VERTICAL));
		
		tk.createButton(buttons, "Add..", SWT.PUSH).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InputDialog id = new InputDialog(buttons.getShell(), "Source directory", "Please input the project-relative path of the source directory", "src", null);
				if (InputDialog.OK == id.open()){
					String src = id.getValue();
					if(pci != null){
						Directory d = ProjectFactory.eINSTANCE.createDirectory();
						d.setPath(src);
						pci.config.getSourcedirs().add(d);
						markDirty();
					}
				}
			}
		});
		tk.createButton(buttons, "Remove", SWT.PUSH).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection ss = (IStructuredSelection)tv.getSelection();
				if (ss.isEmpty()) return;
				if(pci != null){
					pci.config.getSourcedirs().removeAll(ss.toList());
					markDirty();
				}
			}
		});
		
		c.setLayout(new GridLayout(2,false));
		tv.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		buttons.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, true));
		
		section.setClient(c);
	}
	
	@Override
	public void refresh() {
		tv.refresh();
		super.refresh();
	}
	
	@Override
	public void initialize(IManagedForm form) {
		super.initialize(form);
		
		Object input = form.getInput();
		if (input instanceof ProjectConfigInput){
			ProjectConfigInput pci = (ProjectConfigInput)input;
			this.pci = pci;
			IObservableList list = EMFObservables.observeList(pci.config, ProjectPackage.eINSTANCE.getProjectConfig_Sourcedirs());
			IValueProperty value = EMFProperties.value(ProjectPackage.eINSTANCE.getDirectory_Path());
			ViewerSupport.bind(tv, list, value);
		}
	}
	
}
