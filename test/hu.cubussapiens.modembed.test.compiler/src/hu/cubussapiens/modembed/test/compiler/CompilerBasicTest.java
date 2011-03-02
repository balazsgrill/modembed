/**
 * 
 */
package hu.cubussapiens.modembed.test.compiler;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Map;

import hexfile.HexFile;
import hu.cubussapiens.modembed.modularasm.compiler.IArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.compiler.ICompiler;
import hu.cubussapiens.modembed.modularasm.compiler.MASMCompilerPlugin;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.ExtensionArchitectureResolver;
import hu.cubussapiens.modembed.modularasm.compiler.resolvers.FolderModuleResolver;
import hu.cubussapiens.modembed.modularasm.modularASM.Module;
import memory.MemSegment;
import memory.MemoryFactory;
import memory.MemoryModel;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
	
	private static final String Result = "output.hex";
	
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
	
	MemoryModel memmodel;
	
	@Test
	public void memModel(){
		memmodel = MemoryFactory.eINSTANCE.createMemoryModel();
		memmodel.setRam(MemoryFactory.eINSTANCE.createRAMModel());
		MemSegment segment = MemoryFactory.eINSTANCE.createMemSegment();
		segment.setStartAddr(0x000);
		segment.setSize(0x300);
		memmodel.getRam().getSegments().add(segment);
		memmodel.setProg(MemoryFactory.eINSTANCE.createProgModel());
		memmodel.getProg().setResetVector(0);
		memmodel.getProg().setStartAddr(0);
		memmodel.getProg().setSize(0x4000);
	}
	
	@Test
	public void compile() throws Exception{
		ICompiler compiler = MASMCompilerPlugin.getDefault().createCompiler();
		
		memModel();
		compiler.setMemoryModel(memmodel);
		
		compiler.setArchResolver(new ExtensionArchitectureResolver());
		parsingMASM(); //Parses main module
		compiler.setMain(module);
		compiler.setModuleResolver(new FolderModuleResolver(rs, project));
		
		HexFile hf = compiler.compile(new NullProgressMonitor());
		assertNotNull(hf);
		
		IFile result = project.getFile(Result);
		URI uri = URI.createPlatformResourceURI(result.getFullPath().toString(),true);
		Resource r = rs.createResource(uri);
		r.getContents().add(hf);
		
		r.save(null);
		
		
		StringBuilder sb = new StringBuilder();
		Map<String, Long> mapping = compiler.getSymbolMapping();
		for(Map.Entry<String, Long> e : mapping.entrySet()){
			sb.append(e.getKey()+"\t0x"+Long.toString(e.getValue(), 16)+"\n");
		}
		
		IFile map = project.getFile("output.map");
		if (map.exists()){
			map.setContents(new ByteArrayInputStream(sb.toString().getBytes()), IResource.KEEP_HISTORY, new NullProgressMonitor());
		}else{
			map.create(new ByteArrayInputStream(sb.toString().getBytes()), true, new NullProgressMonitor());
		}
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
