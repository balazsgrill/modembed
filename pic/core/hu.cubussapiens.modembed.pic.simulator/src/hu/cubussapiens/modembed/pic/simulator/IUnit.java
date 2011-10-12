/**
 * 
 */
package hu.cubussapiens.modembed.pic.simulator;

import hexfile.HexFile;

/**
 * @author balazs.grill
 *
 */
public interface IUnit {

	public void loadProgram(HexFile hexfile);
	
	public void reset();
	
	public void step();
	
	public long getProgramCounter();
	
	public IDIOPin[] getIOPins();
	
}
