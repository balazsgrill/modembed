/**
 * 
 */
package hu.modembed.application.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

import hu.modembed.application.ILibraryResolver;
import hu.temon.editor.TextualModelEditor;

/**
 * @author balazs.grill
 *
 */
public class ApplicationLibraryEditor extends TextualModelEditor {

	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
		
		if (input instanceof IFileEditorInput){
			IFile file = ((IFileEditorInput) input).getFile();
			ResourceSet resourceSet = getEditingDomain().getResourceSet();
			resourceSet.getLoadOptions().put(ILibraryResolver.OPTION__LIBRARY_RESOLVER, new WorkspaceLibraryResolver(file.getProject()));
		}
		
	}

}
