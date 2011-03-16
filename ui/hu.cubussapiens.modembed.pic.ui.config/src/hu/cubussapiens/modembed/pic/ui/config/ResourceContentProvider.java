/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author balazs.grill
 *
 */
public class ResourceContentProvider implements ITreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	private boolean showClosedProjects = false;
	
    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
     */
    public Object[] getChildren(Object element) {
        if (element instanceof IWorkspace) {
            // check if closed projects should be shown
            IProject[] allProjects = ((IWorkspace) element).getRoot()
                    .getProjects();
            if (showClosedProjects) {
				return allProjects;
			}

            ArrayList<Object> accessibleProjects = new ArrayList<Object>();
            for (int i = 0; i < allProjects.length; i++) {
                if (allProjects[i].isOpen()) {
                    accessibleProjects.add(allProjects[i]);
                }
            }
            return accessibleProjects.toArray();
        } else if (element instanceof IContainer) {
            IContainer container = (IContainer) element;
            if (container.isAccessible()) {
                try {
                    List<Object> children = new ArrayList<Object>();
                    IResource[] members = container.members();
                    for (int i = 0; i < members.length; i++) {
                        //if (members[i].getType() != IResource.FILE) {
                            children.add(members[i]);
                        //}
                    }
                    return children.toArray();
                } catch (CoreException e) {
                    // this should never happen because we call #isAccessible before invoking #members
                }
            }
        }
        return new Object[0];
    }

    /*
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    public Object[] getElements(Object element) {
        return getChildren(element);
    }

    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
     */
    public Object getParent(Object element) {
        if (element instanceof IResource) {
			return ((IResource) element).getParent();
		}
        return null;
    }

    /*
     * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
     */
    public boolean hasChildren(Object element) {
        return getChildren(element).length > 0;
    }

    /*
     * @see org.eclipse.jface.viewers.IContentProvider#inputChanged
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    /**
     * Specify whether or not to show closed projects in the tree 
     * viewer.  Default is to show closed projects.
     * 
     * @param show boolean if false, do not show closed projects in the tree
     */
    public void showClosedProjects(boolean show) {
        showClosedProjects = show;
    }
}
