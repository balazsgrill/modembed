/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.e.parser.convert.LibraryConverter;
import hu.e.parser.eSyntax.LazyParameter;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationParameter;
import hu.e.parser.eSyntax.OperationTypeDef;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.VariableParameter;
import hu.modembed.model.emodel.VariableParameterKind;

/**
 * @author balazs.grill
 *
 */
public class FunctionConverter {

	private static VariableParameterKind kind(ParameterKind kind){
		switch(kind){
		case ANY: return VariableParameterKind.ANY;
		case CONST: return VariableParameterKind.CONST;
		case VAR: return VariableParameterKind.VAR;
		default: return VariableParameterKind.ANY;
		}
	}
	
	private static FunctionParameter convert(OperationParameter op, ICrossReferenceScope scope){
		if (op instanceof ParameterVariable){
			VariableParameter vp = EmodelFactory.eINSTANCE.createVariableParameter();
			vp.setName(((ParameterVariable) op).getName());
			vp.setType(TypeConverter.convertTypeDef(((ParameterVariable) op).getType(), scope));
			vp.setKind(kind(((ParameterVariable) op).getKind()));
			LibraryConverter.addOrigin(vp, op);
			return vp;
		}
		if (op instanceof LazyParameter){
			hu.modembed.model.emodel.LazyParameter lp = EmodelFactory.eINSTANCE.createLazyParameter();
			lp.setName(((LazyParameter) op).getParamname());
			OperationTypeDef ot = ((LazyParameter) op).getType();
			lp.setType(TypeConverter.convertTypeDef(ot.getResultType(), scope));
			for(OperationParameter lop : ot.getParams()){
				lp.getArguments().add(convert(lop, scope));
			}
			LibraryConverter.addOrigin(lp, op);
			return lp;
		}
		return null;
		
	}
	
	public static Function convert(Operation operation, ICrossReferenceScope scope){
		Function func = EmodelFactory.eINSTANCE.createFunction();
		func.setName(operation.getName());
		LibraryConverter.addOrigin(func, operation);
		FunctionCrossReferenceScope funcscope = new FunctionCrossReferenceScope(func, scope);
		
		String overrides = operation.getOverrides();
		if (overrides != null){
			scope.addCrossReference(func, EmodelPackage.eINSTANCE.getFunction_Overrides(), overrides);
		}
		
		OperationTypeDef ot = operation.getType();
		func.setType(TypeConverter.convertTypeDef(ot.getResultType(), scope));
		for(OperationParameter op : ot.getParams()){
			FunctionParameter fp = convert(op, scope);
			func.getArguments().add(fp);
		}
		
		func.setImplementation(ExpressionConverter.convert(operation.getContent(), funcscope));
		
		return func;
	}

}
