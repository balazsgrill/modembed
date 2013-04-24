/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeReferenceResolverSwitch implements hu.modembed.model.textnotations.type.ITypeReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected hu.modembed.model.textnotations.type.analysis.ReferenceTypeDefinitionTypeReferenceResolver referenceTypeDefinitionTypeReferenceResolver = new hu.modembed.model.textnotations.type.analysis.ReferenceTypeDefinitionTypeReferenceResolver();
	
	public hu.modembed.model.textnotations.type.ITypeReferenceResolver<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type> getReferenceTypeDefinitionTypeReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type(), referenceTypeDefinitionTypeReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		referenceTypeDefinitionTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, hu.modembed.model.textnotations.type.ITypeReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition().isInstance(container)) {
			TypeFuzzyResolveResult<hu.modembed.model.modembed.abstraction.types.Type> frr = new TypeFuzzyResolveResult<hu.modembed.model.modembed.abstraction.types.Type>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				referenceTypeDefinitionTypeReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public hu.modembed.model.textnotations.type.ITypeReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type()) {
			return getResolverChain(reference, referenceTypeDefinitionTypeReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> hu.modembed.model.textnotations.type.ITypeReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, hu.modembed.model.textnotations.type.ITypeReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(hu.modembed.model.textnotations.type.ITypeOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new hu.modembed.model.textnotations.type.util.TypeRuntimeUtil().logWarning("Found value with invalid type for option " + hu.modembed.model.textnotations.type.ITypeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof hu.modembed.model.textnotations.type.ITypeReferenceResolver) {
			hu.modembed.model.textnotations.type.ITypeReferenceResolver replacingResolver = (hu.modembed.model.textnotations.type.ITypeReferenceResolver) resolverValue;
			if (replacingResolver instanceof hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			hu.modembed.model.textnotations.type.ITypeReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof hu.modembed.model.textnotations.type.ITypeReferenceCache) {
					hu.modembed.model.textnotations.type.ITypeReferenceResolver nextResolver = (hu.modembed.model.textnotations.type.ITypeReferenceResolver) next;
					if (nextResolver instanceof hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new hu.modembed.model.textnotations.type.util.TypeRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.type.ITypeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new hu.modembed.model.textnotations.type.util.TypeRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.type.ITypeOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.type.ITypeDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
