/**
 * 
 */
package hu.modembed.test;

import static org.junit.Assert.fail;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
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
	public void test() throws CoreException {
		
		for(IMarker m : ResourcesPlugin.getWorkspace().getRoot().findMarkers(null, true, IResource.DEPTH_INFINITE)){
			if (IStatus.OK != m.getAttribute(IMarker.SEVERITY, IStatus.OK)){
				String msg = m.getAttribute(IMarker.MESSAGE, "Error");
				String loc = m.getAttribute(IMarker.LOCATION, "");
				fail(msg+" "+loc);
			}
		}
	}

}
