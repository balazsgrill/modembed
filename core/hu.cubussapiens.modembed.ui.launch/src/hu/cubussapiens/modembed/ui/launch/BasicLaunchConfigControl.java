/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch;

import java.net.URL;

import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;
import hu.cubussapiens.modembed.ui.MODembedUI;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammerDescriptor;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersContentProvider;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersLabelProvider;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * @author balazs.grill
 *
 */
public class BasicLaunchConfigControl extends Composite {

	private Group programgroup = null;
	private Group devicegroup = null;
	private Label label1 = null;
	private Text hexfile = null;
	private Button hexfilebrowse = null;
	private Button alwaysProgram = null;
	private Label label2 = null;
	private CLabel programmerlabel = null;
	private Button selectProgrammer = null;
	private Label label3 = null;
	private Text programmerID = null;
	private String progID = null;
	
	public String getProgID() {
		return progID;
	}
	
	public void setProgID(String progID) {
		this.progID = progID;
		updateProgrammerLabel();
	}
	
	public Text getHexfile() {
		return hexfile;
	}
	
	public Text getProgrammerID() {
		return programmerID;
	}
	
	public CLabel getProgrammerlabel() {
		return programmerlabel;
	}
	
	public Button getAlwaysProgram() {
		return alwaysProgram;
	}
	
	/**
	 * @param parent
	 * @param style
	 */
	public BasicLaunchConfigControl(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
		initialize();
	}

	private void updateProgrammerLabel(){
		RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(progID);
		if (rp == null){
			programmerlabel.setText("None");
			programmerlabel.setImage(null);
		}else{
			programmerlabel.setText(rp.getName());
			URL im = rp.getImage();
			if (im == null){
				programmerlabel.setImage(null);
			}else{
				programmerlabel.setImage(MODembedUI.getDefault().getSharedImage(im));
			}
		}
	}
	
	private void initialize() {
		createProgramgroup();
		createDevicegroup();
		this.setSize(new Point(345, 206));
		setLayout(new GridLayout());
		
		hexfilebrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.setAllowMultiple(false);
				dialog.setTitle("Select hex file to program");
				dialog.setValidator(new ISelectionStatusValidator() {
					
					@Override
					public IStatus validate(Object[] selection) {
						if (selection.length == 1 && selection[0] instanceof IFile){
							return Status.OK_STATUS;
						}
						return new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "You must select a file!");
					}
				});
				if (dialog.open() == Dialog.OK){
					Object o = dialog.getFirstResult();
					if (o instanceof IFile){
						hexfile.setText(((IFile) o).getFullPath().toString());
					}
				}
			}
		});
		
		selectProgrammer.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new ProgrammersLabelProvider(), new ProgrammersContentProvider());
				dialog.setInput(Object.class);
				dialog.setAllowMultiple(false);
				dialog.setTitle("Select a programmer");
				dialog.setValidator(new ISelectionStatusValidator() {
					
					@Override
					public IStatus validate(Object[] selection) {
						if (selection.length == 1){
							return Status.OK_STATUS;
						}
						return new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "You must select a programmer!");
					}
				});
				if (dialog.open() == Dialog.OK){
					Object o = dialog.getFirstResult();
					if (o instanceof ProgrammerDescriptor){
						ProgrammerDescriptor pd = (ProgrammerDescriptor)o;
						progID = pd.id;
						//String id = pd.pi.getID();
						//programmerID.setText(id==null?"":id);
						updateProgrammerLabel();
					}
				}
			}
		});
	}

	/**
	 * This method initializes programgroup	
	 *
	 */
	private void createProgramgroup() {
		GridData gridData3 = new GridData();
		gridData3.horizontalSpan = 3;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.END;
		GridData gridData11 = new GridData();
		gridData11.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData11.grabExcessHorizontalSpace = true;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		programgroup = new Group(this, SWT.NONE);
		programgroup.setText("Program");
		programgroup.setLayout(gridLayout);
		programgroup.setLayoutData(gridData);
		label1 = new Label(programgroup, SWT.NONE);
		label1.setText("Hex file:");
		hexfile = new Text(programgroup, SWT.BORDER);
		hexfile.setLayoutData(gridData11);
		hexfilebrowse = new Button(programgroup, SWT.NONE);
		hexfilebrowse.setText("Browse..");
		hexfilebrowse.setLayoutData(gridData2);
		alwaysProgram = new Button(programgroup, SWT.CHECK);
		alwaysProgram.setText("Always write program before launch");
		alwaysProgram.setLayoutData(gridData3);
	}

	/**
	 * This method initializes devicegroup	
	 *
	 */
	private void createDevicegroup() {
		GridData gridData6 = new GridData();
		gridData6.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData6.horizontalSpan = 2;
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData5.grabExcessHorizontalSpace = true;
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.END;
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 3;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		devicegroup = new Group(this, SWT.NONE);
		devicegroup.setLayoutData(gridData1);
		devicegroup.setLayout(gridLayout1);
		devicegroup.setText("Device");
		label2 = new Label(devicegroup, SWT.NONE);
		label2.setText("Programmer: ");
		programmerlabel = new CLabel(devicegroup, SWT.SHADOW_NONE);
		programmerlabel.setText("NONE");
		programmerlabel.setLayoutData(gridData5);
		selectProgrammer = new Button(devicegroup, SWT.NONE);
		selectProgrammer.setText("Select..");
		selectProgrammer.setLayoutData(gridData4);
		label3 = new Label(devicegroup, SWT.NONE);
		label3.setText("Programmer id: ");
		programmerID = new Text(devicegroup, SWT.BORDER);
		programmerID.setLayoutData(gridData6);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
