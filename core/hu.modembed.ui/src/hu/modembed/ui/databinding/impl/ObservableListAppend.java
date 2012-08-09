/**
 * 
 */
package hu.modembed.ui.databinding.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.list.ComputedList;
import org.eclipse.core.databinding.observable.list.IObservableList;

/**
 * @author balazs.grill
 *
 */
public class ObservableListAppend extends ComputedList {

	private final IObservableList[] lists;
	
	public ObservableListAppend(IObservableList...lists) {
		this.lists = lists;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.list.ComputedList#calculate()
	 */
	@Override
	protected List<?> calculate() {
		int size = 0;
		for (IObservableList l : lists){
			size += l.size();
		}
		List<Object> result = new ArrayList<Object>(size);
		for (IObservableList l : lists){
			result.addAll((List<?>)l);
		}
		return result;
	}

}
