/**
 * 
 */
package hu.cubussapiens.modembed.ui;

import project.ProjectConfig;
import hu.cubussapiens.modembed.modularasm.compiler.ICompilerExtension;


/**
 * @author balazs.grill
 *
 */
public interface IProjectExtension{

	public IProjectWizardExtension createWizardExtension();
	
	public ICompilerExtension createCompilerExtension(ProjectConfig config);
	
	
	
}
