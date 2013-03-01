/**
 * 
 */
package hu.modembed.utils.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class SimpleTree<T> implements ITree<T> {

	private final T node;
	private final ITree<T> parent;
	
	private final List<ITree<T>> children = new LinkedList<ITree<T>>();
	
	/**
	 * 
	 */
	public SimpleTree(T rootnode) {
		this(rootnode, null);
	}
	
	private SimpleTree(T node, ITree<T> parent){
		this.node = node;
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<ITree<T>> iterator() {
		return children.iterator();
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.tree.ITree#getParent()
	 */
	@Override
	public ITree<T> getParent() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.tree.ITree#addChild(java.lang.Object)
	 */
	@Override
	public ITree<T> addChild(T node) {
		ITree<T> child = new SimpleTree<T>(node, this);
		children.add(child);
		return child;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.utils.tree.ITree#getNode()
	 */
	@Override
	public T getNode() {
		return node;
	}

	@Override
	public boolean removeChild(ITree<T> child) {
		return children.remove(child);
	}

	@Override
	public ITree<T> findNode(T node) {
		if (this.node.equals(node)) return this;
		for(ITree<T> child : children){
			ITree<T> c = child.findNode(node);
			if (c != null) return c;
		}
		return null;
	}
}
