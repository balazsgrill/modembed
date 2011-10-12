/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.programmers;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.IProgrammerType;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author balazs.grill
 *
 */
public class ProgrammersContentProvider implements ITreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		List<Object> obs = new ArrayList<Object>();
		
		for(RegisteredProgrammer rp : MODembedCore.getDefault().getProgrammerRegistry().listProgrammers()){
			IProgrammerType pt = rp.getHandler();
			for(IProgrammerInstance pi : pt.detectInstances()){
				obs.add(new ProgrammerDescriptor(rp.getId(), pt, pi));
			}
		}
		
		return obs.toArray();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		return null;
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
