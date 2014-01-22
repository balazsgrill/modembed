/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class StructuredModuleFunctionScope implements IFeatureScope {

	private final StructuredModule module;
	
	/**
	 * 
	 */
	public StructuredModuleFunctionScope(StructuredModule module) {
		this.module = module;
	}

	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new ArrayList<IScopeElement>(module.getFunctions().size());
		for(StructuredFunction f : module.getFunctions()){
			list.add(new NamedScopeElement(f));
		}
		return list;
	}

	@Override
	public IFeatureScope parentScope() {
		return new ImportedModulesFunctionScope(module);
	}

	@Override
	public IScopeElement find(String identifier) {
		for(StructuredFunction f : module.getFunctions()){
			if (identifier.equals(f.getName())){
				return new NamedScopeElement(f);
			}
		}
		return null;
	}
}
