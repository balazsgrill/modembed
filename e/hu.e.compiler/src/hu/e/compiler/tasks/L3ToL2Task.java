/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.VariableParameterKind;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.types.TypeDefinition;

import java.util.ArrayList;
import java.util.List;

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
	
	private class ParameterType{
		public final VariableParameterKind kind;
		public final TypeDefinition type;
		
		public ParameterType(ExecutionStep step) {
			VariableParameterKind kind = null;
			TypeDefinition type = null;
			
			this.kind = kind;
			this.type = type;
		}
	}
	
	private class Linker{
		
		/**
		 * Base -> Overridden
		 */
		private final Multimap<Function, Function> overrides = ArrayListMultimap.create();
		
		public Linker(Library library){
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
				List<ParameterType> types = new ArrayList<L3ToL2Task.ParameterType>();
				
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
		
		Linker linker = new Linker(outlib);
		for(LibraryElement element : outlib.getContent()){
			if (element instanceof Function){
				linker.process(((Function) element).getImplementation());
			}
		}
		
		monitor.done();
	}

}
