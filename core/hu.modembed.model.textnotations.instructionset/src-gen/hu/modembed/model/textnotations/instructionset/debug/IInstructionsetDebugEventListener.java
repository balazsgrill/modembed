/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.debug;

public interface IInstructionsetDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(hu.modembed.model.textnotations.instructionset.debug.InstructionsetDebugMessage message);
}
