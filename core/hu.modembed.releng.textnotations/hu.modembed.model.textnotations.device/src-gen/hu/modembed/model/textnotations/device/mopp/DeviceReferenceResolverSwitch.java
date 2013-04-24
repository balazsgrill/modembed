/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceReferenceResolverSwitch implements hu.modembed.model.textnotations.device.IDeviceReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected hu.modembed.model.textnotations.device.analysis.DeviceAbstractionAncestorReferenceResolver deviceAbstractionAncestorReferenceResolver = new hu.modembed.model.textnotations.device.analysis.DeviceAbstractionAncestorReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.DeviceAbstractionInstructionsetReferenceResolver deviceAbstractionInstructionsetReferenceResolver = new hu.modembed.model.textnotations.device.analysis.DeviceAbstractionInstructionsetReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.MemoryInstanceTypeReferenceResolver memoryInstanceTypeReferenceResolver = new hu.modembed.model.textnotations.device.analysis.MemoryInstanceTypeReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.AttributeValueDefinitionReferenceResolver attributeValueDefinitionReferenceResolver = new hu.modembed.model.textnotations.device.analysis.AttributeValueDefinitionReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.OperationArgumentMemtypeReferenceResolver operationArgumentMemtypeReferenceResolver = new hu.modembed.model.textnotations.device.analysis.OperationArgumentMemtypeReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.InstructionCallOperationStepInstructionReferenceResolver instructionCallOperationStepInstructionReferenceResolver = new hu.modembed.model.textnotations.device.analysis.InstructionCallOperationStepInstructionReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.InstructionParameterMappingValueReferenceResolver instructionParameterMappingValueReferenceResolver = new hu.modembed.model.textnotations.device.analysis.InstructionParameterMappingValueReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.InstructionParameterMappingAttributeReferenceResolver instructionParameterMappingAttributeReferenceResolver = new hu.modembed.model.textnotations.device.analysis.InstructionParameterMappingAttributeReferenceResolver();
	protected hu.modembed.model.textnotations.device.analysis.ReferenceTypeDefinitionTypeReferenceResolver referenceTypeDefinitionTypeReferenceResolver = new hu.modembed.model.textnotations.device.analysis.ReferenceTypeDefinitionTypeReferenceResolver();
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.DeviceAbstraction, hu.modembed.model.modembed.abstraction.DeviceAbstraction> getDeviceAbstractionAncestorReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor(), deviceAbstractionAncestorReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.DeviceAbstraction, hu.modembed.model.modembed.core.instructionset.InstructionSet> getDeviceAbstractionInstructionsetReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction_Instructionset(), deviceAbstractionInstructionsetReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance, hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> getMemoryInstanceTypeReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance_Type(), memoryInstanceTypeReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.infrastructure.AttributeValue, hu.modembed.model.modembed.infrastructure.AttributeDefinition> getAttributeValueDefinitionReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue_Definition(), attributeValueDefinitionReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument, hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> getOperationArgumentMemtypeReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument_Memtype(), operationArgumentMemtypeReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep, hu.modembed.model.modembed.core.instructionset.Instruction> getInstructionCallOperationStepInstructionReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep_Instruction(), instructionCallOperationStepInstructionReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping, hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument> getInstructionParameterMappingValueReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping_Value(), instructionParameterMappingValueReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping, hu.modembed.model.modembed.infrastructure.AttributeDefinition> getInstructionParameterMappingAttributeReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping_Attribute(), instructionParameterMappingAttributeReferenceResolver);
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition, hu.modembed.model.modembed.abstraction.types.Type> getReferenceTypeDefinitionTypeReferenceResolver() {
		return getResolverChain(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type(), referenceTypeDefinitionTypeReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		deviceAbstractionAncestorReferenceResolver.setOptions(options);
		deviceAbstractionInstructionsetReferenceResolver.setOptions(options);
		memoryInstanceTypeReferenceResolver.setOptions(options);
		attributeValueDefinitionReferenceResolver.setOptions(options);
		operationArgumentMemtypeReferenceResolver.setOptions(options);
		instructionCallOperationStepInstructionReferenceResolver.setOptions(options);
		instructionParameterMappingValueReferenceResolver.setOptions(options);
		instructionParameterMappingAttributeReferenceResolver.setOptions(options);
		referenceTypeDefinitionTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, hu.modembed.model.textnotations.device.IDeviceReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.DeviceAbstraction> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.DeviceAbstraction>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ancestor")) {
				deviceAbstractionAncestorReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.DeviceAbstraction) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionSet> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.InstructionSet>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("instructionset")) {
				deviceAbstractionInstructionsetReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.DeviceAbstraction) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.memorymodel.MemoryType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				memoryInstanceTypeReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.infrastructure.AttributeDefinition> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.infrastructure.AttributeDefinition>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("definition")) {
				attributeValueDefinitionReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.infrastructure.AttributeValue) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.memorymodel.MemoryType> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.memorymodel.MemoryType>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("memtype")) {
				operationArgumentMemtypeReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.Instruction> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.core.instructionset.Instruction>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("instruction")) {
				instructionCallOperationStepInstructionReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("value")) {
				instructionParameterMappingValueReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.infrastructure.AttributeDefinition> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.infrastructure.AttributeDefinition>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				instructionParameterMappingAttributeReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition().isInstance(container)) {
			DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.types.Type> frr = new DeviceFuzzyResolveResult<hu.modembed.model.modembed.abstraction.types.Type>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				referenceTypeDefinitionTypeReferenceResolver.resolve(identifier, (hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public hu.modembed.model.textnotations.device.IDeviceReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor()) {
			return getResolverChain(reference, deviceAbstractionAncestorReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction_Instructionset()) {
			return getResolverChain(reference, deviceAbstractionInstructionsetReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance_Type()) {
			return getResolverChain(reference, memoryInstanceTypeReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue_Definition()) {
			return getResolverChain(reference, attributeValueDefinitionReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument_Memtype()) {
			return getResolverChain(reference, operationArgumentMemtypeReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep_Instruction()) {
			return getResolverChain(reference, instructionCallOperationStepInstructionReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping_Value()) {
			return getResolverChain(reference, instructionParameterMappingValueReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping_Attribute()) {
			return getResolverChain(reference, instructionParameterMappingAttributeReferenceResolver);
		}
		if (reference == hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type()) {
			return getResolverChain(reference, referenceTypeDefinitionTypeReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> hu.modembed.model.textnotations.device.IDeviceReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, hu.modembed.model.textnotations.device.IDeviceReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(hu.modembed.model.textnotations.device.IDeviceOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new hu.modembed.model.textnotations.device.util.DeviceRuntimeUtil().logWarning("Found value with invalid type for option " + hu.modembed.model.textnotations.device.IDeviceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof hu.modembed.model.textnotations.device.IDeviceReferenceResolver) {
			hu.modembed.model.textnotations.device.IDeviceReferenceResolver replacingResolver = (hu.modembed.model.textnotations.device.IDeviceReferenceResolver) resolverValue;
			if (replacingResolver instanceof hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			hu.modembed.model.textnotations.device.IDeviceReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof hu.modembed.model.textnotations.device.IDeviceReferenceCache) {
					hu.modembed.model.textnotations.device.IDeviceReferenceResolver nextResolver = (hu.modembed.model.textnotations.device.IDeviceReferenceResolver) next;
					if (nextResolver instanceof hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new hu.modembed.model.textnotations.device.util.DeviceRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.device.IDeviceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new hu.modembed.model.textnotations.device.util.DeviceRuntimeUtil().logWarning("Found value with invalid type in value map for option " + hu.modembed.model.textnotations.device.IDeviceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + hu.modembed.model.textnotations.device.IDeviceDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
