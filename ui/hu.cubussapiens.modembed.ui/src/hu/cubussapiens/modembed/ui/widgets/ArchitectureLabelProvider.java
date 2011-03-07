/**
 * 
 */
package hu.cubussapiens.modembed.ui.widgets;

import hu.cubussapiens.modembed.MODembedCore;

import org.eclipse.jface.viewers.LabelProvider;

/**
 * @author balazs.grill
 *
 */
public class ArchitectureLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof String){
			String e = MODembedCore.getDefault().getArchName(element.toString());
			if (e != null) return e;
		}
		return super.getText(element);
	}

}
