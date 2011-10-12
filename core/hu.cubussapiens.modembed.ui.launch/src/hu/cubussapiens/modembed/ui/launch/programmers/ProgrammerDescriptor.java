/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.programmers;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.IProgrammerType;

/**
 * @author balazs.grill
 *
 */
public class ProgrammerDescriptor {

	public final String id;
	public final IProgrammerInstance pi;
	public final IProgrammerType pt;
	
	public ProgrammerDescriptor(String id, IProgrammerType pt, IProgrammerInstance pi) {
		this.id = id;
		this.pi = pi;
		this.pt = pt;
	}
	
}
