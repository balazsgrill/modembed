/**
 * 
 */
package hu.modembed.pic.simulator.pic18.instructions;

import hu.modembed.pic.simulator.IProgramContext;
import hu.modembed.pic.simulator.generic.AbstractOperation;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractPic18Operation extends AbstractOperation {

	public static final long BSR_ADDRESS = 0xFE0;
	public static final long BSR_LIMIT = 0x60;
	
	public AbstractPic18Operation(String mask) {
		super(mask);
	}

	/**
	 * Resolves banked file register address
	 * @param f
	 * @param context
	 * @return
	 */
	protected long resolveAddress(long f,long a, IProgramContext context){
		f = f&0xFF;
		if (a == 1){
			long bsr = context.getRAM().getValue(BSR_ADDRESS);
			return f+(bsr<<8);
		}else{
			if (f >= BSR_LIMIT){
				return 0xF00 + f;
			}else{
				return f;
			}
		}
		
	}

}
