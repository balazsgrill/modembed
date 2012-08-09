/**
 * 
 */
package hu.modembed.ui.databinding.impl;

import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;

/**
 * @author balazs.grill
 *
 */
public class ConcatenatedString extends ComputedValue {

	private final Object[] objects;
	
	public ConcatenatedString(Object...objects) {
		this.objects = objects;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.value.ComputedValue#calculate()
	 */
	@Override
	protected Object calculate() {
		StringBuilder sb = new StringBuilder();
		
		for (Object o : objects){
			if (o instanceof IObservableValue){
				sb.append(((IObservableValue) o).getValue());
			}else{
				sb.append(o);
			}
		}
		
		return sb.toString();
	}

	@Override
	public Object getValueType() {
		return String.class;
	}
	
}
