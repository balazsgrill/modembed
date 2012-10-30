/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.e.parser.eSyntax.Operation;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Function;

/**
 * @author balazs.grill
 *
 */
public class FunctionConverter {

	public static Function convert(Operation operation, ICrossReferenceScope scope){
		Function func = EmodelFactory.eINSTANCE.createFunction();
		func.setName(operation.getName());
		
		//for(operation.g)
		
		return func;
	}

}
