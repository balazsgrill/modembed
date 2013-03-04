/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.internal.TypeSignature;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
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
	
	private class Linker{
		
		/**
		 * Base -> Overridden
		 */
		private final Multimap<Function, Function> overrides = ArrayListMultimap.create();
		//private final ITaskContext context;
		
		public Linker(ITaskContext context, Library library){
			//this.context = context;
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
		
		public void process(ExecutionStep step){
			if (step instanceof Call){
				for(ExecutionStep param : ((Call) step).getParameters()){
					process(param);
				}
				process((Call)step);
			}
			if (step instanceof ExecutionBlock){
				for(ExecutionStep s : ((ExecutionBlock) step).getSteps()){
					process(s);
				}
			}
		}
		
		public void process(Call call){
			if (call.getFunction() instanceof Function){
				Function abstractfunction = (Function)call.getFunction();
				//collect call signature
				List<TypeSignature> types = new ArrayList<TypeSignature>();
				for(ExecutionStep p : call.getParameters()){
					process(p);
					types.add(TaskUtils.inferType(p));
				}
				TypeSignature[] signature = types.toArray(new TypeSignature[types.size()]);
				
				//Find most specific function with compatible signature
				List<Function> available = new ArrayList<Function>(1);
				Queue<Function> candidates = new LinkedList<Function>();
				candidates.add(abstractfunction);
				while(!candidates.isEmpty()){
					Function f = candidates.poll();
					
					if (TaskUtils.checkSignature(f, signature)){
						Collection<Function> functions = overrides.get(f);
						if (functions.isEmpty()){
							//Found a function!
							available.add(f);
						}else{
							//Check overriding implementations
							candidates.addAll(functions);
						}
					}
				}
				
				//Apply function to call
				if (available.isEmpty()){
					//TODO report error
				}else{
					call.setFunction(available.get(0));
					//TODO first chosen, check if there is no other available
				}
				
			}else{
				/* Instruction calls shall not be changed */
			}
		}
		
	}
	
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		monitor.beginTask("Integrating model", 3);
		
		
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		Library outlib = EcoreUtil.copy(inlib);
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		TaskUtils.addOrigin(outlib, inlib);
		
		Linker linker = new Linker(context, outlib);
		for(LibraryElement element : outlib.getContent()){
			if (element instanceof Function){
				linker.process(((Function) element).getImplementation());
			}
		}
		
		monitor.done();
	}

}
