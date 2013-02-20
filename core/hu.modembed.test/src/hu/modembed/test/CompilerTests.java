package hu.modembed.test;

import static org.junit.Assert.assertTrue;
import hu.e.compiler.WorkflowLauncherRunnable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompilerTests {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}

	@Test
	public void test() throws InvocationTargetException, InterruptedException, CoreException {
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test3");
		assertTrue(testproject.exists());
		
		ModembedTests.build();
		ModembedTests.checkMarkers(testproject);
		
		IStatus status = WorkflowLauncherRunnable.create(testproject, "compile").execute(new NullProgressMonitor());
		Assert.assertThat(status, StatusMatcher.instance);
	}

}
