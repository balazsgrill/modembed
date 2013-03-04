/**
 * 
 */
package hu.modembed.model.editor.properties;

import hu.modembed.model.editor.IPropertyEditor;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * @author balazs.grill
 *
 */
public class ManyEAttributeEditor implements IPropertyEditor {

	private final EAttribute attribute;
	
	public ManyEAttributeEditor(EAttribute attribute) {
		this.attribute = attribute;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IPropertyEditor#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public Control[] createControls(Composite parent, final EObject eobject,
			final EditingDomain edomain) {
		Composite c = new Composite(parent, SWT.BORDER);
		c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		GridLayout gl = new GridLayout(1, false);
		gl.horizontalSpacing = 0;
		gl.verticalSpacing = 0;
		gl.marginWidth = 0;
		gl.marginHeight = 0;
		c.setLayout(gl);
		
		Label l = new Label(c, SWT.NONE);
		l.setText(attribute.getName()+": ");
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		final StructuredViewer viewer = new ListViewer(c);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		IObservableList content = EMFEditProperties.list(edomain, attribute).observe(eobject);
		
		ObservableListContentProvider cp = new ObservableListContentProvider();
		final EMFUpdateValueStrategy updateValueStrategy = new EMFUpdateValueStrategy();
		//IObservableMap labels = MasterDetailObservables.detailValues(cp.getKnownElements(), new ElementLabelValueFactory(edomain), String.class);
		
		viewer.setContentProvider(cp);
		viewer.setLabelProvider(new LabelProvider());
		viewer.setInput(content);
		
		MenuManager menumanager = new MenuManager();
		viewer.getControl().setMenu(menumanager.createContextMenu(viewer.getControl()));
		menumanager.add(new Action("Add..") {
			@Override
			public void run() {
				InputDialog dialog = new InputDialog(viewer.getControl().getShell(), "Add value", "Please input new Value", "", new IInputValidator() {
					
					@Override
					public String isValid(String newText) {
						if (updateValueStrategy.convert(newText) == null){
							return "Invalid value";
						}
						return null;
					}
				});
				//SelectObjectDialog dialog = new SelectObjectDialog(viewer.getControl().getShell(),edomain, eobject, reference, true);
				if (dialog.open() == Dialog.OK){
					String value = dialog.getValue();
					Object addValue = updateValueStrategy.convert(value);
					if (addValue != null){
						Command cmd = new EMultiFeatureAddCommand(eobject, attribute, new Object[]{addValue});
						edomain.getCommandStack().execute(cmd);
					}
				}
			}
		});
		menumanager.add(new Action("Remove"){
			@Override
			public void run() {
				Object[] elements = ((IStructuredSelection)viewer.getSelection()).toArray();
				if (elements.length > 0){
					Command cmd = new EMultiFeatureRemoveCommand(eobject, attribute, elements);
					edomain.getCommandStack().execute(cmd);
				}
			}
		});
		
		
		return new Control[]{c};
	}

	/* (non-Javadoc)
	 * @see hu.modembed.model.editor.IPropertyEditor#getChildren(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<IPropertyEditor> getChildren(EObject eobject) {
		return Collections.emptyList();
	}

}
