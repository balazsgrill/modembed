/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRules;
import hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;
import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;
import hu.modembed.model.modembed.abstraction.types.TypesPackage;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.StructuredPackage;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.BasicFeatureResolver;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class MFeatureResolver extends BasicFeatureResolver {

	private static final class ConditionalOperationFlatScope extends FlatScope {
		private ConditionalOperationFlatScope(EObject container,
				EClass valueClass, EReference containerReference) {
			super(container, valueClass, containerReference);
		}

		@Override
		public IFeatureScope parentScope() {
			EObject container = getContainer().eContainer();
			if (container instanceof OperationDefinition){
				return new FlatScope(container,
						PlatformPackage.eINSTANCE.getOperationLocalLabel(), PlatformPackage.eINSTANCE.getOperationDefinition_Steps());
			}
			if (container instanceof ConditionalOperation){
				return new ConditionalOperationFlatScope(container, PlatformPackage.eINSTANCE.getOperationLocalLabel(), PlatformPackage.eINSTANCE.getConditionalOperation_Steps());
			}
			return super.parentScope();
		}
	}

	private final Resource resource;
	
	private Terminal BINARY_NUMBER = null;
	private Terminal HEXADECIMAL_NUMBER = null;
	
	public MFeatureResolver(Resource resource, IGrammar grammar) {
		super(resource.getResourceSet());
		this.resource = resource;
		for(Terminal t : grammar.terminals()){
			if ("BINARY_NUMBER".equals(t.getName())){
				this.BINARY_NUMBER = t;
			}
			if ("HEXADECIMAL_NUMBER".equals(t.getName())){
				this.HEXADECIMAL_NUMBER = t;
			}
		}
	}

	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		
		/*************************
		 * Infrastructure
		 *************************/
		if (InfrastructurePackage.eINSTANCE.getAttributeValue_Definition().equals(feature)){
			EObject attributeContainer = context.eContainer();
			EObject attributedElement = attributeContainer.eContainer();
			if (attributedElement instanceof MemoryInstance){
				MemoryType memtype = ((MemoryInstance) attributedElement).getType();
				if (memtype != null){
					AttributeContainerDefinition container = memtype.getAttributes();
					if (container != null){
						return new FlatScope(container, InfrastructurePackage.eINSTANCE.getAttributeDefinition(), InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition_Attributes());
					}
				}
			}
		}
		
		/*************************
		 * Types
		 *************************/
		if (TypesPackage.eINSTANCE.getReferenceTypeDefinition_Type().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}		
		
		/*************************
		 * Instructionset
		 *************************/
		if (InstructionsetPackage.eINSTANCE.getParameterSection_Parameter().equals(feature)){			
			EObject container = context.eContainer().eContainer();
			return new FlatScope(container, InstructionsetPackage.eINSTANCE.getInstructionParameter(), InstructionsetPackage.eINSTANCE.getInstruction_Parameters());
		}
		if (InstructionsetPackage.eINSTANCE.getInstructionSet_Extend().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		
		
		/*************************
		 * Device abstraction
		 *************************/
		if (AbstractionPackage.eINSTANCE.getDeviceAbstraction_Instructionset().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		if (AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}		
		if (PlatformPackage.eINSTANCE.getOperationArgument_MemType().equals(feature)){
			EObject device = context.eContainer().eContainer();
			return new ReferenceFollowingFlatScope(device, 
					MemorymodelPackage.eINSTANCE.getMemoryType(), 
					AbstractionPackage.eINSTANCE.getDeviceAbstraction_MemoryTypes(),
					AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor());
		}
		if (PlatformPackage.eINSTANCE.getInstructionParameterMapping_Value().equals(feature)){
			return FlatScope.findScope(context,
					PlatformPackage.eINSTANCE.getOperationDefinition(), 
					PlatformPackage.eINSTANCE.getOperationArgument(), 
					PlatformPackage.eINSTANCE.getOperationDefinition_Arguments());
		}
		if (PlatformPackage.eINSTANCE.getInstructionParameterMapping_Attribute().equals(feature)){
			EObject attributes = ((InstructionParameterMapping)context).getValue().getMemType().getAttributes();
			if (attributes != null){
				return new FlatScope(attributes,
						InfrastructurePackage.eINSTANCE.getAttributeDefinition(),
						MemorymodelPackage.eINSTANCE.getMemoryType_Attributes());
			}
		}
		if (PlatformPackage.eINSTANCE.getInstructionCallOperationStep_Instruction().equals(feature)){
			EObject device = FlatScope.findAncestor(context, AbstractionPackage.eINSTANCE.getDeviceAbstraction());
			if (device instanceof DeviceAbstraction){
				if (((DeviceAbstraction) device).getInstructionset() != null){
					return new ReferenceFollowingFlatScope(((DeviceAbstraction) device).getInstructionset(), 
							InstructionsetPackage.eINSTANCE.getInstruction(),
							InstructionsetPackage.eINSTANCE.getInstructionSet_Instructions(), 
							InstructionsetPackage.eINSTANCE.getInstructionSet_Extend());
				}
			}
		}
		if (PlatformPackage.eINSTANCE.getLabelParameterValue_Label().equals(feature)){
			EObject container = context.eContainer().eContainer();
			if (container instanceof OperationDefinition){
				return new FlatScope(container,
						PlatformPackage.eINSTANCE.getOperationLocalLabel(), PlatformPackage.eINSTANCE.getOperationDefinition_Steps());
			}
			if (container instanceof ConditionalOperation){
				return new ConditionalOperationFlatScope(container, PlatformPackage.eINSTANCE.getOperationLocalLabel(), PlatformPackage.eINSTANCE.getConditionalOperation_Steps());
			}
		}
		if (MemorymodelPackage.eINSTANCE.getMemoryInstance_Type().equals(feature)){
			return ReferenceFollowingFlatScope.findScope(context,
					AbstractionPackage.eINSTANCE.getDeviceAbstraction(), 
					MemorymodelPackage.eINSTANCE.getMemoryType(), 
					AbstractionPackage.eINSTANCE.getDeviceAbstraction_MemoryTypes(), 
					AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor());
		}
		
		/*************************
		 * Sequential behavior
		 *************************/
		if (BehaviorPackage.eINSTANCE.getRootSequentialBehavior_Device().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		if (BehaviorPackage.eINSTANCE.getSequentialBehaviorModule_Device().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		if (BehaviorPackage.eINSTANCE.getSymbolAddressAssignment_MemoryInstance().equals(feature)){
			EObject container = context.eContainer();
			EObject device = null;
			if (container instanceof RootSequentialBehavior){
				device = ((RootSequentialBehavior) container).getDevice();
			}
			if (container instanceof SequentialBehaviorModule){
				device = ((SequentialBehaviorModule) container).getDevice();
			}
			if (device != null){
				return ReferenceFollowingFlatScope.findScope(device,
						AbstractionPackage.eINSTANCE.getDeviceAbstraction(), 
						MemorymodelPackage.eINSTANCE.getMemoryInstance(), 
						AbstractionPackage.eINSTANCE.getDeviceAbstraction_MemoryInstances(), 
						AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor());
			}
		}
		
		/*************************
		 * Memory mapping rules
		 *************************/
		if (BehaviorPackage.eINSTANCE.getSymbolMappingRules_Device().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		if (BehaviorPackage.eINSTANCE.getSymbolMappingRule_MemInstance().equals(feature)){
			EObject rules = context.eContainer();
			if (rules instanceof SymbolMappingRules){
				DeviceAbstraction device = ((SymbolMappingRules) rules).getDevice();
				if (device != null){
					return ReferenceFollowingFlatScope.findScope(device,
							AbstractionPackage.eINSTANCE.getDeviceAbstraction(), 
							MemorymodelPackage.eINSTANCE.getMemoryInstance(), 
							AbstractionPackage.eINSTANCE.getDeviceAbstraction_MemoryInstances(), 
							AbstractionPackage.eINSTANCE.getDeviceAbstraction_Ancestor());
				}
			}
		}
		
		/*************************
		 * Modules
		 *************************/
		if (StructuredPackage.eINSTANCE.getStructuredModule_Uses().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		if (StructuredPackage.eINSTANCE.getVariableReferenceExpression_Variable().equals(feature)){
			return VariableReferenceScope.getScope(context);
		}
		if (StructuredPackage.eINSTANCE.getFunctionCallExpression_Function().equals(feature)){
			EObject module = FlatScope.findAncestor(context, StructuredPackage.eINSTANCE.getStructuredModule());
			if (module instanceof StructuredModule){
				return new StructuredModuleFunctionScope((StructuredModule) module);
			}
		}
		
		return super.getScope(context, feature, terminal, value);
	}
	
	@Override
	public Object resolvePrimitive(EDataType datatype, Terminal terminal,
			String value) {
		if (terminal != null){
			if (terminal.equals(BINARY_NUMBER)){
				if (value.toLowerCase().startsWith("0b")){
					long v = Long.parseLong(value.substring(2), 2);
					return super.resolvePrimitive(datatype, terminal, Long.toString(v));
				}
			}
			if (terminal.equals(HEXADECIMAL_NUMBER)){
				if (value.toLowerCase().startsWith("0x")){
					long v = Long.parseLong(value.substring(2), 16);
					return super.resolvePrimitive(datatype, terminal, Long.toString(v));
				}
			}
		}
		return super.resolvePrimitive(datatype, terminal, value);
	}

}
