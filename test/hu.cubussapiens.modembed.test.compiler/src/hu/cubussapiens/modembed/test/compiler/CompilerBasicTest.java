/**
 * 
 */
package hu.cubussapiens.modembed.test.compiler;

import static org.junit.Assert.*;
import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.builder.IArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.builder.ICompiler;
import hu.cubussapiens.modembed.modularasm.builder.IModuleResolver;
import hu.cubussapiens.modembed.modularasm.builder.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.builder.resolvers.ExtensionArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import embedded.assembly.InstructionSet;

/**
 * @author balazs.grill
 *
 */
public class CompilerBasicTest {

	private IProject project;
	
	private static final String projectName = "modembed.tests.compiler";
	
	private static final String Main = "main.masm";
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!project.exists()){
			project.create(new NullProgressMonitor());
		}
		project.open(new NullProgressMonitor());
		
		rs = new ResourceSetImpl();
	}

	private Module module;
	
	private ResourceSet rs;
	
	@Test
	public void parsingMASM() throws Exception{
		IFile main = project.getFile(Main);
		assertTrue(main.exists());
		
		URI uri = URI.createPlatformResourceURI(main.getFullPath().toString(),true);
		Resource res = rs.getResource(uri, true);
		
		assertTrue(!res.getContents().isEmpty());
		
		EObject eo = res.getContents().get(0);
		assertTrue(eo instanceof Module);
		
		this.module = (Module)eo;
	}
	
	private IArchitectureResolver archres;
	
	@Test
	public void getArchitecture() throws Exception{
		archres = new ExtensionArchitectureResolver();
		
		InstructionSet iset = archres.getInstructionSet("microchip.pic18", rs);
		
		assertNotNull(iset);
		
	}
	
	@Test
	public void compile() throws Exception{
		ICompiler compiler = MASMCompilerPlugin.getDefault().createCompiler();
		
		compiler.setArchResolver(new ExtensionArchitectureResolver());
		parsingMASM(); //Parses main module
		compiler.setMain(module);
		compiler.setModuleResolver(new IModuleResolver() {
			
			@Override
			public Module resolveModule(String moduleID) {
				// dummy resolver
				return null;
			}
		});
		
		HexFile hf = compiler.compile(new NullProgressMonitor());
		//assertNotNull(hf);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
