/**
 * 
 */
package hu.cubussapiens.modembed.ui;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author balazs.grill
 *
 */
public class WrappedColumnLabelProvider extends ColumnLabelProvider {

	private final ILabelProvider labelprovider;
	
	protected Object resolve(Object obj){
		return obj;
	}
	
	public WrappedColumnLabelProvider(ILabelProvider labelprovider) {
		this.labelprovider = labelprovider;
	}
	
	@Override
	public String getText(Object element) {
		element = resolve(element);
		if (element == null) return "<Not set>";
		return labelprovider.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		element = resolve(element);
		return labelprovider.getImage(element);
	}
	
}
