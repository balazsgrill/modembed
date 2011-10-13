/*
 * generated by Xtext
 */
package hu.e.parser.scoping;

import hu.e.parser.eSyntax.OperationCall;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class ESyntaxScopeProvider extends AbstractDeclarativeScopeProvider {

	protected IScope importedScope(EObject eobject, EReference ref){
		return new ImportedScope(eobject, ref.getEType().getInstanceClass(), delegateGetScope(eobject, ref));
	}
	
	public IScope scope_OperationCall_operation(OperationCall opcall, EReference ref){
		return importedScope(opcall, ref);
	}
	
	public IScope scope_Variable_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_Operation_returntype(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_VariableReference_var(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_OperatorDefinition_candidate(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_Package_uses(EObject eobject, EReference ref){
		
		
		//TODO: provide import package scope here
		IScope scope = delegateGetScope(eobject, ref);
		scope = new PluginDependencyScope(
				eobject.eResource().getURI(), eobject.eResource().getResourceSet(), scope);
		Iterable<IEObjectDescription> i = scope.getAllElements();
		Iterator<IEObjectDescription> iter = i.iterator();
		while(iter.hasNext()){
			IEObjectDescription odesc = iter.next();
			System.out.println(odesc.getName());
		}
		return scope;
	}
	
	public IScope scope_StructTypeDefMember_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_ArrayTypeDef_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_StructRef_ref(EObject eobject, EReference ref){
		return new StructMemberScope(eobject, delegateGetScope(eobject, ref));
	}
	
}
