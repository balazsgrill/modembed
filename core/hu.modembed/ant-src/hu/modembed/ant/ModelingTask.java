/**
 * 
 */
package hu.modembed.ant;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public abstract class ModelingTask extends Task {

	protected <T> T loadInput(ResourceSet resourceSet, File file, Class<? extends T> clazz) throws IOException{
		Object o = loadInput(resourceSet, file);
		if (clazz.isInstance(o)) return clazz.cast(o);
		throw new BuildException("Invalid input: "+file.getCanonicalPath());
	}
	
	protected Object loadInput(ResourceSet resourceSet, File file) throws IOException{
		URI uri = URI.createFileURI(file.getCanonicalPath());
		Resource resource = resourceSet.getResource(uri, true);
		return resource.getContents().get(0);
	}
	
	protected Resource getOutput(ResourceSet resourceSet, File file) throws IOException{
		URI uri = URI.createFileURI(file.getCanonicalPath());
		Resource resource = resourceSet.createResource(uri);
		return resource;
	}
	
}
