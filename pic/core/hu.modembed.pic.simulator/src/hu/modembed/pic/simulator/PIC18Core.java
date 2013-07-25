/**
 * 
 */
package hu.modembed.pic.simulator;

import hu.modembed.simulator.IBit;
import hu.modembed.simulator.IByte;
import hu.modembed.simulator.IWord;
import hu.modembed.simulator.impl.AbstractCore;
import hu.modembed.simulator.impl.BitInByte;
import hu.modembed.simulator.impl.ByteInMemory;
import hu.modembed.simulator.impl.WritableWord;

/**
 * @author balazs.grill
 *
 */
public abstract class PIC18Core extends AbstractCore {

	/**
	 * Extend address with the currently selected bank.
	 * 
	 * The Access Bank consists of the first 96 bytes of memory
(00h-5Fh) in Bank 0 and the last 160 bytes of memory
(60h-FFh) in Block 15.
	 * 
	 * @param address
	 * @return
	 */
	protected long bank(long address, long access){
		int bank = BSR.get();
		long addr = address & 0xFF;
		if (access != 0){
			if (addr >= 0x60){
				bank = 15;
			}
		}
		return (bank << 8) + (addr);
	}
	
	/**
	 * Working register
	 * @return
	 */
	protected final IByte W = new ByteInMemory(memory(), 0xFE8);
	
	protected final IByte STATUS = new ByteInMemory(memory(), 0xFD8);
	
	protected final IBit C = new BitInByte(STATUS, 0);
	protected final IBit Z = new BitInByte(STATUS, 2);
	
	/**
	 * Program counter
	 * @return
	 */
	protected final IWord PC = new WritableWord();

	/**
	 * Bank select register is mapped to 0xFE0 (in pic18f14K50, to check in other devices)
	 */
	protected final IByte BSR = new ByteInMemory(memory(), 0xFE0);
	
	public void MOVLW(long k){
		W.set((int)k);
	}
	
	public void MOVLB(long k){
		BSR.set((int)k);
	}
	
	public void MOVWF(long f, long a){
		memory().setValue(bank(f, a), W.get());
	}
	
	public void CLRF(long f, long a){
		memory().setValue(bank(f, a), 0);
	}
	
	public void MOVF(long f, long d, long a){
		int v = memory().getValue(bank(f, a));
		Z.set(v == 0);
		if (d == 0){
			W.set(v);
		}else{
			memory().setValue(bank(f, a), v);
		}
	}
	
	public void SUBWF(long f, long d, long a){
		int v = memory().getValue(bank(f, a));
		v -= W.get();
		C.set(v < 0);
		if (v < 0){
			v += 255;
		}
		v = v&0xFF;
		Z.set(v == 0);
		if (d == 0){
			W.set(v);
		}else{
			memory().setValue(bank(f, a), v);
		}
	}
	
	public void BTFSC(long f, long b, long a){
		int v = memory().getValue(bank(f, a));
		int bit = (int)(1<<b);
		boolean set = (v & bit) != 0;
		
		if (!set){
			PC.set(PC.get()+1);
		}
	}
	
	public void BTFSS(long f, long b, long a){
		int v = memory().getValue(bank(f, a));
		int bit = (int)(1<<b);
		boolean set = (v & bit) != 0;
		
		if (set){
			PC.set(PC.get()+1);
		}
	}
	
	public void BCF(long f, long b, long a){
		long v = memory().getValue(bank(f, 1));
		long mask = (~(1<<b)) & 0xFF;
		v = v & mask;
		memory().setValue(bank(f, a), (int) v);
	}
	
	public void BSF(long f, long b, long a){
		long v = memory().getValue(bank(f, a));
		long mask = (1<<b);
		v = (v | mask) & 0xFF;
		memory().setValue(bank(f, a), (int) v);
	}
	
	public void GOTO(long k){
		PC.set(k);
	}
}
