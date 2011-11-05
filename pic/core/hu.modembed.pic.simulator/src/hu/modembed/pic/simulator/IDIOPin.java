/**
 * 
 */
package hu.modembed.pic.simulator;

/**
 * @author balazs.grill
 *
 */
public interface IDIOPin {

	public boolean isInput();
	
	public boolean getValue();
	
	public void setValue(boolean v);
	
}
