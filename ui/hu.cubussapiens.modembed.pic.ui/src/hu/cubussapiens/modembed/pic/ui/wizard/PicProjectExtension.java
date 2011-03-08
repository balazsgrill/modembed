/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension;
import hu.cubussapiens.modembed.ui.IProjectExtension;
import hu.cubussapiens.modembed.ui.IProjectWizardExtension;
import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class PicProjectExtension implements IProjectExtension {

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectExtension#createWizardExtension()
	 */
	@Override
	public IProjectWizardExtension createWizardExtension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICompilerExtension createCompilerExtension(ProjectConfig config) {
		// TODO Auto-generated method stub
		return null;
	}

}
