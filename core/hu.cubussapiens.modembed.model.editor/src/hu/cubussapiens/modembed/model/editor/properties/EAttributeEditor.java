/**
 * 
 */
package hu.cubussapiens.modembed.model.editor.properties;

import hu.cubussapiens.modembed.model.editor.IPropertyEditor;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author balage
 *
 */
public class EAttributeEditor implements IPropertyEditor {

	private final EAttribute attrib;
	
	public EAttributeEditor(EAttribute attrib) {
		this.attrib = attrib;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IPropertyEditor#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public Control[] createControls(Composite parent, final EObject eobject,
			final EditingDomain edomain) {
		
		Label l = new Label(parent, SWT.NONE);
		l.setText(attrib.getName()+": ");
		final Text text = new Text(parent, SWT.BORDER);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		text.setText(eobject.eGet(attrib)+"");
		
		text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				edomain.getCommandStack().execute(new EAttributeChangeCommand(eobject, attrib, text.getText()));
			}
		});
		
		return new Control[]{l, text};
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IPropertyEditor#getChildren(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<IPropertyEditor> getChildren(EObject eobject) {
		return Collections.emptyList();
	}

}
