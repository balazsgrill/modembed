/**
 * 
 */
package hu.modembed.pic.pk2cmd.props;

import hu.modembed.pic.pk2cmd.PK2Plugin;
import hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;

import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author balazs.grill
 *
 */
public class PK2ConfigurationPane extends Composite implements
		IProgrammerInstanceConfigurationPane, IPK2Propertes {

	private Text hexfile;
	private Text id;
	private Button vdd_def;
	private Button vdd_5v;
	private Button vdd_33v;
	private Button vdd_ext;
	
	/**
	 * @param parent
	 * @param style
	 */
	public PK2ConfigurationPane(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, false));
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Hex file path:");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		hexfile = new Text(this, SWT.BORDER);
		hexfile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Button browse = new Button(this, SWT.PUSH);
		browse.setText("Browse..");
		browse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		browse.addSelectionListener(new SelectionAdapter() {
			
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
						return new Status(IStatus.ERROR, PK2Plugin.PLUGIN_ID, "You must select a file!");
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
		
		label = new Label(this, SWT.NONE);
		label.setText("Programmer ID (optional:)");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));

		id = new Text(this, SWT.BORDER);
		id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,2,1));
		
		Group vddGroup = new Group(this, SWT.NONE);
		vddGroup.setText("Target power");
		vddGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,3,1));
		vddGroup.setLayout(new GridLayout(1, false));
		
		vdd_def = new Button(vddGroup, SWT.RADIO);
		vdd_def.setText("Powered by pickit2 with default voltage");
		
		vdd_5v = new Button(vddGroup, SWT.RADIO);
		vdd_5v.setText("Powered by pickit2 with 5V");
		
		vdd_33v = new Button(vddGroup, SWT.RADIO);
		vdd_33v.setText("Powered by pickit2 with 3.3V");
		
		vdd_ext = new Button(vddGroup, SWT.RADIO);
		vdd_ext.setText("Powered externally");
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getControl()
	 */
	@Override
	public Control getControl() {
		return this;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties props) {
		this.hexfile.setText(props.getProperty(HEXFILEPATH, ""));
		this.id.setText(props.getProperty(PK2ID, ""));
		
		String vdd = props.getProperty(VDD);
		if (vdd == null){
			vdd_def.setSelection(true);
		}else
		if ("5".equals(vdd)){
			vdd_5v.setSelection(true);
		}else
		if ("3.3".equals(vdd)){
			vdd_33v.setSelection(true);
		}else
		if (VDD_External.equals(vdd)){
			vdd_ext.setSelection(true);
		}else{
			vdd_def.setSelection(true);
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getProperties()
	 */
	@Override
	public Properties getProperties() {
		Properties prop = new Properties();
		prop.put(HEXFILEPATH, hexfile.getText());
		prop.put(PK2ID, id.getText());
		if (vdd_def.getSelection()) prop.remove(VDD);
		if (vdd_ext.getSelection()) prop.put(VDD,VDD_External);
		if (vdd_33v.getSelection()) prop.put(VDD,"3.3");
		if (vdd_5v.getSelection()) prop.put(VDD,"5");
		return prop;
	}

}
