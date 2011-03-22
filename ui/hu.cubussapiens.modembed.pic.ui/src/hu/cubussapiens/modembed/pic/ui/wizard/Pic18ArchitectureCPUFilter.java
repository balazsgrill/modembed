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
public class Pic18ArchitectureCPUFilter extends ViewerFilter {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		String name = PICPlugin.getDefault().getDefinitions().get(element);
		if (name != null){
			return name.toLowerCase().startsWith("pic18");
		}
		return false;
	}

}
