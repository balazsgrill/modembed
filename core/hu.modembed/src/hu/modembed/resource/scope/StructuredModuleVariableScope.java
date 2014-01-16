/**
 * 
 */
package hu.modembed.resource.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

/**
 * @author balazs.grill
 *
 */
public class StructuredModuleVariableScope implements IFeatureScope{

	private final StructuredModule module;
	
	/**
	 * 
	 */
	public StructuredModuleVariableScope(StructuredModule module) {
		this.module = module;
	}

	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new ArrayList<IScopeElement>(module.getVariables().size());
		for(VariableDeclaration vd : module.getVariables()){
			list.add(new NamedScopeElement(vd));
		}
		return list;
	}

	@Override
	public IFeatureScope parentScope() {
		return new ImportedModulesVariableScope(module);
	}

	@Override
	public IScopeElement find(String identifier) {
		for(VariableDeclaration vd : module.getVariables()){
			if (identifier.equals(vd.getName())){
				return new NamedScopeElement(vd);
			}
		}
		return null;
	}

}
