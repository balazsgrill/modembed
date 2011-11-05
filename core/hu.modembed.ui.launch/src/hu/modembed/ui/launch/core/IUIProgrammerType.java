/**
 * 
 */
package hu.modembed.ui.launch.core;

import org.eclipse.swt.widgets.Composite;

import hu.modembed.IProgrammerType;

/**
 * @author balazs.grill
 *
 */
public interface IUIProgrammerType extends IProgrammerType{

	public IProgrammerInstanceConfigurationPane createConfigurationPane(Composite parent);
	
}
