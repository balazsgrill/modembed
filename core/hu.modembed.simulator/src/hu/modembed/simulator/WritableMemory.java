/**
 * 
 */
package hu.modembed.simulator;

/**
 * @author balazs.grill
 *
 */
public class WritableMemory implements IMemory {

	private final int[] data;
	
	public WritableMemory(int size) {
		data = new int[size];
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IMemory#getSize()
	 */
	@Override
	public long getSize() {
		return data.length;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IMemory#setValue(long, int)
	 */
	@Override
	public void setValue(long address, int value) {
		if (address >= 0 && address < data.length){
			data[(int)address] = value;
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IMemory#getValue(long)
	 */
	@Override
	public int getValue(long address) {
		if (address >= 0 && address < data.length){
			return data[(int)address];
		}
		return 0;
	}

}
