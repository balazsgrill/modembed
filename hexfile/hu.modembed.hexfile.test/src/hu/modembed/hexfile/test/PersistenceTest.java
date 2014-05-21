/**
 * 
 */
package hu.modembed.hexfile.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import hexfile.AddressType;
import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.hexfile.persistence.ChecksumMismatchDiagnostic;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class PersistenceTest {

	private static final String TEST = "test-subjects/test.hex";
	private static final String TEST_ERROR = "test-subjects/test_error.hex";
	private static final String TEST_CODE = "test-subjects/test_code.hex";
	private static final String TEST_CFG = "test-subjects/test_config.hex";
	
	private static final String PLUGIN_ID = "hu.modembed.hexfile.test";
	
	private URI getSubject(String path) throws IOException, URISyntaxException{
		URL url = FileLocator.find(Platform.getBundle(PLUGIN_ID), new Path(path), null);
		url = FileLocator.resolve(url);
		return URI.createURI(url.toURI().toString());
	}
	
	private ResourceSet resourceSet;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
	}

	@Test
	public void loadHexFileTest() throws IOException, URISyntaxException {
		Resource resource = resourceSet.getResource(getSubject(TEST), true);
		
		assertTrue(resource.getErrors().isEmpty());
		assertFalse(resource.getContents().isEmpty());
		
		EObject root = resource.getContents().get(0);
		assertTrue(root instanceof HexFile);
		
		HexFile hf = (HexFile)root;
		assertEquals(AddressType.EXTENDED_LINEAR, hf.getAddressType());
		
		
		assertEquals(2, hf.getEntries().size());
		
	}
	
	@Test
	public void loadHexFileTestError() throws IOException, URISyntaxException{
		Resource resource = resourceSet.getResource(getSubject(TEST_ERROR), true);
		
		assertEquals(1, resource.getErrors().size());
		
		Diagnostic error = resource.getErrors().get(0);
		assertTrue(error instanceof ChecksumMismatchDiagnostic);
		
		assertEquals(1, error.getLine());
	}

	@Test
	public void loadValuesTest() throws IOException, URISyntaxException{
		Resource rt = resourceSet.getResource(getSubject(TEST), true);
		Resource rt0 = resourceSet.getResource(getSubject(TEST_CODE), true);
		Resource rt1 = resourceSet.getResource(getSubject(TEST_CFG), true);
		
		Entry et_0 = ((HexFile)rt.getContents().get(0)).getEntries().get(0);
		Entry et_1 = ((HexFile)rt.getContents().get(0)).getEntries().get(1);
		
		Entry et0 = ((HexFile)rt0.getContents().get(0)).getEntries().get(0);
		Entry et1 = ((HexFile)rt1.getContents().get(0)).getEntries().get(0);
		
		assertEquals(et0.getAddress(), et_0.getAddress());
		assertEquals(et0.getBlocksize(), et_0.getBlocksize());
		assertArrayEquals(et0.getData(), et_0.getData());
		
		assertEquals(et1.getAddress(), et_1.getAddress());
		assertEquals(et1.getBlocksize(), et_1.getBlocksize());
		assertArrayEquals(et1.getData(), et_1.getData());
	}
	
}
