/**
 * 
 */
package hu.modembed.ui.project;

import hu.modembed.ui.MODembedUI;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * @author balazs.grill
 *
 */
public class CreateProjectTask implements IRunnableWithProgress {

	private IProjectDescription projectDescription;
	private IProject project;
	
	
	
	public void setProject(IProjectDescription projectDescription, IProject project) {
		this.projectDescription = projectDescription;
		this.project = project;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {

		monitor.beginTask("Creating project", 8);
		
		try {
			project.create(projectDescription, new SubProgressMonitor(monitor, 1));
			project.open(new SubProgressMonitor(monitor, 1));
			
			IProjectDescription pd = project.getDescription();
			
			
			List<String> nids = new ArrayList<String>(Arrays.asList(pd.getNatureIds())); 
			
			nids.add(MODembedUI.NatureID);
			
			pd.setNatureIds(nids.toArray(new String[nids.size()]));
			
			project.setDescription(pd, new SubProgressMonitor(monitor, 1));
			
			monitor.worked(1);
			
			monitor.done();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
