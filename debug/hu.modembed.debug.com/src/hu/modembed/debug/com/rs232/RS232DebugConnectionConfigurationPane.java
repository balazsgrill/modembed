/**
 * 
 */
package hu.modembed.debug.com.rs232;

import java.util.Properties;

import hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author balazs.grill
 *
 */
public class RS232DebugConnectionConfigurationPane extends Composite implements
		IProgrammerInstanceConfigurationPane {

	/**
	 * @param parent
	 * @param style
	 */
	public RS232DebugConnectionConfigurationPane(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getControl()
	 */
	@Override
	public Control getControl() {
		return this;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane#getProperties()
	 */
	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

}
