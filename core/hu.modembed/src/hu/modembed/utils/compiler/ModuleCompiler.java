/**
 * 
 */
package hu.modembed.utils.compiler;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.abstraction.types.TypesFactory;
import hu.modembed.model.modembed.structured.ConditionalOperation;
import hu.modembed.model.modembed.structured.Expression;
import hu.modembed.model.modembed.structured.ExpressionOperation;
import hu.modembed.model.modembed.structured.FunctionCallExpression;
import hu.modembed.model.modembed.structured.IntegerConstExpression;
import hu.modembed.model.modembed.structured.LoopOperation;
import hu.modembed.model.modembed.structured.Operation;
import hu.modembed.model.modembed.structured.OperationBlock;
import hu.modembed.model.modembed.structured.OperationExpression;
import hu.modembed.model.modembed.structured.ReturnOperation;
import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.modembed.model.modembed.structured.VariableReferenceExpression;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class ModuleCompiler {

	private static final String RESULT = "__RESULT__";
	private static final String FUNCTION_END_LABEL = "__FUNCTION_END__";
	private static final String CONSTANT = "__CONSTANT__";
	private static final String LABEL = "__LABEL__";
	private static final String BUFFER = "__BUFFER__";
	
	private static String getSymbol(VariableDeclaration vd){
		EObject eo = vd.eContainer();
		if (eo instanceof StructuredModule){
			String qid = ((StructuredModule) eo).getName()+".."+vd.getName();
			return qid.replace('.', '_');
		}
		//Parameter or local symbol
		return vd.getName();
	}
	
	private static String getSymbol(StructuredFunction function){
		StructuredModule module = (StructuredModule)function.eContainer();
		String name = function.getName();
		for(StructuredModule sm : module.getUses()){
			for(StructuredFunction sf : sm.getFunctions()){
				if (name.equals(sf.getName())){
					//TODO check signature?
					return getSymbol(sf);
				}
			}
		}
		
		String qid = module.getName()+".."+function.getName();
		return qid.replace('.', '_');
	}
	
	private SequentialAction label(String labelSymbol){
		CodeSymbolPlacement label = BehaviorFactory.eINSTANCE.createCodeSymbolPlacement();
		label.setSymbol(labelSymbol);
		return label;
	}
	
	private SequentialAction op(String operation, String...arguments){
		OperationExecution op = BehaviorFactory.eINSTANCE.createOperationExecution();
		op.setOperation(operation);
		for(String arg : arguments){
			op.getArguments().add(arg);
		}
		return op;
	}
	
	private String getConstantSymbol(SequentialBehaviorPart result, long constant){
		String symbol = CONSTANT+constant;
		for(SymbolAssignment sa : result.getLocalSymbols()){
			if (symbol.equals(sa.getSymbol())) return symbol;
		}
		SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
		sva.setSymbol(symbol);
		sva.setValue(constant);
		result.getLocalSymbols().add(sva);
		return symbol;
	}
	
	private String getUniqueSymbol(List<SymbolAssignment> assignments, String prefix){
		int i=0;
		boolean done = false;
		while(!done){
			i++;
			done = true;
			for(SymbolAssignment sa : assignments) if (done){
				if (sa.getSymbol().equals(prefix+i)){
					done = false;
				}
			}
		}
		
		return prefix+i;
	}
	
	private String allocateSymbol(SequentialBehaviorPart result, TypeDefinition type, String prefix){
		String symbol = getUniqueSymbol(result.getLocalSymbols(), prefix);
		
		SymbolAllocation sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
		sa.setType(type);
		sa.setSymbol(symbol);
		result.getLocalSymbols().add(sa);
		return symbol;
	}

	private String compile(SequentialBehaviorPart result, String operation, List<String> arguments){
		if ("assign".equals(operation)){
			result.getActions().add(op("set", arguments.get(0), arguments.get(1)));
		}
		return null;
	}
	
	private String compile(SequentialBehaviorPart result, Expression expression){
		if (expression instanceof FunctionCallExpression){
			StructuredFunction sf = ((FunctionCallExpression) expression).getFunction();
			String resultSymbol = null;
			OperationExecution call = BehaviorFactory.eINSTANCE.createOperationExecution();
			call.setOperation(getSymbol(sf));
			
			if (sf.getResultType() != null){
				resultSymbol = allocateSymbol(result, EcoreUtil.copy(sf.getResultType()), BUFFER);
				call.getArguments().add(resultSymbol);
			}
	
			for(Expression e : ((FunctionCallExpression) expression).getArguments()){
				call.getArguments().add(compile(result, e));
			}
			result.getActions().add(call);
			return resultSymbol;
		}
		if (expression instanceof IntegerConstExpression){
			return getConstantSymbol(result, ((IntegerConstExpression) expression).getValue());
		}
		if (expression instanceof OperationExpression){
			List<String> arguments = new ArrayList<String>(((OperationExpression) expression).getArguments().size());
			for(Expression e : ((OperationExpression) expression).getArguments()){
				arguments.add(compile(result, e));
			}
			
			return compile(result, ((OperationExpression) expression).getOperation(), arguments);
		}
		if (expression instanceof VariableReferenceExpression){
			return getSymbol(((VariableReferenceExpression) expression).getVariable());
		}
		throw new RuntimeException("Expression error: "+expression);
	}
	
	private void compile(SequentialBehaviorPart result, Operation implementation){
		if (implementation instanceof ConditionalOperation){
			Expression condition = ((ConditionalOperation) implementation).getCondition();
			String conditionSymbol = compile(result, condition);
			
			Operation trueBranch = ((ConditionalOperation) implementation).getTrueBranch();
			Operation falseBranch = ((ConditionalOperation) implementation).getFalseBranch();
			
			String trueLabel = createLabelSymbol(result);
			String falseLabel = createLabelSymbol(result);
			String endLabel = createLabelSymbol(result);
			
			result.getActions().add(op("branch", conditionSymbol, trueLabel, falseLabel));
			result.getActions().add(label(trueLabel));
			
			if (trueBranch != null){
				compile(result, trueBranch);
			}
			
			if (falseBranch != null) result.getActions().add(op("goto", endLabel));
			result.getActions().add(label(falseLabel));

			if (falseBranch != null){
				compile(result, falseBranch);
			}
			
			result.getActions().add(label(endLabel));
		}
		if (implementation instanceof ExpressionOperation){
			compile(result, ((ExpressionOperation) implementation).getExpression());
		}
		if (implementation instanceof LoopOperation){
			Expression entry = ((LoopOperation) implementation).getEntryCondition();
			Expression exit = ((LoopOperation) implementation).getExitCondition();
			Operation body = ((LoopOperation) implementation).getBody();
			
			String startLabel = createLabelSymbol(result);
			String endLabel = createLabelSymbol(result);
			
			result.getActions().add(label(startLabel));
			if (entry != null){
				String entryLabel = createLabelSymbol(result);
				String entryExpr = compile(result, entry);
				result.getActions().add(op("branch", entryExpr, entryLabel, endLabel));
				result.getActions().add(label(entryLabel));
			}
			
			compile(result, body);
			
			if (exit != null){
				String exitExpr = compile(result, exit);
				result.getActions().add(op("branch", exitExpr, endLabel, startLabel));
			}else{
				result.getActions().add(op("goto", startLabel));
			}
			
			result.getActions().add(label(endLabel));
		}
		if (implementation instanceof OperationBlock){
			for(VariableDeclaration vd : ((OperationBlock) implementation).getVariables()){
				SymbolAssignment sa = null;
				if (vd.isConst()){
					SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
					sa = sva;
					//TODO compute value
				}else{
					sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
					//TODO add init value
				}
				
				sa.setType(EcoreUtil.copy(vd.getType()));
				sa.setSymbol(getSymbol(vd));
				result.getLocalSymbols().add(sa);
			}
			
			for(Operation step : ((OperationBlock) implementation).getSteps()){
				compile(result, step);
			}
		}
		if (implementation instanceof ReturnOperation){
			Expression e = ((ReturnOperation) implementation).getResult();
			if (e != null){
				result.getActions().add(op("set", RESULT, compile(result, e)));
			}
			result.getActions().add(op("goto", FUNCTION_END_LABEL));
		}
	}
	
	private String createLabelSymbol(SequentialBehaviorPart result) {
		return allocateSymbol(result, TypesFactory.eINSTANCE.createCodeLabelTypeDefinition(), LABEL);
	}

	public SequentialBehaviorModule compile(StructuredModule module){
		SequentialBehaviorModule result = BehaviorFactory.eINSTANCE.createSequentialBehaviorModule();
		result.setName(module.getName()+".sb");
		
		for(VariableDeclaration vd : module.getVariables()){
			SymbolAssignment sa = null;
			if (vd.isConst()){
				SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
				sa = sva;
				//TODO compute value
			}else{
				sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				//TODO add init value
			}
			
			sa.setType(EcoreUtil.copy(vd.getType()));
			sa.setSymbol(getSymbol(vd));
			result.getSymbolMappings().add(sa);
		}
		
		for(StructuredFunction func : module.getFunctions()){
			if (func.getImplementation() != null){
				SequentialBehaviorPart sbp = BehaviorFactory.eINSTANCE.createSequentialBehaviorPart();
				sbp.setName(getSymbol(func));
				
				if (func.getResultType() != null){
					sbp.getParameters().add(RESULT);
				}
				
				for(VariableDeclaration param : func.getParameters()){
					sbp.getParameters().add(getSymbol(param));
				}
				
				SymbolAllocation function_end = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				function_end.setType(TypesFactory.eINSTANCE.createCodeLabelTypeDefinition());
				function_end.setSymbol(FUNCTION_END_LABEL);
				
				compile(sbp, func.getImplementation());
				
				CodeSymbolPlacement functionEnd = BehaviorFactory.eINSTANCE.createCodeSymbolPlacement();
				functionEnd.setSymbol(FUNCTION_END_LABEL);
				sbp.getActions().add(functionEnd);
				result.getBehaviorModels().add(sbp);
			}
		}
		
		return result;
	}
	
}
