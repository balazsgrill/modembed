package hu.modembed.ui.workflow;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class WorkflowLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup{

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[]{
				new WorkflowLaunchConfigurationTab()
		});
	}


}
