/**
 * 
 */
package hu.modembed.pic.simulator.generic;

import hu.modembed.pic.simulator.ICore;
import hu.modembed.pic.simulator.IMemory;
import hu.modembed.pic.simulator.IProgramContext;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractPicCore implements ICore {

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
		IOperation io = getOperation(op);
		if (io != null){
			return io.execute(op, pc, context);
		}
		
		throw new IllegalArgumentException("Unrecognized operation: "+Long.toString(op, 2));
	}

	protected abstract IOperation getOperation(long opcode);
	

}
