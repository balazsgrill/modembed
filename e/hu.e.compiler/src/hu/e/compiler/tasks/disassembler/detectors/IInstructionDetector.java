/**
 * 
 */
package hu.e.compiler.tasks.disassembler.detectors;

import hu.e.compiler.tasks.disassembler.InstructionInstance;


/**
 * @author balazs.grill
 *
 */
public interface IInstructionDetector {

	public InstructionInstance getNextInstance(byte[] data, int index);
	
}
