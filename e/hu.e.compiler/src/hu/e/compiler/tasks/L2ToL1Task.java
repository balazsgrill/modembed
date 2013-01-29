/**
 * 
 */
package hu.e.compiler.tasks;

import java.util.List;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.CompilationLogStep;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.ExpressionsFactory;
import hu.modembed.model.emodel.expressions.LocalVariable;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class L2ToL1Task implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";

	private List<ExecutionStep> flatten(Call call){
		return null;
	}
	
	private ExecutionStep convert(ExecutionStep step){
		if (step instanceof ExecutionBlock){
			ExecutionBlock result = ExpressionsFactory.eINSTANCE.createExecutionBlock();
			TaskUtils.addOrigin(result, step);
			for(ExecutionStep bs : ((ExecutionBlock) step).getSteps()){
				result.getSteps().add(convert(bs));
			}
			return result;
		}
		
		if (step instanceof CompilationLogStep){
			return EcoreUtil.copy(step);
		}
		
		if (step instanceof LocalVariable){
			return EcoreUtil.copy(step);
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
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
		
		for(LibraryElement le : outlib.getContent()){
			if (le instanceof Function){
				((Function) le).setImplementation(convert(((Function) le).getImplementation()));
			}
		}
		
	}

}
