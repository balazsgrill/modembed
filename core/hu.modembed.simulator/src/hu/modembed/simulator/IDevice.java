/**
 * 
 */
package hu.modembed.simulator;

/**
 * @author balazs.grill
 *
 */
public interface IDevice {

	public ICore getCore();
	
	public IWord getProgramCounter();
	
	public IMemory getMemory();
	
}
