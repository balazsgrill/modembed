/**
 * 
 */
package hu.modembed.test;

import org.eclipse.core.resources.IProject;
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class SimulatorTests {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}
	
	@Test
	public void pic16_dio() throws Exception{
		IProject project = ModembedTests.loadProject("test.dio");
		ModembedTests.runAntScript(project, "build.xml", "pic16f1824");
	}
	
	@Test
	public void pic18_dio() throws Exception{
		IProject project = ModembedTests.loadProject("test.dio");
		ModembedTests.runAntScript(project, "build.xml", "pic18f14k50");
	}

}
