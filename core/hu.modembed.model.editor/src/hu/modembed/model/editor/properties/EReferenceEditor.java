/**
 * 
 */
package hu.modembed.model.editor.properties;

import hu.modembed.model.editor.IPropertyEditor;
import hu.modembed.ui.databinding.ElementLabelValueFactory;
import hu.modembed.ui.dialogs.SelectObjectDialog;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * @author balazs.grill
 *
 */
public class EReferenceEditor implements IPropertyEditor {

	private final EReference reference;
	
	private IProject scope = null;
	
	public void setScope(IProject scope) {
		this.scope = scope;
	}
	
	public EReferenceEditor(EReference reference) {
		this.reference = reference;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IPropertyEditor#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public Control[] createControls(Composite parent, final EObject eobject,
			final EditingDomain edomain) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(reference.getName()+": ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		final CLabel item = new CLabel(parent, SWT.BORDER);
		item.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		final Button button = new Button(parent, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		button.setText("Select..");
		
		IObservableValue master = EMFEditProperties.value(edomain, reference).observe(eobject);
		
		IObservableValue labelvalue = MasterDetailObservables.detailValue(master, new ElementLabelValueFactory(edomain), String.class);
		
		final DataBindingContext dbc = new DataBindingContext();
		dbc.bindValue(WidgetProperties.text().observe(item), labelvalue);
		
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object input = (scope == null) ? eobject : scope;
				SelectObjectDialog dialog = new SelectObjectDialog(button.getShell(), edomain, input, reference, false);
				if (dialog.open() == Dialog.OK){
					Object[] sel = dialog.getResult();
					if (sel.length > 0){
						Object s = sel[0];
						Command cmd = new EReferenceChangeCommand(eobject, reference, s);
						edomain.getCommandStack().execute(cmd);
					}
				}
			}
		});
		
		return new Control[]{label, item, button};
	}

	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IPropertyEditor#getChildren(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<IPropertyEditor> getChildren(EObject eobject) {
		return Collections.emptyList();
	}

}
