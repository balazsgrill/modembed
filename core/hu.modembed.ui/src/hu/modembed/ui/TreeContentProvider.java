/**
 * 
 */
package hu.modembed.ui;

import hu.modembed.utils.tree.ITree;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author balazs.grill
 *
 */
public class TreeContentProvider implements ITreeContentProvider {

	/**
	 * 
	 */
	public TreeContentProvider() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	private ITree<?> tree;
	
	private static ITree<?> find(ITree<?> tree, Object o){
		if (o == null) return tree;
		if (tree.getNode().equals(o)) return tree;
		for(ITree<?> child : tree){
			ITree<?> r = find(child, o);
			if (r != null) return r;
		}
		return null;
	}
	
	private ITree<?> find(Object o){
		if (tree == null) return null;
		if (o instanceof ITree<?>) return (ITree<?>)o;
		return find(tree, o);
	}
 	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof ITree<?>){
			this.tree = (ITree<?>)newInput;
		}else{
			this.tree = null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		ITree<?> tree = find(parentElement);
		if (tree != null){
			List<Object> children = new LinkedList<Object>();
			for(ITree<?> child : tree){
				children.add(child.getNode());
			}
			return children.toArray();
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

}
