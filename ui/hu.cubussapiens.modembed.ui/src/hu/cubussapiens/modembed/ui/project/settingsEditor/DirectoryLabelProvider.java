/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * @author balazs.grill
 *
 */
public class DirectoryLabelProvider extends LabelProvider {

	private final IPath base;
	
	public DirectoryLabelProvider(IPath base) {
		this.base = base;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof IResource){
			return ((IResource) element).getFullPath().makeRelativeTo(base).toString();
		}
		return super.getText(element);
	}
	
}
