/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.wizard;

import hu.cubussapiens.modembed.pic.PICPlugin;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author balazs.grill
 *
 */
public class PicMidRangeArchitectureCPUFilter extends ViewerFilter {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		String arch = PICPlugin.getDefault().getArchitecture(element);
		if (arch != null){
			return arch.equals("microchip.midrange");
		}
		return true;
	}

}
