/**
 * 
 */
package hu.modembed.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * @author balage
 *
 */
public class WorkbenchModelContentProvider extends WorkbenchContentProvider {

	private final ResourceSet resourceset = new ResourceSetImpl();
	
	@Override
	public Object[] getChildren(Object element) {
		if (element instanceof EObject){
			return ((EObject) element).eContents().toArray();
		}
		if (element instanceof IFile){
			String ext = ((IFile) element).getFileExtension();
			if ("xmi".equalsIgnoreCase(ext)){
				URI uri = URI.createPlatformResourceURI(((IFile) element).getFullPath().toPortableString(),true);
				Resource r = resourceset.getResource(uri, true);
				if (r != null){
					return r.getContents().toArray();
				}
			}
		}
		return super.getChildren(element);
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IFile){
			String ext = ((IFile) element).getFileExtension();
			return ("xmi".equalsIgnoreCase(ext));
		}
		return super.hasChildren(element);
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
}
