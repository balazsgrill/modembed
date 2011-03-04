/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

/**
 * @author balazs.grill
 *
 */
public class ProjectSettingsEditorPart extends FormEditor {

	

	private IFile file;
	
	private ResourceSet resourceSet;
	private Resource res;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		try{
			if (input instanceof IFileEditorInput){
				setInput(input);
				setSite(site);

				IFileEditorInput finput = (IFileEditorInput)input;
				file = finput.getFile();

				resourceSet = new ResourceSetImpl();
				res = resourceSet.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
			}
		}catch(Exception e){
			throw new PartInitException("Could not open project config", e);
		}

	}

	@Override
	protected void addPages() {
		try {
			addPage(new GeneralSettingsPage("", "General"));
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
