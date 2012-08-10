/*
 * generated by Xtext
 */
package hu.e.parser.scoping;

import hu.e.parser.eSyntax.OperationCall;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
	
	protected IScope projectScope(EObject eobject, EReference ref){
		IScope scope = delegateGetScope(eobject, ref);
		scope = new ProjectDependencyScope(
				eobject.eResource().getURI(), eobject.eResource().getResourceSet(), scope);
		
		return scope;
	}
	
	public IScope scope_RefTypeDef_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
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
	
	public IScope scope_StructTypeDefMember_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_ArrayTypeDef_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_XStructExpression_type(EObject eobject, EReference ref){
		return importedScope(eobject, ref);
	}
	
	public IScope scope_XExpression0_member(EObject eobject, EReference ref){
		return new StructMemberScope(eobject, delegateGetScope(eobject, ref));
	}
	
	

	
	public IScope scope_ReferenceBinarySection_inc(EObject eobject, EReference ref){		
		return projectScope(eobject, ref);
	}
	
	public IScope scope_Library_overrides(EObject eobject, EReference ref){		
		return projectScope(eobject, ref);
	}
	
	public IScope scope_CompilationUnit_use(EObject eobject, EReference ref){		
		return projectScope(eobject, ref);
	}
	
	public IScope scope_FunctionBinarySection_lib(EObject eobject, EReference ref){		
		return projectScope(eobject, ref);
	}
}
