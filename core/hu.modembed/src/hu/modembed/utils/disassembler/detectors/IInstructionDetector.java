/**
 * 
 */
package hu.modembed.utils.disassembler.detectors;

import hu.modembed.utils.disassembler.InstructionInstance;


/**
 * @author balazs.grill
 *
 */
public interface IInstructionDetector {

	public InstructionInstance getNextInstance(byte[] data, int index);
	
}
