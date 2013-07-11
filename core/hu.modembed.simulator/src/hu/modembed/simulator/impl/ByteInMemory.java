/**
 * 
 */
package hu.modembed.simulator.impl;

import hu.modembed.simulator.IByte;
import hu.modembed.simulator.IMemory;

/**
 * @author balazs.grill
 *
 */
public class ByteInMemory implements IByte {

	private final IMemory memory;
	private final long address;
	
	public ByteInMemory(IMemory memory, long address) {
		this.address = address;
		this.memory = memory;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IByte#get()
	 */
	@Override
	public int get() {
		return memory.getValue(address);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IByte#set(int)
	 */
	@Override
	public void set(int value) {
		memory.setValue(address, value);
	}

}
