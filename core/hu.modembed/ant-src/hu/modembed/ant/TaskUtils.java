package hu.modembed.ant;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public final class TaskUtils {

	private TaskUtils() {
	}

	public static <T> T loadInput(ResourceSet resourceSet, File file, Class<? extends T> clazz) throws Exception{
		Object o = loadInput(resourceSet, file);
		if (clazz.isInstance(o)) return clazz.cast(o);
		throw new BuildException("Invalid input: "+file.getCanonicalPath());
	}
	
	public static Object loadInput(ResourceSet resourceSet, File file) throws Exception{
		URI uri = URI.createFileURI(file.getCanonicalPath());
		Resource resource = resourceSet.getResource(uri, true);
		if (resource.getContents().isEmpty()) throw new Exception("Could not load file: "+file.getCanonicalPath()+" (using "+resource.getClass()+")");
		return resource.getContents().get(0);
	}
	
	public static Resource getOutput(ResourceSet resourceSet, File file) throws IOException{
		URI uri = URI.createFileURI(file.getCanonicalPath());
		Resource resource = resourceSet.createResource(uri);
		return resource;
	}
	
}
