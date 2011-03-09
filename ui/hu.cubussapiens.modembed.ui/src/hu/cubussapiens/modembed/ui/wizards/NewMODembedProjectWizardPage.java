/**
 * 
 */
package hu.cubussapiens.modembed.ui.wizards;

import hu.cubussapiens.modembed.ui.IProjectExtension;
import hu.cubussapiens.modembed.ui.IProjectWizardExtension;
import hu.cubussapiens.modembed.ui.MODembedUI;
import hu.cubussapiens.modembed.ui.widgets.IDataListener;
import hu.cubussapiens.modembed.ui.widgets.WizardPageUtil;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IPropertyListener;
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

	private Group createGroup(Composite parent, String label){
		Group result = new Group(parent, SWT.SHADOW_NONE);
		result.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		result.setText(label);
		
		result.setLayout(new GridLayout(2, false));
		return result;
	}
	
	private String oldArchID = null;
	private Control[] extensions = null;
	private IProjectWizardExtension[] wextensions = null;
	
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
			
			if (wextensions != null){
				for(int i=0;i<wextensions.length;i++){
					boolean v = wextensions[i].validate(this);
					if (!v) return false;
				}
			}
		}
		return r;
	}
	
	public IProjectWizardExtension[] getWextensions() {
		return wextensions;
	}
	
	private void updateExtension(){
		if (oldArchID != null && (!oldArchID.equals(archID))){
			for(Control c : extensions){
				c.dispose();
			}
			extensions = null;
			wextensions = null;
			oldArchID = null;
		}
		
		Composite c = (Composite)getControl();
		
		if (archID != null && (!archID.equals(oldArchID))){
			IProjectExtension[] pes = MODembedUI.getDefault().getExtensions(archID);
			extensions = new Control[pes.length];
			wextensions = new IProjectWizardExtension[pes.length];
			for(int i =0;i<pes.length;i++){
				wextensions[i] = pes[i].createWizardExtension();
				extensions[i] = wextensions[i].createControls(c);
				extensions[i].setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
				wextensions[i].addPropertyListener(new IPropertyListener() {
					
					@Override
					public void propertyChanged(Object source, int propId) {
						updatePage();
					}
				});
			}
			oldArchID = archID;
		}
		
		c.layout();
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		Composite c = (Composite)getControl();
		
		Group dirs = createGroup(c, "Directories");
		WizardPageUtil.createTextField(dirs, "Source directory", srcDirName, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				srcDirName = data;
				updatePage();
			}
		});
		WizardPageUtil.createTextField(dirs, "Output directory", outDirName, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				outDirName = data;
				updatePage();
			}
		});
		
		Group buildopts = createGroup(c, "Build options");
		WizardPageUtil.createArchSelectorField(buildopts, "Target architecture", new IDataListener() {
			
			@Override
			public void dataChanged(String data) {
				archID = data;
				updateExtension();
				updatePage();
			}
		});
		WizardPageUtil.createTextField(buildopts, "Main module name", mainModule, new IDataListener() {
			@Override
			public void dataChanged(String data) {
				mainModule = data;
				updatePage();
			}
		});
	}
}
