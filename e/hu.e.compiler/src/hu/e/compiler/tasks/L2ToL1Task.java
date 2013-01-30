/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.internal.AbstractConverter;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;
import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.VariableParameter;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.ExpressionsFactory;
import hu.modembed.model.emodel.expressions.LocalVariable;
import hu.modembed.model.emodel.expressions.ResultVariableReference;
import hu.modembed.model.emodel.expressions.VariableReference;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class L2ToL1Task implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String ENTRY = "entry";
	
	private class FunctionFlattener extends AbstractConverter{
		
		private class VariableStack{
			
			private final VariableStack parent;
			
			private Variable result;
			private final Map<Variable, Variable> variableMap = new HashMap<Variable, Variable>();
			private final Map<FunctionParameter, ExecutionStep> parameterStep = new HashMap<FunctionParameter, ExecutionStep>();
			
			public VariableStack(VariableStack parent) {
				this.parent = parent;
			}
			
			public void put(FunctionParameter parameter, ExecutionStep step){
				parameterStep.put(parameter, step);
			}
			
			public void putVariable(Variable var, Variable localVar){
				variableMap.put(var, localVar);
			}
			
			public ExecutionStep get(Variable var){
				if (variableMap.containsKey(var)) {
					VariableReference ref = ExpressionsFactory.eINSTANCE.createVariableReference();
					ref.setVariable(variableMap.get(var));
					return ref;
				}
				if (parameterStep.containsKey(var)){
					return copy(parameterStep.get(var));
				}
				if (parent != null) return parent.get(var);
				return null;
			}
			
			public Variable getResult() {
				if (result != null) return result;
				if (parent != null) return parent.getResult();
				return null;
			}
			
			public void setResult(Variable result) {
				this.result = result;
			}
			
		}
		
		private final Stack<VariableStack> stack = new Stack<L2ToL1Task.FunctionFlattener.VariableStack>();
		
		private VariableStack current(){
			return stack.peek();
		}
		
		private void push(){
			VariableStack parent = current();
			stack.push(new VariableStack(parent));
		}
		
		private void pop(){
			stack.pop();
		}
		
		private Function flatten(Function input){
			Function func = EmodelFactory.eINSTANCE.createFunction();
			func.setName(input.getName());
			TaskUtils.addOrigin(func, input);
			ExecutionStep impl = input.getImplementation();
			
			stack.push(new VariableStack(null)); //Push root stack level
			func.setImplementation(copy(impl));
			stack.pop();
			
			return func;
		}
		
		@Override
		protected EObject internalCopy(EObject step){
			if (step instanceof LocalVariable){
				EObject lv = super.internalCopy(step);
				current().putVariable((LocalVariable)step, (LocalVariable)lv);
				return lv;
			}
			if (step instanceof ResultVariableReference){
				VariableReference ref = ExpressionsFactory.eINSTANCE.createVariableReference();
				ref.setVariable(current().getResult());
				return ref;
			}
			if (step instanceof VariableReference){
				Variable vf = ((VariableReference) step).getVariable();
				ExecutionStep v = current().get(vf);
				if (v != null){
					return v;
				}else{
					return super.internalCopy(step);
				}
			}
			if (step instanceof Call){
				Call call = (Call)step;
				if (call.getFunction() instanceof Function){
					ExecutionBlock callcontext = ExpressionsFactory.eINSTANCE.createExecutionBlock();
					LocalVariable resultVar = null;
					
					Function f = (Function)call.getFunction();
					push();
					
					if (f.getType() != null){
						resultVar = ExpressionsFactory.eINSTANCE.createLocalVariable();
						resultVar.setName("result");
						resultVar.setType(copy(f.getType()));
						callcontext.getSteps().add(resultVar);
						current().setResult(resultVar);
					}
					int parami = 0;
					for(FunctionParameter fp : f.getArguments()){
						if (fp instanceof VariableParameter){
							//TODO check if call parameter is another call
							//TODO lazy parameter support
							current().put(fp, call.getParameters().get(parami));
							parami++;
						}
					}
					
					ExecutionStep result = copy(f.getImplementation());
					callcontext.getSteps().add(result);
					
					pop();
					
					return callcontext;
				}
			}
			if (step instanceof ExecutionBlock){
				ExecutionBlock eb = ExpressionsFactory.eINSTANCE.createExecutionBlock();
				for(ExecutionStep ebs : ((ExecutionBlock) step).getSteps()){
					eb.getSteps().add(copy(ebs));
				}
				return eb;
			}
			return super.internalCopy(step);
		}
		
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		String entry = context.getParameterValue(ENTRY).get(0);
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		Library outlib = EmodelFactory.eINSTANCE.createLibrary();
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		TaskUtils.addOrigin(outlib, inlib); 
		
		FunctionFlattener flattener = new FunctionFlattener();
		Function main = null;
		
		for(LibraryElement le : inlib.getContent()){
			if (le instanceof Function){
				if (entry.equals(le.getName())){
					main = (Function)le;
				}
			}else{
				outlib.getContent().add(flattener.copy(le));
			}
		}
		
		if (main != null){
			outlib.getContent().add(flattener.flatten(main));
		}
		
		flattener.resolveCrossReferences();
		
	}

}
