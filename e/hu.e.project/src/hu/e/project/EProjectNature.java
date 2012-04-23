/**
 * 
 */
package hu.e.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.ui.XtextProjectHelper;

/**
 * @author balazs.grill
 *
 */
public class EProjectNature implements IProjectNature{

	@Override
	public void configure() throws CoreException {
		IProjectDescription pd = getProject().getDescription();
		
		String xtextnature = XtextProjectHelper.NATURE_ID;
		
		List<String> natures = new ArrayList<String>(Arrays.asList(pd.getNatureIds()));
		
		if (!natures.contains(xtextnature)){
			natures.add(xtextnature);
			pd.setNatureIds(natures.toArray(new String[natures.size()]));
		}
		
		getProject().setDescription(pd, new NullProgressMonitor());
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub
		
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
