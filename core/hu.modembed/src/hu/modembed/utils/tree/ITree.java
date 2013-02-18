/**
 * 
 */
package hu.modembed.utils.tree;

/**
 * @author balazs.grill
 *
 */
public interface ITree<T> extends Iterable<ITree<T>>{

	public ITree<T> getParent();
	
	public ITree<T> addChild(T node);
	
	public T getNode();
	
	public boolean removeChild(ITree<T> child);
	
}
