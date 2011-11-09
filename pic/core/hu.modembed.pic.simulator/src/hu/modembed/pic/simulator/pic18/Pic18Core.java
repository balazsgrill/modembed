/**
 * 
 */
package hu.modembed.pic.simulator.pic18;

import hu.modembed.pic.simulator.ICore;
import hu.modembed.pic.simulator.IMemory;
import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.IOperation;

/**
 * @author balazs.grill
 *
 */
public class Pic18Core implements ICore{

	IMemory prog;
	
	@Override
	public void setProgramMem(IMemory mem) {
		this.prog = mem;
		
	}

	@Override
	public IMemory getProgramMem() {
		return prog;
	}

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

	private final IOperation[] ops = new IOperation[]{
			
	};
	
}
