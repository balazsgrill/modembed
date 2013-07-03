/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.list.AbstractObservableList;
import org.eclipse.core.databinding.observable.list.ListDiff;

/**
 * @author balazs.grill
 *
 */
public abstract class UpdatingList extends AbstractObservableList {

	private List<?> cache = Collections.emptyList();
	
	public void update(){
		List<?> oldList = cache;
		List<?> newList = doUpdate();
		cache = newList;
		ListDiff diff = Diffs.computeListDiff(oldList, newList);
		if (!diff.isEmpty()){
			fireListChange(diff);
		}
	}
	
	protected abstract List<?> doUpdate();

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.list.AbstractObservableList#doGetSize()
	 */
	@Override
	protected int doGetSize() {
		return cache.size();
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#get(int)
	 */
	@Override
	public Object get(int index) {
		return cache.get(index);
	}

}
