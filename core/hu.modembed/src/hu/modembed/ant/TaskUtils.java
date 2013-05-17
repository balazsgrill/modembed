package hu.modembed.ant;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public final class TaskUtils {

	private TaskUtils() {
	}
	
	public static URI pathToUri(String path){
		for(IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			String location = p.getLocation().toOSString();
			if (path.startsWith(location)){
				IFile file = p.getFile(path.substring(location.length()));
				if (file.exists()) return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			}
		}
		return URI.createFileURI(path);
	}

	public static <T> T loadInput(ResourceSet resourceSet, File file, Class<? extends T> clazz) throws Exception{
		Object o = loadInput(resourceSet, file);
		if (clazz.isInstance(o)) return clazz.cast(o);
		throw new BuildException("Invalid input: "+file.getCanonicalPath());
	}
	
	public static Object loadInput(ResourceSet resourceSet, File file) throws Exception{
		URI uri = pathToUri(file.getCanonicalPath());
		Resource resource = resourceSet.getResource(uri, true);
		if (resource.getContents().isEmpty()) throw new Exception("Could not load file: "+file.getCanonicalPath()+" (using "+resource.getClass()+")");
		return resource.getContents().get(0);
	}
	
	public static Resource getOutput(ResourceSet resourceSet, File file) throws IOException{
		URI uri = pathToUri(file.getCanonicalPath());
		Resource resource = resourceSet.createResource(uri);
		return resource;
	}
	
}
