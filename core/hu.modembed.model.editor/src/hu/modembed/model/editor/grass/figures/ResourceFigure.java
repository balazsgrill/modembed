/**
 * 
 */
package hu.modembed.model.editor.grass.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

/**
 * @author balazs.grill
 *
 */
public class ResourceFigure extends Figure {

	/**
	 * 
	 */
	public ResourceFigure() {
		setLayoutManager(new ListLayout());
		setBackgroundColor(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
	}

	@Override
	protected boolean useLocalCoordinates() {
		return true;
	}	
	
}
