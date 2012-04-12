/**
 * 
 */
package hu.modembed.pic.simulator.pic16;

import hu.modembed.pic.simulator.generic.AbstractPicCore;
import hu.modembed.pic.simulator.generic.IOperation;
import hu.modembed.pic.simulator.pic16.instructions.Pic16ArithmeticOperation;

/**
 * @author balazs.grill
 *
 */
public class Pic16Core extends AbstractPicCore {

	private static final IOperation[] ops = new IOperation[]{
		//ADDWF
		new Pic16ArithmeticOperation("000111dfffffff") {
			
			@Override
			protected long calculate(long w, long fv) {
				return w+fv;
			}
		},
	};
	
	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.generic.AbstractPicCore#getOperation(long)
	 */
	@Override
	protected IOperation getOperation(long opcode) {
		for (IOperation op : ops){
			if (op.check(opcode)) return op;
		}
		return null;
	}

}
