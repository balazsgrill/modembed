/**
 * 
 */
package hu.modembed.simulator.impl;

import hu.modembed.simulator.IMemory;
import hu.modembed.simulator.IWord;

/**
 * @author balazs.grill
 *
 */
public class WordInMemory implements IWord {

	private final IMemory memory;
	private final long address;
	private final int size;
	
	/**
	 * 
	 */
	public WordInMemory(IMemory memory, long address, int size) {
		this.memory = memory;
		this.address = address;
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IWord#set(long)
	 */
	@Override
	public void set(long value) {
		for(int i=0;i<size;i++){
			int b = (int)((value >> (i*8)) & 0xFF);
			memory.setValue(address+i, b);
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IWord#get()
	 */
	@Override
	public long get() {
		long v = 0;
		for(int i=0;i<size;i++){
			v += memory.getValue(address+i)<<(i*8);
		}
		return v;
	}

}
