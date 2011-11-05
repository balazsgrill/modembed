/**
 * 
 */
package hu.modembed.pic.simulator.baseline;

import hu.modembed.pic.simulator.IDIOPin;
import hu.modembed.pic.simulator.IMemory;
import hu.modembed.pic.simulator.IPeripheral;
import hu.modembed.pic.simulator.IProgramContext;

/**
 * @author balazs.grill
 *
 */
public class PortPeripheral implements IPeripheral, IMemory {

	public static final int GPIO = 0x06;
	
	public int port = 0;
	public int tris = 0;
	
	private class Pin implements IDIOPin{
		private final int mask;

		public Pin(int index) {
			mask = 1<<index;
		}
		
		@Override
		public boolean isInput() {
			//input : tris[i] == 1
			return (tris&mask) != 0;
		}

		@Override
		public boolean getValue() {
			return (port&mask) != 0;
		}

		@Override
		public void setValue(boolean v) {
			port = port | mask;
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.IPeripheral#register(hu.modembed.pic.simulator.generic.ram.MappedRAM, hu.modembed.pic.simulator.IProgramContext)
	 */
	@Override
	public void register(IProgramContext context) {
		context.mapMemorySegment(this, GPIO, 1);
	}

	@Override
	public long getValue(long addr) {
		switch ((int)addr) {
		case 0:
			return port;
		}
		return 0;
	}

	@Override
	public void setValue(long addr, long value) {
		switch ((int)addr) {
		case 0:
			port = (int)value;
			return;
		}
	}

	private final IDIOPin[] pins = new IDIOPin[]{
			new Pin(0),
			new Pin(1),
			new Pin(2),
			new Pin(3),
			new Pin(4),
			new Pin(5),
	};
	
	public IDIOPin[] getPins(){
		return pins;
	}

	public void setTris(int tris){
		this.tris = tris;
	}
	
}
