/**
 * 
 */
package hu.modembed.model.graph.composition.features;

import hu.modembed.model.graph.DiagramProperties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * @author balazs.grill
 *
 */
public class InitializeDiagramFeature extends AbstractCustomFeature {

	/**
	 * @param fp
	 */
	public InitializeDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.custom.ICustomFeature#execute(org.eclipse.graphiti.features.context.ICustomContext)
	 */
	@Override
	public void execute(ICustomContext context) {
		Diagram d = null;
		for(PictogramElement pe : context.getPictogramElements()){
			if (pe instanceof Diagram){
				d = (Diagram)pe;
			}
		}
		
		if (d != null){
			String ccuri = new DiagramProperties(d).get(DiagramProperties.ModelLink);
			EObject eo = d.eResource().getResourceSet().getEObject(URI.createURI(ccuri), true);
			if (eo != null){
				for(EObject o : eo.eContents()){
					AddContext ac = new AddContext();
					ac.setLocation(100, 100);
					ac.setSize(100, 50);
					ac.setNewObject(o);
					ac.setTargetContainer(d);
					getFeatureProvider().addIfPossible(ac);
				}
			}
		}
		System.out.println(context);
		//if (context.)

	}

	@Override
	public String getName() {
		return "Initialize diagram";
	}
	
	@Override
	public String getDescription() {
		return "Places all domain model element on the diagram";
	}
	
}
