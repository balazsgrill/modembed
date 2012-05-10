/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.util;

import crownking.edc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crownking.edc.EdcPackage
 * @generated
 */
public class EdcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdcSwitch<Adapter> modelSwitch =
		new EdcSwitch<Adapter>() {
			@Override
			public Adapter caseAdjustPointType(AdjustPointType object) {
				return createAdjustPointTypeAdapter();
			}
			@Override
			public Adapter caseAliasListType(AliasListType object) {
				return createAliasListTypeAdapter();
			}
			@Override
			public Adapter caseAliasListType1(AliasListType1 object) {
				return createAliasListType1Adapter();
			}
			@Override
			public Adapter caseAliasListType2(AliasListType2 object) {
				return createAliasListType2Adapter();
			}
			@Override
			public Adapter caseAliasListType3(AliasListType3 object) {
				return createAliasListType3Adapter();
			}
			@Override
			public Adapter caseAliasListType4(AliasListType4 object) {
				return createAliasListType4Adapter();
			}
			@Override
			public Adapter caseAliasListType5(AliasListType5 object) {
				return createAliasListType5Adapter();
			}
			@Override
			public Adapter caseAliasListType6(AliasListType6 object) {
				return createAliasListType6Adapter();
			}
			@Override
			public Adapter caseAliasListType7(AliasListType7 object) {
				return createAliasListType7Adapter();
			}
			@Override
			public Adapter caseAliasListType8(AliasListType8 object) {
				return createAliasListType8Adapter();
			}
			@Override
			public Adapter caseArchDefType(ArchDefType object) {
				return createArchDefTypeAdapter();
			}
			@Override
			public Adapter caseBACKBUGVectorSectorType(BACKBUGVectorSectorType object) {
				return createBACKBUGVectorSectorTypeAdapter();
			}
			@Override
			public Adapter caseBackgroundDebugMemTraitsType(BackgroundDebugMemTraitsType object) {
				return createBackgroundDebugMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseBreakpointsType(BreakpointsType object) {
				return createBreakpointsTypeAdapter();
			}
			@Override
			public Adapter caseCalDataMemTraitsType(CalDataMemTraitsType object) {
				return createCalDataMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseCalDataZoneType(CalDataZoneType object) {
				return createCalDataZoneTypeAdapter();
			}
			@Override
			public Adapter caseChecksumType(ChecksumType object) {
				return createChecksumTypeAdapter();
			}
			@Override
			public Adapter caseCodeMemTraitsType(CodeMemTraitsType object) {
				return createCodeMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseCodeSectorType(CodeSectorType object) {
				return createCodeSectorTypeAdapter();
			}
			@Override
			public Adapter caseConfigFuseMemTraitsType(ConfigFuseMemTraitsType object) {
				return createConfigFuseMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseConfigFuseSectorType(ConfigFuseSectorType object) {
				return createConfigFuseSectorTypeAdapter();
			}
			@Override
			public Adapter caseDataMemTraitsType(DataMemTraitsType object) {
				return createDataMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseDataSpaceType(DataSpaceType object) {
				return createDataSpaceTypeAdapter();
			}
			@Override
			public Adapter caseDCRDefType(DCRDefType object) {
				return createDCRDefTypeAdapter();
			}
			@Override
			public Adapter caseDCRFieldDefType(DCRFieldDefType object) {
				return createDCRFieldDefTypeAdapter();
			}
			@Override
			public Adapter caseDCRFieldSemanticType(DCRFieldSemanticType object) {
				return createDCRFieldSemanticTypeAdapter();
			}
			@Override
			public Adapter caseDCRModeListType(DCRModeListType object) {
				return createDCRModeListTypeAdapter();
			}
			@Override
			public Adapter caseDCRModeType(DCRModeType object) {
				return createDCRModeTypeAdapter();
			}
			@Override
			public Adapter caseDeviceIDMemTraitsType(DeviceIDMemTraitsType object) {
				return createDeviceIDMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseDeviceIDSectorType(DeviceIDSectorType object) {
				return createDeviceIDSectorTypeAdapter();
			}
			@Override
			public Adapter caseDEVIDToRevType(DEVIDToRevType object) {
				return createDEVIDToRevTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDPRDataSectorType(DPRDataSectorType object) {
				return createDPRDataSectorTypeAdapter();
			}
			@Override
			public Adapter caseEEDataMemTraitsType(EEDataMemTraitsType object) {
				return createEEDataMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseEEDataSectorType(EEDataSectorType object) {
				return createEEDataSectorTypeAdapter();
			}
			@Override
			public Adapter caseEmulatorZoneType(EmulatorZoneType object) {
				return createEmulatorZoneTypeAdapter();
			}
			@Override
			public Adapter caseGPRDataSectorType(GPRDataSectorType object) {
				return createGPRDataSectorTypeAdapter();
			}
			@Override
			public Adapter caseIllegalType(IllegalType object) {
				return createIllegalTypeAdapter();
			}
			@Override
			public Adapter caseImportType(ImportType object) {
				return createImportTypeAdapter();
			}
			@Override
			public Adapter caseJoinedSFRDefType(JoinedSFRDefType object) {
				return createJoinedSFRDefTypeAdapter();
			}
			@Override
			public Adapter caseLatchesType(LatchesType object) {
				return createLatchesTypeAdapter();
			}
			@Override
			public Adapter caseLCDType(LCDType object) {
				return createLCDTypeAdapter();
			}
			@Override
			public Adapter caseLegacyAliasType(LegacyAliasType object) {
				return createLegacyAliasTypeAdapter();
			}
			@Override
			public Adapter caseMemTraitsType(MemTraitsType object) {
				return createMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseMigrationAliasType(MigrationAliasType object) {
				return createMigrationAliasTypeAdapter();
			}
			@Override
			public Adapter caseMirrorType(MirrorType object) {
				return createMirrorTypeAdapter();
			}
			@Override
			public Adapter caseModuleExcludeType(ModuleExcludeType object) {
				return createModuleExcludeTypeAdapter();
			}
			@Override
			public Adapter caseModuleImportType(ModuleImportType object) {
				return createModuleImportTypeAdapter();
			}
			@Override
			public Adapter caseModuleMacroType(ModuleMacroType object) {
				return createModuleMacroTypeAdapter();
			}
			@Override
			public Adapter caseModuleRefType(ModuleRefType object) {
				return createModuleRefTypeAdapter();
			}
			@Override
			public Adapter caseMuxedSFRDefType(MuxedSFRDefType object) {
				return createMuxedSFRDefTypeAdapter();
			}
			@Override
			public Adapter caseNMMRPlaceType(NMMRPlaceType object) {
				return createNMMRPlaceTypeAdapter();
			}
			@Override
			public Adapter caseOscillatorModeType(OscillatorModeType object) {
				return createOscillatorModeTypeAdapter();
			}
			@Override
			public Adapter caseOscillatorType(OscillatorType object) {
				return createOscillatorTypeAdapter();
			}
			@Override
			public Adapter casePICType(PICType object) {
				return createPICTypeAdapter();
			}
			@Override
			public Adapter casePinListType(PinListType object) {
				return createPinListTypeAdapter();
			}
			@Override
			public Adapter casePinType(PinType object) {
				return createPinTypeAdapter();
			}
			@Override
			public Adapter casePowerType(PowerType object) {
				return createPowerTypeAdapter();
			}
			@Override
			public Adapter caseProgrammingType(ProgrammingType object) {
				return createProgrammingTypeAdapter();
			}
			@Override
			public Adapter caseProgramSpaceType(ProgramSpaceType object) {
				return createProgramSpaceTypeAdapter();
			}
			@Override
			public Adapter caseRegardlessOfModeType(RegardlessOfModeType object) {
				return createRegardlessOfModeTypeAdapter();
			}
			@Override
			public Adapter caseSelectSFRType(SelectSFRType object) {
				return createSelectSFRTypeAdapter();
			}
			@Override
			public Adapter caseSFRDataSectorType(SFRDataSectorType object) {
				return createSFRDataSectorTypeAdapter();
			}
			@Override
			public Adapter caseSFRDefType(SFRDefType object) {
				return createSFRDefTypeAdapter();
			}
			@Override
			public Adapter caseSFRFieldDefType(SFRFieldDefType object) {
				return createSFRFieldDefTypeAdapter();
			}
			@Override
			public Adapter caseSFRFieldSemanticType(SFRFieldSemanticType object) {
				return createSFRFieldSemanticTypeAdapter();
			}
			@Override
			public Adapter caseSFRModeListType(SFRModeListType object) {
				return createSFRModeListTypeAdapter();
			}
			@Override
			public Adapter caseSFRModeType(SFRModeType object) {
				return createSFRModeTypeAdapter();
			}
			@Override
			public Adapter caseStimInfoType(StimInfoType object) {
				return createStimInfoTypeAdapter();
			}
			@Override
			public Adapter caseTestMemTraitsType(TestMemTraitsType object) {
				return createTestMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseTestZoneType(TestZoneType object) {
				return createTestZoneTypeAdapter();
			}
			@Override
			public Adapter caseUserIDMemTraitsType(UserIDMemTraitsType object) {
				return createUserIDMemTraitsTypeAdapter();
			}
			@Override
			public Adapter caseUserIDSectorType(UserIDSectorType object) {
				return createUserIDSectorTypeAdapter();
			}
			@Override
			public Adapter caseVDDType(VDDType object) {
				return createVDDTypeAdapter();
			}
			@Override
			public Adapter caseVirtualPinType(VirtualPinType object) {
				return createVirtualPinTypeAdapter();
			}
			@Override
			public Adapter caseVPPType(VPPType object) {
				return createVPPTypeAdapter();
			}
			@Override
			public Adapter caseWaitType(WaitType object) {
				return createWaitTypeAdapter();
			}
			@Override
			public Adapter caseWatchdogTimerType(WatchdogTimerType object) {
				return createWatchdogTimerTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AdjustPointType <em>Adjust Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AdjustPointType
	 * @generated
	 */
	public Adapter createAdjustPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType <em>Alias List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType
	 * @generated
	 */
	public Adapter createAliasListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType1 <em>Alias List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType1
	 * @generated
	 */
	public Adapter createAliasListType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType2 <em>Alias List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType2
	 * @generated
	 */
	public Adapter createAliasListType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType3 <em>Alias List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType3
	 * @generated
	 */
	public Adapter createAliasListType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType4 <em>Alias List Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType4
	 * @generated
	 */
	public Adapter createAliasListType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType5 <em>Alias List Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType5
	 * @generated
	 */
	public Adapter createAliasListType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType6 <em>Alias List Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType6
	 * @generated
	 */
	public Adapter createAliasListType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType7 <em>Alias List Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType7
	 * @generated
	 */
	public Adapter createAliasListType7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.AliasListType8 <em>Alias List Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.AliasListType8
	 * @generated
	 */
	public Adapter createAliasListType8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ArchDefType <em>Arch Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ArchDefType
	 * @generated
	 */
	public Adapter createArchDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.BACKBUGVectorSectorType <em>BACKBUG Vector Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.BACKBUGVectorSectorType
	 * @generated
	 */
	public Adapter createBACKBUGVectorSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.BackgroundDebugMemTraitsType <em>Background Debug Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.BackgroundDebugMemTraitsType
	 * @generated
	 */
	public Adapter createBackgroundDebugMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.BreakpointsType <em>Breakpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.BreakpointsType
	 * @generated
	 */
	public Adapter createBreakpointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.CalDataMemTraitsType <em>Cal Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.CalDataMemTraitsType
	 * @generated
	 */
	public Adapter createCalDataMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.CalDataZoneType <em>Cal Data Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.CalDataZoneType
	 * @generated
	 */
	public Adapter createCalDataZoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ChecksumType <em>Checksum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ChecksumType
	 * @generated
	 */
	public Adapter createChecksumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.CodeMemTraitsType <em>Code Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.CodeMemTraitsType
	 * @generated
	 */
	public Adapter createCodeMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.CodeSectorType <em>Code Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.CodeSectorType
	 * @generated
	 */
	public Adapter createCodeSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ConfigFuseMemTraitsType <em>Config Fuse Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ConfigFuseMemTraitsType
	 * @generated
	 */
	public Adapter createConfigFuseMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ConfigFuseSectorType <em>Config Fuse Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ConfigFuseSectorType
	 * @generated
	 */
	public Adapter createConfigFuseSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DataMemTraitsType <em>Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DataMemTraitsType
	 * @generated
	 */
	public Adapter createDataMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DataSpaceType <em>Data Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DataSpaceType
	 * @generated
	 */
	public Adapter createDataSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DCRDefType <em>DCR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DCRDefType
	 * @generated
	 */
	public Adapter createDCRDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DCRFieldDefType <em>DCR Field Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DCRFieldDefType
	 * @generated
	 */
	public Adapter createDCRFieldDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DCRFieldSemanticType <em>DCR Field Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DCRFieldSemanticType
	 * @generated
	 */
	public Adapter createDCRFieldSemanticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DCRModeListType <em>DCR Mode List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DCRModeListType
	 * @generated
	 */
	public Adapter createDCRModeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DCRModeType <em>DCR Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DCRModeType
	 * @generated
	 */
	public Adapter createDCRModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DeviceIDMemTraitsType <em>Device ID Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DeviceIDMemTraitsType
	 * @generated
	 */
	public Adapter createDeviceIDMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DeviceIDSectorType <em>Device ID Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DeviceIDSectorType
	 * @generated
	 */
	public Adapter createDeviceIDSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DEVIDToRevType <em>DEVID To Rev Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DEVIDToRevType
	 * @generated
	 */
	public Adapter createDEVIDToRevTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.DPRDataSectorType <em>DPR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.DPRDataSectorType
	 * @generated
	 */
	public Adapter createDPRDataSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.EEDataMemTraitsType <em>EE Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.EEDataMemTraitsType
	 * @generated
	 */
	public Adapter createEEDataMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.EEDataSectorType <em>EE Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.EEDataSectorType
	 * @generated
	 */
	public Adapter createEEDataSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.EmulatorZoneType <em>Emulator Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.EmulatorZoneType
	 * @generated
	 */
	public Adapter createEmulatorZoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.GPRDataSectorType <em>GPR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.GPRDataSectorType
	 * @generated
	 */
	public Adapter createGPRDataSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.IllegalType <em>Illegal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.IllegalType
	 * @generated
	 */
	public Adapter createIllegalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ImportType
	 * @generated
	 */
	public Adapter createImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.JoinedSFRDefType <em>Joined SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.JoinedSFRDefType
	 * @generated
	 */
	public Adapter createJoinedSFRDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.LatchesType <em>Latches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.LatchesType
	 * @generated
	 */
	public Adapter createLatchesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.LCDType <em>LCD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.LCDType
	 * @generated
	 */
	public Adapter createLCDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.LegacyAliasType <em>Legacy Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.LegacyAliasType
	 * @generated
	 */
	public Adapter createLegacyAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.MemTraitsType <em>Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.MemTraitsType
	 * @generated
	 */
	public Adapter createMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.MigrationAliasType <em>Migration Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.MigrationAliasType
	 * @generated
	 */
	public Adapter createMigrationAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.MirrorType <em>Mirror Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.MirrorType
	 * @generated
	 */
	public Adapter createMirrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ModuleExcludeType <em>Module Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ModuleExcludeType
	 * @generated
	 */
	public Adapter createModuleExcludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ModuleImportType <em>Module Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ModuleImportType
	 * @generated
	 */
	public Adapter createModuleImportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ModuleMacroType <em>Module Macro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ModuleMacroType
	 * @generated
	 */
	public Adapter createModuleMacroTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ModuleRefType <em>Module Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ModuleRefType
	 * @generated
	 */
	public Adapter createModuleRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.MuxedSFRDefType <em>Muxed SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.MuxedSFRDefType
	 * @generated
	 */
	public Adapter createMuxedSFRDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.NMMRPlaceType <em>NMMR Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.NMMRPlaceType
	 * @generated
	 */
	public Adapter createNMMRPlaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.OscillatorModeType <em>Oscillator Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.OscillatorModeType
	 * @generated
	 */
	public Adapter createOscillatorModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.OscillatorType <em>Oscillator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.OscillatorType
	 * @generated
	 */
	public Adapter createOscillatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.PICType <em>PIC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.PICType
	 * @generated
	 */
	public Adapter createPICTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.PinListType <em>Pin List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.PinListType
	 * @generated
	 */
	public Adapter createPinListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.PinType
	 * @generated
	 */
	public Adapter createPinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.PowerType <em>Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.PowerType
	 * @generated
	 */
	public Adapter createPowerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ProgrammingType <em>Programming Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ProgrammingType
	 * @generated
	 */
	public Adapter createProgrammingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.ProgramSpaceType <em>Program Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.ProgramSpaceType
	 * @generated
	 */
	public Adapter createProgramSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.RegardlessOfModeType <em>Regardless Of Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.RegardlessOfModeType
	 * @generated
	 */
	public Adapter createRegardlessOfModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SelectSFRType <em>Select SFR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SelectSFRType
	 * @generated
	 */
	public Adapter createSelectSFRTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRDataSectorType <em>SFR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRDataSectorType
	 * @generated
	 */
	public Adapter createSFRDataSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRDefType <em>SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRDefType
	 * @generated
	 */
	public Adapter createSFRDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRFieldDefType <em>SFR Field Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRFieldDefType
	 * @generated
	 */
	public Adapter createSFRFieldDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRFieldSemanticType <em>SFR Field Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRFieldSemanticType
	 * @generated
	 */
	public Adapter createSFRFieldSemanticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRModeListType <em>SFR Mode List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRModeListType
	 * @generated
	 */
	public Adapter createSFRModeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.SFRModeType <em>SFR Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.SFRModeType
	 * @generated
	 */
	public Adapter createSFRModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.StimInfoType <em>Stim Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.StimInfoType
	 * @generated
	 */
	public Adapter createStimInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.TestMemTraitsType <em>Test Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.TestMemTraitsType
	 * @generated
	 */
	public Adapter createTestMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.TestZoneType <em>Test Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.TestZoneType
	 * @generated
	 */
	public Adapter createTestZoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.UserIDMemTraitsType <em>User ID Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.UserIDMemTraitsType
	 * @generated
	 */
	public Adapter createUserIDMemTraitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.UserIDSectorType <em>User ID Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.UserIDSectorType
	 * @generated
	 */
	public Adapter createUserIDSectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.VDDType <em>VDD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.VDDType
	 * @generated
	 */
	public Adapter createVDDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.VirtualPinType <em>Virtual Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.VirtualPinType
	 * @generated
	 */
	public Adapter createVirtualPinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.VPPType <em>VPP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.VPPType
	 * @generated
	 */
	public Adapter createVPPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.WaitType <em>Wait Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.WaitType
	 * @generated
	 */
	public Adapter createWaitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crownking.edc.WatchdogTimerType <em>Watchdog Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crownking.edc.WatchdogTimerType
	 * @generated
	 */
	public Adapter createWatchdogTimerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EdcAdapterFactory
