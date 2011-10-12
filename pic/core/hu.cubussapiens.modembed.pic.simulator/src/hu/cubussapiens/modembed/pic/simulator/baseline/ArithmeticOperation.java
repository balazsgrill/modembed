/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator.baseline;

import hu.cubussapiens.modembed.pic.simulator.IProgramContext;
import hu.cubussapiens.modembed.pic.simulator.generic.AbstractOperation;

/**
 * @author balazs.grill
 *
 */
public abstract class ArithmeticOperation extends AbstractOperation implements IRegisters{
	
	public ArithmeticOperation(String mask) {
		super(mask);
	}

	protected abstract long calculate(long w, long fv);
	
	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.pic.simulator.generic.IOperation#execute(long, long, hu.cubussapiens.modembed.pic.simulator.IProgramContext)
	 */
	@Override
	public long execute(long op, long addr, IProgramContext context) {
		boolean d = true;
		if (mask.contains("d")) d = extract(op, 'd') != 0;
		long f = extract(op, 'f');
		
		long w = 0xFF&calculate(context.getRegisterValue(W), context.getRAM().getValue(f));
		
		if (d){
			context.getRAM().setValue(f, w);
		}else{
			context.setRegisterValue(W, w);
		}
		
		return addr+1;
	}

}
