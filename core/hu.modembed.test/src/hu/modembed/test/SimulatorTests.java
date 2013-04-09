/**
 * 
 */
package hu.modembed.test;

import hu.e.compiler.TaskUtils;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.simulator.DeviceSimulator;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class SimulatorTests {

	private static final String SIM_1 = "test6";
	
	
	
	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}
	
	@Test
	public void simulate_1() throws Exception{
		IProject project = ModembedTests.loadAndCompileProject(SIM_1);
		
		URI uri = TaskUtils.findModelURI(project, "addNumbers.asm");
		Assert.assertNotNull(uri);
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(uri, true);
		
		Assert.assertTrue(!r.getContents().isEmpty());
		EObject eo = r.getContents().get(0);
		Assert.assertTrue(eo instanceof AssemblerObject);
		
		AssemblerObject asm = (AssemblerObject)eo;
		DeviceSimulator device = new DeviceSimulator();
		device.setCode(asm);
		
	}
	
}
