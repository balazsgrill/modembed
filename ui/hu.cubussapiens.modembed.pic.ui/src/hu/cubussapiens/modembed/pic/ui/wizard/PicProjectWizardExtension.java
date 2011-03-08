/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import project.ProjectConfig;
import hu.cubussapiens.modembed.ui.IProjectWizardExtension;

/**
 * @author balazs.grill
 *
 */
public class PicProjectWizardExtension implements IProjectWizardExtension {

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#createControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public Control createControls(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#validate(org.eclipse.jface.wizard.WizardPage)
	 */
	@Override
	public boolean validate(WizardPage page) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectWizardExtension#includeData(project.ProjectConfig)
	 */
	@Override
	public void includeData(ProjectConfig config) {
		// TODO Auto-generated method stub

	}

}
