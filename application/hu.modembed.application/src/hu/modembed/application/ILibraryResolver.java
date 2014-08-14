/**
 * 
 */
package hu.modembed.application;

import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public interface ILibraryResolver {

	public static final String OPTION__LIBRARY_RESOLVER = ILibraryResolver.class.getCanonicalName();  
	
	public URI findLibraryResource(String libraryID);
	
}
