/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui;

import hu.cubussapiens.modembed.pic.PICPlugin;

import org.eclipse.jface.viewers.LabelProvider;

/**
 * @author balage
 *
 */
public class PicTargetLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		return PICPlugin.getDefault().getDefinitions().get(element);
	}
	
}
