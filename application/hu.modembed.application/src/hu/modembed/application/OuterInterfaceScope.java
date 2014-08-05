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
import java.util.Collections;
import java.util.List;

import application.ApplicationInterfaceType;
import application.CompositeInterfacePart;
import application.CompositeInterfaceType;
import application.CompositeModuleImplementation;

/**
 * @author balazs.grill
 *
 */
public class OuterInterfaceScope extends AbstractScope {

	private final CompositeModuleImplementation context;
	
	/**
	 * 
	 */
	public OuterInterfaceScope(CompositeModuleImplementation context) {
		this.context = context;
	}

	@Override
	public Collection<IScopeElement> getLocalElements() {
		ApplicationInterfaceType type = context.getType();
		if (type instanceof CompositeInterfaceType){
			List<CompositeInterfacePart> expects = ((CompositeInterfaceType) type).getExpects();
			List<CompositeInterfacePart> impls = ((CompositeInterfaceType) type).getImplements();
			List<IScopeElement> result = new ArrayList<IScopeElement>(expects.size() + impls.size());
			for(CompositeInterfacePart part : expects){
				result.add(new SimpleScopeElement(part.getName(), part));
			}
			for(CompositeInterfacePart part : impls){
				result.add(new SimpleScopeElement(part.getName(), part));
			}
			return result;
		}
		
		return Collections.emptyList();
	}

	@Override
	public IFeatureScope parentScope() {
		return null;
	}

}
