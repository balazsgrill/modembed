package hu.modembed.test;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;

public class CompilerTests {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}

	@Test
	public void test_assembly() throws InvocationTargetException, InterruptedException, CoreException {
		ModembedTests.loadAndCompileProject("test.assembler");
	}

	
	
}
