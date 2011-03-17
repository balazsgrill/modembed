/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.core.resources.IProject;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class ProjectConfigInput {

	public final ProjectConfig config;

	public final IProject project;
	
	public ProjectConfigInput(ProjectConfig config, IProject project) {
		this.config = config;
		this.project = project;
	}
	
}