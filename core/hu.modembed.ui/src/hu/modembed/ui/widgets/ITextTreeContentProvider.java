/**
 * 
 */
package hu.modembed.ui.widgets;

import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * @author balazs.grill
 *
 */
public interface ITextTreeContentProvider extends ITreeContentProvider {

	/**
	 * 
	 * @param text
	 * @return
	 */
	public Object getElementForText(String text);
	
}
