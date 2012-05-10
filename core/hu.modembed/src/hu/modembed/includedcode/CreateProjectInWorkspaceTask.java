/**
 * 
 */
package hu.modembed.includedcode;

import hu.modembed.MODembedCore;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * @author balazs.grill
 *
 */
public class CreateProjectInWorkspaceTask {

	private static final String NATURE = "hu.modembed.ui.nature";
	
	private final IncludedProject project;
	
	public CreateProjectInWorkspaceTask(IncludedProject project) {
		this.project = project;
	}
	
	public IncludedProject getProject() {
		return project;
	}
	
	public void run(IProgressMonitor monitor) throws CoreException{
		Map<URL, String> resources = project.getResources();
		monitor.beginTask("Creating project "+project.getID(), 2+resources.size());
		
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject pro = ws.getRoot().getProject(project.getID());
		
		if (!pro.exists()){
			
			pro.create(new SubProgressMonitor(monitor, 1));
			pro.open(new SubProgressMonitor(monitor, 1));
			
			IProjectDescription pd = pro.getDescription();
			
			/*
			 * Add nature
			 */
			String[] natures = pd.getNatureIds();
			natures = Arrays.copyOf(natures, natures.length+1);
			natures[natures.length-1] = NATURE;
			pd.setNatureIds(natures);
			
			/*
			 * Add dependencies
			 */
			List<String> deps = project.getDependencies();
			IProject[] dependencies = new IProject[deps.size()];
			for (int i=0;i<deps.size();i++){
				IProject p = ws.getRoot().getProject(deps.get(i));
				dependencies[i] = p;
			}
			pd.setReferencedProjects(dependencies);
			
			/*
			 * Add files
			 */
			for(URL url : resources.keySet()){
				String path = resources.get(url);
				
				IFolder folder = pro.getFolder(new Path(path));
				ensureFolder(folder);
				
				String file = url.getPath();
				int i = file.lastIndexOf('/');
				if (i != -1){
					file = file.substring(i+1);
				}
				
				IFile f = folder.getFile(file);
				try {
					f.create(url.openStream(), true, new SubProgressMonitor(monitor, 1));
				} catch (IOException e) {
					throw new CoreException(new Status(IStatus.ERROR, MODembedCore.PLUGIN_ID, "Could not create resource "+file,e));
				}
				
			}
		}
		
		monitor.done();
	}
	
	private void ensureFolder(IFolder folder) throws CoreException{
		if (folder.exists()) return;
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder){
			ensureFolder((IFolder)parent);
			folder.create(true, true, new NullProgressMonitor());
		}
	}
	
}
