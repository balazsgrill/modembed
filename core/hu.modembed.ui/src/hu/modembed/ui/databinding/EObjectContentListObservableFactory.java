/**
 * 
 */
package hu.modembed.ui.databinding;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @author balazs.grill
 *
 */
public class EObjectContentListObservableFactory implements IObservableFactory {

	private final EditingDomain edomain;
	
	public EObjectContentListObservableFactory(EditingDomain edomain) {
		this.edomain = edomain;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.masterdetail.IObservableFactory#createObservable(java.lang.Object)
	 */
	@Override
	public IObservable createObservable(Object target) {
		
		if (target instanceof ResourceSet){
			return Observables.staticObservableList(((ResourceSet) target).getResources());
			//return EMFObservables.
		}
		
		if (target instanceof Resource){
			IObservableList errors = Observables.staticObservableList(((Resource) target).getErrors());
			return UtilObservables.append(
					EMFProperties.resource().observe(target),
					errors);
		}
		
		if (target instanceof EObject){
			List<EReference> refs = ((EObject) target).eClass().getEAllContainments();
			List<IObservableList> lists = new ArrayList<IObservableList>(refs.size());
			
			for (EReference ref : refs){
				lists.add(EMFEditProperties.list(edomain, ref).observe(target));
			}
			
			return UtilObservables.append(lists.toArray(new IObservableList[lists.size()]));
		}
		
		return Observables.emptyObservableList();
	}

}
