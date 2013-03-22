/**
 * 
 */
package hu.e.compiler.tasks.optimizers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.e.compiler.tasks.internal.AbstractConverter;
import hu.e.parser.convert.PlatformOperations;
import hu.modembed.model.emodel.CallableElement;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.LazyParameter;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.RegisterVariable;
import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.ExpressionsFactory;
import hu.modembed.model.emodel.expressions.IntegerLiteralExpression;
import hu.modembed.model.emodel.expressions.LiteralExpression;
import hu.modembed.model.emodel.expressions.VariableReference;
import hu.modembed.model.emodel.memorymap.HeapLevel;
import hu.modembed.model.emodel.memorymap.HeapVariableMapping;
import hu.modembed.model.emodel.memorymap.MemoryMap;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class ConstantExpressionOptimizer implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String MAP = "map";
	
	private class ConstantResolver extends AbstractConverter{
		
		private final Map<Variable, Long> vars = new HashMap<Variable, Long>();
		
		public ConstantResolver(MemoryMap map) {
			if (map != null){
				visit(map.getRoot());
			}
		}
		
		private void visit(HeapLevel level){
			if (level == null) return;
			for(HeapVariableMapping m : level.getMappings()){
				vars.put(m.getVariable(), m.getAddress());
			}
			for(HeapLevel sl : level.getSubLevels()){
				visit(sl);
			}
		}
		
		private PlatformOperations asOperation(CallableElement callable){
			if (callable instanceof Function){
				String name = callable.getName();
				try{
					return PlatformOperations.valueOf(name);
				}catch(IllegalArgumentException e){
					return null;
				}
			}
			return null;
		}
		
		private boolean check(Function f, List<ExecutionStep> args){
			for(int i=0;i<f.getArguments().size();i++){
				FunctionParameter fp = f.getArguments().get(i);
				if (i >= args.size()) return false;
				if (!(fp instanceof LazyParameter)){
					if (!(args.get(i) instanceof LiteralExpression)){
						return false;
					}
				}
			}
			return true;
		}
		
		private BigDecimal toDecimal(ExecutionStep step){
			if (step instanceof IntegerLiteralExpression){
				return BigDecimal.valueOf(((IntegerLiteralExpression) step).getValue().longValue());
			}
			return null;
		}
		
		private LiteralExpression toExpression(BigDecimal decimal){
			try{
				long longvalue = decimal.longValueExact();
				IntegerLiteralExpression il = ExpressionsFactory.eINSTANCE.createIntegerLiteralExpression();
				il.setValue(BigInteger.valueOf(longvalue));
				return il;
			}catch(ArithmeticException e){
				//TODO return double value
				long longvalue = decimal.longValue();
				IntegerLiteralExpression il = ExpressionsFactory.eINSTANCE.createIntegerLiteralExpression();
				il.setValue(BigInteger.valueOf(longvalue));
				return il;
			}
		}
		
		private BigDecimal execute(PlatformOperations op, List<BigDecimal> args){
			switch(op){
			case ADD:
				return args.get(0).add(args.get(1));
			case AND:
				return BigDecimal.valueOf(args.get(0).longValue() & (args.get(1).longValue()));
			case ASSIGN:
				return null;
			case ASSIGNADD:
				return null;
			case ASSIGNSUBTRACT:
				return null;
			case DEREFERENCE:
				return null;
			case DIV:
				return args.get(0).divide(args.get(1));
			case EQUALS:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) == 0 ? 1l : 0l);
			case GT:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) > 0 ? 1l : 0l);
			case GTE:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) >= 0 ? 1l : 0l);
			case LT:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) < 0 ? 1l : 0l);
			case LTE:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) <= 0 ? 1l : 0l);
			case MINUS:
				return args.get(0).subtract(args.get(1));
			case MOD:
				return args.get(0).remainder(args.get(1));
			case MUL:
				return args.get(0).multiply(args.get(1));
			case NOT:
				break;
			case NOTEQUALS:
				return BigDecimal.valueOf(args.get(0).compareTo(args.get(1)) != 0 ? 1l : 0l);
			case OR:
				return BigDecimal.valueOf(args.get(0).longValue() | (args.get(1).longValue()));
			case REFERENCE:
				return null;
			case UNARY_MINUS:
				return args.get(0).negate();
			default:
				break;
			}
			return null;
		}
		
		private ExecutionStep toLiteral(PlatformOperations op, List<ExecutionStep> args){
			List<BigDecimal> argnums = new ArrayList<BigDecimal>(args.size());
			for(ExecutionStep s : args){
				argnums.add(toDecimal(s));
			}
			BigDecimal value = execute(op, argnums);
			if (value == null) return null;
			return toExpression(value);
		}
		
		@Override
		protected EObject internalCopy(EObject element) {
			if (element instanceof Call){
				PlatformOperations op = asOperation(((Call) element).getFunction());
				if (op != null){
					if (op == PlatformOperations.REFERENCE){
						List<ExecutionStep> args = ((Call) element).getParameters();
						if (args.size() == 1 && args.get(0) instanceof VariableReference){
							VariableReference vref = (VariableReference)args.get(0);
							Variable v = vref.getVariable();
							if (v instanceof RegisterVariable){
								return copy(((RegisterVariable) v).getAddress());
							}
							if (vars.containsKey(v)){
								return toExpression(BigDecimal.valueOf(vars.get(v)));
							}else{
								return super.internalCopy(element);
							}
						}
					}
					
					List<ExecutionStep> arguments = new LinkedList<ExecutionStep>();
					for(ExecutionStep arg : ((Call) element).getParameters()){
						ExecutionStep e = copy(arg);
						arguments.add(e);
					}
					
					if (check((Function)((Call) element).getFunction(), arguments)){
						ExecutionStep es = toLiteral(op, arguments);
						if (es != null) return es;
					}
				}
			}
			return super.internalCopy(element);
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		monitor.beginTask("Optimizing constant expressions", 3);

		String inputmodel = context.getParameterValue(INPUT).get(0);
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		String mapmodel = context.getParameterValue(MAP).isEmpty() ? null : context.getParameterValue(MAP).get(0); 
		
		Resource inr = context.getInput(context.getModelURI(inputmodel));
		monitor.worked(1);
		
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		monitor.worked(1);
		
		MemoryMap map = null;
		if (mapmodel != null){
			Resource mapr = context.getInput(context.getModelURI(mapmodel));
			map = (MemoryMap)mapr.getContents().get(0);
		}
		
		EObject lib = inr.getContents().get(0);
		Assert.isLegal(lib instanceof Library);
		Library inlib = (Library)lib;
		
		ConstantResolver resolver = new ConstantResolver(map);
		
		Library outlib = resolver.copy(inlib);
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		TaskUtils.addOrigin(outlib, inlib);

		resolver.resolveCrossReferences();
		monitor.done();
	}

}
