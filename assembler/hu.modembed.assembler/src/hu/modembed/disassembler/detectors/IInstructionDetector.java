/**
 * 
 */
package hu.modembed.disassembler.detectors;

import hu.modembed.disassembler.InstructionInstance;


/**
 * @author balazs.grill
 *
 */
public interface IInstructionDetector {

	public InstructionInstance getNextInstance(byte[] data, int index);
	
}
