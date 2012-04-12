/**
 * 
 */
package hu.modembed.pic.simulator.pic16.instructions;

import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.AbstractOperation;

/**
 * @author balazs.grill
 *
 */
public abstract class Pic16Op extends AbstractOperation {

	/**
	 * @param mask
	 */
	public Pic16Op(String mask) {
		super(mask);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.generic.IOperation#execute(long, long, hu.modembed.pic.simulator.IProgramContext)
	 */
	@Override
	public long execute(long op, long addr, IProgramContext context) {
		// TODO Auto-generated method stub
		return 0;
	}

}
