/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.structured.OperationBlock;
import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.VariableDeclaration;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class VariableReferenceScope implements IFeatureScope {

	public static IFeatureScope getScope(EObject element){
		EObject context = findContext(element);
		
		if (context instanceof OperationBlock){
			return new VariableReferenceScope((OperationBlock) context);
		}
		if (context instanceof StructuredFunction){
			return new StructuredFunctionParameterScope((StructuredFunction) context);
		}
		if (context instanceof StructuredModule){
			return new StructuredModuleVariableScope((StructuredModule)context);
		}
		
		return null;
	}
	
	private static EObject findContext(EObject current){
		if (current == null) return null;
		if (current instanceof OperationBlock) return current;
		if (current instanceof StructuredFunction) return current;
		if (current instanceof StructuredModule) return current;
		return findContext(current.eContainer());
	}
	
	private final OperationBlock block;
	
	/**
	 * 
	 */
	public VariableReferenceScope(OperationBlock block) {
		this.block = block;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> list = new ArrayList<IScopeElement>(block.getVariables().size());
		for(VariableDeclaration vd : block.getVariables()){
			list.add(new NamedScopeElement(vd));
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return getScope(block.eContainer());
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		for(VariableDeclaration vd : block.getVariables()){
			if (identifier.equals(vd.getName())){
				return new NamedScopeElement(vd);
			}
		}
		return null;
	}

}
