/**
 * 
 */
package hu.e.compiler;

import hu.e.compiler.list.MemoryAssignment;

/**
 * @author balazs.grill
 *
 */
public interface IOptimizerContext {

	/**
	 * Return the currently mapped address of the given memory assignment
	 * 
	 * @param ma
	 * @return
	 */
	public long getMappedAddress(MemoryAssignment ma);
	
}
