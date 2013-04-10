package hu.modembed.test;

import static org.junit.Assert.fail;
import hu.modembed.MODembedCore;
import hu.modembed.includedcode.CreateProjectInWorkspaceTask;
import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.EclipseModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParsingTests.class, AssemblerTest.class, CompilerTests.class, SimulatorTests.class, ExampleTests.class })
public class ModembedTests {

	public static final String TEST_CATEGORY = "hu.modembed.test.category"; 
	
	public static boolean modelsAreEquivalent(IFile file1, IFile file2) throws InterruptedException, IOException{
		ResourceSet rs = MODembedCore.createResourceSet();
		EObject e1 = EclipseModelUtils.load(file1, rs);
		EObject e2 = EclipseModelUtils.load(file2, rs);
		
		MatchModel mm = MatchService.doMatch(e1, e2, Collections.<String,Object>emptyMap());
		DiffModel diff = DiffService.doDiff(mm);
		
		if (!diff.getDifferences().isEmpty()){
			for(DiffElement de : diff.getDifferences()){
				System.out.println(de);
			}
		}
		
		return diff.getDifferences().isEmpty();
	}
	
	public static void build() throws CoreException{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
	}
	
	public static IStatus executeWorkflow(IProject project, String workflow){
//		WorkflowLauncherRunnable launcher = WorkflowLauncherRunnable.create(project, workflow);
//		launcher.addListener(new SysoutWorkflowLauncherListener());
//		return launcher.execute(new SysoutProgressMonitor());
		return null;
	}
	
	public static void testSetUp() throws CoreException{
		//Clean workspace
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		System.out.println("Cleaning workspace");
		for(IProject p : root.getProjects()){
			System.out.println("Deleting "+p.getProject());
			p.delete(true, new NullProgressMonitor());
		}
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

		List<IncludedProject> projects = IncludedProjectsRegistry.getInstance().getAllProjectsByCategory(TEST_CATEGORY);
		projects = IncludedProjectsRegistry.getInstance().resolveDependencies(projects);
		
		//Import projects
		for(IncludedProject ip : projects){
			System.out.println("Importing "+ip.getName());
			CreateProjectInWorkspaceTask task = new CreateProjectInWorkspaceTask(ip);
			task.run(new NullProgressMonitor());
		}
		
		build();
	}
	
	public static void checkMarkers(IProject project) throws CoreException{
		for(IMarker m : project.findMarkers(null, true, IResource.DEPTH_INFINITE)){
			if (IStatus.OK != m.getAttribute(IMarker.SEVERITY, IStatus.OK)){
				String msg = m.getAttribute(IMarker.MESSAGE, "Error");
				String loc = m.getAttribute(IMarker.LOCATION, "Unknown location");
				String ln = m.getAttribute(IMarker.LINE_NUMBER, "");
				fail(msg+" at "+loc+" "+ln);
			}
		}
	}
	
	public static IProject loadAndCompileProject(String testID) throws CoreException{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IProject project = root.getProject(testID);
		Assert.assertTrue(project.exists());
		if (!project.isOpen()) project.open(new NullProgressMonitor());
		
		ModembedTests.build();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IStatus status = ModembedTests.executeWorkflow(project, "compile");
		Assert.assertThat(status, StatusMatcher.instance);
		
		return project;
	}
	
}
