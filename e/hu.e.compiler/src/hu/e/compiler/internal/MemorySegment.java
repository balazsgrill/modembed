/**
 * 
 */
package hu.e.compiler.internal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class MemorySegment {

	private final int start;
	private final int size;
	
	private int[][] data;
	
	public int getStart() {
		return start;
	}
	
	public int getSize() {
		return size;
	}
	
	public MemorySegment(int start, int end) {
		this.start = start;
		this.size = end-start+1;
		data = new int[][]{ new int[]{start, size, 0} };
	}
	
	public int freespace(){
		int s = 0;
		for(int[] d : data){
			if (d[2] == 0){
				s += d[1];
			}
		}
		return s;
	}
	
	public int allocate(int varsize){
		List<int[]> newdata = new ArrayList<int[]>(data.length+1);
		int addr = -1;
		for(int[] d : data){
			if (addr == -1 && d[2] == 0 && d[1]>=varsize){
				//allocate
				newdata.add(new int[]{d[0],varsize,1});
				if (d[1] > varsize){
					//free space
					newdata.add(new int[]{d[0]+varsize,d[1]-varsize,0});
					addr = d[0];
				}
			}else{
				newdata.add(d);
			}
			
		}
		if (addr != -1) data = newdata.toArray(new int[newdata.size()][]);
		return addr;
	}
	
	public void release(int addr){
		List<int[]> newdata = new ArrayList<int[]>(data.length);
		int fstart = this.start;
		int fsize = 0;
		for(int[] d : data){
			if (d[2] == 0 || d[0] == addr){
				//it's free
				fsize += d[1];
			}else{
				//if there is previous free, add it before the allocated one
				if (fsize > 0){
					newdata.add(new int[]{fstart,fsize,0});
					fsize = 0;
				}
				newdata.add(d);
				fstart = d[0]+d[1];
			}
		}
		//Add free segments at the end of the list
		if (fsize > 0){
			newdata.add(new int[]{fstart,fsize,0});
			fsize = 0;
		}
		
		data = newdata.toArray(new int[newdata.size()][]);
	}
	
}
