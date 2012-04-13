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
public class MemoryManager{
	
	private final List<MemorySegment> segments = new ArrayList<MemorySegment>();
	
	public void addSegment(int start, int end){
		segments.add(new MemorySegment(start, end));
	}
	
	public int allocate(int varsize){
		for(MemorySegment ms : segments){
			int addr = ms.allocate(varsize);
			if (addr != -1) return addr;
		}
		return -1;
	}
	
	public void release(int addr){
		for(MemorySegment ms : segments){
			if (addr >= ms.getStart() && addr < ms.getStart()+ms.getSize()){
				ms.release(addr);
			}
		}
	}
	
}
