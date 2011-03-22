/**
 * 
 */
package hu.cubussapiens.modembed.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IPropertyListener;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public interface IProjectWizardExtension {

	public Control createControls(Composite parent);
	
	public boolean validate(WizardPage page);
	
	public void includeData(IProject project, ProjectConfig config);
	
	public void addPropertyListener(IPropertyListener pl);
	
}
