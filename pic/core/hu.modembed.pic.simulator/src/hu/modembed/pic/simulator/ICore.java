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
	
	public long execute(long pc, IProgramContext context);
	
}
