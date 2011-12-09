/**
 * 
 */
package hu.modembed.model.graph.composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.modembed.model.application.Port;
import hu.modembed.model.graph.composition.features.AddPortFeature;
import hu.modembed.model.graph.composition.features.InitializeDiagramFeature;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
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
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		ICustomFeature[] ret = super.getCustomFeatures(context);
		List<ICustomFeature> cs = new ArrayList<ICustomFeature>(Arrays.asList(ret));
		cs.add(new InitializeDiagramFeature(this));
		return cs.toArray(ret);
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof Port){
			return new AddPortFeature(this);
		}
		return super.getAddFeature(context);
	}
	
}
