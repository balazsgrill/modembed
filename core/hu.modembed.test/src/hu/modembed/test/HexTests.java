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
public class HexTests {

	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}	

	@Test
	public void pic16_hex_merge() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic16_merge");
		ModembedTests.assertModelsAreEquivalent(project, "pic16/blink_release.hex", "pic16/.test.blink_release.hex");
	}
	
	@Test
	public void pic16_hex_extract() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic16_extract");
		ModembedTests.assertModelsAreEquivalent(project, "pic16/blink.hex", "pic16/.test.blink.hex");
		ModembedTests.assertModelsAreEquivalent(project, "pic16/config.hex", "pic16/.test.config.hex");
	}
	
	@Test
	public void pic16_pic_config_compilation() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic16_pic_config");
		ModembedTests.assertModelsAreEquivalent(project, "pic16/config.hex", "pic16/.test.config.values.hex");
	}	
	
	@Test
	public void pic18_hex_merge() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic18_merge");
		ModembedTests.assertModelsAreEquivalent(project, "pic18/test.hex", "pic18/.test.hex");
	}
	
	@Test
	public void pic18_hex_extract() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic18_extract");
		ModembedTests.assertModelsAreEquivalent(project, "pic18/test_code.hex", "pic18/.test_code.hex");
		ModembedTests.assertModelsAreEquivalent(project, "pic18/test_config.hex", "pic18/.test_config.hex");
	}
	
	@Test
	public void pic18_pic_config_compilation() throws Exception{
		IProject project = ModembedTests.loadProject("test.hex.manipulate");
		ModembedTests.runAntScript(project, "test.hex.manipulate.xml", "pic18_pic_config");
		ModembedTests.assertModelsAreEquivalent(project, "pic18/test_config.hex", "pic18/.test.config.values.hex");
	}	
}
