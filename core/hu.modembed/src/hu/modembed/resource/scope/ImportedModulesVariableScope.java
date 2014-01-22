/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ImportedModulesVariableScope implements IFeatureScope {

	private final StructuredModule module;
	
	/**
	 * 
	 */
	public ImportedModulesVariableScope(StructuredModule module) {
		this.module = module;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new LinkedList<IScopeElement>();
		for(StructuredModule m : module.getUses()){
			for(VariableDeclaration vd : m.getVariables()){
				list.add(new NamedScopeElement(vd));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		for(StructuredModule m : module.getUses()){
			for(VariableDeclaration vd : m.getVariables()){
				if (identifier.equals(vd.getName())){
					return new NamedScopeElement(vd);
				}
			}
		}
		return null;
	}

}
