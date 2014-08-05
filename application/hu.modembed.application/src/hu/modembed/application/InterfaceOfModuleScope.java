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

import application.ApplicationInterface;
import application.ApplicationInterfaceType;
import application.ApplicationModule;
import application.CompositeInterfacePart;
import application.CompositeInterfaceType;
import application.InterfaceOfModule;

/**
 * @author balazs.grill
 *
 */
public class InterfaceOfModuleScope extends AbstractScope {

	private final InterfaceOfModule reference;
	
	/**
	 * 
	 */
	public InterfaceOfModuleScope(InterfaceOfModule reference) {
		this.reference = reference;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		ApplicationInterface lastIf = null;
		
		List<ApplicationInterface> ifs = reference.getInterface();
		if (ifs.isEmpty()){
			ApplicationModule module = reference.getModule();
			if (module != null){
				lastIf = module.getImplementation();
			}
		}else{
			lastIf = ifs.get(ifs.size()-1);
		}
		
		if (lastIf != null){
			ApplicationInterfaceType type = lastIf.getType();
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
		}
		
		return Collections.emptyList();
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

}
