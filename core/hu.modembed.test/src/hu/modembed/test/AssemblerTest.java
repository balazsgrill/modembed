package hu.modembed.test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import hu.e.compiler.WorkflowLauncherRunnable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

public class AssemblerTest {

	@Test
	public void test() throws Exception{
		IProject testproject = ResourcesPlugin.getWorkspace().getRoot().getProject("test1");
		assertTrue(testproject.exists());
		
		IFile input = testproject.getFile("16f1824_blink_wo_Config.hex");
		IFile workflow = testproject.getFile("build.xmi");
		WorkflowLauncherRunnable launch = new WorkflowLauncherRunnable(URI.createPlatformResourceURI(workflow.getFullPath().toString(), true));
		
		IStatus status = launch.execute(new NullProgressMonitor());
		assertThat("Could not execute workflow!", status, new BaseMatcher<IStatus>() {
			@Override
			public boolean matches(Object item) {
				if (item instanceof IStatus){
					return ((IStatus) item).isOK();
				}
				return false;
			}

			@Override
			public void describeTo(Description description) {
				
			}
		});
		
		IFile output = testproject.getFile("output.hex");
		assertTrue("output does not match input!", compare(input, output));
	}

	private static boolean compare(IFile file1, IFile file2) throws CoreException, IOException{
		InputStream is1 = file1.getContents();
		InputStream is2 = file2.getContents();
		
		int r1 = is1.available();
		int r2 = is2.available();
		if (r1 != r2) return false;
		
		byte[] d1 = new byte[r1];
		byte[] d2 = new byte[r2];
		
		for(int i=0;i<r1;i++){
			if (d1[i] != d2[i]) return false;
		}
		return true;
	}
	
}
