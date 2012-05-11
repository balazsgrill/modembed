package hu.modembed.pic.tools.generator;

import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;

public class GenerateDeviceDescription {

	@Test
	public void test() throws Exception {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("generate");
		
		if (!project.exists()){
			project.create(new NullProgressMonitor());
		}
		
		assertTrue(project.exists());
		
		project.open(new NullProgressMonitor());
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		for(IResource r : project.getFolder("16xxxx").members()){
			if ((r instanceof IFile) && r.getFileExtension().toUpperCase().endsWith("PIC")){
				new LibraryGenerator((IFile) r);
			}
		}
	}

}
