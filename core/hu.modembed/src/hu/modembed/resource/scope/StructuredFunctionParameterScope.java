/**
 * 
 */
package hu.modembed.resource.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

/**
 * @author balazs.grill
 *
 */
public class StructuredFunctionParameterScope implements IFeatureScope {

	private final StructuredFunction function;
	
	/**
	 * 
	 */
	public StructuredFunctionParameterScope(StructuredFunction function) {
		this.function = function;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new ArrayList<IScopeElement>(function.getParameters().size());
		for(VariableDeclaration vd : function.getParameters()){
			list.add(new NamedScopeElement(vd));
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return VariableReferenceScope.getScope(function.eContainer());
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		for(VariableDeclaration vd : function.getParameters()){
			if (identifier.equals(vd.getName())){
				return new NamedScopeElement(vd);
			}
		}
		return null;
	}

}
