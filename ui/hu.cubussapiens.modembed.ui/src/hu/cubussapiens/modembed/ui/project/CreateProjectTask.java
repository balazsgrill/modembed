/**
 * 
 */
package hu.cubussapiens.modembed.ui.project;

import hu.cubussapiens.modembed.ui.IProjectWizardExtension;
import hu.cubussapiens.modembed.ui.MODembedUI;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;

import project.Directory;
import project.MainModule;
import project.ProjectConfig;
import project.ProjectFactory;

/**
 * @author balazs.grill
 *
 */
public class CreateProjectTask implements IRunnableWithProgress {

	private IProject project;
	
	private String srcDirName = "src";
	private String outDirName = "out";
	private String mainModule = "main";
	private String archID = "";
	
	private IProjectWizardExtension[] wextensions;

	public void setWextensions(IProjectWizardExtension[] wextensions) {
		this.wextensions = wextensions;
	}
	
	public void setSrcDirName(String srcDirName) {
		this.srcDirName = srcDirName;
	}
	
	public void setOutDirName(String outDirName) {
		this.outDirName = outDirName;
	}
	
	public void setMainModule(String mainModule) {
		this.mainModule = mainModule;
	}
	
	public void setArchID(String archID) {
		this.archID = archID;
	}
	
	public void setProject(IProject project) {
		this.project = project;
	}
	
	public IProject getProject() {
		return project;
	}
	
	private IFile getFile(IFolder folder, String qid) throws CoreException{
		String[] ss = qid.split("\\.");
		IFolder c = folder;
		for(int i = 0;i<ss.length-1;i++){
			IFolder f = c.getFolder(ss[i]);
			f.create(true, true, new NullProgressMonitor());
			c = f;
		}
		return c.getFile(ss[ss.length-1]+".masm");
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		int l = 0;
		if (wextensions != null){
			l = wextensions.length;
		}
		monitor.beginTask("Creating project", 7+l);
		
		try {
			project.create(new SubProgressMonitor(monitor, 1));
			project.open(new SubProgressMonitor(monitor, 1));
			
			IProjectDescription pd = project.getDescription();
			
			List<String> nids = new ArrayList<String>(Arrays.asList(pd.getNatureIds())); 
			
			nids.add("org.eclipse.xtext.ui.shared.xtextNature");
			nids.add(MODembedUI.NatureID);
			
			pd.setNatureIds(nids.toArray(new String[nids.size()]));
			
			project.setDescription(pd, new SubProgressMonitor(monitor, 1));
			
			ResourceSet rs = new ResourceSetImpl();
			IFile prsettings = project.getFile(MODembedUI.SettingsFile);
			Resource settings = rs.createResource(URI.createPlatformResourceURI(prsettings.getFullPath().toString(), true));
			
			IFolder src = project.getFolder(srcDirName);
			src.create(true, true, new SubProgressMonitor(monitor, 1));
			
			IFolder out = project.getFolder(outDirName);
			out.create(true, true, new SubProgressMonitor(monitor, 1));
			
			ProjectConfig pc = ProjectFactory.eINSTANCE.createProjectConfig();
			settings.getContents().add(pc);
			Directory srcdir = ProjectFactory.eINSTANCE.createDirectory();
			srcdir.setPath(src.getFullPath().makeRelativeTo(project.getFullPath()).toString());
			pc.getSourcedirs().add(srcdir);
			MainModule main = ProjectFactory.eINSTANCE.createMainModule();
			Directory outdir = ProjectFactory.eINSTANCE.createDirectory();
			outdir.setPath(out.getFullPath().makeRelativeTo(project.getFullPath()).toString());
			main.setQualifiedID(mainModule);
			main.setTarget(archID);
			main.setOutput(outdir);
			pc.setBuild(main);
			
			if (wextensions != null){
				for(IProjectWizardExtension we : wextensions){
					we.includeData(pc);
					monitor.worked(1);
				}
			}
			
			settings.save(null);
			monitor.worked(1);
			
			IFile mainf = getFile(src, main.getQualifiedID());
			mainf.create(new ByteArrayInputStream(MainModuleTemplate.createFile(main).toString().getBytes()), true, new SubProgressMonitor(monitor, 1));
			
			monitor.done();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
