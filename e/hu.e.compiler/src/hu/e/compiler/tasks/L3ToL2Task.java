/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;

import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * @author balazs.grill
 *
 */
public class L3ToL2Task implements IModembedTask{

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String LIBRARY = "library";
	
	private class Linker{
		
		/**
		 * Base -> Overridden
		 */
		private final Multimap<Function, Function> overrides = ArrayListMultimap.create();
		
		public void addLibrary(Library library){
			for(LibraryElement le : library.getContent()){
				if (le instanceof Function){
					Function f = (Function)le;
					Function o = f.getOverrides();
					if (o != null){
						overrides.put(o, f);
					}
				}
			}
		}
		
	}
	
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		monitor.beginTask("Integrating model", 3);
		
		Linker linker = new Linker();
		for(String libmodel : context.getParameterValue(LIBRARY)){
			Resource libr = context.getInput(context.getModelURI(libmodel));
			EObject lib = libr.getContents().get(0);
			if (lib instanceof Library){
				linker.addLibrary((Library)lib);
			}
		}
		
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		Library outlib = EmodelFactory.eINSTANCE.createLibrary();
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		TaskUtils.addOrigin(outlib, inlib);
		
		Queue<Function> copyAndLink = new LinkedList<Function>();
		
		for(LibraryElement le : inlib.getContent()){
			if (le instanceof Function){
				copyAndLink.add((Function)le);
			}
		}
		
		while(!copyAndLink.isEmpty()){
			Function func = copyAndLink.poll();
			Function conv = EcoreUtil.copy(func);
			conv.getOrigins().clear();
			TaskUtils.addOrigin(conv, func);
			
			outlib.getContent().add(func);
		}
		
		monitor.done();
	}

}
