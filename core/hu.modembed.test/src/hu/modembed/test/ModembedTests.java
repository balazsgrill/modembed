package hu.modembed.test;

import hu.modembed.includedcode.CreateProjectInWorkspaceTask;
import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParsingTests.class, AssemblerTest.class })
public class ModembedTests {

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

		//Import projects
		for(IncludedProject ip : IncludedProjectsRegistry.getInstance().getProjects()){
			System.out.println("Importing "+ip.getName());
			CreateProjectInWorkspaceTask task = new CreateProjectInWorkspaceTask(ip);
			task.run(new NullProgressMonitor());
		}
		
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
	}
	
}
