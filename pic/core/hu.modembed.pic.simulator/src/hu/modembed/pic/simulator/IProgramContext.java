/**
 * 
 */
package hu.modembed.pic.simulator;

/**
 * @author balazs.grill
 *
 */
public interface IProgramContext {

	public IMemory getRAM();
	
	public long getRegisterValue(int reg);
	
	public void setRegisterValue(int reg, long v);
	
	public void mapMemorySegment(IMemory segment, int addr, int size);
	
}
