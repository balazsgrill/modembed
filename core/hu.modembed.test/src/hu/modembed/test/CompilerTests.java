package hu.modembed.test;

import hu.modembed.MODembedCore;
import hu.modembed.model.modembed.core.object.AssemblerObject;
import hu.modembed.simulator.DeviceSimulator;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.compare.util.EclipseModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
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
	
	@Test
	public void test_compiler_pic16e() throws Exception{
		IProject project = ModembedTests.loadProject("test.compileToDevice");
		ModembedTests.runAntScript(project, "test.compile.pic16e.ant.xml");
		
		IFile asmfile = project.getFile(".test.main.asm.xmi");
		Assert.assertTrue("AssemblerObject model does not exist!", asmfile.exists());
		ResourceSet rs = MODembedCore.createResourceSet();
		EObject asm = EclipseModelUtils.load(asmfile, rs);
		Assert.assertTrue("Invalid AssemblerObject", asm instanceof AssemblerObject);
		
		DeviceSimulator simulator = new DeviceSimulator();
		TestPic16Core device = new TestPic16Core();
		simulator.setCore(device);
		simulator.setCode((AssemblerObject)asm);
		simulator.setProgramCounter(device.PC());
		
		simulator.start();
		long counter = 0;
		while(simulator.isRunning()){
			if (counter >= 100){
				Assert.fail("Simulation did not end!");
			}
			simulator.step();
			counter++;
		}
		
		Assert.assertTrue(device.memory().getValue(0) == 5);
	}
	
}
