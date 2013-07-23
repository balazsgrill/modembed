/**
 * 
 */
package hu.modembed.simulator.impl;

import hu.modembed.simulator.IWord;

/**
 * @author balazs.grill
 *
 */
public class WritableWord implements IWord {

	private long value;

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IWord#set(long)
	 */
	@Override
	public void set(long value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IWord#get()
	 */
	@Override
	public long get() {
		return this.value;
	}

}
