/**
 * 
 */
package hu.modembed.utils.tree;

import java.util.Iterator;

/**
 * @author balazs.grill
 *
 */
public class UnmodifiableTree<T> implements ITree<T>{

	private final ITree<T> tree;
	
	/**
	 * 
	 */
	public UnmodifiableTree(ITree<T> tree) {
		this.tree = tree;
	}

	@Override
	public Iterator<ITree<T>> iterator() {
		final Iterator<ITree<T>> baseiterator = tree.iterator();
		return new Iterator<ITree<T>>() {

			@Override
			public boolean hasNext() {
				return baseiterator.hasNext();
			}

			@Override
			public ITree<T> next() {
				ITree<T> bt = baseiterator.next();
				return bt==null ? null : new UnmodifiableTree<T>(bt);
			}

			@Override
			public void remove() {
				throw new IllegalAccessError("Unmodifiable tree!");
			}
		};
	}

	@Override
	public ITree<T> getParent() {
		ITree<T> parent = tree.getParent();
		return parent == null ? null : new UnmodifiableTree<T>(parent);
	}

	@Override
	public ITree<T> addChild(T node) {
		throw new IllegalAccessError("Unmodifiable tree!");
	}

	@Override
	public T getNode() {
		return tree.getNode();
	}

	@Override
	public boolean removeChild(ITree<T> child) {
		throw new IllegalAccessError("Unmodifiable tree!");
	}

	@Override
	public int hashCode() {
		return tree.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UnmodifiableTree<?>){
			return ((UnmodifiableTree<?>) obj).tree.equals(tree);
		}
		return super.equals(obj);
	}
	
}
