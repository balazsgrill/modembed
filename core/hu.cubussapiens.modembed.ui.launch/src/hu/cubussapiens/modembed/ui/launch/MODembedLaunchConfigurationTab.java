/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch;

import hu.cubussapiens.modembed.ui.launch.control.LaunchConfigControl;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class MODembedLaunchConfigurationTab extends
		AbstractLaunchConfigurationTab implements ModifyListener{

	private LaunchConfigControl control;

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.control = new LaunchConfigControl(parent, SWT.NONE);
		setControl(control);
		scheduleUpdateJob();
		
//		this.control.getHexfile().addModifyListener(this);
//		this.control.getProgrammerID().addModifyListener(this);
//		this.control.getAlwaysProgram().addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				scheduleUpdateJob();
//			}
//		});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(LaunchPlugin.A_HEXFILE, "");
		configuration.setAttribute(LaunchPlugin.A_PROG, "");
		configuration.setAttribute(LaunchPlugin.A_PROGID, "");
		configuration.setAttribute(LaunchPlugin.A_ALWAYSPROGRAM, false);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
//		try {
////			this.control.getHexfile().setText(configuration.getAttribute(LaunchPlugin.A_HEXFILE, ""));
////			this.control.setProgID(configuration.getAttribute(LaunchPlugin.A_PROG, ""));
////			this.control.getProgrammerID().setText(configuration.getAttribute(LaunchPlugin.A_PROGID, ""));
////			this.control.getAlwaysProgram().setSelection(configuration.getAttribute(LaunchPlugin.A_ALWAYSPROGRAM, false));
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
//		configuration.setAttribute(LaunchPlugin.A_HEXFILE, control.getHexfile().getText());
//		configuration.setAttribute(LaunchPlugin.A_PROG, control.getProgID());
//		configuration.setAttribute(LaunchPlugin.A_PROGID, control.getProgrammerID().getText());
//		configuration.setAttribute(LaunchPlugin.A_ALWAYSPROGRAM, control.getAlwaysProgram().getSelection());
		//configuration.setat
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return "Embedded";
	}

	@Override
	public void modifyText(ModifyEvent e) {
		scheduleUpdateJob();
	}
	
	@Override
	public Image getImage() {
		return LaunchPlugin.getDefault().getImageRegistry().get(LaunchPlugin.IMAGECPU);
	}

}
