/**
 * 
 */
package hu.modembed.test;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class ParsingTests {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ModembedTests.testSetUp();
	}

	@Test
	public void test0() throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("test0");
		IFolder folder = project.getFolder(".models");
		IFile file = folder.getFile("parseTest.xmi");
		
		Assert.assertTrue(file.exists());
		ModembedTests.checkMarkers(project);
	}

}
