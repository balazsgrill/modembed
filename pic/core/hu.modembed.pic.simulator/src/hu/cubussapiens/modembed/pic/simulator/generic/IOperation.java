/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.generic;

import hu.cubussapiens.modembed.pic.simulator.IProgramContext;

/**
 * @author balazs.grill
 *
 */
public interface IOperation {

	public boolean check(long op);
	
	public long execute(long op, long addr, IProgramContext context);
	
}
