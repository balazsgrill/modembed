/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.grammar;

public class DeviceGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static DeviceGrammarInformationProvider INSTANCE = new DeviceGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_0_0_0_0 = INSTANCE.getDEVICE_0_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_0_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("device", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_0_0_0_1 = INSTANCE.getDEVICE_0_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_0_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_0_0_0_2_0_0_0 = INSTANCE.getDEVICE_0_0_0_2_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_0_0_0_2_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("extends", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_0_0_0_2_0_0_1 = INSTANCE.getDEVICE_0_0_0_2_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_0_0_0_2_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_2_0_0 = INSTANCE.getDEVICE_0_0_0_2_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_2_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_2_0_0_0, DEVICE_0_0_0_2_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_0_0_0_2_0 = INSTANCE.getDEVICE_0_0_0_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_0_0_0_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_2_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_0_0_0_2 = INSTANCE.getDEVICE_0_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_0_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_0_0_0_2_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_0_0_0_3_0_0_0 = INSTANCE.getDEVICE_0_0_0_3_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_0_0_0_3_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("instructionset", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_0_0_0_3_0_0_1 = INSTANCE.getDEVICE_0_0_0_3_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_0_0_0_3_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_3_0_0 = INSTANCE.getDEVICE_0_0_0_3_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_3_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_3_0_0_0, DEVICE_0_0_0_3_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_0_0_0_3_0 = INSTANCE.getDEVICE_0_0_0_3_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_0_0_0_3_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_3_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_0_0_0_3 = INSTANCE.getDEVICE_0_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_0_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_0_0_0_3_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_0_0_0_4 = INSTANCE.getDEVICE_0_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_0_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_0_0_0_5_0_0_0_0_0_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_0_0_0_5_0_0_0_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_5_0_0_0_0_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_5_0_0_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0_0_0_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_0_0_0_5_0_0_0_0_1_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_0_0_0_5_0_0_0_0_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_5_0_0_0_0_1 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_5_0_0_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0_0_0_1_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_0_0_0_5_0_0_0_0_2_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_0_0_0_5_0_0_0_0_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__OPERATION), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_5_0_0_0_0_2 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_5_0_0_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0_0_0_2_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_0_0_0_5_0_0_0_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_0_0_0_5_0_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0_0_0_0, DEVICE_0_0_0_5_0_0_0_0_1, DEVICE_0_0_0_5_0_0_0_0_2);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_0_0_0_5_0_0_0 = INSTANCE.getDEVICE_0_0_0_5_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_0_0_0_5_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_0_0_0_5_0_0_0_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_0_0_0_5_0_0_1 = INSTANCE.getDEVICE_0_0_0_5_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_0_0_0_5_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0_5_0_0 = INSTANCE.getDEVICE_0_0_0_5_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0_5_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0_0, DEVICE_0_0_0_5_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_0_0_0_5_0 = INSTANCE.getDEVICE_0_0_0_5_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_0_0_0_5_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_5_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_0_0_0_5 = INSTANCE.getDEVICE_0_0_0_5();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_0_0_0_5() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_0_0_0_5_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_0_0_0 = INSTANCE.getDEVICE_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0_0, DEVICE_0_0_0_1, DEVICE_0_0_0_2, DEVICE_0_0_0_3, DEVICE_0_0_0_4, DEVICE_0_0_0_5);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_0_0 = INSTANCE.getDEVICE_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_0_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_0 = INSTANCE.getDEVICE_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.AbstractionPackage.eINSTANCE.getDeviceAbstraction(), DEVICE_0_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_1_0_0_0 = INSTANCE.getDEVICE_1_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_1_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("mtype", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal DEVICE_1_0_0_1 = INSTANCE.getDEVICE_1_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal getDEVICE_1_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE), "volatile", "", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal DEVICE_1_0_0_2 = INSTANCE.getDEVICE_1_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal getDEVICE_1_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA), "data", "", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal DEVICE_1_0_0_3 = INSTANCE.getDEVICE_1_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal getDEVICE_1_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM), "program", "", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_1_0_0_4 = INSTANCE.getDEVICE_1_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_1_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_1_0_0_5 = INSTANCE.getDEVICE_1_0_0_5();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_1_0_0_5() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("(", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_1_0_0_6 = INSTANCE.getDEVICE_1_0_0_6();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_1_0_0_6() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_1_0_0_7 = INSTANCE.getDEVICE_1_0_0_7();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_1_0_0_7() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(")", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_1_0_0_8 = INSTANCE.getDEVICE_1_0_0_8();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_1_0_0_8() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_1_0_0 = INSTANCE.getDEVICE_1_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_1_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_1_0_0_0, DEVICE_1_0_0_1, DEVICE_1_0_0_2, DEVICE_1_0_0_3, DEVICE_1_0_0_4, DEVICE_1_0_0_5, DEVICE_1_0_0_6, DEVICE_1_0_0_7, DEVICE_1_0_0_8);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_1_0 = INSTANCE.getDEVICE_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_1_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_1 = INSTANCE.getDEVICE_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryType(), DEVICE_1_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_2_0_0_0 = INSTANCE.getDEVICE_2_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_2_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("minstance", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_2_0_0_1 = INSTANCE.getDEVICE_2_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_2_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_2_0_0_2 = INSTANCE.getDEVICE_2_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_2_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("[", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_2_0_0_3 = INSTANCE.getDEVICE_2_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_2_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_2_0_0_4 = INSTANCE.getDEVICE_2_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_2_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(",", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_2_0_0_5 = INSTANCE.getDEVICE_2_0_0_5();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_2_0_0_5() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_2_0_0_6 = INSTANCE.getDEVICE_2_0_0_6();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_2_0_0_6() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("]", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_2_0_0_7 = INSTANCE.getDEVICE_2_0_0_7();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_2_0_0_7() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(":", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_2_0_0_8 = INSTANCE.getDEVICE_2_0_0_8();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_2_0_0_8() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_2_0_0_9 = INSTANCE.getDEVICE_2_0_0_9();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_2_0_0_9() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ATTRIBUTES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_2_0_0 = INSTANCE.getDEVICE_2_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_2_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_2_0_0_0, DEVICE_2_0_0_1, DEVICE_2_0_0_2, DEVICE_2_0_0_3, DEVICE_2_0_0_4, DEVICE_2_0_0_5, DEVICE_2_0_0_6, DEVICE_2_0_0_7, DEVICE_2_0_0_8, DEVICE_2_0_0_9);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_2_0 = INSTANCE.getDEVICE_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_2_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_2 = INSTANCE.getDEVICE_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.eINSTANCE.getMemoryInstance(), DEVICE_2_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_3_0_0_0 = INSTANCE.getDEVICE_3_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_3_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("{", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_3_0_0_1 = INSTANCE.getDEVICE_3_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_3_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_3_0_0_2 = INSTANCE.getDEVICE_3_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_3_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("}", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_3_0_0 = INSTANCE.getDEVICE_3_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_3_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_3_0_0_0, DEVICE_3_0_0_1, DEVICE_3_0_0_2);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_3_0 = INSTANCE.getDEVICE_3_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_3_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_3_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_3 = INSTANCE.getDEVICE_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeContainerDefinition(), DEVICE_3_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_4_0_0_0 = INSTANCE.getDEVICE_4_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_4_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_4_0_0_1 = INSTANCE.getDEVICE_4_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_4_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_4_0_0 = INSTANCE.getDEVICE_4_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_4_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_4_0_0_0, DEVICE_4_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_4_0 = INSTANCE.getDEVICE_4_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_4_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_4_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_4 = INSTANCE.getDEVICE_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeDefinition(), DEVICE_4_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_5_0_0_0 = INSTANCE.getDEVICE_5_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_5_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("{", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_5_0_0_1 = INSTANCE.getDEVICE_5_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_5_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__VALUES), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_5_0_0_2 = INSTANCE.getDEVICE_5_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_5_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("}", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_5_0_0 = INSTANCE.getDEVICE_5_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_5_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_5_0_0_0, DEVICE_5_0_0_1, DEVICE_5_0_0_2);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_5_0 = INSTANCE.getDEVICE_5_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_5_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_5_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_5 = INSTANCE.getDEVICE_5();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_5() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValueContainer(), DEVICE_5_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_6_0_0_0 = INSTANCE.getDEVICE_6_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_6_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_6_0_0_1 = INSTANCE.getDEVICE_6_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_6_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("=", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_6_0_0_2 = INSTANCE.getDEVICE_6_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_6_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_6_0_0_3 = INSTANCE.getDEVICE_6_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_6_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_6_0_0 = INSTANCE.getDEVICE_6_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_6_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_6_0_0_0, DEVICE_6_0_0_1, DEVICE_6_0_0_2, DEVICE_6_0_0_3);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_6_0 = INSTANCE.getDEVICE_6_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_6_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_6_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_6 = INSTANCE.getDEVICE_6();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_6() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.eINSTANCE.getAttributeValue(), DEVICE_6_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_0 = INSTANCE.getDEVICE_7_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("operation", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_7_0_0_1 = INSTANCE.getDEVICE_7_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_7_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_2 = INSTANCE.getDEVICE_7_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("(", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_7_0_0_3_0_0_0 = INSTANCE.getDEVICE_7_0_0_3_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_7_0_0_3_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_3_0_0_1_0_0_0 = INSTANCE.getDEVICE_7_0_0_3_0_0_1_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_3_0_0_1_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(",", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_7_0_0_3_0_0_1_0_0_1 = INSTANCE.getDEVICE_7_0_0_3_0_0_1_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_7_0_0_3_0_0_1_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_7_0_0_3_0_0_1_0_0 = INSTANCE.getDEVICE_7_0_0_3_0_0_1_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_7_0_0_3_0_0_1_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0_3_0_0_1_0_0_0, DEVICE_7_0_0_3_0_0_1_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_7_0_0_3_0_0_1_0 = INSTANCE.getDEVICE_7_0_0_3_0_0_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_7_0_0_3_0_0_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0_3_0_0_1_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_7_0_0_3_0_0_1 = INSTANCE.getDEVICE_7_0_0_3_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_7_0_0_3_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_7_0_0_3_0_0_1_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_7_0_0_3_0_0 = INSTANCE.getDEVICE_7_0_0_3_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_7_0_0_3_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0_3_0_0_0, DEVICE_7_0_0_3_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_7_0_0_3_0 = INSTANCE.getDEVICE_7_0_0_3_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_7_0_0_3_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0_3_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_7_0_0_3 = INSTANCE.getDEVICE_7_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_7_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_7_0_0_3_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_4 = INSTANCE.getDEVICE_7_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(")", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_5 = INSTANCE.getDEVICE_7_0_0_5();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_5() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("{", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_7_0_0_6 = INSTANCE.getDEVICE_7_0_0_6();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_7_0_0_6() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__STEPS), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationStep(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_7_0_0_7 = INSTANCE.getDEVICE_7_0_0_7();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_7_0_0_7() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("}", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_7_0_0 = INSTANCE.getDEVICE_7_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_7_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0_0, DEVICE_7_0_0_1, DEVICE_7_0_0_2, DEVICE_7_0_0_3, DEVICE_7_0_0_4, DEVICE_7_0_0_5, DEVICE_7_0_0_6, DEVICE_7_0_0_7);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_7_0 = INSTANCE.getDEVICE_7_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_7_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_7_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_7 = INSTANCE.getDEVICE_7();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_7() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationDefinition(), DEVICE_7_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_8_0_0_0 = INSTANCE.getDEVICE_8_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_8_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_8_0_0_1 = INSTANCE.getDEVICE_8_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_8_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(":", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_8_0_0_2 = INSTANCE.getDEVICE_8_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_8_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__TYPE), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getTypeDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_8_0_0_3 = INSTANCE.getDEVICE_8_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_8_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("|", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_8_0_0_4 = INSTANCE.getDEVICE_8_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_8_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_8_0_0_5_0_0_0 = INSTANCE.getDEVICE_8_0_0_5_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_8_0_0_5_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("@", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_8_0_0_5_0_0_1 = INSTANCE.getDEVICE_8_0_0_5_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_8_0_0_5_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_8_0_0_5_0_0 = INSTANCE.getDEVICE_8_0_0_5_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_8_0_0_5_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_8_0_0_5_0_0_0, DEVICE_8_0_0_5_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_8_0_0_5_0 = INSTANCE.getDEVICE_8_0_0_5_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_8_0_0_5_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_8_0_0_5_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_8_0_0_5 = INSTANCE.getDEVICE_8_0_0_5();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_8_0_0_5() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_8_0_0_5_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_8_0_0 = INSTANCE.getDEVICE_8_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_8_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_8_0_0_0, DEVICE_8_0_0_1, DEVICE_8_0_0_2, DEVICE_8_0_0_3, DEVICE_8_0_0_4, DEVICE_8_0_0_5);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_8_0 = INSTANCE.getDEVICE_8_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_8_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_8_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_8 = INSTANCE.getDEVICE_8();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_8() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getOperationArgument(), DEVICE_8_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_9_0_0_0 = INSTANCE.getDEVICE_9_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_9_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_9_0_0_1 = INSTANCE.getDEVICE_9_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_9_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("(", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_9_0_0_2_0_0_0 = INSTANCE.getDEVICE_9_0_0_2_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_9_0_0_2_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_9_0_0_2_0_0_1_0_0_0 = INSTANCE.getDEVICE_9_0_0_2_0_0_1_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_9_0_0_2_0_0_1_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(",", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment DEVICE_9_0_0_2_0_0_1_0_0_1 = INSTANCE.getDEVICE_9_0_0_2_0_0_1_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getDEVICE_9_0_0_2_0_0_1_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_9_0_0_2_0_0_1_0_0 = INSTANCE.getDEVICE_9_0_0_2_0_0_1_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_9_0_0_2_0_0_1_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0_2_0_0_1_0_0_0, DEVICE_9_0_0_2_0_0_1_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_9_0_0_2_0_0_1_0 = INSTANCE.getDEVICE_9_0_0_2_0_0_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_9_0_0_2_0_0_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0_2_0_0_1_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_9_0_0_2_0_0_1 = INSTANCE.getDEVICE_9_0_0_2_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_9_0_0_2_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_9_0_0_2_0_0_1_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.STAR);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_9_0_0_2_0_0 = INSTANCE.getDEVICE_9_0_0_2_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_9_0_0_2_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0_2_0_0_0, DEVICE_9_0_0_2_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_9_0_0_2_0 = INSTANCE.getDEVICE_9_0_0_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_9_0_0_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0_2_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_9_0_0_2 = INSTANCE.getDEVICE_9_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_9_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_9_0_0_2_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_9_0_0_3 = INSTANCE.getDEVICE_9_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_9_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(")", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_9_0_0_4 = INSTANCE.getDEVICE_9_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_9_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_9_0_0 = INSTANCE.getDEVICE_9_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_9_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0_0, DEVICE_9_0_0_1, DEVICE_9_0_0_2, DEVICE_9_0_0_3, DEVICE_9_0_0_4);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_9_0 = INSTANCE.getDEVICE_9_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_9_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_9_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_9 = INSTANCE.getDEVICE_9();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_9() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionCallOperationStep(), DEVICE_9_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_10_0_0_0 = INSTANCE.getDEVICE_10_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_10_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_10_0_0_1_0_0_0 = INSTANCE.getDEVICE_10_0_0_1_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_10_0_0_1_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("->", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_10_0_0_1_0_0_1 = INSTANCE.getDEVICE_10_0_0_1_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_10_0_0_1_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_10_0_0_1_0_0 = INSTANCE.getDEVICE_10_0_0_1_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_10_0_0_1_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_1_0_0_0, DEVICE_10_0_0_1_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_10_0_0_1_0 = INSTANCE.getDEVICE_10_0_0_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_10_0_0_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_1_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_10_0_0_1 = INSTANCE.getDEVICE_10_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_10_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_10_0_0_1_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_10_0_0_2_0_0_0 = INSTANCE.getDEVICE_10_0_0_2_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_10_0_0_2_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(":", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_10_0_0_2_0_0_1 = INSTANCE.getDEVICE_10_0_0_2_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_10_0_0_2_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_10_0_0_2_0_0 = INSTANCE.getDEVICE_10_0_0_2_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_10_0_0_2_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_2_0_0_0, DEVICE_10_0_0_2_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_10_0_0_2_0 = INSTANCE.getDEVICE_10_0_0_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_10_0_0_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_2_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_10_0_0_2 = INSTANCE.getDEVICE_10_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_10_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_10_0_0_2_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword DEVICE_10_0_0_3_0_0_0 = INSTANCE.getDEVICE_10_0_0_3_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getDEVICE_10_0_0_3_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("+", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder DEVICE_10_0_0_3_0_0_1 = INSTANCE.getDEVICE_10_0_0_3_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getDEVICE_10_0_0_3_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_10_0_0_3_0_0 = INSTANCE.getDEVICE_10_0_0_3_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_10_0_0_3_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_3_0_0_0, DEVICE_10_0_0_3_0_0_1);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_10_0_0_3_0 = INSTANCE.getDEVICE_10_0_0_3_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_10_0_0_3_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_3_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceCompound DEVICE_10_0_0_3 = INSTANCE.getDEVICE_10_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceCompound getDEVICE_10_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceCompound(DEVICE_10_0_0_3_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.QUESTIONMARK);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence DEVICE_10_0_0 = INSTANCE.getDEVICE_10_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getDEVICE_10_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0_0, DEVICE_10_0_0_1, DEVICE_10_0_0_2, DEVICE_10_0_0_3);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice DEVICE_10_0 = INSTANCE.getDEVICE_10_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getDEVICE_10_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, DEVICE_10_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule DEVICE_10 = INSTANCE.getDEVICE_10();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getDEVICE_10() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.eINSTANCE.getInstructionParameterMapping(), DEVICE_10_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_0_0_0_0 = INSTANCE.getTYPE_0_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_0_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("type", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder TYPE_0_0_0_1 = INSTANCE.getTYPE_0_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getTYPE_0_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_0_0_0_2 = INSTANCE.getTYPE_0_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_0_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("=", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceContainment TYPE_0_0_0_3 = INSTANCE.getTYPE_0_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceContainment getTYPE_0_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceContainment(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION), hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getTypeDefinition(), }, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_0_0_0_4 = INSTANCE.getTYPE_0_0_0_4();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_0_0_0_4() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(";", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence TYPE_0_0_0 = INSTANCE.getTYPE_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getTYPE_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_0_0_0_0, TYPE_0_0_0_1, TYPE_0_0_0_2, TYPE_0_0_0_3, TYPE_0_0_0_4);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice TYPE_0_0 = INSTANCE.getTYPE_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getTYPE_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_0_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule TYPE_0 = INSTANCE.getTYPE_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getTYPE_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getType(), TYPE_0_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_1_0_0_0 = INSTANCE.getTYPE_1_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_1_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("unsigned", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_1_0_0_1 = INSTANCE.getTYPE_1_0_0_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_1_0_0_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword("(", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder TYPE_1_0_0_2 = INSTANCE.getTYPE_1_0_0_2();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getTYPE_1_0_0_2() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS), "INT", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceKeyword TYPE_1_0_0_3 = INSTANCE.getTYPE_1_0_0_3();
	private hu.modembed.model.textnotations.device.grammar.DeviceKeyword getTYPE_1_0_0_3() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceKeyword(")", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence TYPE_1_0_0 = INSTANCE.getTYPE_1_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getTYPE_1_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_1_0_0_0, TYPE_1_0_0_1, TYPE_1_0_0_2, TYPE_1_0_0_3);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice TYPE_1_0 = INSTANCE.getTYPE_1_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getTYPE_1_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_1_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule TYPE_1 = INSTANCE.getTYPE_1();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getTYPE_1() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getUnsignedTypeDefinition(), TYPE_1_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DevicePlaceholder TYPE_2_0_0_0 = INSTANCE.getTYPE_2_0_0_0();
	private hu.modembed.model.textnotations.device.grammar.DevicePlaceholder getTYPE_2_0_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DevicePlaceholder(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), "QUALIFIEDID", hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, 0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceSequence TYPE_2_0_0 = INSTANCE.getTYPE_2_0_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceSequence getTYPE_2_0_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceSequence(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_2_0_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceChoice TYPE_2_0 = INSTANCE.getTYPE_2_0();
	private hu.modembed.model.textnotations.device.grammar.DeviceChoice getTYPE_2_0() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceChoice(hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE, TYPE_2_0_0);
	}
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule TYPE_2 = INSTANCE.getTYPE_2();
	private hu.modembed.model.textnotations.device.grammar.DeviceRule getTYPE_2() {
		return new hu.modembed.model.textnotations.device.grammar.DeviceRule(hu.modembed.model.modembed.abstraction.types.TypesPackage.eINSTANCE.getReferenceTypeDefinition(), TYPE_2_0, hu.modembed.model.textnotations.device.grammar.DeviceCardinality.ONE);
	}
	
	public static String getSyntaxElementID(hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement) hu.modembed.model.textnotations.device.grammar.DeviceGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static hu.modembed.model.textnotations.device.grammar.DeviceRule[] RULES = new hu.modembed.model.textnotations.device.grammar.DeviceRule[] {
		DEVICE_0,
		DEVICE_1,
		DEVICE_2,
		DEVICE_3,
		DEVICE_4,
		DEVICE_5,
		DEVICE_6,
		DEVICE_7,
		DEVICE_8,
		DEVICE_9,
		DEVICE_10,
		TYPE_0,
		TYPE_1,
		TYPE_2,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (hu.modembed.model.textnotations.device.grammar.DeviceRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof hu.modembed.model.textnotations.device.grammar.DeviceKeyword) {
			keywords.add(((hu.modembed.model.textnotations.device.grammar.DeviceKeyword) element).getValue());
		} else if (element instanceof hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal) {
			keywords.add(((hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal) element).getTrueLiteral());
			keywords.add(((hu.modembed.model.textnotations.device.grammar.DeviceBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof hu.modembed.model.textnotations.device.grammar.DeviceEnumerationTerminal) {
			hu.modembed.model.textnotations.device.grammar.DeviceEnumerationTerminal terminal = (hu.modembed.model.textnotations.device.grammar.DeviceEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (hu.modembed.model.textnotations.device.grammar.DeviceSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
