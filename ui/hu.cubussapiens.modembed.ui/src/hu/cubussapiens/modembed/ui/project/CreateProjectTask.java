/**
 * 
 */
package hu.cubussapiens.modembed.ui.project;

import hu.cubussapiens.modembed.ui.MODembedUI;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;

import project.ProjectConfig;
import project.ProjectFactory;

/**
 * @author balazs.grill
 *
 */
public class CreateProjectTask implements IRunnableWithProgress {

	private IProject project;
	
	public void setProject(IProject project) {
		this.project = project;
	}
	
	public IProject getProject() {
		return project;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		monitor.beginTask("Creating project", 4);
		
		try {
			project.create(new SubProgressMonitor(monitor, 1));
			project.open(new SubProgressMonitor(monitor, 1));
			
			IProjectDescription pd = project.getDescription();
			String[] nids = pd.getNatureIds();
			
			String[] nids2 = new String[nids.length+1];
			System.arraycopy(nids, 0, nids2, 0, nids.length);
			nids2[nids.length] = MODembedUI.NatureID;
			
			pd.setNatureIds(nids2);
			project.setDescription(pd, new SubProgressMonitor(monitor, 1));
			
			ResourceSet rs = new ResourceSetImpl();
			IFile prsettings = project.getFile(MODembedUI.SettingsFile);
			Resource settings = rs.createResource(URI.createPlatformResourceURI(prsettings.getFullPath().toString(), true));
			
			ProjectConfig pc = ProjectFactory.eINSTANCE.createProjectConfig();
			settings.getContents().add(pc);
			
			settings.save(null);
			monitor.worked(1);
			
			monitor.done();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
