/**
 * 
 */
package hu.modembed.pic.simulator.generic.ram;

import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.pic.simulator.IMemory;

/**
 * @author balazs.grill
 *
 */
public class HexFileMemorySegment implements IMemory{

	private final long[] data;
	
	private final int startAddr;
	
	public HexFileMemorySegment(HexFile hex, int wordbytes, int startAddr, int maxsize) {
		long[] d = new long[0];
		this.startAddr = startAddr;
		for(Entry entry : hex.getEntries()){
			int addr = entry.getAddress()/wordbytes;
			int realaddr = addr-startAddr;
			if (startAddr <= addr && (startAddr+maxsize) < addr){
				byte[] edata = entry.getData();
				long[] part = new long[edata.length/wordbytes];
				for(int i=0;i<(edata.length/wordbytes);i++){
					long v = 0;
					for(int j=0;j<wordbytes;j++){
						int b = HexFileResource.byteToInt(edata[i*wordbytes+j]);
						v = (v<<8)+b;
					}
					part[i] = v;
				}
				if (d.length <= realaddr+part.length){
					long[] nd = new long[realaddr+part.length];
					System.arraycopy(d, 0, nd, 0, d.length);
					d = nd;
				}
				System.arraycopy(part, 0, d, realaddr, part.length);
			}
		}
		data = d;
	}

	@Override
	public long getValue(long addr) {
		int realaddr = (int)addr-startAddr;
		if (realaddr < 0) return 0;
		if (realaddr >= data.length) return 0;
		return data[realaddr];
	}

	@Override
	public void setValue(long addr, long value) {
		// READONLY!
	}
	
}
