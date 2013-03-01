/**
 * 
 */
package hu.modembed.pic.ui.tasks;

import hexfile.Entry;
import hexfile.HexFile;
import hu.modembed.hexfile.persistence.HexFileResource;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigWord;

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
	
	public static long allFieldMask(ConfigWord word){
		long v = 0;
		for(ConfigField f : word.getFields()){
			v |= mask(f.getSize()) << f.getStart();
		}
		return v;
	}
	
	/**
	 * Heuristic method to calculate implemented bits mask of a configuration word.
	 * 
	 * @param word
	 * @return
	 */
	public static long configImplMask(ConfigWord word){
		long implMask = word.getImplMask();
		long fieldMask = allFieldMask(word);
		long mask = 0;
		for(int i=0;i<63;i++){
			long nmask = mask | (1<<i);
			if (nmask > implMask) return mask | fieldMask;
			mask = nmask;
		}
		return implMask | fieldMask;
	}
	
	public static long insertValue(long value, long start, int size, long insertedValue){
		long ivalue = insertedValue<<start;
		long mask = mask(size)<<start;
		
		return (value & ~mask) | (ivalue & mask);
	}
	
}
