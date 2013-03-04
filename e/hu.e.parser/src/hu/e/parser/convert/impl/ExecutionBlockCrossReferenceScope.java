/**
 * 
 */
package hu.e.parser.convert.impl;

import hu.e.parser.convert.ICrossReferenceScope;
import hu.modembed.model.core.NamedElement;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class ExecutionBlockCrossReferenceScope extends
		AbstractCrossReferenceScope {

	private final ExecutionBlock block;
	private final ICrossReferenceScope parent;
	
	public ExecutionBlockCrossReferenceScope(ExecutionBlock block, ICrossReferenceScope parent) {
		parent.addSubScope(this);
		this.block = block;
		this.parent = parent;
	}
	
	/* (non-Javadoc)
	 * @see hu.e.parser.convert.ICrossReferenceScope#resolve(java.lang.String)
	 */
	@Override
	public List<EObject> resolve(String id) {
		List<EObject> result = new ArrayList<EObject>();
		for(ExecutionStep step : block.getSteps()){
			if (step instanceof NamedElement){
				if (id.equals(((NamedElement) step).getName())){
					result.add(step);
				}
			}
		}
		result.addAll(parent.resolve(id));
		return result;
	}

}
