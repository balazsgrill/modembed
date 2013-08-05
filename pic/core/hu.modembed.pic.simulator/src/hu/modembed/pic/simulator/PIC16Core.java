/**
 * 
 */
package hu.modembed.pic.simulator;

import hu.modembed.simulator.IByte;
import hu.modembed.simulator.IWord;
import hu.modembed.simulator.impl.AbstractCore;
import hu.modembed.simulator.impl.ByteInMemory;

/**
 * @author balazs.grill
 *
 */
public abstract class PIC16Core extends AbstractCore{
	
	/**
	 * Extend address with the currently selected bank.
	 * 
	 * @param address
	 * @return
	 */
	protected abstract long bank(long address);
	
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
	
	/**
	 * 0: C
	 * 1: DC
	 * 2: Z
	 */
	protected final IByte STATUS = new ByteInMemory(memory(), 3);
	
	protected void setZ(boolean b){
		if (b){
			STATUS.set(STATUS.get() | 4);
		}else{
			STATUS.set(STATUS.get() & ~4);
		}
	}

	protected void setC(boolean b){
		if (b){
			STATUS.set(STATUS.get() | 1);
		}else{
			STATUS.set(STATUS.get() & ~1);
		}
	}
	
	public void ADDWF(long f, long d){
		int v = memory().getValue(bank(f));
		v += W().get();
		setC(v > 255);
		v = v&0xFF;
		setZ(v == 0);
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
		setZ(v == 0);
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
	public void MOVF(long f, long d){
		int v = memory().getValue(bank(f));
		setZ(v == 0);
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
	public void CLRF(long f){
		memory().setValue(bank(f), 0);
	}
	
	public void SUBWF(long f, long d){
		int v = memory().getValue(bank(f));
		v -= W().get();
		setC(v < 0);
		if (v < 0){
			v += 255;
		}
		v = v&0xFF;
		setZ(v == 0);
		if (d == 0){
			W().set(v);
		}else{
			memory().setValue(bank(f), v);
		}
	}
	
	public void BTFSC(long f, long b){
		int v = memory().getValue(bank(f));
		int bit = (int)(1<<b);
		boolean set = (v & bit) != 0;
		
		if (!set){
			PC().set(PC().get()+1);
		}
	}
	
	public void BTFSS(long f, long b){
		int v = memory().getValue(bank(f));
		int bit = (int)(1<<b);
		boolean set = (v & bit) != 0;
		
		if (set){
			PC().set(PC().get()+1);
		}
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
	
	public void BCF(long f, long b){
		long v = memory().getValue(bank(f));
		long mask = (~(1<<b)) & 0xFF;
		v = v & mask;
		memory().setValue(bank(f), (int) v);
	}
	
	public void BSF(long f, long b){
		long v = memory().getValue(bank(f));
		long mask = (1<<b);
		v = (v | mask) & 0xFF;
		memory().setValue(bank(f), (int) v);
	}
}
