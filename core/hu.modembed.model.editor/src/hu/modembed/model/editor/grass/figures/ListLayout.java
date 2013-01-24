/**
 * 
 */
package hu.modembed.model.editor.grass.figures;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author balazs.grill
 *
 */
public class ListLayout extends AbstractLayout {

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.LayoutManager#layout(org.eclipse.draw2d.IFigure)
	 */
	@Override
	public void layout(IFigure container) {
		Rectangle clientArea = container.getClientArea();
		int h = clientArea.y+20;
		
		for(Object o : container.getChildren()){
			if (o instanceof IFigure){
				Dimension d = ((IFigure) o).getPreferredSize(clientArea.width, -1);
				Rectangle b = new Rectangle(clientArea.x, h, clientArea.width, d.height);
				((IFigure) o).setBounds(b);
				h += d.height;
			}
		}

		System.out.println(clientArea);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.AbstractLayout#calculatePreferredSize(org.eclipse.draw2d.IFigure, int, int)
	 */
	@Override
	protected Dimension calculatePreferredSize(IFigure container, int wHint,
			int hHint) {

		int width = wHint;
		int height = 20;
		
		for(Object o : container.getChildren()){
			if (o instanceof IFigure){
				Dimension d = ((IFigure) o).getPreferredSize(wHint, -1);
				width = Math.max(width, d.width);
				height += d.height; 
			}
		}
		
		return new Dimension(width, height);
	}

}
