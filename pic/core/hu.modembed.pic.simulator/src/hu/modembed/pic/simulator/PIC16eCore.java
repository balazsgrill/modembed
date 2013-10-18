/**
 * 
 */
package hu.modembed.pic.simulator;

import hu.modembed.simulator.IByte;
import hu.modembed.simulator.impl.ByteInMemory;

/**
 * @author balazs.grill
 *
 */
public abstract class PIC16eCore extends PIC16Core {

	private final IByte BSR = new ByteInMemory(memory(), 8);
	
	@Override
	protected long bank(long address) {
		return (BSR.get()*128) + address;
	}
	
	public void MOVLB(long b){
		BSR.set((int)b);
	}
	
	public void ADDWFC(long f, long d){
		int v = memory().getValue(bank(f));
		v += W().get();
		if (getC()) v++;
		setC(v > 255);
		v = v&0xFF;
		setZ(v == 0);
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
}
