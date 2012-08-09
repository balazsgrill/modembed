/**
 * 
 */
package hu.modembed.ui.databinding;

import hu.modembed.ui.databinding.impl.ConcatenatedString;
import hu.modembed.ui.databinding.impl.ObservableListAppend;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;

/**
 * @author balazs.grill
 *
 */
public final class UtilObservables {

	private UtilObservables() {}
	
	public static IObservableList append(IObservableList...lists){
		return new ObservableListAppend(lists);
	}
	
	public static IObservableValue concatenate(Object...objects){
		return new ConcatenatedString(objects);
	}
	
}
