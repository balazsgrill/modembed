/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import hu.modembed.ui.MODembedUI;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author balazs.grill
 *
 */
public class MTextEditor extends TextEditor {

	private EditingDomain edomain;
	private Resource resource = null;
	
	public MTextEditor() {
		super();
	}
	
	volatile boolean dirty = false;
	
	private final DelayedExecutor reloader = new DelayedExecutor() {
		
		public String toString() {
			return "Checking file..";
		};
		
		@Override
		protected IStatus doExecute(IProgressMonitor monitor) {
			reload();
			return Status.OK_STATUS;
		}
	};
	
	private String oldText = "";
	
	private void reload(){
		final String[] text = new String[1];
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				text[0] = getSourceViewer().getTextWidget().getText();
			}
		});
		
		if (oldText.equals(text[0])) return;
		
		final InputStream is = new ByteArrayInputStream(text[0].getBytes());
		
		try {
			resource.unload();
			resource.load(is, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (contentOutlinePage != null){
			contentOutlinePage.update();
		}
	}
	
	@Override
	public void updatePartControl(IEditorInput input) {
		if (input instanceof IFileEditorInput){
			IFile file = ((IFileEditorInput) input).getFile();
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
			if (edomain == null){
				edomain = MODembedUI.getDefault().createEditingDomain(file.getProject());
			}
			if (resource == null){
				resource = edomain.getResourceSet().createResource(uri);
				reload();
				getSourceViewer().addTextListener(new ITextListener() {
					
					@Override
					public void textChanged(TextEvent event) {
						reloader.trigger();
					}
				});
			}
			
		}
		super.updatePartControl(input);
	}
	
	
	private MContentOutlinePage contentOutlinePage = null;
	
	private IContentOutlinePage getContentOutlinePage(){
		if (contentOutlinePage == null){
			return contentOutlinePage = new MContentOutlinePage(resource);
		}
		return contentOutlinePage;
	}
	
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)){
			return getContentOutlinePage();
		}
		return super.getAdapter(adapter);
	}
	
}
