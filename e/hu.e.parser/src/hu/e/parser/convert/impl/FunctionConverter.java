/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.e.parser.eSyntax.LazyParameter;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationParameter;
import hu.e.parser.eSyntax.OperationTypeDef;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.VariableParameter;

/**
 * @author balazs.grill
 *
 */
public class FunctionConverter {

	private static FunctionParameter convert(OperationParameter op, ICrossReferenceScope scope){
		if (op instanceof ParameterVariable){
			VariableParameter vp = EmodelFactory.eINSTANCE.createVariableParameter();
			vp.setName(((ParameterVariable) op).getName());
			vp.setType(TypeConverter.convertTypeDef(((ParameterVariable) op).getType(), scope));
			//TODO FIXME Parameter Kind is discared!
			return vp;
		}
		if (op instanceof LazyParameter){
			hu.modembed.model.emodel.LazyParameter lp = EmodelFactory.eINSTANCE.createLazyParameter();
			lp.setName(((LazyParameter) op).getParamname());
			OperationTypeDef ot = ((LazyParameter) op).getType();
			lp.setType(TypeConverter.convertTypeDef(ot.getResultType(), scope));
			for(OperationParameter lop : ot.getParams()){
				lp.getParameters().add(convert(lop, scope));
			}
			return lp;
		}
		return null;
		
	}
	
	public static Function convert(Operation operation, ICrossReferenceScope scope){
		Function func = EmodelFactory.eINSTANCE.createFunction();
		func.setName(operation.getName());
		
		OperationTypeDef ot = operation.getType();
		for(OperationParameter op : ot.getParams()){
			FunctionParameter fp = convert(op, scope);
			func.getArguments().add(fp);
		}
		
		return func;
	}

}
