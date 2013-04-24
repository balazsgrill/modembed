/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetReferenceResolverSwitch implements hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected hu.modembed.model.textnotations.instructionset.analysis.InstructionSetExtendReferenceResolver instructionSetExtendReferenceResolver = new hu.modembed.model.textnotations.instructionset.analysis.InstructionSetExtendReferenceResolver();
	protected hu.modembed.model.textnotations.instructionset.analysis.ParameterSectionParameterReferenceResolver parameterSectionParameterReferenceResolver = new hu.modembed.model.textnotations.instructionset.analysis.ParameterSectionParameterReferenceResolver();
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<hu.modembed.model.modembed.core.instructionset.InstructionSet, hu.modembed.model.modembed.core.instructionset.InstructionSet> getInstructionSetExtendReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet_Extend(), instructionSetExtendReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<hu.modembed.model.modembed.core.instructionset.ParameterSection, hu.modembed.model.modembed.core.instructionset.InstructionParameter> getParameterSectionParameterReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection_Parameter(), parameterSectionParameterReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		instructionSetExtendReferenceResolver.setOptions(options);
		parameterSectionParameterReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet().isInstance(container)) {
			InstructionsetFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionSet> frr = new InstructionsetFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionSet>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("extend")) {
				instructionSetExtendReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.core.instructionset.InstructionSet) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection().isInstance(container)) {
			InstructionsetFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionParameter> frr = new InstructionsetFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionParameter>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("parameter")) {
				parameterSectionParameterReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.core.instructionset.ParameterSection) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getInstructionSet_Extend()) {
			return getResolverChain(reference, instructionSetExtendReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.eINSTANCE.getParameterSection_Parameter()) {
			return getResolverChain(reference, parameterSectionParameterReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new hu.modembed.model.textnotations.instructionset.util.InstructionsetRuntimeUtil().logWarning("Found value with invalid type for option " + hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver) {
			hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver replacingResolver = (hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver) resolverValue;
			if (replacingResolver instanceof hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceCache) {
					hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver nextResolver = (hu.modembed.model.textnotations.instructionset.IInstructionsetReferenceResolver) next;
					if (nextResolver instanceof hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new hu.modembed.model.textnotations.instructionset.util.InstructionsetRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new hu.modembed.model.textnotations.instructionset.util.InstructionsetRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.instructionset.IInstructionsetOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.instructionset.IInstructionsetDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
