/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;

import project.ProjectConfig;

/**
 * @author balazs.grill
 *
 */
public class ProjectSettingsEditorPart extends SharedHeaderFormEditor {

	

	private IFile file;
	
	private ResourceSet resourceSet;
	private Resource res;
	private ProjectConfig config;
	
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
				
				EObject eo = res.getContents().get(0);
				if (eo instanceof ProjectConfig){
					config = (ProjectConfig)eo;
				}else{
					throw new IllegalArgumentException("Invalid project config");
				}
				
				generalsettings = new GeneralSettingsPage(this, config);
				
				setPartName(file.getProject().getName());
			}
		}catch(Exception e){
			throw new PartInitException("Could not open project config", e);
		}

	}

	private GeneralSettingsPage generalsettings;
	
	@Override
	protected void addPages() {
		try {
			addPage(generalsettings);
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

	@Override
	protected void createHeaderContents(IManagedForm headerForm) {
		headerForm.setInput(config);
		
		headerForm.getForm().setText("Project Configuration");
		
		//headerForm.getForm().s
	}
	
}
