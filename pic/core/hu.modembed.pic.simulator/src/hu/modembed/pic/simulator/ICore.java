/**
 * 
 */
package hu.modembed.pic.simulator;

/**
 * @author balazs.grill
 *
 */
public interface ICore {

	public void setProgramMem(IMemory mem);
	
	public IMemory getProgramMem();
	
	/**
	 * Execute the operation at the program counter "pc" in the program memory.
	 * This method returns the next pc value.
	 * @param pc
	 * @param context
	 * @return
	 */
	public long execute(long pc, IProgramContext context);
	
}
