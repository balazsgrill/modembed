/**
 * 
 */
package hu.modembed.debug.com.rs232;

import java.util.Properties;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import hu.modembed.IProgrammerInstance;
import hu.modembed.IProgrammerType;

/**
 * @author balazs.grill
 *
 */
public class RS232DebugConnectionInstance implements IProgrammerInstance {

	private final RS232DebugConnectionType parent;
	
	public RS232DebugConnectionInstance(RS232DebugConnectionType parent) {
		this.parent = parent;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#isConnected()
	 */
	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public String toString() {
		return "RS232 connection";
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#initialize(java.util.Properties, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void initialize(Properties props, IProgressMonitor monitor)
			throws CoreException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#start()
	 */
	@Override
	public void start(Properties props) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#getType()
	 */
	@Override
	public IProgrammerType getType() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerInstance#fillDefaults(java.util.Properties)
	 */
	@Override
	public void fillDefaults(Properties props) {
		// TODO Auto-generated method stub

	}

}
