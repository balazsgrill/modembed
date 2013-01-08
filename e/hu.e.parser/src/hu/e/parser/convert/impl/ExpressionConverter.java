/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.e.parser.convert.LibraryConverter;
import hu.e.parser.eSyntax.ADDITIVE_OPERATOR;
import hu.e.parser.eSyntax.Annotation;
import hu.e.parser.eSyntax.BOOLEAN_OPERATOR;
import hu.e.parser.eSyntax.EQUALITY_OPERATOR;
import hu.e.parser.eSyntax.ErrorLevels;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR;
import hu.e.parser.eSyntax.OpSingleAssign;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.UNARY_OPERATOR;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XErrorExpression;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpression6;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XPrimaryExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.CompilationLogStep;
import hu.modembed.model.emodel.expressions.CompilationLogStepSeverity;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.ExpressionsFactory;
import hu.modembed.model.emodel.expressions.ExpressionsPackage;
import hu.modembed.model.emodel.expressions.IntegerLiteralExpression;
import hu.modembed.model.emodel.expressions.LocalVariable;
import hu.modembed.model.emodel.expressions.VariableReference;

import java.math.BigInteger;

/**
 * @author balazs.grill
 *
 */
public class ExpressionConverter {
	
	public static ExecutionStep convert(XExpression xpression, ICrossReferenceScope scope){
		if (xpression instanceof XExpression6){
			ExecutionStep es = convert((XExpression6)xpression, scope);
			if (es != null){
				LibraryConverter.addOrigin(es, xpression);
			}
			return es;
		}
		return null;
	}
	
	public static Call createCall(PlatformOperations pop, ICrossReferenceScope scope){
		Call call = ExpressionsFactory.eINSTANCE.createCall();
		scope.addCrossReference(call, ExpressionsPackage.eINSTANCE.getCall_Function(), pop.qid());
		return call;
	}
	
	public static VariableReference vref(hu.e.parser.eSyntax.VariableReference vref, ICrossReferenceScope scope){
		VariableReference ref = ExpressionsFactory.eINSTANCE.createVariableReference();
		scope.addCrossReference(ref, ExpressionsPackage.eINSTANCE.getVariableReference_Variable(), vref.getVar());
		return ref;
	}
	
	public static PlatformOperations getOp(OpSingleAssign a){
		switch(a){
		case ASSIGN: return PlatformOperations.SET;
		case ASSIGNADD:
		case ASSIGNSUBTRACT:
		}
		return null;
	}
	
	public static ExecutionStep convert(XExpression6 x, ICrossReferenceScope scope){
		ExecutionStep step = convert(x.getA(), scope);
		if (x.getRef() != null){
			PlatformOperations pop = getOp(x.getOp());
			Call call = createCall(pop, scope);
			VariableReference ref = vref(x.getRef(), scope);
			call.getParameters().add(ref);
			call.getParameters().add(step);
			step = call;
		}
		if (x.getType() != null){
			//TODO Cast
		}
		return step;
	}
	
	public static PlatformOperations getOp(BOOLEAN_OPERATOR op){
		switch(op){
		case AND:
		case OR:
		}
		return null;
	}
	
	public static ExecutionStep convert(XExpression5 x, ICrossReferenceScope scope){
		ExecutionStep step = convert(x.getA(), scope);
		for(int i=0;i<x.getB().size();i++){
			ExecutionStep b = convert(x.getB().get(i), scope);
			PlatformOperations pop = getOp(x.getOp().get(i));
			Call call = createCall(pop, scope);
			call.getParameters().add(step);
			call.getParameters().add(b);
			step = call;
		}
		return step;
	}
	
	public static ExecutionStep convert(XExpression4 x, ICrossReferenceScope scope){
		ExecutionStep step = convert(x.getA(), scope);
		for(int i=0;i<x.getB().size();i++){
			ExecutionStep b = convert(x.getB().get(i), scope);
			PlatformOperations pop = getOp(x.getOp().get(i));
			Call call = createCall(pop, scope);
			call.getParameters().add(step);
			call.getParameters().add(b);
			step = call;
		}
		return step;
	}
	
	private static PlatformOperations getOp(EQUALITY_OPERATOR op) {
		switch(op){
		case EQUALS:
		case GT:
		case GTE:
		case LT:
		case LTE:
		case NOTEQUALS:
		}
		return null;
	}

	public static ExecutionStep convert(XExpression3 x, ICrossReferenceScope scope){
		ExecutionStep step = convert(x.getA(), scope);
		for(int i=0;i<x.getB().size();i++){
			ExecutionStep b = convert(x.getB().get(i), scope);
			PlatformOperations pop = getOp(x.getOp().get(i));
			Call call = createCall(pop, scope);
			call.getParameters().add(step);
			call.getParameters().add(b);
			step = call;
		}
		return step;
	}

	private static PlatformOperations getOp(ADDITIVE_OPERATOR op) {
		switch(op){
		case ADD:
		case MINUS:
		}
		return null;
	}

	private static ExecutionStep convert(XExpression2 x,
			ICrossReferenceScope scope) {
		ExecutionStep step = convert(x.getA(), scope);
		for(int i=0;i<x.getB().size();i++){
			ExecutionStep b = convert(x.getB().get(i), scope);
			PlatformOperations pop = getOp(x.getOp().get(i));
			Call call = createCall(pop, scope);
			call.getParameters().add(step);
			call.getParameters().add(b);
			step = call;
		}
		return step;
	}

	private static PlatformOperations getOp(
			MULTIPLICATIVE_OPERATOR op) {
		switch(op){
		case DIV:
		case MOD:
		case MUL:
		}
		return null;
	}

	private static ExecutionStep convert(XExpression1 x,
			ICrossReferenceScope scope) {
		ExecutionStep step = convert(x.getA(), scope);
		for(UNARY_OPERATOR op : x.getOperator()){
			PlatformOperations pop = getOp(op);
			Call call = createCall(pop, scope);
			call.getParameters().add(step);
			step = call;
		}
		return step;
	}

	private static PlatformOperations getOp(UNARY_OPERATOR op) {
		switch(op){
		case DEREFERENCE:
		case MINUS:
		case NOT:
		case REFERENCE:	
		}
		return null;
	}

	private static ExecutionStep convert(XExpression0 x,
			ICrossReferenceScope scope) {
		ExecutionStep step = convert(x.getA(), scope);
		//TODO resolve memebers
		return step;
	}

	private static ExecutionStep convert(XExpressionM1 x,
			ICrossReferenceScope scope) {
		
		ExecutionStep step = convert(x.getA(), scope);
		//TODO resolve Array indexing
		return step;
	}

	private static ExecutionStep convert(OperationCall call, ICrossReferenceScope scope){
		Call c = ExpressionsFactory.eINSTANCE.createCall();
		scope.addCrossReference(c, ExpressionsPackage.eINSTANCE.getCall_Function(), call.getOperation());
		for(OperationCallParameter cp : call.getParams()){
			c.getParameters().add(convert((XExpression)cp, scope));
		}
		return c;
	}
	
	private static ExecutionStep convert(XPrimaryExpression x,
			ICrossReferenceScope scope) {
		if (x instanceof OperationCall){
			return convert((OperationCall)x, scope);
		}
		if (x instanceof hu.e.parser.eSyntax.VariableReference){
			return vref((hu.e.parser.eSyntax.VariableReference) x, scope);
		}
		if (x instanceof OperationBlock){
			ExecutionBlock block = ExpressionsFactory.eINSTANCE.createExecutionBlock();
			ICrossReferenceScope sscope = new ExecutionBlockCrossReferenceScope(block, scope);
			for(OperationStep step : ((OperationBlock) x).getSteps()){
				block.getSteps().add(convert(step, sscope));
			}
			return block;
		}
		if (x instanceof XExpressionLiteral){
			return convert((XExpressionLiteral)x);
		}
		if (x instanceof XIsLiteralExpression){
			//TODO
		}
		if (x instanceof XParenthesizedExpression){
			return convert(((XParenthesizedExpression) x).getA(), scope);
		}
		if (x instanceof XSizeOfExpression){
			//TODO
		}
		if (x instanceof XStructExpression){
			//TODO
		}
		CompilationLogStep log = ExpressionsFactory.eINSTANCE.createCompilationLogStep();
		log.setSeverity(CompilationLogStepSeverity.ERROR);
		log.setMessage("TODO Unsupported structure: "+x);
		return log;
	}
	
	private static CompilationLogStepSeverity severity(ErrorLevels el){
		switch(el){
		case ERROR:
			return CompilationLogStepSeverity.ERROR;
		case INFO:
			return CompilationLogStepSeverity.INFO;
		case WARNING:
			return CompilationLogStepSeverity.WARNING;
		default:
			return CompilationLogStepSeverity.DEBUG;
		}
	}
	
	public static ExecutionStep convert(XExpressionLiteral x){
		String value = x.getValue();
		if (value.startsWith("0x")){
			value = value.substring(2);
			try{
				int v = Integer.parseInt(value, 16);
				IntegerLiteralExpression i = ExpressionsFactory.eINSTANCE.createIntegerLiteralExpression();
				i.setValue(BigInteger.valueOf(v));
				return i;
			}catch(NumberFormatException e){
				
			}
		}
		try{
			int v = Integer.parseInt(value);
			IntegerLiteralExpression i = ExpressionsFactory.eINSTANCE.createIntegerLiteralExpression();
			i.setValue(BigInteger.valueOf(v));
			return i;
		}catch(NumberFormatException e){
			
		}
		CompilationLogStep log = ExpressionsFactory.eINSTANCE.createCompilationLogStep();
		log.setSeverity(CompilationLogStepSeverity.ERROR);
		log.setMessage("Invalid literal: "+value);
		return log;
	}
	
	public static ExecutionStep convert(OperationStep x, ICrossReferenceScope scope){
		if (x instanceof Variable){
			Variable v = (Variable)x;
			LocalVariable lv = ExpressionsFactory.eINSTANCE.createLocalVariable();
			lv.setName(v.getName());
			if (!(x instanceof Label)){
				lv.setType(TypeConverter.convertTypeDef(v.getType(), scope));
			}
			return lv;
		}
		if (x instanceof Annotation){
			//TODO
		}
		if (x instanceof XErrorExpression){
			CompilationLogStep log = ExpressionsFactory.eINSTANCE.createCompilationLogStep();
			
			log.setSeverity(severity(((XErrorExpression) x).getLevel()));
			log.setMessage(((XErrorExpression) x).getMsg());
			return log;
		}
		if (x instanceof XExpression){
			return convert((XExpression)x, scope);
		}
		return null;
	}
	
}
