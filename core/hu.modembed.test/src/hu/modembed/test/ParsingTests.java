/**
 * 
 */
package hu.modembed.test;

import static org.junit.Assert.fail;
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
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class ParsingTests {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//Clean workspace
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
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
	}

	@Test
	public void test() throws CoreException {
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());

		
		//fail("Not yet implemented");
	}

}
