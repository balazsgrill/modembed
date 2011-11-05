package hu.modembed.model.editor;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public interface IPropertyEditor {

	public Control[] createControls(Composite parent, EObject eobject, EditingDomain edomain);

	public Collection<IPropertyEditor> getChildren(EObject eobject);
	
}
