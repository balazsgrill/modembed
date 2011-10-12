/**
 * 
 */
package hu.cubussapiens.modembed.model.editor;

import hu.cubussapiens.modembed.model.editor.properties.GenericEMFPropertyEditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * @author balage
 *
 */
public class GenericModelPropertyPage extends Page implements IPropertySheetPage, ISelectionChangedListener{

	private Composite control;

	private EditingDomain editingDomain;
	
	private final List<Control> editors = new ArrayList<Control>();
	
	public GenericModelPropertyPage(EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.Page#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		//parent.setLayout(new FillLayout());
		control = new Composite(parent, SWT.NONE);
		editors.clear();
		control.setLayout(new GridLayout(3, false));
		
		selectionChanged(preselection);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.Page#getControl()
	 */
	@Override
	public Control getControl() {
		return control;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.Page#setFocus()
	 */
	@Override
	public void setFocus() {
		control.setFocus();
	}

	EObject selection = null;
	EObject preselection = null;
	
	private void selectionChanged(EObject eobject){
		if (control == null){
			preselection = eobject;
			return;
		}
		
		if (selection != eobject){
			
			for(Control c : editors){
				c.dispose();
			}
			editors.clear();
			
			if (eobject != null){
				Deque<IPropertyEditor> pes = new LinkedList<IPropertyEditor>();
				pes.add(new GenericEMFPropertyEditor());
				while(!pes.isEmpty()){
					IPropertyEditor pe = pes.pollLast();
					editors.addAll(Arrays.asList(pe.createControls(control, eobject, editingDomain)));
					pes.addAll(pe.getChildren(eobject));
				}
			}
		
			control.layout(true);
			selection = eobject;
		}
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) selection).getFirstElement();
			selectionChanged(o instanceof EObject ? (EObject)o : null);
		}
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) event.getSelection()).getFirstElement();
			selectionChanged(o instanceof EObject ? (EObject)o : null);
		}
	}

}
