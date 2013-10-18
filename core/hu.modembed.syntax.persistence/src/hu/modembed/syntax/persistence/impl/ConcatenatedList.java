/**
 * 
 */
package hu.modembed.syntax.persistence.impl;

import java.util.AbstractList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ConcatenatedList<T> extends AbstractList<T> {

	private final List<T> list1;
	private final List<T> list2;
	
	/**
	 * 
	 */
	public ConcatenatedList(List<T> list1, List<T> list2) {
		this.list1 = list1;
		this.list2 = list2;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#get(int)
	 */
	@Override
	public T get(int index) {
		if (index < list1.size()){
			return list1.get(index);
		}
		return list2.get(index-list1.size());
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		return list1.size()+list2.size();
	}

}
