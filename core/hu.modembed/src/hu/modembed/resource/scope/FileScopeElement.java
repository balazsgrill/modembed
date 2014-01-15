/**
 * 
 */
package hu.modembed.resource.scope;

import hu.textualmodeler.parser.scope.IScopeElement;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class FileScopeElement implements IScopeElement {

	private final IFile file;
	
	/**
	 * 
	 */
	public FileScopeElement(IFile file) {
		this.file = file;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IScopeElement#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		String fn  = file.getName();
		if (fn.endsWith(".m")){
			fn = fn.substring(0, fn.length()-2);
		}
		return fn;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IScopeElement#getValue(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public EObject getValue(ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		if (!resource.getContents().isEmpty()){
			return resource.getContents().get(0);
		}
		return null;
	}

}
