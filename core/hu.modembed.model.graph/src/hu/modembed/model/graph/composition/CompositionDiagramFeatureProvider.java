/**
 * 
 */
package hu.modembed.model.graph.composition;

import hu.modembed.model.application.Port;
import hu.modembed.model.graph.composition.features.AddPortFeature;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

/**
 * @author balazs.grill
 *
 */
public class CompositionDiagramFeatureProvider extends DefaultFeatureProvider {

	public CompositionDiagramFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof Port){
			return new AddPortFeature(this);
		}
		return super.getAddFeature(context);
	}
	
}
