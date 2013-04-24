/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(),
			hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(),
			hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(),
			hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(),
			hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(),
			hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(),
			hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(),
			hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(),
			hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(),
			hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(),
			hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(),
			hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(),
			hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(),
			hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(),
		};
	}
	
}
