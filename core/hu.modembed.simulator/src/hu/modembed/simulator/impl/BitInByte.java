/**
 * 
 */
package hu.modembed.simulator.impl;

import hu.modembed.simulator.IBit;
import hu.modembed.simulator.IByte;

/**
 * @author balazs.grill
 *
 */
public class BitInByte implements IBit {

	private final IByte b;
	private final int idx;
	
	/**
	 * 
	 */
	public BitInByte(IByte b, int idx) {
		this.b = b;
		this.idx = idx;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IBit#set(boolean)
	 */
	@Override
	public void set(boolean value) {
		int v = b.get();
		if (value){
			v = v | (1<<idx);
		}else{
			v = v & ~(1<<idx);
		}
		b.set(v);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IBit#get()
	 */
	@Override
	public boolean get() {
		return (b.get() & (1<<idx)) != 0;
	}
	
	@Override
	public String toString() {
		return Boolean.toString(get());
	}

}
