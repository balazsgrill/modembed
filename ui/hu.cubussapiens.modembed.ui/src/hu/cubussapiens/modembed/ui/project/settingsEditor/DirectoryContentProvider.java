/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import java.util.ArrayList;
import java.util.List;

import hu.cubussapiens.modembed.ui.widgets.ITextTreeContentProvider;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author balazs.grill
 *
 */
public class DirectoryContentProvider implements ITextTreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (input != null){
			List<Object> os = new ArrayList<Object>();
			try {
				for(IResource r : input.project.members()){
					if (r instanceof IFolder){
						os.add(r);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			return os.toArray();
		}
		return new Object[0];
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFolder){
			IFolder parent = (IFolder)parentElement;
			List<Object> os = new ArrayList<Object>();
			try {
				for(IResource r : parent.members()){
					if (r instanceof IFolder){
						os.add(r);
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			return os.toArray();
		}
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
		return getChildren(element).length > 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	ProjectConfigInput input = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof ProjectConfigInput){
			input = (ProjectConfigInput)newInput;
		}

	}

	/* (non-Javadoc)
	 * @see hu.cubussapiens.modembed.ui.widgets.ITextTreeContentProvider#getElementForText(java.lang.String)
	 */
	@Override
	public Object getElementForText(String text) {
		return input.project.getFolder(text);
	}

}
