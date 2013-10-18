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
public class AppendedList<T> extends AbstractList<T> {

	private final int index;
	private final List<T> list;
	private final T element;
	
	/**
	 * 
	 */
	public AppendedList(List<T> list, T element) {
		this.index = list.size();
		this.list = list;
		this.element = element;
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractList#get(int)
	 */
	@Override
	public T get(int index) {
		if (index == this.index) return element;
		return list.get(index);
	}

	/* (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		return index+1;
	}

}
