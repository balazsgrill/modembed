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
import hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition;
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
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Assert;
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
	
	private static TypedSymbol getSymbol(VariableDeclaration vd){
		if (vd.isGlobal()){
			return new TypedSymbol(vd.getName(), vd.getType());
		}
		EObject eo = vd.eContainer();
		if (eo instanceof StructuredModule){
			String qid = ((StructuredModule) eo).getName()+".."+vd.getName();
			return new TypedSymbol(qid.replace('.', '_'), vd.getType());
		}
		//Parameter or local symbol
		return new TypedSymbol(vd.getName(), vd.getType());
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
	
	private TypedSymbol getConstantSymbol(SequentialBehaviorPart result, long constant){
		String symbol = CONSTANT+constant;
		TypeDefinition type = createTypeForConstant(constant);
		for(SymbolAssignment sa : result.getLocalSymbols()){
			if (symbol.equals(sa.getSymbol())) return new TypedSymbol(symbol, type);
		}
		SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
		sva.setSymbol(symbol);
		sva.setValue(constant);
		sva.setType(type);
		result.getLocalSymbols().add(sva);
		return new TypedSymbol(symbol, type);
	}
	
	private TypeDefinition createTypeForConstant(long constant){
		int bits = 1;
		int maxv = 1;
		while(constant > maxv){
			bits++;
			maxv *= 2;
		}
		return createUnsignedTypeDef(bits);
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
	
	private TypedSymbol allocateSymbol(SequentialBehaviorPart result, TypeDefinition type, String prefix){
		Assert.isNotNull(type);
		String symbol = getUniqueSymbol(result.getLocalSymbols(), prefix);
		
		SymbolAllocation sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
		sa.setType(EcoreUtil.copy(type));
		sa.setSymbol(symbol);
		result.getLocalSymbols().add(sa);
		return new TypedSymbol(symbol, type);
	}
	
	private TypedSymbol compile(SequentialBehaviorPart result, Expression expression){
		if (expression instanceof FunctionCallExpression){
			StructuredFunction sf = ((FunctionCallExpression) expression).getFunction();
			TypedSymbol resultSymbol = null;
			OperationExecution call = BehaviorFactory.eINSTANCE.createOperationExecution();
			call.setOperation(getSymbol(sf));
			
			if (sf.getResultType() != null){
				TypeDefinition td = EcoreUtil.copy(sf.getResultType());
				resultSymbol = allocateSymbol(result, td, BUFFER);
				call.getArguments().add(resultSymbol.getSymbol());
			}
	
			for(Expression e : ((FunctionCallExpression) expression).getArguments()){
				call.getArguments().add(compile(result, e).getSymbol());
			}
			result.getActions().add(call);
			return resultSymbol;
		}
		if (expression instanceof IntegerConstExpression){
			return getConstantSymbol(result, ((IntegerConstExpression) expression).getValue());
		}
		if (expression instanceof OperationExpression){
			List<TypedSymbol> arguments = new ArrayList<TypedSymbol>(((OperationExpression) expression).getArguments().size());
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
			TypedSymbol conditionSymbol = compile(result, condition);
			
			Operation trueBranch = ((ConditionalOperation) implementation).getTrueBranch();
			Operation falseBranch = ((ConditionalOperation) implementation).getFalseBranch();
			
			TypedSymbol trueLabel = createLabelSymbol(result);
			TypedSymbol falseLabel = createLabelSymbol(result);
			TypedSymbol endLabel = createLabelSymbol(result);
			
			result.getActions().add(op("branch", conditionSymbol.getSymbol(), trueLabel.getSymbol(), falseLabel.getSymbol()));
			result.getActions().add(label(trueLabel.getSymbol()));
			
			if (trueBranch != null){
				compile(result, trueBranch);
			}
			
			if (falseBranch != null) result.getActions().add(op("goto", endLabel.getSymbol()));
			result.getActions().add(label(falseLabel.getSymbol()));

			if (falseBranch != null){
				compile(result, falseBranch);
			}
			
			result.getActions().add(label(endLabel.getSymbol()));
		}
		if (implementation instanceof ExpressionOperation){
			compile(result, ((ExpressionOperation) implementation).getExpression());
		}
		if (implementation instanceof LoopOperation){
			Expression entry = ((LoopOperation) implementation).getEntryCondition();
			Expression exit = ((LoopOperation) implementation).getExitCondition();
			Operation body = ((LoopOperation) implementation).getBody();
			
			TypedSymbol startLabel = createLabelSymbol(result);
			TypedSymbol endLabel = createLabelSymbol(result);
			
			result.getActions().add(label(startLabel.getSymbol()));
			if (entry != null){
				String entryLabel = createLabelSymbol(result).getSymbol();
				TypedSymbol entryExpr = compile(result, entry);
				result.getActions().add(op("branch", entryExpr.getSymbol(), entryLabel, endLabel.getSymbol()));
				result.getActions().add(label(entryLabel));
			}
			
			compile(result, body);
			
			if (exit != null){
				TypedSymbol exitExpr = compile(result, exit);
				result.getActions().add(op("branch", exitExpr.getSymbol(), endLabel.getSymbol(), startLabel.getSymbol()));
			}else{
				result.getActions().add(op("goto", startLabel.getSymbol()));
			}
			
			result.getActions().add(label(endLabel.getSymbol()));
		}
		if (implementation instanceof OperationBlock){
			for(VariableDeclaration vd : ((OperationBlock) implementation).getVariables()){
				SymbolAssignment sa = null;
				if (vd.isConst()){
					SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
					sa = sva;
					sva.setValue(computeConstant(vd.getInitValue()));
					sva.setType(createTypeForConstant(sva.getValue()));
				}else{
					sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
					if (vd.getInitValue() != null){
						TypedSymbol initValue = compile(result, vd.getInitValue());
						compile(result, "assign", Arrays.asList(getSymbol(vd), initValue));
					}
				}
				
				sa.setType(EcoreUtil.copy(vd.getType()));
				sa.setSymbol(getSymbol(vd).getSymbol());
				result.getLocalSymbols().add(sa);
			}
			
			for(Operation step : ((OperationBlock) implementation).getSteps()){
				compile(result, step);
			}
		}
		if (implementation instanceof ReturnOperation){
			Expression e = ((ReturnOperation) implementation).getResult();
			if (e != null){
				result.getActions().add(op("set", RESULT, compile(result, e).getSymbol()));
			}
			result.getActions().add(op("goto", FUNCTION_END_LABEL));
		}
	}
	
	private TypedSymbol createLabelSymbol(SequentialBehaviorPart result) {
		return allocateSymbol(result, TypesFactory.eINSTANCE.createCodeLabelTypeDefinition(), LABEL);
	}

	private long computeConstant(Expression expression){
		if (expression instanceof IntegerConstExpression){
			return ((IntegerConstExpression) expression).getValue();
		}
		if (expression instanceof VariableReferenceExpression){
			VariableDeclaration vd = ((VariableReferenceExpression) expression).getVariable();
			if (vd.isConst()){
				return computeConstant(vd.getInitValue());
			}
		}
		if (expression instanceof OperationExpression){
			String operation = ((OperationExpression) expression).getOperation();
			//TODO execute operation compile-time
		}
		throw new RuntimeException(expression+" is not constant!");
	}
	
	public SequentialBehaviorModule compile(StructuredModule module){
		SequentialBehaviorModule result = BehaviorFactory.eINSTANCE.createSequentialBehaviorModule();
		result.setName(module.getName()+".sb");
		
		SequentialBehaviorPart initFunction = BehaviorFactory.eINSTANCE.createSequentialBehaviorPart();
		initFunction.setName("__INIT__"+module.getName().replace('.', '_'));
		result.setInitSequence(initFunction);
		
		for(VariableDeclaration vd : module.getVariables()){
			SymbolAssignment sa = null;
			if (vd.isConst()){
				SymbolValueAssignment sva = BehaviorFactory.eINSTANCE.createSymbolValueAssignment();
				sva.setValue(computeConstant(vd.getInitValue()));
				sa = sva;
				sva.setType(createTypeForConstant(sva.getValue()));
			}else{
				sa = BehaviorFactory.eINSTANCE.createSymbolAllocation();
				if (vd.getInitValue() != null){
					TypedSymbol initValue = compile(initFunction, vd.getInitValue());
					compile(initFunction, "assign", Arrays.asList(getSymbol(vd), initValue));
				}
			}
			
			sa.setType(EcoreUtil.copy(vd.getType()));
			sa.setSymbol(getSymbol(vd).getSymbol());
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
					sbp.getParameters().add(getSymbol(param).getSymbol());
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
	
	private TypeDefinition createUnsignedTypeDef(int bits){
		UnsignedTypeDefinition utd = TypesFactory.eINSTANCE.createUnsignedTypeDefinition();
		utd.setBits(bits);
		return utd;
	}
	
	private TypeDefinition extend(TypeDefinition td1, TypeDefinition td2){
		td1 = EcoreUtil.copy(td1);
		td2 = EcoreUtil.copy(td2);
		TypeDefinition rd1 = TypeSignature.raw(td1);
		TypeDefinition rd2 = TypeSignature.raw(td2);
		
		if (rd1 instanceof UnsignedTypeDefinition && rd2 instanceof UnsignedTypeDefinition){
			if (((UnsignedTypeDefinition)rd1).getBits() >= ((UnsignedTypeDefinition)rd2).getBits()){
				return td1;
			}else{
				return td2;
			}
		}
		
		if (td1 == null) return td2;
		
		return td1;
	}
	
	private TypedSymbol extendSymbol(SequentialBehaviorPart result, TypedSymbol symbol, TypeDefinition to){
		TypeDefinition td = extend(symbol.getType(), to);
		if (TypeSignature.isCompatible(td, symbol.getType())){
			return symbol;
		}
		TypedSymbol buffer = allocateSymbol(result, td, "buffer");
		result.getActions().add(op("set", buffer.getSymbol(), symbol.getSymbol()));
		return buffer;
	}
	
	/**
	 * Compile a high-level operation to low-level operations 
	 * 
	 * @param result
	 * @param operation
	 * @param arguments
	 * @return
	 */
	private TypedSymbol compile(SequentialBehaviorPart result, String operation, List<TypedSymbol> arguments){
		if ("assign".equals(operation)){
			result.getActions().add(op("set", arguments.get(0).getSymbol(), arguments.get(1).getSymbol()));
			return arguments.get(0);
		}
		if ("add".equals(operation)){
			TypedSymbol a0 = arguments.get(0);
			TypedSymbol a1 = arguments.get(1);
			
			TypedSymbol v0 = extendSymbol(result, a0, a1.getType());
			TypedSymbol v1 = extendSymbol(result, a1, a0.getType());
			
			TypedSymbol buffer = allocateSymbol(result, v0.getType(), "buffer");
			result.getActions().add(op("set", buffer.getSymbol(), v0.getSymbol()));
			result.getActions().add(op("add", buffer.getSymbol(), v1.getSymbol()));
			return buffer;
		}
		if ("subtract".equals(operation)){
			TypedSymbol a0 = arguments.get(0);
			TypedSymbol a1 = arguments.get(1);
			
			TypedSymbol v0 = extendSymbol(result, a0, a1.getType());
			TypedSymbol v1 = extendSymbol(result, a1, a0.getType());
			
			TypedSymbol buffer = allocateSymbol(result, v0.getType(), "buffer");
			result.getActions().add(op("set", buffer.getSymbol(), v0.getSymbol()));
			result.getActions().add(op("subtract", buffer.getSymbol(), v1.getSymbol()));
			return buffer;
		}
		if ("greater".equals(operation)){
			TypedSymbol a0 = arguments.get(0);
			TypedSymbol a1 = arguments.get(1);
			
			TypedSymbol v0 = extendSymbol(result, a0, a1.getType());
			TypedSymbol v1 = extendSymbol(result, a1, a0.getType());
			
			TypedSymbol buffer = allocateSymbol(result, createUnsignedTypeDef(1), "buffer");
			result.getActions().add(op("greater", buffer.getSymbol(), v0.getSymbol(), v1.getSymbol()));
			return buffer;
		}
		throw new RuntimeException("Unsupported operation: "+operation);
	}
	
	
	
}
