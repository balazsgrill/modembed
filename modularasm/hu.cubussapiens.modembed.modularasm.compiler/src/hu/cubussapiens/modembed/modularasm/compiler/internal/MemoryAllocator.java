/**
 * 
 */
package hu.cubussapiens.modembed.modularasm.compiler.internal;

import java.util.ArrayList;
import java.util.List;

import memory.MemSegment;


/**
 * @author balazs.grill
 *
 */
public class MemoryAllocator {

	private final List<MemSegment> segments = new ArrayList<MemSegment>();
	
	private int current = 0;
	
	private int counter = 0;
	
	public MemoryAllocator(List<? extends MemSegment> segments) {
		this.segments.addAll(segments);
	}
	
	private MemSegment getAvailable(int size){
		MemSegment ms = segments.get(current);
		if (ms.getSize() < counter+size){
			current++;
			counter=0;
		}
		return segments.get(current);
	}
	
	public long allocate(int size){
		MemSegment ms = getAvailable(size);
		long result = ms.getStartAddr()+counter;
		counter += size;
		return result;
	}
	
}
