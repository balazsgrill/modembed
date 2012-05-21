/**
 * 
 */
package hu.e.compiler.optimizer;

import hu.e.compiler.list.InstructionStep;
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
	
	/**
	 * Return the value of the given instruction. Returns -1 if
	 * this instruction cannot be resolved currently.
	 * @param step
	 * @return
	 */
	public long getInstructionValue(InstructionStep step);
	
}
