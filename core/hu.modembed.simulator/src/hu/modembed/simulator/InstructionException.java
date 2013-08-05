/**
 * 
 */
package hu.modembed.simulator;

/**
 * @author balazs.grill
 *
 */
public class InstructionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3876826092465391847L;

	public InstructionException(long programCounter, Throwable cause) {
		super("Simulation error at 0x"+Long.toHexString(programCounter), cause);
	}
	
	public InstructionException(long programCounter) {
		this(programCounter, null);
	}
	
}
