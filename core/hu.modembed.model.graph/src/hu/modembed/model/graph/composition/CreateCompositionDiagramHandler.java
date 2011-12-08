/**
 * 
 */
package hu.modembed.model.graph.composition;

import hu.modembed.model.application.composition.CompositeComponent;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author balazs.grill
 *
 */
public class CreateCompositionDiagramHandler extends AbstractHandler implements
		IHandler {

	public static String DIAGRAMTYPEID = "MODembedCompositionDiagram";
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection s = HandlerUtil.getCurrentSelection(event);
		if (s instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) s).getFirstElement();
			if (o instanceof CompositeComponent){
				CompositeComponent cc = (CompositeComponent)o;
				
				URI uri = ((CompositeComponent) o).eResource().getURI();
				uri = uri.trimSegments(1).appendSegment(cc.getName()+".diagram");
				
				Diagram diagram = Graphiti.getPeCreateService().createDiagram(DIAGRAMTYPEID, cc.getName(), true);
				
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.createResource(uri);
				
				resource.getContents().add(diagram);
				try {
					resource.save(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
			
		return null;
	}

}
