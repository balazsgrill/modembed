/**
 * 
 */
package hu.modembed.pic.simulator;

import hu.modembed.simulator.IByte;
import hu.modembed.simulator.ICore;
import hu.modembed.simulator.IMemory;
import hu.modembed.simulator.IWord;

/**
 * @author balazs.grill
 *
 */
public abstract class PIC16Core implements ICore{
	
	/**
	 * Extend address with the currently selected bank.
	 * 
	 * @param address
	 * @return
	 */
	protected abstract long bank(long address);
	
	protected abstract IMemory memory();
	
	/**
	 * Working register
	 * @return
	 */
	protected abstract IByte W();
	
	/**
	 * Program counter
	 * @return
	 */
	protected abstract IWord PC();
	
	public void ADDWF(long f, long d){
		int v = memory().getValue(bank(f));
		v += W().get();
		v = v&0xFF;
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
	public void ANDWF(long f, long d){
		int v = memory().getValue(bank(f));
		v &= W().get();
		v = v&0xFF;
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
	public void CLRF(long f){
		memory().setValue(bank(f), 0);
	}
	
	public void CLRW(){
		W().set(0);
	}
	
	public void GOTO(long k){
		PC().set(k);
	}
	
	public void MOVLW(long k){
		W().set((int)k);
	}
	
	public void MOVWF(long f){
		memory().setValue(bank(f), W().get());
	}
}
