/**
 * 
 */
package hu.modembed.model.editor.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Control;

/**
 * @author balazs.grill
 *
 */
public class EReferenceCellEditingSupport extends EditingSupport {

	private final EReference ref;
	
	private final EditingDomain edomain;
	
	/**
	 * @param viewer
	 */
	public EReferenceCellEditingSupport(ColumnViewer viewer, EReference ref, EditingDomain edomain) {
		super(viewer);
		this.ref = ref;
		this.edomain = edomain;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
	 */
	@Override
	protected CellEditor getCellEditor(final Object element) {
		return new DialogCellEditor() {
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
//				SelectObjectDialog dialog = new SelectObjectDialog(cellEditorWindow.getShell(), element, ref, false);
//				if (dialog.open() == Dialog.OK){
//					Object[] sel = dialog.getResult();
//					if (sel.length > 0){
//						Object s = sel[0];
//						return s;
//					}
//				}
				return null;
			}
		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
	 */
	@Override
	protected boolean canEdit(Object element) {
		return ref.getEContainingClass().isInstance(element);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
	 */
	@Override
	protected Object getValue(Object element) {
		if (element instanceof EObject){
			((EObject)element).eGet(ref);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof EObject){
			edomain.getCommandStack().execute(new EReferenceChangeCommand((EObject)element, ref, value));
		}
	}

}
