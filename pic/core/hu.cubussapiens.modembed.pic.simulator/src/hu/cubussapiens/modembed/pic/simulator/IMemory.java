/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator;

/**
 * @author balazs.grill
 *
 */
public interface IMemory {

	public long getValue(long addr);
	
	public void setValue(long addr, long value);
	
}
