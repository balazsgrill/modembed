/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import org.eclipse.core.resources.IProject;

import hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension;
import hu.cubussapiens.modembed.ui.IProjectExtension;
import hu.cubussapiens.modembed.ui.IProjectWizardExtension;
import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class Pic16ProjectExtension implements IProjectExtension {

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.IProjectExtension#createWizardExtension()
	 */
	@Override
	public IProjectWizardExtension createWizardExtension() {
		return new PicProjectWizardExtension(new Pic16ArchitectureCPUFilter());
	}

	@Override
	public ICompilerExtension createCompilerExtension(IProject project, ProjectConfig config) {
		return new PicCompilerExtension(project, config);
	}

}
