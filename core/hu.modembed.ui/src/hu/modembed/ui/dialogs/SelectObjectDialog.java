/**
 * 
 */
package hu.modembed.ui.dialogs;

import hu.modembed.ui.databinding.ElementLabelValueFactory;
import hu.modembed.ui.databinding.FeaturePossibleValueListFactory;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;

/**
 * @author balage
 *
 */
public class SelectObjectDialog extends ListDialog {

	private final boolean multi;
	
	public SelectObjectDialog(Shell parentShell, EditingDomain edomain, Object input, EReference ref, boolean multi) {
		super(parentShell);
		
		this.multi = multi;
		
		IObservableList inputlist = (IObservableList)new FeaturePossibleValueListFactory(ref, edomain.getResourceSet()).createObservable(input);
		ObservableListContentProvider cp = new ObservableListContentProvider();
		
		IObservableMap labels = MasterDetailObservables.detailValues(cp.getKnownElements(), new ElementLabelValueFactory(edomain), String.class);
		
		setContentProvider(cp);
		setLabelProvider(new ObservableMapLabelProvider(labels));
		setInput(inputlist);
		setTitle("Select an object");
		
	}

	@Override
	protected int getTableStyle() {
		return (multi ? SWT.MULTI : SWT.SINGLE) | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;
	}
	
}
