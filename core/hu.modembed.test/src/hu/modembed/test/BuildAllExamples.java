package hu.modembed.test;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;

public class BuildAllExamples {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}

	@Test
	public void example_ledblink_pic16f1824() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("example.ledblink");
		ModembedTests.runAntScript(project, "build.xml", "release.pic16f1824");
	}
	
	@Test
	public void example_ledblink_pic18f14k50() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("example.ledblink");
		ModembedTests.runAntScript(project, "build.xml", "release.pic18f14k50");
	}
	
	@Test
	public void example_io_allon_pic16f1824() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("example.io.allon");
		ModembedTests.runAntScript(project, "build.xml", "release.pic16f1824");
	}
	
	@Test
	public void example_io_allon_pic18f14k50() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("example.io.allon");
		ModembedTests.runAntScript(project, "build.xml", "release.pic18f14k50");
	}
	
	public void example_uart_loopback()throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("example.uart.loopback");
		ModembedTests.runAntScript(project, "build.xml", "release");
	}
	
}
