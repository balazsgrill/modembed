/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import hu.modembed.ui.MODembedUI;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
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
	
	private void reload(){
		String text = getSourceViewer().getTextWidget().getText();
		final InputStream is = new ByteArrayInputStream(text.getBytes());
		
//		edomain.getCommandStack().execute(new RecordingCommand((TransactionalEditingDomain) edomain) {
//			
//			@Override
//			protected void doExecute() {
//				resource.getContents().clear();
//				resource.getErrors().clear();
//			}
//		});
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
//			if (resource != null){
//				resource.unload();
//				resource = null;
//			}
//			
//			if (resource == null){
//				try{
//					resource = edomain.getResourceSet().getResource(uri, true);
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//			}
			edomain = MODembedUI.getDefault().createEditingDomain(file.getProject());
			resource = edomain.getResourceSet().createResource(uri);
			reload();
			getSourceViewer().addTextListener(new ITextListener() {
				
				@Override
				public void textChanged(TextEvent event) {
					reload();
				}
			});
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
