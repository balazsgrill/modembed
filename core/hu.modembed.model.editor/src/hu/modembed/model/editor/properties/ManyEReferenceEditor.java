/**
 * 
 */
package hu.modembed.model.editor.properties;

import hu.modembed.model.editor.IPropertyEditor;
import hu.modembed.ui.MODembedUI;
import hu.modembed.ui.dialogs.SelectObjectDialog;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
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
public class ManyEReferenceEditor implements IPropertyEditor {

	private final EReference reference;
	
	public ManyEReferenceEditor(EReference reference) {
		this.reference = reference;
	}
	
	private static final AdapterFactoryLabelProvider lp = new AdapterFactoryLabelProvider(MODembedUI.getDefault().createAdapterFactory());
	
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
		l.setText(reference.getName()+": ");
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		final TreeViewer viewer = new TreeViewer(c);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		viewer.setContentProvider(new EReferenceContentProvider(reference));
		viewer.setLabelProvider(lp);
		viewer.setInput(eobject);
		
		MenuManager menumanager = new MenuManager();
		viewer.getTree().setMenu(menumanager.createContextMenu(viewer.getTree()));
		menumanager.add(new Action("Add..") {
			@Override
			public void run() {
				SelectObjectDialog dialog = new SelectObjectDialog(viewer.getControl().getShell(), eobject, reference, true);
				if (dialog.open() == Dialog.OK){
					Object[] sel = dialog.getResult();
					if (sel.length > 0){
						Command cmd = new EReferenceAddCommand(eobject, reference, sel);
						edomain.getCommandStack().execute(cmd);
						viewer.refresh();
					}
				}
			}
		});
		menumanager.add(new Action("Remove"){
			@Override
			public void run() {
				Object[] elements = ((IStructuredSelection)viewer.getSelection()).toArray();
				if (elements.length > 0){
					Command cmd = new EReferenceRemoveCommand(eobject, reference, elements);
					edomain.getCommandStack().execute(cmd);
					viewer.refresh();
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