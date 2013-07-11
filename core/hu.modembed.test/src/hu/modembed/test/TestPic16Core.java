/**
 * 
 */
package hu.modembed.test;

import hu.modembed.pic.simulator.PIC16eCore;
import hu.modembed.simulator.IByte;
import hu.modembed.simulator.ICore;
import hu.modembed.simulator.IDevice;
import hu.modembed.simulator.IMemory;
import hu.modembed.simulator.IWord;

/**
 * @author balazs.grill
 *
 */
public class TestPic16Core extends PIC16eCore implements IDevice{

	@Override
	protected int memorySize() {
		return 128;
	}
	
	private final IByte w = new IByte() {
		
		private int value;
		
		@Override
		public void set(int value) {
			this.value = value;
		}
		
		@Override
		public int get() {
			return value;
		}
	};
	
	private final IWord pc = new IWord() {
		
		private long value;
		
		@Override
		public void set(long value) {
			this.value = value;
		}
		
		@Override
		public long get() {
			return value;
		}
	};

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.PIC16Core#memory()
	 */
	@Override
	protected IMemory memory() {
		return memory;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.PIC16Core#W()
	 */
	@Override
	protected IByte W() {
		return w;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.PIC16Core#PC()
	 */
	@Override
	protected IWord PC() {
		return pc;
	}

	@Override
	public ICore getCore() {
		return this;
	}

	@Override
	public IWord getProgramCounter() {
		return PC();
	}

	@Override
	public IMemory getMemory() {
		return memory;
	}

}
