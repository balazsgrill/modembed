/**
 * 
 */
package hu.modembed.pic.simulator.baseline;

import hu.modembed.pic.simulator.ICore;
import hu.modembed.pic.simulator.IMemory;
import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.AbstractOperation;
import hu.modembed.pic.simulator.generic.IOperation;
import hu.modembed.pic.simulator.generic.IRegisters;

/**
 * @author balazs.grill
 *
 */
public class PicBaselineCore implements ICore, IRegisters{
	
	IMemory prog;
	
	PortPeripheral ioPort = null;
	
	public void setIoPort(PortPeripheral ioPort) {
		this.ioPort = ioPort;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.ICore#setProgramMem(hu.modembed.pic.simulator.IMemory)
	 */
	@Override
	public void setProgramMem(IMemory mem) {
		prog = mem;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.ICore#getProgramMem()
	 */
	@Override
	public IMemory getProgramMem() {
		return prog;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.pic.simulator.ICore#execute(long, hu.modembed.pic.simulator.IProgramContext)
	 */
	@Override
	public long execute(long pc, IProgramContext context) {

		long op = prog.getValue(pc);
		for(IOperation io : ops){
			if (io.check(op)){
				return io.execute(op, pc, context);
			}
		}
		
		throw new IllegalArgumentException("Unrecognized operation: "+Long.toString(op, 2));
	}

	/**
	 * Operations
	 */
	private final IOperation[] ops = {
			/*ADDWF*/
			new ArithmeticOperation("000111dfffff") {

				@Override
				protected long calculate(long w, long fv) {
					return w+fv;
				}
			},
			
			/*ANDWF*/
			new ArithmeticOperation("000101dfffff") {

				@Override
				protected long calculate(long w, long fv) {
					return w & fv;
				}
			},
			
			/*CLRF*/
			new AbstractOperation("0000011fffff") {

				@Override
				public long execute(long op, long addr, IProgramContext context) {
					long f = extract(op, 'f');
					
					context.getRAM().setValue(f,0);
					
					return addr+1;
				}
			},
			
			/*CLRW*/
			new AbstractOperation("000001000000") {
				@Override
				public long execute(long op, long addr, IProgramContext context) {
					context.setRegisterValue(W,0);
					
					return addr+1;
				}
			},
			
			/*COMF #f #d=1	0010	01 d1:d0 f5:f0*/
			new ArithmeticOperation("001001dfffff") {
				@Override
				protected long calculate(long w, long fv) {
					return ~fv;
				}

			},
	};
}
