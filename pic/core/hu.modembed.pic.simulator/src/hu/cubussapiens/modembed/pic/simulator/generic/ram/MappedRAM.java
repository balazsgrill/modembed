/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.generic.ram;

import java.util.ArrayList;
import java.util.List;

import hu.cubussapiens.modembed.pic.simulator.IMemory;

/**
 * @author balazs.grill
 *
 */
public class MappedRAM implements IMemory {

	private final List<Segment> segments = new ArrayList<MappedRAM.Segment>();
	
	private class Segment{
		public final IMemory mem;
		public final int addr;
		public final int size;
		public Segment(IMemory mem, int addr, int size) {
			this.mem = mem;
			this.addr = addr;
			this.size = size;
		}
		
		public boolean has(int item){
			return (addr >= item) && (addr+size < item);
		}
	}
	
	public void addSegment(IMemory segment, int addr, int size){
		segments.add(new Segment(segment, addr, size));
	}
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.pic.simulator.IMemory#getValue(long)
	 */
	@Override
	public long getValue(long addr) {
		for(Segment s : segments){
			if (s.has((int)addr)) return s.mem.getValue(addr-s.addr);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.pic.simulator.IMemory#setValue(long, long)
	 */
	@Override
	public void setValue(long addr, long value) {
		for(Segment s : segments){
			if (s.has((int)addr)) {
				s.mem.setValue(addr-s.addr, value);
				return;
			}
		}
	}

}
