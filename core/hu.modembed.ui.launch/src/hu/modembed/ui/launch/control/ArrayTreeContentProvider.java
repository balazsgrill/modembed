/**
 * 
 */
package hu.modembed.ui.launch.control;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * @author balazs.grill
 *
 */
public class ArrayTreeContentProvider extends ArrayContentProvider implements
		ITreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[0];
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

}
