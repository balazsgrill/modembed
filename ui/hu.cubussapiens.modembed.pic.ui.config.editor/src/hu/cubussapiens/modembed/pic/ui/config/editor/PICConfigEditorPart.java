/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config.editor;

import java.io.IOException;

import modembedconfig.Parameter;
import modembedconfig.Scheme;
import modembedconfig.instance.Configuration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.EditorPart;

import pic.PicCPUType;

/**
 * @author balage
 *
 */
public class PICConfigEditorPart extends EditorPart {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		monitor.beginTask("Saving..", -1);
		try {
			resource.save(null);
			dirty = false;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		firePropertyChange(PROP_DIRTY);
		monitor.done();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	private ResourceSet resourceset;
	private Resource resource;
	
	private Scheme configscheme;
	
	private Configuration configuration;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
		if (input instanceof IFileEditorInput){
			setSite(site);
			setInput(input);
			
			IFile file = ((IFileEditorInput) input).getFile();
			
			resourceset = new ResourceSetImpl();
			resource = resourceset.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
			try {
				resource.load(null);
			} catch (IOException e) {
				throw new PartInitException("Could not load configuration", e);
			}
			
			configuration = ((Configuration)resource.getContents().get(0));
			configscheme = configuration.getScheme();
			setPartName(file.getName());
			
		}

	}

	private boolean dirty = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return dirty;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		FormToolkit tk = new FormToolkit(Display.getDefault());
		parent.setLayout(new FillLayout());
		ScrolledForm form = tk.createScrolledForm(parent);

		form.setText("PIC configuration");
		
		Label head = new Label(form.getForm().getHead(), SWT.None);
		head.setText("Target: "+((PicCPUType)configscheme.eContainer().eContainer()).getName());
		form.setHeadClient(head);
		
		form.getBody().setLayout(new FillLayout());
		new ParameterSetViewer(form.getBody(), tk, configscheme, configuration).addListener(new IParameterListener() {
			
			@Override
			public void parameterValueChanged(Parameter parameter, int newvalue) {
				dirty = true;
				firePropertyChange(PROP_DIRTY);
				
			}
		});
		form.reflow(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
