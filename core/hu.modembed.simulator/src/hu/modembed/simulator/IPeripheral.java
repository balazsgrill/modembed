/**
 * 
 */
package hu.modembed.simulator;

import hu.modembed.simulator.impl.MappedMemory;

/**
 * @author balazs.grill
 *
 */
public interface IPeripheral {

	public void install(MappedMemory memory);
	
}
