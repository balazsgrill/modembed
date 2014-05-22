/**
 * 
 */
package hu.modembed.assembler.test;

import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.assembler.Assembler;
import hu.modembed.assembler.code.AssemblerObject;
import hu.modembed.assembler.instructionset.InstructionSet;
import hu.modembed.disassembler.Disassembler;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class AssemblerTests {

	private static final String PLUGIN_ID = "hu.modembed.assembler";
	
	private static final String ISET_PIC16 = "microchip.pic16.instructionset";
	private static final String ISET_PIC16E = "microchip.pic16e.instructionset";
	private static final String ISET_PIC18 = "microchip.pic18.instructionset";
	
	private static final String HEX_PIC16E = "test.asm.pic16e.hex";
	private static final String HEX_PIC18 = "test.asm.pic18.hex";
	
	public static URI getSubject(String path){
		return URI.createPlatformPluginURI("/"+PLUGIN_ID+"/test-subjects/"+path, true);
	}
	
	public static void assertModelsAreEquivalent(HexFile f1, HexFile f2){
		Assert.assertEquals(f1.getEntries().size(), f2.getEntries().size());
		for(int i=0;i<f1.getEntries().size();i++){
			Entry e1 = f1.getEntries().get(i);
			Entry e2 = f2.getEntries().get(i);
			
			Assert.assertArrayEquals(e1.getData(), e2.getData());
		}
	}
	
	public static EObject load(URI uri, ResourceSet resourceSet){
		Resource res = resourceSet.getResource(uri, true);
		if (!res.getErrors().isEmpty()){
			throw new RuntimeException(res.getErrors().toString());
		}
		return res.getContents().get(0);
	}
	
	public static <T extends EObject> T load(URI file, ResourceSet resourceSet, Class<T> clazz){
		EObject eo = load(file, resourceSet);
		Assert.assertTrue(clazz.isInstance(eo));
		return clazz.cast(eo);
	}

	@Test
	public void testPIC16E() {
		ResourceSet rs = new ResourceSetImpl();
		
		load(getSubject(ISET_PIC16), rs);
		EObject iset = load(getSubject(ISET_PIC16E), rs);
		EObject h = load(getSubject(HEX_PIC16E), rs);
		
		Assert.assertTrue(iset instanceof InstructionSet);
		Assert.assertTrue(h instanceof HexFile);
		
		HexFile hex = (HexFile)h;
		Assert.assertEquals(1, hex.getEntries().size());
		
		Disassembler disassembler = new Disassembler((InstructionSet) iset);
		AssemblerObject obj = disassembler.disassemble(hex.getEntries().get(0));
		
		if (!disassembler.getErrors().isEmpty()){
			for(Diagnostic d : disassembler.getErrors()){
				System.out.println(d.getMessage());
			}
		}
		Assert.assertTrue(disassembler.getErrors().isEmpty());
		
		Assembler assembler = new Assembler();
		HexFile hex2 = assembler.execute(obj, (int) obj.getStartAddress(), new NullProgressMonitor());
		
		assertModelsAreEquivalent(hex, hex2);
	}
	
	@Test
	public void testPIC18(){
		ResourceSet rs = new ResourceSetImpl();
		
		EObject iset = load(getSubject(ISET_PIC18), rs);
		EObject h = load(getSubject(HEX_PIC18), rs);
		
		Assert.assertTrue(iset instanceof InstructionSet);
		Assert.assertTrue(h instanceof HexFile);
		
		HexFile hex = (HexFile)h;
		Assert.assertEquals(1, hex.getEntries().size());
		
		Disassembler disassembler = new Disassembler((InstructionSet) iset);
		AssemblerObject obj = disassembler.disassemble(hex.getEntries().get(0));
		
		if (!disassembler.getErrors().isEmpty()){
			for(Diagnostic d : disassembler.getErrors()){
				System.out.println(d.getMessage());
			}
		}
		Assert.assertTrue(disassembler.getErrors().isEmpty());

		Assembler assembler = new Assembler();
		HexFile hex2 = assembler.execute(obj, (int) obj.getStartAddress(), new NullProgressMonitor());
		
		assertModelsAreEquivalent(hex, hex2);
	}

}
