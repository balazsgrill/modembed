/**
 * 
 */
package hu.modembed.simulator.impl;

import hu.modembed.simulator.ICore;
import hu.modembed.simulator.IMemory;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractCore implements ICore{

	private IMemory memory;
	
	protected abstract IMemory createCoreMemory();

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.ICore#memory()
	 */
	@Override
	public IMemory memory() {
		if (memory == null){
			
			MappedMemory mem = new MappedMemory();
			this.memory = mem;
			
			installPeripherals(mem);
			
			IMemory coreMemory = createCoreMemory();
			mem.addSegment(0, coreMemory);
		}
		return memory;
	}

	protected void installPeripherals(MappedMemory memory){
		
	}
	
}
