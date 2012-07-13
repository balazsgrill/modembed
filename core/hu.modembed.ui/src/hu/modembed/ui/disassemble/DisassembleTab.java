/**
 * 
 */
package hu.modembed.ui.disassemble;

import hu.modembed.ui.MODembedUI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author balazs.grill
 *
 */
public class DisassembleTab extends AbstractLaunchConfigurationTab implements IDisassembleLaunchAttributes{

	private Text hexfile;
	private Text iseturi;
	private Text resultf;
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);

		control.setLayout(new GridLayout(3, false));
		
		Label label = new Label(control, SWT.NONE);
		label.setText("Hex file path:");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		hexfile = new Text(control, SWT.BORDER);
		hexfile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		hexfile.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		Button browse = new Button(control, SWT.PUSH);
		browse.setText("Browse..");
		browse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		label = new Label(control, SWT.NONE);
		label.setText("Instruction set model URI: ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		iseturi = new Text(control, SWT.BORDER);
		iseturi.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		iseturi.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		browse = new Button(control, SWT.PUSH);
		browse.setText("Browse..");
		browse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		label = new Label(control, SWT.NONE);
		label.setText("Output file: ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		resultf = new Text(control, SWT.BORDER);
		resultf.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		resultf.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		browse = new Button(control, SWT.PUSH);
		browse.setText("Browse..");
		browse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		setControl(control);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//NO defaults

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			hexfile.setText(configuration.getAttribute(HEXFILE, ""));
			iseturi.setText(configuration.getAttribute(INSTRUCTIONSET, ""));
			resultf.setText(configuration.getAttribute(RESULTFILE, ""));
		} catch (CoreException e) {
			MODembedUI.getDefault().getLog().log(e.getStatus());
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(HEXFILE, hexfile.getText());
		configuration.setAttribute(INSTRUCTIONSET, iseturi.getText());
		configuration.setAttribute(RESULTFILE, resultf.getText());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return "Disassemble";
	}

}
