/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ImportedModulesFunctionScope implements IFeatureScope {

	private final StructuredModule module;
	
	/**
	 * 
	 */
	public ImportedModulesFunctionScope(StructuredModule module) {
		this.module = module;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new LinkedList<IScopeElement>();
		for(StructuredModule m : module.getUses()){
			for(StructuredFunction f : m.getFunctions()){
				list.add(new NamedScopeElement(f));
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
			for(StructuredFunction f : m.getFunctions()){
				if (identifier.equals(f.getName())){
					return new NamedScopeElement(f);
				}
			}
		}
		return null;
	}

}
