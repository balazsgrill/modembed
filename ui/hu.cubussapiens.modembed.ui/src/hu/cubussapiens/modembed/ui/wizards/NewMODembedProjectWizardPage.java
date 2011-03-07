/**
 * 
 */
package hu.cubussapiens.modembed.ui.wizards;

import hu.cubussapiens.modembed.ui.widgets.ArchitectureSelectorCombo;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
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
	}

	private Group createGroup(Composite parent, String label){
		Group result = new Group(parent, SWT.SHADOW_NONE);
		result.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		result.setText(label);
		
		result.setLayout(new GridLayout(2, false));
		return result;
	}
	
	private void createTextField(Composite parent, String label, String def, final IDataListener listener){
		Label l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		final Text t = new Text(parent, SWT.BORDER);
		t.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		l.setText(label);
		t.setText(def);
		t.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				listener.dataChanged(t.getText());
				updatePage();
			}
		});
	}
	
	private void createArchSelectorField(Composite parent, String label, final IDataListener listener){
		Label l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		final ArchitectureSelectorCombo c = new ArchitectureSelectorCombo(parent, SWT.BORDER);
		c.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		l.setText(label);
		c.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				listener.dataChanged(c.getArchSelection());
				updatePage();
			}
		});
	}
	
	private String srcDirName = "src";
	private String outDirName = "out";
	private String mainModule = "main";
	private String archID = "";
	
	public String getSrcDirName() {
		return srcDirName;
	}
	
	public String getOutDirName() {
		return outDirName;
	}
	
	public String getMainModule() {
		return mainModule;
	}
	
	public String getArchID() {
		return archID;
	}
	
	private void updatePage(){
		setPageComplete(validatePage());
	}
	
	@Override
	protected boolean validatePage() {
		boolean r = super.validatePage();
		if (r){
			if (srcDirName.equals("")){
				setErrorMessage("Invalid source directory given");
				return false;
			}
			
			if (outDirName.equals("")){
				setErrorMessage("Invalid output directory given");
				return false;
			}
			
			if (mainModule.equals("")){
				setErrorMessage("Invalid main module name given");
				return false;
			}
			
			if (archID.equals("")){
				setMessage("Please select a target architecture");
				return false;
			}
		}
		return r;
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		Composite c = (Composite)getControl();
		
		Group dirs = createGroup(c, "Directories");
		createTextField(dirs, "Source directory", srcDirName, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				srcDirName = data;
				
			}
		});
		createTextField(dirs, "Output directory", outDirName, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				outDirName = data;
			}
		});
		
		Group buildopts = createGroup(c, "Build options");
		createArchSelectorField(buildopts, "Target architecture", new IDataListener() {
			
			@Override
			public void dataChanged(String data) {
				archID = data;
			}
		});
		createTextField(buildopts, "Main module name", mainModule, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				mainModule = data;
			}
		});
	}
}
