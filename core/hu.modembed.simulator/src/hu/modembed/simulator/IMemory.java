/**
 * 
 */
package hu.modembed.simulator;

/**
 * @author balazs.grill
 *
 */
public interface IMemory {

	public long getSize();
	
	public void setValue(long address, int value);
	
	public int getValue(long address);
	
}
