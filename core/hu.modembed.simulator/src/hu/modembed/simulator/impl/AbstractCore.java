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

	private IMemory coreMemory;
	
	protected abstract IMemory createCoreMemory();

	/* (non-Javadoc)
	 * @see hu.modembed.simulator.ICore#memory()
	 */
	@Override
	public IMemory memory() {
		if (coreMemory == null){
			coreMemory = createCoreMemory();
		}
		return coreMemory;
	}

}
