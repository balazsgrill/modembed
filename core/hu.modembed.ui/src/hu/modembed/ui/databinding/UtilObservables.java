/**
 * 
 */
package hu.modembed.ui.databinding;

import hu.modembed.ui.databinding.impl.ObservableListAppend;

import org.eclipse.core.databinding.observable.list.IObservableList;

/**
 * @author balazs.grill
 *
 */
public final class UtilObservables {

	private UtilObservables() {}
	
	public static IObservableList append(IObservableList...lists){
		return new ObservableListAppend(lists);
	}
	
}
