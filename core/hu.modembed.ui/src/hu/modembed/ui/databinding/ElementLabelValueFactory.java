/**
 * 
 */
package hu.modembed.ui.databinding;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @author balazs.grill
 *
 */
public class ElementLabelValueFactory implements IObservableFactory {

	private final EditingDomain edomain;
	
	public ElementLabelValueFactory(EditingDomain edomain) {
		this.edomain = edomain;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.masterdetail.IObservableFactory#createObservable(java.lang.Object)
	 */
	@Override
	public IObservable createObservable(Object target) {
		
		if (target instanceof EObject){
			List<Object> items = new ArrayList<Object>();
			
			items.add(((EObject) target).eClass().getName());
			
			for(EAttribute eattr : ((EObject) target).eClass().getEAllAttributes()){
				if (eattr.isMany()){
					
				}else{
					items.add(" ");
					items.add(EMFEditProperties.value(edomain, eattr).observe(target));
				}
			}
			
			return UtilObservables.concatenate(items.toArray());
		}
		
		return Observables.constantObservableValue(""+target);
	}

}
