/**
 * 
 */
package hu.cubussapiens.modembed.ui.widgets;

import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author balazs.grill
 *
 */
public class TreeTextButtonViewer extends ContentViewer implements ModifyListener{

	private final Text text;
	private final Button button;

	private String value = "";
	
	public TreeTextButtonViewer(Composite parent, FormToolkit tk) {
		text = tk.createText(parent, "", SWT.BORDER);
		text.addModifyListener(this);
		button = tk.createButton(parent, "Browse..", SWT.PUSH);
	}
	
	public Text getText() {
		return text;
	}
	
	public Button getButton() {
		return button;
	}
	
	@Override
	public Control getControl() {
		return text;
	}

	@Override
	public ISelection getSelection() {
		Object o = getContentProvider().getElementForText(value);
		if (o == null){
			return new StructuredSelection();
		}
		return new StructuredSelection(o);
	}

	@Override
	public ILabelProvider getLabelProvider() {
		IBaseLabelProvider lp = super.getLabelProvider();
		if (lp instanceof ILabelProvider){
			return (ILabelProvider)lp;
		}
		return null;
	}
	
	@Override
	public ITextTreeContentProvider getContentProvider() {
		IContentProvider cp = super.getContentProvider();
		if (cp instanceof ITextTreeContentProvider){
			return (ITextTreeContentProvider)cp;
		}
		return null;
	}
	
	public void setValue(String value) {
		text.setText(value);
		this.value = value;
	}
	
	@Override
	public void refresh() {
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		if (selection.isEmpty()){
			setValue("");
		}else{
			if (selection instanceof IStructuredSelection){
				Object o = ((IStructuredSelection) selection).getFirstElement();
				setValue(getLabelProvider().getText(o));
			}
		}
		
	}

	@Override
	public void modifyText(ModifyEvent e) {
		this.value = text.getText();
		fireSelectionChanged(new SelectionChangedEvent(this, getSelection()));
	}


}
