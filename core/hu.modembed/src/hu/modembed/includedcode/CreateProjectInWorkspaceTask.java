/**
 * 
 */
package hu.modembed.includedcode;

import hu.modembed.MODembedCore;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

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
	
	public void extract(ZipFile zipfile, IProject to) throws Exception{
		for (Enumeration<? extends ZipEntry> e = zipfile.entries(); e.hasMoreElements();){
			ZipEntry entry = e.nextElement();
			String name = entry.getName();
			if (entry.isDirectory()){
				IFolder f = to.getFolder(name);
				if (!f.exists()){
					f.create(true, true, new NullProgressMonitor());
				}
			}else{
				InputStream is = zipfile.getInputStream(entry);
				try{
					IFile file = to.getFile(name);
					if (file.exists()){
						file.setContents(is, true, true, new NullProgressMonitor());
					}else{
						file.create(is, true, new NullProgressMonitor());
					}
				}finally{
					is.close();
				}
			}
		}
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
			pro.setDescription(pd, new NullProgressMonitor());
			
			/*
			 * Extract Archive if available 
			 */
			if (project.getArchiveURL() != null){
				
				try {
					ZipFile zipfile = new ZipFile(new File(project.getArchiveURL().toURI()));
					extract(zipfile, pro);
				} catch (Exception e) {
					throw new CoreException(new Status(IStatus.ERROR, MODembedCore.PLUGIN_ID, "Couldn't extract archive: "+project.getArchiveURL(),e));
				} 				
			}
			
			/*
			 * Add files
			 */
			for(URL url : resources.keySet()){
				String path = resources.get(url);
				IContainer folder = getContainer(pro, path);
				
				String file = url.getPath();
				int i = file.lastIndexOf('/');
				if (i != -1){
					file = file.substring(i+1);
				}
				
				IFile f = folder.getFile(new Path(file));
				try {
					f.create(url.openStream(), true, new SubProgressMonitor(monitor, 1));
				} catch (IOException e) {
					throw new CoreException(new Status(IStatus.ERROR, MODembedCore.PLUGIN_ID, "Could not create resource "+file,e));
				}
				
			}
		}
		
		monitor.done();
	}
	
	private IContainer getContainer(IContainer cont, String folderpath) throws CoreException{
		String path = folderpath;
		if (path.startsWith("/")) path = path.substring(1);
		
		if (path.isEmpty()) return cont;
		
		int i = folderpath.indexOf('/');
		String next = folderpath;
		if (i != -1){
			next = next.substring(0,i);
		}
		String nextpath = folderpath.substring(i+1);
		
		IFolder folder = null;
		if (cont instanceof IProject){
			folder = ((IProject) cont).getFolder(next);
		}
		if (cont instanceof IFolder){
			folder = ((IFolder) cont).getFolder(next);
		}
		
		if (!folder.exists()) folder.create(true, true, new NullProgressMonitor());
		
		return getContainer(folder, nextpath);
	}
	
}
