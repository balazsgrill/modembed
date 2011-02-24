/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.configt;

import java.util.HashSet;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public abstract class PropertyField {

	private final Set<IValueListener> listeners = new HashSet<IValueListener>();

	public boolean addListener(IValueListener arg0) {
		return listeners.add(arg0);
	}

	public boolean removeListener(IValueListener arg0) {
		return listeners.remove(arg0);
	}
	
	protected void fireValueChangeEvent(String property, String value){
		for(IValueListener l : listeners)
			l.valueChanged(property, value);
	}
	
	public abstract void setValue(String value);
	
}
