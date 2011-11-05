/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.generic.ram;

import hu.cubussapiens.modembed.pic.simulator.IMemory;
import hu.cubussapiens.modembed.pic.simulator.IPeripheral;
import hu.cubussapiens.modembed.pic.simulator.IProgramContext;

/**
 * @author balazs.grill
 *
 */
public class SimpleRAM implements IMemory, IPeripheral {

	private final long[] data;
	
	private final int startaddr;
	
	public SimpleRAM(int startaddr, int size) {
		data = new long[size];
		this.startaddr = startaddr;
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.pic.simulator.IMemory#getValue(long)
	 */
	@Override
	public long getValue(long addr) {
		if (addr < 0) return 0;
		if (addr >= data.length) return 0;
		return data[(int)addr];
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.pic.simulator.IMemory#setValue(long, long)
	 */
	@Override
	public void setValue(long addr, long value) {
		if (addr < 0) return;
		if (addr >= data.length) return;
		data[(int)addr] = value;
	}

	@Override
	public void register(IProgramContext context) {
		context.mapMemorySegment(this, startaddr, data.length);
	}

}
