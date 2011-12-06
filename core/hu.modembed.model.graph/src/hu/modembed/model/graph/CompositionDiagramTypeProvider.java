package hu.modembed.model.graph;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

public class CompositionDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {

	public CompositionDiagramTypeProvider() {
		setFeatureProvider(new CompositionDiagramFeatureProvider(this));
		
	}

}
