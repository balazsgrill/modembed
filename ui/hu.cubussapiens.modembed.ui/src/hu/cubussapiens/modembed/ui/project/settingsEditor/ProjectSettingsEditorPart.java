/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import java.io.IOException;

import org.eclipse.core.databinding.DataBindingContext;
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
				
				context = new DataBindingContext();
				generalsettings = new GeneralSettingsPage(this, new ProjectConfigInput(config, file.getProject(), context));
				
				setPartName(file.getProject().getName());
			}
		}catch(Exception e){
			throw new PartInitException("Could not open project config", e);
		}

	}

	private GeneralSettingsPage generalsettings;

	private DataBindingContext context;
	
	@Override
	protected void addPages() {
		try {
			addPage(generalsettings);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
	public void doSave(IProgressMonitor monitor) {
		monitor.beginTask("Saving", -1);
		try {
			commitPages(true);
			res.save(null);
			getHeaderForm().dirtyStateChanged();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		monitor.done();
	}

	@Override
	public void doSaveAs() {	
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	protected void createHeaderContents(IManagedForm headerForm) {
		headerForm.getForm().setText("Project Configuration");
		
	}
	
	@Override
	public void dispose() {
		context.dispose();
		super.dispose();
	}
	
}
