/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.ECompilerPlugin;
import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.model.core.assembler.code.CodeFactory;
import hu.modembed.model.core.assembler.code.InstructionCall;
import hu.modembed.model.core.assembler.code.InstructionCallParameter;
import hu.modembed.model.emodel.CallableElement;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.IntegerLiteralExpression;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class CreateAssemblerObjectTask implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ENTRY = "entry";
	
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String entryfunction = context.getParameterValue(ENTRY).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		
		EObject lib = inr.getContents().get(0);
		if (lib instanceof Library){
			Function mainfunc = null;
			for(LibraryElement le : ((Library) lib).getContent()){
				if (le instanceof Function && le.getName().equals(entryfunction)){
					mainfunc = (Function)le;
				}
			}
			
			if (mainfunc == null){
				context.logStatus(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Could not find entry point!"));
				return;
			}
			
			Resource outr = context.getOutput(context.getModelURI(outputmodel));
			AssemblerObject object = CodeFactory.eINSTANCE.createAssemblerObject();
			TaskUtils.addOrigin(object, mainfunc);
			outr.getContents().add(object);
			
			ExecutionStep step = mainfunc.getImplementation();
			processStep(step, context, object);		
		}
	}

	private void processStep(ExecutionStep step, ITaskContext context, AssemblerObject result){
		if (step instanceof ExecutionBlock){
			for(ExecutionStep sstep : ((ExecutionBlock) step).getSteps()){
				processStep(sstep, context, result);
			}
		}else if (step instanceof Call){
			CallableElement callable = ((Call) step).getFunction();
			if (callable instanceof Instruction){
				Instruction ins = (Instruction)callable;
				InstructionCall icall = CodeFactory.eINSTANCE.createInstructionCall();
				icall.setInstruction(ins);
				TaskUtils.addOrigin(icall, step);
				result.getInstructions().add(icall);
				
				int i = 0;
				for (ExecutionStep param : ((Call) step).getParameters()){
					if (param instanceof IntegerLiteralExpression){
						InstructionCallParameter icallp = CodeFactory.eINSTANCE.createInstructionCallParameter();
						InstructionParameter ip = ins.getParameters().get(i);
						i++;
						icallp.setDefinition(ip);
						icallp.setValue(((IntegerLiteralExpression) param).getValue().longValue());
						icall.getParameters().add(icallp);
						TaskUtils.addOrigin(icallp, param);
					}else{
						context.logStatus(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Only integer parameters are supported!"));
					}
				}
			}else{
				context.logStatus(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Input model must only refer to atomic instruction! ("+callable+")"));
			}
		}else{
			context.logStatus(new Status(IStatus.ERROR, ECompilerPlugin.PLUGIN_ID, "Input model contains element of unsupported type: "+step.eClass().getName()));
		}
	}
	
}
