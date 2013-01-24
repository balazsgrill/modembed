package hu.modembed.model.editor.grass;

import hu.balazsgrill.grass.IGrassFigureProvider;
import hu.modembed.model.editor.grass.figures.EObjectFigure;
import hu.modembed.model.editor.grass.figures.ResourceFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.LabelProvider;

public class ObservableMapLabelAndFigureProvider extends
		LabelProvider implements IGrassFigureProvider {

	@Override
	public IFigure createFigure(Object element) {
		if (element instanceof Resource){
			return new ResourceFigure();
		}
		
		if (element instanceof EObject){
			return new EObjectFigure();
		}
		
		return null;
	}

}
