/**
 * 
 */
package hu.modembed.pic.ui.tasks;

import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.hexfile.persistence.HexFileResource;

/**
 * @author balazs.grill
 *
 */
public class ConfigUtils {

	public static int getByte(HexFile hexfile, long address){
		for(Entry e : hexfile.getEntries()){
			long from = e.getAddress();
			long to = from+e.getData().length;
			if (address >= from && address < to){
				int index = (int)(address-from);
				return HexFileResource.byteToInt(e.getData()[index]);
			}
		}
		return -1;
	}
	
	public static long mask(int bits){
		long mask = 0;
		for(int i=0;i<bits;i++){
			mask += 1<<i;
		}
		return mask;
	}
	
	public static long insertValue(long value, long start, int size, long insertedValue){
		long ivalue = insertedValue<<start;
		long mask = mask(size)<<start;
		
		return (value & ~mask) | (ivalue & mask);
	}
	
}
