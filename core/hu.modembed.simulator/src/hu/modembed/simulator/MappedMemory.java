/**
 * 
 */
package hu.modembed.simulator;

import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class MappedMemory implements IMemory {

	private static class MemorySegment{
		public final long address;
		public final IMemory memory;
	
		public MemorySegment(long address, IMemory memory) {
			this.address = address;
			this.memory = memory;
		}
		
		public long end(){
			return address + memory.getSize();
		}
	}
	
	public void addSegment(long address, IMemory segment){
		segments.add(new MemorySegment(address, segment));
	}
	
	private final List<MemorySegment> segments = new LinkedList<MemorySegment>();
	
	@Override
	public long getSize() {
		long size = 0;
		for(MemorySegment ms : segments){
			size = Math.max(size, ms.end());
		}
		return size;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IMemory#setValue(long, int)
	 */
	@Override
	public void setValue(long address, int value) {
		for(MemorySegment ms : segments){
			if (address >= ms.address && address < ms.end()){
				ms.memory.setValue(address-ms.address, value);
			}
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IMemory#getValue(long)
	 */
	@Override
	public int getValue(long address) {
		for(MemorySegment ms : segments){
			if (address >= ms.address && address < ms.end()){
				return ms.memory.getValue(address-ms.address);
			}
		}
		return 0;
	}

}
