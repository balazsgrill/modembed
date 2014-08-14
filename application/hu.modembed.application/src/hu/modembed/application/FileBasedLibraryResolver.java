/**
 * 
 */
package hu.modembed.application;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class FileBasedLibraryResolver implements ILibraryResolver {

	private final File files[];
	
	/**
	 * @param files Files or directories to include
	 */
	public FileBasedLibraryResolver(File...files) {
		this.files = files;
	}

	private static URI findResource(File[] files, String name){
		for(File file : files){
			URI result = findResource(file, name);
			if (result != null){
				return result;
			}
		}
		return null;
	}
	
	private static URI findResource(File file, String name){
		if (file.isFile()){
			try {
				return (name.equals(file.getName())) ? URI.createFileURI(file.getCanonicalPath()) : null;
			} catch (IOException e) {
				return null;
			}
		}
		if (file.isDirectory()){
			return findResource(file.listFiles(), name);
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.application.ILibraryResolver#findLibraryResource(java.lang.String)
	 */
	@Override
	public URI findLibraryResource(String libraryID) {
		String name = libraryID+".mal";
		return findResource(files, name);
	}

}
