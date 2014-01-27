/**
 * 
 */
package hu.modembed.utils.compiler.module;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypesFactory;
import hu.modembed.model.modembed.infrastructure.expressions.Expression;
import hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression;
import hu.modembed.model.modembed.infrastructure.expressions.OperationExpression;
import hu.modembed.model.modembed.structured.ConditionalOperation;
import hu.modembed.model.modembed.structured.ExpressionOperation;
import hu.modembed.model.modembed.structured.FunctionCallExpression;
import hu.modembed.model.modembed.structured.LoopOperation;
import hu.modembed.model.modembed.structured.Operation;
import hu.modembed.model.modembed.structured.OperationBlock;
import hu.modembed.model.modembed.structured.ReturnOperation;
import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.modembed.model.modembed.structured.VariableReferenceExpression;
import hu.modembed.utils.compiler.module.impl.BasicSymbol;
import hu.modembed.utils.compiler.module.impl.IndexedSymbol;
import hu.modembed.utils.expressions.ExpressionResolveException;
import hu.modembed.utils.expressions.ExpressionResolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompilerPart extends AbstractModuleCompilerPart{
	
	private static final String RESULT = "__RESULT__";
	private static final String FUNCTION_END_LABEL = "__FUNCTION_END__";
	
	private final ExpressionResolver expressionResolver;
	/**
	 * @param parent 
	 * 
	 */
	public ModuleCompilerPart(ExpressionResolver expressionResolver, SequentialBehaviorPart part) {
		super(part);
		this.expressionResolver = expressionResolver;
	}
	
	public void compile(StructuredFunction func) throws ExpressionResolveException{
		if (func.getResultType() != null){
			addParameter(RESULT);
		}
		
		for(VariableDeclaration param : func.getParameters()){
			addParameter(BasicSymbol.getSymbol(param).getSymbolIdentifier());
		}
		
		SymbolAllocation function_end = BehaviorFactory.eINSTANCE.createSymbolAllocation();
		function_end.setType(TypesFactory.eINSTANCE.createCodeLabelTypeDefinition());
		function_end.setSymbol(FUNCTION_END_LABEL);
		
		compile(func.getImplementation());
		
		CodeSymbolPlacement functionEnd = BehaviorFactory.eINSTANCE.createCodeSymbolPlacement();
		functionEnd.setSymbol(FUNCTION_END_LABEL);
		add(functionEnd);
	}

	public ISymbol compile(Expression expression){
		if (expression instanceof FunctionCallExpression){
			StructuredFunction sf = ((FunctionCallExpression) expression).getFunction();
			IBasicSymbol resultSymbol = null;
			OperationExecution call = BehaviorFactory.eINSTANCE.createOperationExecution();
			call.setOperation(ModuleCompiler2.getSymbol(sf));
			
			if (sf.getResultType() != null){
				TypeDefinition td = EcoreUtil.copy(sf.getResultType());
				resultSymbol = allocateSymbol(td, BUFFER);
				call.getArguments().add(resultSymbol.getSymbolIdentifier());
			}
	
			for(Expression e : ((FunctionCallExpression) expression).getArguments()){
				call.getArguments().add(compile(e).get(this).getSymbolIdentifier());
			}
			add(call);
			return resultSymbol;
		}
		if (expression instanceof IntegerConstantExpression){
			return getConstantSymbol(((IntegerConstantExpression) expression).getValue());
		}
		if (expression instanceof OperationExpression){
			List<ISymbol> arguments = new ArrayList<ISymbol>(((OperationExpression) expression).getArguments().size());
			for(Expression e : ((OperationExpression) expression).getArguments()){
				arguments.add(compile(e));
			}
			
			return compile(((OperationExpression) expression).getOperation(), arguments.toArray(new ISymbol[arguments.size()]));
		}
		if (expression instanceof VariableReferenceExpression){
			return BasicSymbol.getSymbol(((VariableReferenceExpression) expression).getVariable());
		}
		throw new IllegalArgumentException("Expression is not supported: "+expression);
	}
	
	public void basicSet(IBasicSymbol destination, IBasicSymbol source){
		add(op("set", destination.getSymbolIdentifier(), source.getSymbolIdentifier()));
	}
	
	private ISymbol compileDualArgumentOperation(String operation, ISymbol a0, ISymbol a1){
		
		ISymbol v0 = extendSymbol(a0, a1.getType());
		ISymbol v1 = extendSymbol(a1, a0.getType());
		
		IBasicSymbol buffer = allocateSymbol(v0.getType(), BUFFER);
		basicSet(buffer, v0.get(this));
		add(op(operation, buffer.getSymbolIdentifier(), v1.get(this).getSymbolIdentifier()));
		
		return buffer;
	}
	
	private static Set<String> dualArgOps = new HashSet<String>(Arrays.asList(
			"add", "subtract"));
	
	private ISymbol compileComparisonOperation(String operation, ISymbol a0, ISymbol a1){
		ISymbol v0 = extendSymbol(a0, a1.getType());
		ISymbol v1 = extendSymbol(a1, a0.getType());
		
		IBasicSymbol buffer = allocateSymbol(TypeUtils.createUnsignedTypeDef(1), BUFFER);
		add(op(operation, buffer.getSymbolIdentifier(), v0.get(this).getSymbolIdentifier(), v1.get(this).getSymbolIdentifier()));
		return buffer;
	}
	
	private static Set<String> comparisonOps =  new HashSet<String>(Arrays.asList(
			"greater", "lower", "equals", "notEquals"));
	
	public ISymbol compile(String operation, ISymbol...arguments){
		if ("assign".equals(operation)){
			arguments[0].set(this, arguments[1].get(this));
			return arguments[0];
		}
		
		if ("access_indexed".equals(operation)){
			return IndexedSymbol.create(arguments[0], arguments[1]);
		}
		
		if ("not".equals(operation)){
			IBasicSymbol buffer = allocateSymbol(arguments[0].getType(), BUFFER);
			add(op("not", buffer.getSymbolIdentifier(), arguments[1].get(this).getSymbolIdentifier()));
			return buffer;
		}
		
		if (dualArgOps.contains(operation)){
			return compileDualArgumentOperation(operation, arguments[0], arguments[1]);
		}
		if (comparisonOps.contains(operation)){
			return compileComparisonOperation(operation, arguments[0], arguments[1]);
		}
		throw new IllegalArgumentException("Operation is not supported: "+operation);
	}
	
	public void compile(Operation implementation) throws ExpressionResolveException{
		if (implementation instanceof ConditionalOperation){
			Expression condition = ((ConditionalOperation) implementation).getCondition();
			ISymbol conditionSymbol = compile(condition);
			
			Operation trueBranch = ((ConditionalOperation) implementation).getTrueBranch();
			Operation falseBranch = ((ConditionalOperation) implementation).getFalseBranch();
			
			IBasicSymbol trueLabel = createLabelSymbol();
			IBasicSymbol falseLabel = createLabelSymbol();
			IBasicSymbol endLabel = createLabelSymbol();
			
			add(op("branch", conditionSymbol.get(this).getSymbolIdentifier(), trueLabel.getSymbolIdentifier(), falseLabel.getSymbolIdentifier()));
			add(label(trueLabel.getSymbolIdentifier()));
			
			if (trueBranch != null){
				compile(trueBranch);
			}
			
			if (falseBranch != null) add(op("goto", endLabel.getSymbolIdentifier()));
			add(label(falseLabel.getSymbolIdentifier()));

			if (falseBranch != null){
				compile(falseBranch);
			}
			
			add(label(endLabel.getSymbolIdentifier()));
			return;
		}
		if (implementation instanceof ExpressionOperation){
			compile(((ExpressionOperation) implementation).getExpression());
			return;
		}
		if (implementation instanceof LoopOperation){
			Expression entry = ((LoopOperation) implementation).getEntryCondition();
			Expression exit = ((LoopOperation) implementation).getExitCondition();
			Operation body = ((LoopOperation) implementation).getBody();
			
			IBasicSymbol startLabel = createLabelSymbol();
			IBasicSymbol endLabel = createLabelSymbol();
			
			add(label(startLabel.getSymbolIdentifier()));
			if (entry != null){
				String entryLabel = createLabelSymbol().getSymbolIdentifier();
				ISymbol entryExpr = compile(entry);
				add(op("branch", entryExpr.get(this).getSymbolIdentifier(), entryLabel, endLabel.getSymbolIdentifier()));
				add(label(entryLabel));
			}
			
			compile(body);
			
			if (exit != null){
				ISymbol exitExpr = compile(exit);
				add(op("branch", exitExpr.get(this).getSymbolIdentifier(), endLabel.getSymbolIdentifier(), startLabel.getSymbolIdentifier()));
			}else{
				add(op("goto", startLabel.getSymbolIdentifier()));
			}
			
			add(label(endLabel.getSymbolIdentifier()));
			return;
		}
		if (implementation instanceof OperationBlock){
			for(VariableDeclaration vd : ((OperationBlock) implementation).getVariables()){
				SymbolAssignment sa = null;
				if (vd.isConst()){
					SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
					sa = sva;
					sva.setValue((Long)expressionResolver.computeValue(vd.getInitValue()));
					sva.setType(TypeUtils.createTypeForConstant(sva.getValue()));
				}else{
					sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
					if (vd.getInitValue() != null){
						ISymbol initValue = compile(vd.getInitValue());
						compile("assign", BasicSymbol.getSymbol(vd), initValue);
					}
				}
				
				sa.setType(EcoreUtil.copy(vd.getType()));
				sa.setSymbol(BasicSymbol.getSymbol(vd).getSymbolIdentifier());
				add(sa);
			}
			
			for(Operation step : ((OperationBlock) implementation).getSteps()){
				compile(step);
			}
			return;
		}
		if (implementation instanceof ReturnOperation){
			Expression e = ((ReturnOperation) implementation).getResult();
			if (e != null){
				add(op("set", RESULT, compile(e).get(this).getSymbolIdentifier()));
			}
			add(op("goto", FUNCTION_END_LABEL));
			return;
		}
		throw new IllegalArgumentException("Operation is not supported: "+implementation);
	}
	
}
