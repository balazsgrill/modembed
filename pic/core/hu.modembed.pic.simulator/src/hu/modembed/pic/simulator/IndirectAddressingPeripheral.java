/**
 * 
 */
package hu.modembed.pic.simulator;

import hu.modembed.simulator.IMemory;
import hu.modembed.simulator.IPeripheral;
import hu.modembed.simulator.IWord;
import hu.modembed.simulator.impl.MappedMemory;

/**
 * @author balazs.grill
 *
 */
public class IndirectAddressingPeripheral implements IPeripheral {

	private final class INDFMemory implements IMemory {
		
		private final IMemory parent;
		
		public INDFMemory(IMemory parent) {
			this.parent = parent;
		}
		
		@Override
		public void setValue(long address, int value) {
			long a = fsr.get();
			if (indfAddr == a) return;
			parent.setValue(a, value);
		}

		@Override
		public int getValue(long address) {
			long a = fsr.get();
			if (indfAddr == a) return 0;
			return parent.getValue(a);
		}

		@Override
		public long getSize() {
			return 1;
		}
	}

	private final long indfAddr;
	private final IWord fsr;
	
	/**
	 * 
	 */
	public IndirectAddressingPeripheral(long indfAddr, IWord fsr) {
		this.indfAddr = indfAddr;
		this.fsr = fsr;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IPeripheral#install(hu.modembed.simulator.impl.MappedMemory)
	 */
	@Override
	public void install(MappedMemory memory) {
		memory.addSegment(indfAddr, new INDFMemory(memory));
	}


}
