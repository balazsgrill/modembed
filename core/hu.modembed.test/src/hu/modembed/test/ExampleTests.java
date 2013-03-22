/**
 * 
 */
package hu.modembed.test;

import hu.modembed.includedcode.CreateProjectInWorkspaceTask;
import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class ExampleTests {

	private static final String EXAMPLE_1 = "e.examples.blink.pic16f1824";
	
	private void testExample(String exampleID) throws CoreException{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IncludedProject p = IncludedProjectsRegistry.getInstance().getProject(exampleID);
		List<IncludedProject> ps = IncludedProjectsRegistry.getInstance().resolveDependencies(Collections.singletonList(p));
		//Import projects
		for(IncludedProject ip : ps){
			System.out.println("Importing "+ip.getName());
			CreateProjectInWorkspaceTask task = new CreateProjectInWorkspaceTask(ip);
			task.run(new NullProgressMonitor());
		}

		ModembedTests.build();
		
		IProject project = root.getProject(exampleID);
		Assert.assertTrue(project.exists());
		if (!project.isOpen()) project.open(new NullProgressMonitor());
		
		ModembedTests.build();
		root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		IStatus status = ModembedTests.executeWorkflow(project, "compile");
		Assert.assertThat(status, StatusMatcher.instance);
	}
	
	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}
	
	@Test
	public void example_1() throws Exception{
		testExample(EXAMPLE_1);
	}
	
}
