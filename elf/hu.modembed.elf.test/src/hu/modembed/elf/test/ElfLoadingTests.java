/**
 * 
 */
package hu.modembed.elf.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
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
public class ElfLoadingTests {

	private static final String PLUGIN_ID = "hu.modembed.elf.test";
	
	private URI input1;
	
	private ResourceSet rs;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		input1 = URI.createPlatformPluginURI("/"+PLUGIN_ID+"/input/hello.o", true);
		
		rs = new ResourceSetImpl();
	}

	@Test
	public void test() {
		Resource resource = rs.createResource(input1, "ELF");
		try {
			resource.load(null);
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
	}

}
