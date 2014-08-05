/**
 * 
 */
package hu.modembed.application;

import hu.temon.parser.scope.AbstractScope;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;
import hu.temon.parser.scope.SimpleScopeElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import application.ApplicationModule;
import application.CompositeModuleImplementation;

/**
 * @author balazs.grill
 *
 */
public class SubModuleScope extends AbstractScope {

	private final CompositeModuleImplementation context;
	
	/**
	 * 
	 */
	public SubModuleScope(CompositeModuleImplementation context) {
		this.context = context;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<ApplicationModule> modules = context.getSubModules();
		
		List<IScopeElement> result = new ArrayList<IScopeElement>(modules.size());
		for(ApplicationModule m : modules){
			result.add(new SimpleScopeElement(m.getName(), m));
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

}
