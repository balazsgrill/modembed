/**
 * 
 */
package hu.modembed.ui;

import hu.modembed.model.core.NamedElement;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author balage
 *
 */
public class WorkbenchModelLabelProvider extends LabelProvider {

	private final WorkbenchLabelProvider lp = new WorkbenchLabelProvider();
	
	@Override
	public String getText(Object element) {
		if (element instanceof NamedElement){
			return ((NamedElement) element).getName();
		}
		return lp.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		return lp.getImage(element);
	}
	
}
