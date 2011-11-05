/**
 * 
 */
package hu.modembed.debug.com.rs232;

import java.util.Properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import hu.modembed.IProgrammerInstance;
import hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;
import hu.modembed.ui.launch.core.IUIProgrammerType;

/**
 * @author balazs.grill
 *
 */
public class RS232DebugConnectionType implements IUIProgrammerType {

	public static final String ID = "hu.modembed.debug.com.rs232";
	
	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerType#detectInstances()
	 */
	@Override
	public IProgrammerInstance[] detectInstances() {
		return new IProgrammerInstance[0];
	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerType#createInstance(java.util.Properties)
	 */
	@Override
	public IProgrammerInstance createInstance(Properties props) {
		return new RS232DebugConnectionInstance(this);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.IProgrammerType#getID()
	 */
	@Override
	public String getID() {
		return ID;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IUIProgrammerType#createConfigurationPane(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public IProgrammerInstanceConfigurationPane createConfigurationPane(
			Composite parent) {
		return new RS232DebugConnectionConfigurationPane(parent, SWT.NONE);
	}

}
