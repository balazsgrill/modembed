package hu.modembed.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
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
		
		IStatus status = ModembedTests.executeWorkflow(testproject, "compile");
		Assert.assertThat(status, StatusMatcher.instance);
	}

	@Test
	public void test4_picConfig() throws CoreException, InterruptedException, IOException{
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test4");
		assertTrue(testproject.exists());
		
		IFile input = testproject.getFile("16f1824_blink.hex");
		
		ModembedTests.build();
		ModembedTests.checkMarkers(testproject);
		
		IStatus status = ModembedTests.executeWorkflow(testproject, "compile");
		Assert.assertThat(status, StatusMatcher.instance);
		
		IFile output = testproject.getFile("blink_w_config.hex");
		assertTrue("output does not match input!", ModembedTests.modelsAreEquivalent(input, output));
	}
	
	@Test
	public void test5_pic18_asmAndConfig() throws InterruptedException, IOException, CoreException{
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test5");
		assertTrue(testproject.exists());
		
		IFile input = testproject.getFile("fishlamp.hex");
		
		ModembedTests.build();
		ModembedTests.checkMarkers(testproject);
		
		IStatus status = ModembedTests.executeWorkflow(testproject, "compile");
		Assert.assertThat(status, StatusMatcher.instance);
		
		IFile output = testproject.getFile("fishlamp_2.hex");
		assertTrue("output does not match input!", ModembedTests.modelsAreEquivalent(input, output));
	}
	
}
