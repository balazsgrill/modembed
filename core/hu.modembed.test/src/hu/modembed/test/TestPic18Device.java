/**
 * 
 */
package hu.modembed.test;

import hu.modembed.pic.simulator.PIC18Core;
import hu.modembed.simulator.ICore;
import hu.modembed.simulator.IDevice;
import hu.modembed.simulator.IMemory;
import hu.modembed.simulator.IWord;
import hu.modembed.simulator.impl.WritableMemory;

/**
 * @author balazs.grill
 *
 */
public class TestPic18Device extends PIC18Core implements IDevice {

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IDevice#getCore()
	 */
	@Override
	public ICore getCore() {
		return this;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IDevice#getProgramCounter()
	 */
	@Override
	public IWord getProgramCounter() {
		return PC;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.IDevice#getMemory()
	 */
	@Override
	public IMemory getMemory() {
		return memory();
	}

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.impl.AbstractCore#createCoreMemory()
	 */
	@Override
	protected IMemory createCoreMemory() {
		return new WritableMemory(4096);
	}

}
