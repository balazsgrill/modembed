/**
 * 
 */
package hu.e.compiler.internal.model;

/**
 * @author balazs.grill
 *
 */
public class AddressedStep implements IProgramStep {
	
	public int address = -1;
	
	@Override
	public String toString() {
		return "label Code("+address+")";
	}
	
}
