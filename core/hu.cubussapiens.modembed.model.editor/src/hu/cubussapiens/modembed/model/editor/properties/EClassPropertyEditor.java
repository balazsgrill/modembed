/**
 * 
 */
package hu.cubussapiens.modembed.model.editor.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import hu.cubussapiens.modembed.model.editor.IPropertyEditor;

/**
 * @author balage
 *
 */
public class EClassPropertyEditor implements IPropertyEditor {

	private final EClass eclass;
	
	public EClassPropertyEditor(EClass eclass) {
		this.eclass = eclass;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IPropertyEditor#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Control[] createControls(Composite parent, EObject eobject, EditingDomain edomain) {
		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 3, 1));
		label.setText(eclass.getName());
		return new Control[]{label};
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.model.editor.IPropertyEditor#getChildren(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<IPropertyEditor> getChildren(EObject eobject) {
		List<IPropertyEditor> editors = new ArrayList<IPropertyEditor>();
		
		for(EAttribute a : eclass.getEAttributes()){
			editors.add(new EAttributeEditor(a));
		}
		
		for(EReference r : eclass.getEReferences()){
			if (!r.isContainment()){
				if (r.isMany()){
					editors.add(new ManyEReferenceEditor(r));
				}else{
					editors.add(new EReferenceEditor(r));
				}
			}
		}
		
		return editors;
	}

}
