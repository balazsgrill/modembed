/**
 * 
 */
package hu.modembed.pic.simulator.pic18.instructions;

import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.IRegisters;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractByteOrientedOperation extends AbstractPic18Operation implements IRegisters{
	
	public AbstractByteOrientedOperation(String maskprefix) {
		super(maskprefix+"daffffffff");
	}

	protected abstract long calculate(long w, long fv);
	
	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.generic.IOperation#execute(long, long, hu.modembed.pic.simulator.IProgramContext)
	 */
	@Override
	public long execute(long op, long addr, IProgramContext context) {
		boolean d = extract(op, 'd') != 0;
		long f = extract(op, 'f');
		long a = extract(op, 'a');
		
		long address = resolveAddress(f, a, context);
		
		long w = 0xFF&calculate(context.getRegisterValue(W), context.getRAM().getValue(address));
		
		if (d){
			context.getRAM().setValue(f, w);
		}else{
			context.setRegisterValue(W, w);
		}
		
		return addr+1;
	}

}
