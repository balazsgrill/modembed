/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.ResultBuffer;

import java.util.Collections;
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
	
	private ResultBuffer resultBuffer; 
	
	public FunctionCrossReferenceScope(Function function, ICrossReferenceScope parent) {
		parent.addSubScope(this);
		this.function = function;
		this.parent = parent;
	}
	
	public void setResultBuffer(ResultBuffer resultBuffer) {
		this.resultBuffer = resultBuffer;
	}
	
	@Override
	public List<EObject> resolve(String id) {
		if ("result".equals(id) && (resultBuffer != null)){
			return Collections.<EObject>singletonList(resultBuffer);
		}
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
