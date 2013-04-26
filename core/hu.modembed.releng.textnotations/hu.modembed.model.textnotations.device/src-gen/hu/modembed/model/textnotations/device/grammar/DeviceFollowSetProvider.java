/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class DeviceFollowSetProvider {
	
	public final static hu.modembed.model.textnotations.device.IDeviceExpectedElement TERMINALS[] = new hu.modembed.model.textnotations.device.IDeviceExpectedElement[69];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[12];
	
	public final static hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] LINKS = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[28];
	
	public final static hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] EMPTY_LINK_ARRAY = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_0);
		TERMINALS[1] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_1);
		TERMINALS[2] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_2_0_0_0);
		TERMINALS[3] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_3_0_0_0);
		TERMINALS[4] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_4);
		TERMINALS[5] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_2_0_0_1);
		TERMINALS[6] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_3_0_0_1);
		TERMINALS[7] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_0);
		TERMINALS[8] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_0);
		TERMINALS[9] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_0);
		TERMINALS[10] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_0_0_0_5_0_0_1);
		TERMINALS[11] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedBooleanTerminal(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_1);
		TERMINALS[12] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedBooleanTerminal(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_2);
		TERMINALS[13] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedBooleanTerminal(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_3);
		TERMINALS[14] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_4);
		TERMINALS[15] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_5);
		TERMINALS[16] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_6);
		TERMINALS[17] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_1_0_0_7);
		TERMINALS[18] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_0);
		TERMINALS[19] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_1);
		TERMINALS[20] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_2);
		TERMINALS[21] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_3);
		TERMINALS[22] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_4);
		TERMINALS[23] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_5);
		TERMINALS[24] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_6);
		TERMINALS[25] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_7);
		TERMINALS[26] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_2_0_0_8);
		TERMINALS[27] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_0);
		TERMINALS[28] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_4_0_0_0);
		TERMINALS[29] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_3_0_0_2);
		TERMINALS[30] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_4_0_0_1);
		TERMINALS[31] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_0);
		TERMINALS[32] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_5_0_0_2);
		TERMINALS[33] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_1);
		TERMINALS[34] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_2);
		TERMINALS[35] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_6_0_0_3);
		TERMINALS[36] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_1);
		TERMINALS[37] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_2);
		TERMINALS[38] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_0);
		TERMINALS[39] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_4);
		TERMINALS[40] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_3_0_0_1_0_0_0);
		TERMINALS[41] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_5);
		TERMINALS[42] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_0);
		TERMINALS[43] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_7_0_0_7);
		TERMINALS[44] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_1);
		TERMINALS[45] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_0);
		TERMINALS[46] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_2_0_0_0);
		TERMINALS[47] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_3);
		TERMINALS[48] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_4);
		TERMINALS[49] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_5_0_0_0);
		TERMINALS[50] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_8_0_0_5_0_0_1);
		TERMINALS[51] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_1);
		TERMINALS[52] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_0);
		TERMINALS[53] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_3);
		TERMINALS[54] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_2_0_0_1_0_0_0);
		TERMINALS[55] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_9_0_0_4);
		TERMINALS[56] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_1_0_0_0);
		TERMINALS[57] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_2_0_0_0);
		TERMINALS[58] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_3_0_0_0);
		TERMINALS[59] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_1_0_0_1);
		TERMINALS[60] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_2_0_0_1);
		TERMINALS[61] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.DEVICE_10_0_0_3_0_0_1);
		TERMINALS[62] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_0);
		TERMINALS[63] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_1);
		TERMINALS[64] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_2);
		TERMINALS[65] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_0_0_0_4);
		TERMINALS[66] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_1);
		TERMINALS[67] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedStructuralFeature(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_2);
		TERMINALS[68] = new hu.modembed.model.textnotations.device.mopp.DeviceExpectedCsString(hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.TYPE_1_0_0_3);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES);
		FEATURES[1] = hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES);
		FEATURES[2] = hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__OPERATION);
		FEATURES[3] = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES);
		FEATURES[4] = hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ATTRIBUTES);
		FEATURES[5] = hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES);
		FEATURES[6] = hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__VALUES);
		FEATURES[7] = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS);
		FEATURES[8] = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__STEPS);
		FEATURES[9] = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__TYPE);
		FEATURES[10] = hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS);
		FEATURES[11] = hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), FEATURES[0]);
		LINKS[1] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), FEATURES[1]);
		LINKS[2] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), FEATURES[2]);
		LINKS[3] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), FEATURES[0]);
		LINKS[4] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), FEATURES[1]);
		LINKS[5] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), FEATURES[2]);
		LINKS[6] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), FEATURES[0]);
		LINKS[7] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), FEATURES[1]);
		LINKS[8] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), FEATURES[2]);
		LINKS[9] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), FEATURES[3]);
		LINKS[10] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), FEATURES[4]);
		LINKS[11] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), FEATURES[5]);
		LINKS[12] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), FEATURES[5]);
		LINKS[13] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), FEATURES[5]);
		LINKS[14] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), FEATURES[6]);
		LINKS[15] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), FEATURES[6]);
		LINKS[16] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), FEATURES[6]);
		LINKS[17] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), FEATURES[7]);
		LINKS[18] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), FEATURES[7]);
		LINKS[19] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), FEATURES[8]);
		LINKS[20] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), FEATURES[8]);
		LINKS[21] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[9]);
		LINKS[22] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[9]);
		LINKS[23] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), FEATURES[10]);
		LINKS[24] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), FEATURES[10]);
		LINKS[25] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), FEATURES[8]);
		LINKS[26] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[11]);
		LINKS[27] = new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[11]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[4], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[4], EMPTY_LINK_ARRAY);
		TERMINALS[3].addFollower(TERMINALS[6], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[4], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[7], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), FEATURES[0]), });
		TERMINALS[4].addFollower(TERMINALS[8], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[9], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), FEATURES[2]), });
		TERMINALS[10].addFollower(TERMINALS[7], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), FEATURES[0]), });
		TERMINALS[10].addFollower(TERMINALS[8], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), FEATURES[1]), });
		TERMINALS[10].addFollower(TERMINALS[9], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), FEATURES[2]), });
		TERMINALS[7].addFollower(TERMINALS[11], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[17].addFollower(TERMINALS[18], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), FEATURES[3]), });
		TERMINALS[17].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[27], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), FEATURES[4]), });
		TERMINALS[18].addFollower(TERMINALS[28], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), FEATURES[5]), });
		TERMINALS[18].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[29].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[28], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), FEATURES[5]), });
		TERMINALS[30].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[31], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), FEATURES[6]), });
		TERMINALS[27].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[33], EMPTY_LINK_ARRAY);
		TERMINALS[33].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[35].addFollower(TERMINALS[31], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), FEATURES[6]), });
		TERMINALS[35].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[37].addFollower(TERMINALS[38], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), FEATURES[7]), });
		TERMINALS[37].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[38], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), FEATURES[7]), });
		TERMINALS[39].addFollower(TERMINALS[41], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[42], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), FEATURES[8]), });
		TERMINALS[41].addFollower(TERMINALS[43], EMPTY_LINK_ARRAY);
		TERMINALS[43].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
		TERMINALS[44].addFollower(TERMINALS[45], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[9]), });
		TERMINALS[44].addFollower(TERMINALS[46], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[9]), });
		TERMINALS[47].addFollower(TERMINALS[48], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[50], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[51], EMPTY_LINK_ARRAY);
		TERMINALS[51].addFollower(TERMINALS[52], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), FEATURES[10]), });
		TERMINALS[51].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[54].addFollower(TERMINALS[52], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), FEATURES[10]), });
		TERMINALS[53].addFollower(TERMINALS[55], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[42], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), FEATURES[8]), });
		TERMINALS[55].addFollower(TERMINALS[43], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[56], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[56].addFollower(TERMINALS[59], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[57].addFollower(TERMINALS[60], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[58].addFollower(TERMINALS[61], EMPTY_LINK_ARRAY);
		TERMINALS[61].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[61].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[62].addFollower(TERMINALS[63], EMPTY_LINK_ARRAY);
		TERMINALS[63].addFollower(TERMINALS[64], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[45], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), FEATURES[11]), });
		TERMINALS[64].addFollower(TERMINALS[46], new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature[] {new hu.modembed.model.textnotations.device.mopp.DeviceContainedFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), FEATURES[11]), });
		TERMINALS[45].addFollower(TERMINALS[66], EMPTY_LINK_ARRAY);
		TERMINALS[66].addFollower(TERMINALS[67], EMPTY_LINK_ARRAY);
		TERMINALS[67].addFollower(TERMINALS[68], EMPTY_LINK_ARRAY);
		TERMINALS[68].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[68].addFollower(TERMINALS[65], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[65], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
