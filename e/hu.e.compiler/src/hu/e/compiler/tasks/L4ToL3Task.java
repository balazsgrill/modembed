/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.internal.AbstractConverter;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class L4ToL3Task implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	
	private class Integrator extends AbstractConverter{
		
		private final Library target;
		
		public Integrator(Library target) {
			this.target = target;
		}
		
		
		public void addLibrary(Library library){
			TaskUtils.addOrigin(target, library);
			for(LibraryElement element : library.getContent()){
				target.getContent().add(copy(element));
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		Library outlib = EmodelFactory.eINSTANCE.createLibrary();
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		
		Integrator integrator = new Integrator(outlib);
		
		for(String libmodel : context.getParameterValue(INPUT)){
			Resource libr = context.getInput(context.getModelURI(libmodel));
			EObject lib = libr.getContents().get(0);
			if (lib instanceof Library){
				integrator.addLibrary((Library)lib);
			}
		}

		integrator.resolveCrossReferences();
		
	}

}
