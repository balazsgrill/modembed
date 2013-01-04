package hu.modembed.test;

import static org.junit.Assert.assertTrue;
import hu.e.compiler.WorkflowLauncherRunnable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssemblerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}
	
	@Test
	public void test_Assembly() throws Exception{
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test1");
		assertTrue(testproject.exists());
		
		IFile input = testproject.getFile("16f1824_blink_wo_Config.hex");
		IFile workflow = testproject.getFile("build.xmi");
		WorkflowLauncherRunnable launch = new WorkflowLauncherRunnable(URI.createPlatformResourceURI(workflow.getFullPath().toString(), true));
		
		IStatus status = launch.execute(new NullProgressMonitor());
		assertTrue("Could not execute workflow!", status.isOK());
		
		IFile output = testproject.getFile("output.hex");
		assertTrue("output does not match input!", ModembedTests.modelsAreEquivalent(input, output));
	}

	@Test
	public void test_createAssemblerObject() throws Exception{
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test2");
		assertTrue(testproject.exists());
		
		IStatus status = WorkflowLauncherRunnable.create(testproject, "build").execute(new NullProgressMonitor());
		Assert.assertThat(status, StatusMatcher.instance);
	}
	
}
