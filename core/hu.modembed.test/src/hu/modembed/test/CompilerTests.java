package hu.modembed.test;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;

public class CompilerTests {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}

	@Test
	public void test_assembler_pic16e() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("test.assembler");
		ModembedTests.runAntScript(project, "test.asm.pic16e.ant.xml");
		ModembedTests.assertModelsAreEquivalent(project, "test.asm.pic16e.hex", ".test.asm.pic16e.out.hex");
	}

	@Test
	public void test_assembler_pic18() throws InvocationTargetException, InterruptedException, CoreException {
		IProject project = ModembedTests.loadProject("test.assembler");
		ModembedTests.runAntScript(project, "test.asm.pic18.ant.xml");
		ModembedTests.assertModelsAreEquivalent(project, "test.asm.pic18.hex", ".test.asm.pic18.out.hex");
	}
	
}
