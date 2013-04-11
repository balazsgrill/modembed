/**
 * 
 */
package hu.modembed.utils;

import hu.modembed.hexfile.persistence.HexFileResource;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class MODembedTool {

	public byte[] numberListToByteArray(List<?> list){
		byte[] data = new byte[list.size()];
		for(int i = 0;i<data.length;i++){
			Object o = list.get(i);
			if (o instanceof Number){
				int v = ((Number) o).intValue();
				data[i] = HexFileResource.intToByte(v);
			}
		}
		return data;
	}

}
