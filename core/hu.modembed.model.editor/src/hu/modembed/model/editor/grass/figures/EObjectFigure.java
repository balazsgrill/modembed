package hu.modembed.model.editor.grass.figures;

import hu.balazsgrill.grass.IUpdateableFigure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

public class EObjectFigure extends Figure implements IUpdateableFigure {

	private String label;
	private Image image;
	
	public EObjectFigure() {
		setLayoutManager(new ListLayout());
		//setBorder(new LineBorder(1));
	}
	
	@Override
	public Rectangle getClientArea(Rectangle rect) {
		Rectangle r = super.getClientArea(rect);
		r.x += 20;
		r.width -= 20;
		r.y += 20;
		r.y -= 20;
		return r;
	}
	
	@Override
	protected boolean useLocalCoordinates() {
		return true;
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		Rectangle b = getBounds(); 
		graphics.drawText(label, b.x, b.y);
	}
	
	@Override
	public void setFigureLabel(String label) {
		this.label = label;
	}

	@Override
	public void setFigureImage(Image image) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSelectionState(boolean selected) {
		// TODO Auto-generated method stub

	}

}
