/**
 * 
 */
package hu.modembed.ui;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * @author balage
 *
 */
public class ProjectNature implements IProjectNature {

	public static final String BUILDER = "hu.modembed.ui.builder.ModembedBuilder";
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	@Override
	public void configure() throws CoreException {
		IProjectDescription pd = getProject().getDescription();
		ICommand[] builders = pd.getBuildSpec();
		
		for(ICommand cmd : builders){
			if (BUILDER.equals(cmd.getBuilderName())){
				return;
			}
		}
		
		ICommand[] newBuilders = new ICommand[builders.length+1];
		System.arraycopy(builders, 0, newBuilders, 0, builders.length);
		ICommand cmd = pd.newCommand();
		newBuilders[builders.length] = cmd;
		cmd.setBuilderName(BUILDER);
		cmd.setBuilding(IncrementalProjectBuilder.AUTO_BUILD, true);
		cmd.setBuilding(IncrementalProjectBuilder.CLEAN_BUILD, true);
		cmd.setBuilding(IncrementalProjectBuilder.FULL_BUILD, true);
		cmd.setBuilding(IncrementalProjectBuilder.INCREMENTAL_BUILD, true);
		
		pd.setBuildSpec(newBuilders);
		getProject().setDescription(pd, new NullProgressMonitor());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	@Override
	public void deconfigure() throws CoreException {
		/*
		 * TODO
		 */
	}

	private IProject project;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	@Override
	public IProject getProject() {
		return project;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
