/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class FunctionCrossReferenceScope extends AbstractCrossReferenceScope {

	private final Function function;
	private final ICrossReferenceScope parent;
	
	public FunctionCrossReferenceScope(Function function, ICrossReferenceScope parent) {
		parent.addSubScope(this);
		this.function = function;
		this.parent = parent;
	}
	
	@Override
	public List<EObject> resolve(String id) {
		List<EObject> result = new LinkedList<EObject>();
		for(FunctionParameter fp : function.getArguments()){
			if (id.equals(fp.getName())){
				result.add(fp);
			}
		}
		result.addAll(parent.resolve(id));
		return result;
	}


}
