/**
 * 
 */
package hu.modembed.ui.launch.programmers;

import hu.modembed.IProgrammerInstance;
import hu.modembed.IProgrammerType;
import hu.modembed.MODembedCore;
import hu.modembed.RegisteredProgrammer;

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
			IProgrammerInstance[] instances = pt.detectInstances();
			if (instances == null || instances.length == 0){
				obs.add(pt.createInstance(null));
			}else{
				for(IProgrammerInstance pi : instances){
					obs.add(pi);
				}
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
