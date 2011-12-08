/**
 * 
 */
package hu.modembed.model.graph.composition.features;

import hu.modembed.model.application.Port;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * @author balazs.grill
 *
 */
public class AddPortFeature extends AbstractAddShapeFeature {

	private static final IColorConstant CLASS_TEXT_FOREGROUND =

	        new ColorConstant(51, 51, 153);

	 

	    private static final IColorConstant CLASS_FOREGROUND =

	        new ColorConstant(255, 102, 0);

	 

	    private static final IColorConstant CLASS_BACKGROUND =

	        new ColorConstant(255, 204, 153);


	
	public AddPortFeature(IFeatureProvider fp) {
		super(fp);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.func.IAdd#canAdd(org.eclipse.graphiti.features.context.IAddContext)
	 */
	@Override
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a Port
		if (context.getNewObject() instanceof Port) {
			// check if user wants to add to a diagram
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.func.IAdd#add(org.eclipse.graphiti.features.context.IAddContext)
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		Port addedPort = (Port) context.getNewObject();

        Diagram targetDiagram = (Diagram) context.getTargetContainer();

 

        // CONTAINER SHAPE WITH ROUNDED RECTANGLE

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape =

             peCreateService.createContainerShape(targetDiagram, true);

 

        // define a default size for the shape

        int width = 100;

        int height = 50; 

        IGaService gaService = Graphiti.getGaService();

 



            // create and set graphics algorithm

            RoundedRectangle roundedRectangle =

                gaService.createRoundedRectangle(containerShape, 5, 5);

            roundedRectangle.setForeground(manageColor(CLASS_FOREGROUND));

            roundedRectangle.setBackground(manageColor(CLASS_BACKGROUND));

            roundedRectangle.setLineWidth(2);

            gaService.setLocationAndSize(roundedRectangle,

                context.getX(), context.getY(), width, height);

 

            // if added Class has no resource we add it to the resource 
            // of the diagram

            // in a real scenario the business model would have its own resource

            if (addedPort.eResource() == null) {

                     getDiagram().eResource().getContents().add(addedPort);

            }

            // create link and wire it

            link(containerShape, addedPort);


		return containerShape;
	}

}
