/**
 * 
 */
package hu.modembed.ui.dialogs;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * @author balage
 *
 */
public class SelectObjectDialog extends ListDialog {

	private final boolean multi;
	
	public SelectObjectDialog(Shell parentShell, ResourceSet resourceset, Object input, EReference ref, boolean multi) {
		super(parentShell);
		
		this.multi = multi;
		setContentProvider(new SelectObjectContentProvider(ref, resourceset));
		setLabelProvider(new LabelProvider());
		setInput(input);
		setTitle("Select an object");
		
	}

	@Override
	protected int getTableStyle() {
		return (multi ? SWT.MULTI : SWT.SINGLE) | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;
	}
	
}
