/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * @author balazs.grill
 *
 */
public class ContentProposedTextViewer extends ContentViewer {

	private final Text text;
	
	private final ContentProviderBasedContentProposal proposalProvider;
	
	private ViewerFilter filter = null;
	
	public ContentProposedTextViewer(Composite parent, int style) {
		text = new Text(parent, style);
		ControlDecoration dec = new ControlDecoration(text, SWT.TOP | SWT.LEFT);
		
		FieldDecoration fd = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		// Specify the decoration image and description
		dec.setImage(fd.getImage());
		dec.setDescriptionText(fd.getDescription());
		
		proposalProvider = new ContentProviderBasedContentProposal();
		try {
			new ContentProposalAdapter(
				text, new TextContentAdapter(), 
				proposalProvider,
				KeyStroke.getInstance("Ctrl+Space"), new char[0]).
				setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				fireSelectionChanged(new SelectionChangedEvent(ContentProposedTextViewer.this, getSelection()));
			}
		});
	}
	
	@Override
	public Control getControl() {
		return text;
	}

	@Override
	public ISelection getSelection() {
		Object element = proposalProvider.getElement(text.getText());
		return (element == null) ? new StructuredSelection() : new StructuredSelection(element);
	}
	
	public void setFilter(ViewerFilter filter) {
		this.filter = filter;
	}
	
	@Override
	public void refresh() {
		proposalProvider.setContentProvider((IStructuredContentProvider)getContentProvider());
		proposalProvider.setLabelProvider((ILabelProvider)getLabelProvider());
		proposalProvider.setFilter(filter, this);
		proposalProvider.setInput(getInput());
	}

	@Override
	protected void inputChanged(Object input, Object oldInput) {
		refresh();
	}
	
	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		Object element = (selection instanceof IStructuredSelection) ? ((IStructuredSelection)selection).getFirstElement() : null;
		if (element != null){
			text.setText(((ILabelProvider)getLabelProvider()).getText(element));
		}
	}
	
}
