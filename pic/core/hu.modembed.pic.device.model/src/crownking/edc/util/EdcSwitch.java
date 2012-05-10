/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.util;

import crownking.edc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see crownking.edc.EdcPackage
 * @generated
 */
public class EdcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdcSwitch() {
		if (modelPackage == null) {
			modelPackage = EdcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EdcPackage.ADJUST_POINT_TYPE: {
				AdjustPointType adjustPointType = (AdjustPointType)theEObject;
				T result = caseAdjustPointType(adjustPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE: {
				AliasListType aliasListType = (AliasListType)theEObject;
				T result = caseAliasListType(aliasListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE1: {
				AliasListType1 aliasListType1 = (AliasListType1)theEObject;
				T result = caseAliasListType1(aliasListType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE2: {
				AliasListType2 aliasListType2 = (AliasListType2)theEObject;
				T result = caseAliasListType2(aliasListType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE3: {
				AliasListType3 aliasListType3 = (AliasListType3)theEObject;
				T result = caseAliasListType3(aliasListType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE4: {
				AliasListType4 aliasListType4 = (AliasListType4)theEObject;
				T result = caseAliasListType4(aliasListType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE5: {
				AliasListType5 aliasListType5 = (AliasListType5)theEObject;
				T result = caseAliasListType5(aliasListType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE6: {
				AliasListType6 aliasListType6 = (AliasListType6)theEObject;
				T result = caseAliasListType6(aliasListType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE7: {
				AliasListType7 aliasListType7 = (AliasListType7)theEObject;
				T result = caseAliasListType7(aliasListType7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ALIAS_LIST_TYPE8: {
				AliasListType8 aliasListType8 = (AliasListType8)theEObject;
				T result = caseAliasListType8(aliasListType8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ARCH_DEF_TYPE: {
				ArchDefType archDefType = (ArchDefType)theEObject;
				T result = caseArchDefType(archDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.BACKBUG_VECTOR_SECTOR_TYPE: {
				BACKBUGVectorSectorType backbugVectorSectorType = (BACKBUGVectorSectorType)theEObject;
				T result = caseBACKBUGVectorSectorType(backbugVectorSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.BACKGROUND_DEBUG_MEM_TRAITS_TYPE: {
				BackgroundDebugMemTraitsType backgroundDebugMemTraitsType = (BackgroundDebugMemTraitsType)theEObject;
				T result = caseBackgroundDebugMemTraitsType(backgroundDebugMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.BREAKPOINTS_TYPE: {
				BreakpointsType breakpointsType = (BreakpointsType)theEObject;
				T result = caseBreakpointsType(breakpointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CAL_DATA_MEM_TRAITS_TYPE: {
				CalDataMemTraitsType calDataMemTraitsType = (CalDataMemTraitsType)theEObject;
				T result = caseCalDataMemTraitsType(calDataMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CAL_DATA_ZONE_TYPE: {
				CalDataZoneType calDataZoneType = (CalDataZoneType)theEObject;
				T result = caseCalDataZoneType(calDataZoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CHECKSUM_TYPE: {
				ChecksumType checksumType = (ChecksumType)theEObject;
				T result = caseChecksumType(checksumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CODE_MEM_TRAITS_TYPE: {
				CodeMemTraitsType codeMemTraitsType = (CodeMemTraitsType)theEObject;
				T result = caseCodeMemTraitsType(codeMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CODE_SECTOR_TYPE: {
				CodeSectorType codeSectorType = (CodeSectorType)theEObject;
				T result = caseCodeSectorType(codeSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CONFIG_FUSE_MEM_TRAITS_TYPE: {
				ConfigFuseMemTraitsType configFuseMemTraitsType = (ConfigFuseMemTraitsType)theEObject;
				T result = caseConfigFuseMemTraitsType(configFuseMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE: {
				ConfigFuseSectorType configFuseSectorType = (ConfigFuseSectorType)theEObject;
				T result = caseConfigFuseSectorType(configFuseSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DATA_MEM_TRAITS_TYPE: {
				DataMemTraitsType dataMemTraitsType = (DataMemTraitsType)theEObject;
				T result = caseDataMemTraitsType(dataMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DATA_SPACE_TYPE: {
				DataSpaceType dataSpaceType = (DataSpaceType)theEObject;
				T result = caseDataSpaceType(dataSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DCR_DEF_TYPE: {
				DCRDefType dcrDefType = (DCRDefType)theEObject;
				T result = caseDCRDefType(dcrDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DCR_FIELD_DEF_TYPE: {
				DCRFieldDefType dcrFieldDefType = (DCRFieldDefType)theEObject;
				T result = caseDCRFieldDefType(dcrFieldDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DCR_FIELD_SEMANTIC_TYPE: {
				DCRFieldSemanticType dcrFieldSemanticType = (DCRFieldSemanticType)theEObject;
				T result = caseDCRFieldSemanticType(dcrFieldSemanticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DCR_MODE_LIST_TYPE: {
				DCRModeListType dcrModeListType = (DCRModeListType)theEObject;
				T result = caseDCRModeListType(dcrModeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DCR_MODE_TYPE: {
				DCRModeType dcrModeType = (DCRModeType)theEObject;
				T result = caseDCRModeType(dcrModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DEVICE_ID_MEM_TRAITS_TYPE: {
				DeviceIDMemTraitsType deviceIDMemTraitsType = (DeviceIDMemTraitsType)theEObject;
				T result = caseDeviceIDMemTraitsType(deviceIDMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DEVICE_ID_SECTOR_TYPE: {
				DeviceIDSectorType deviceIDSectorType = (DeviceIDSectorType)theEObject;
				T result = caseDeviceIDSectorType(deviceIDSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DEVID_TO_REV_TYPE: {
				DEVIDToRevType devidToRevType = (DEVIDToRevType)theEObject;
				T result = caseDEVIDToRevType(devidToRevType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.DPR_DATA_SECTOR_TYPE: {
				DPRDataSectorType dprDataSectorType = (DPRDataSectorType)theEObject;
				T result = caseDPRDataSectorType(dprDataSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE: {
				EEDataMemTraitsType eeDataMemTraitsType = (EEDataMemTraitsType)theEObject;
				T result = caseEEDataMemTraitsType(eeDataMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.EE_DATA_SECTOR_TYPE: {
				EEDataSectorType eeDataSectorType = (EEDataSectorType)theEObject;
				T result = caseEEDataSectorType(eeDataSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.EMULATOR_ZONE_TYPE: {
				EmulatorZoneType emulatorZoneType = (EmulatorZoneType)theEObject;
				T result = caseEmulatorZoneType(emulatorZoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.GPR_DATA_SECTOR_TYPE: {
				GPRDataSectorType gprDataSectorType = (GPRDataSectorType)theEObject;
				T result = caseGPRDataSectorType(gprDataSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.ILLEGAL_TYPE: {
				IllegalType illegalType = (IllegalType)theEObject;
				T result = caseIllegalType(illegalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.JOINED_SFR_DEF_TYPE: {
				JoinedSFRDefType joinedSFRDefType = (JoinedSFRDefType)theEObject;
				T result = caseJoinedSFRDefType(joinedSFRDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.LATCHES_TYPE: {
				LatchesType latchesType = (LatchesType)theEObject;
				T result = caseLatchesType(latchesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.LCD_TYPE: {
				LCDType lcdType = (LCDType)theEObject;
				T result = caseLCDType(lcdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.LEGACY_ALIAS_TYPE: {
				LegacyAliasType legacyAliasType = (LegacyAliasType)theEObject;
				T result = caseLegacyAliasType(legacyAliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MEM_TRAITS_TYPE: {
				MemTraitsType memTraitsType = (MemTraitsType)theEObject;
				T result = caseMemTraitsType(memTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MIGRATION_ALIAS_TYPE: {
				MigrationAliasType migrationAliasType = (MigrationAliasType)theEObject;
				T result = caseMigrationAliasType(migrationAliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MIRROR_TYPE: {
				MirrorType mirrorType = (MirrorType)theEObject;
				T result = caseMirrorType(mirrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MODULE_EXCLUDE_TYPE: {
				ModuleExcludeType moduleExcludeType = (ModuleExcludeType)theEObject;
				T result = caseModuleExcludeType(moduleExcludeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MODULE_IMPORT_TYPE: {
				ModuleImportType moduleImportType = (ModuleImportType)theEObject;
				T result = caseModuleImportType(moduleImportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MODULE_MACRO_TYPE: {
				ModuleMacroType moduleMacroType = (ModuleMacroType)theEObject;
				T result = caseModuleMacroType(moduleMacroType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MODULE_REF_TYPE: {
				ModuleRefType moduleRefType = (ModuleRefType)theEObject;
				T result = caseModuleRefType(moduleRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.MUXED_SFR_DEF_TYPE: {
				MuxedSFRDefType muxedSFRDefType = (MuxedSFRDefType)theEObject;
				T result = caseMuxedSFRDefType(muxedSFRDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.NMMR_PLACE_TYPE: {
				NMMRPlaceType nmmrPlaceType = (NMMRPlaceType)theEObject;
				T result = caseNMMRPlaceType(nmmrPlaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.OSCILLATOR_MODE_TYPE: {
				OscillatorModeType oscillatorModeType = (OscillatorModeType)theEObject;
				T result = caseOscillatorModeType(oscillatorModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.OSCILLATOR_TYPE: {
				OscillatorType oscillatorType = (OscillatorType)theEObject;
				T result = caseOscillatorType(oscillatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.PIC_TYPE: {
				PICType picType = (PICType)theEObject;
				T result = casePICType(picType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.PIN_LIST_TYPE: {
				PinListType pinListType = (PinListType)theEObject;
				T result = casePinListType(pinListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.PIN_TYPE: {
				PinType pinType = (PinType)theEObject;
				T result = casePinType(pinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.POWER_TYPE: {
				PowerType powerType = (PowerType)theEObject;
				T result = casePowerType(powerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.PROGRAMMING_TYPE: {
				ProgrammingType programmingType = (ProgrammingType)theEObject;
				T result = caseProgrammingType(programmingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.PROGRAM_SPACE_TYPE: {
				ProgramSpaceType programSpaceType = (ProgramSpaceType)theEObject;
				T result = caseProgramSpaceType(programSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.REGARDLESS_OF_MODE_TYPE: {
				RegardlessOfModeType regardlessOfModeType = (RegardlessOfModeType)theEObject;
				T result = caseRegardlessOfModeType(regardlessOfModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SELECT_SFR_TYPE: {
				SelectSFRType selectSFRType = (SelectSFRType)theEObject;
				T result = caseSelectSFRType(selectSFRType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_DATA_SECTOR_TYPE: {
				SFRDataSectorType sfrDataSectorType = (SFRDataSectorType)theEObject;
				T result = caseSFRDataSectorType(sfrDataSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_DEF_TYPE: {
				SFRDefType sfrDefType = (SFRDefType)theEObject;
				T result = caseSFRDefType(sfrDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_FIELD_DEF_TYPE: {
				SFRFieldDefType sfrFieldDefType = (SFRFieldDefType)theEObject;
				T result = caseSFRFieldDefType(sfrFieldDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_FIELD_SEMANTIC_TYPE: {
				SFRFieldSemanticType sfrFieldSemanticType = (SFRFieldSemanticType)theEObject;
				T result = caseSFRFieldSemanticType(sfrFieldSemanticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_MODE_LIST_TYPE: {
				SFRModeListType sfrModeListType = (SFRModeListType)theEObject;
				T result = caseSFRModeListType(sfrModeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.SFR_MODE_TYPE: {
				SFRModeType sfrModeType = (SFRModeType)theEObject;
				T result = caseSFRModeType(sfrModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.STIM_INFO_TYPE: {
				StimInfoType stimInfoType = (StimInfoType)theEObject;
				T result = caseStimInfoType(stimInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.TEST_MEM_TRAITS_TYPE: {
				TestMemTraitsType testMemTraitsType = (TestMemTraitsType)theEObject;
				T result = caseTestMemTraitsType(testMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.TEST_ZONE_TYPE: {
				TestZoneType testZoneType = (TestZoneType)theEObject;
				T result = caseTestZoneType(testZoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.USER_ID_MEM_TRAITS_TYPE: {
				UserIDMemTraitsType userIDMemTraitsType = (UserIDMemTraitsType)theEObject;
				T result = caseUserIDMemTraitsType(userIDMemTraitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.USER_ID_SECTOR_TYPE: {
				UserIDSectorType userIDSectorType = (UserIDSectorType)theEObject;
				T result = caseUserIDSectorType(userIDSectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.VDD_TYPE: {
				VDDType vddType = (VDDType)theEObject;
				T result = caseVDDType(vddType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.VIRTUAL_PIN_TYPE: {
				VirtualPinType virtualPinType = (VirtualPinType)theEObject;
				T result = caseVirtualPinType(virtualPinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.VPP_TYPE: {
				VPPType vppType = (VPPType)theEObject;
				T result = caseVPPType(vppType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.WAIT_TYPE: {
				WaitType waitType = (WaitType)theEObject;
				T result = caseWaitType(waitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdcPackage.WATCHDOG_TIMER_TYPE: {
				WatchdogTimerType watchdogTimerType = (WatchdogTimerType)theEObject;
				T result = caseWatchdogTimerType(watchdogTimerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjust Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjust Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjustPointType(AdjustPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType(AliasListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType1(AliasListType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType2(AliasListType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType3(AliasListType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType4(AliasListType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType5(AliasListType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType6(AliasListType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType7(AliasListType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias List Type8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias List Type8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasListType8(AliasListType8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchDefType(ArchDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BACKBUG Vector Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BACKBUG Vector Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBACKBUGVectorSectorType(BACKBUGVectorSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Debug Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Debug Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundDebugMemTraitsType(BackgroundDebugMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakpoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakpoints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakpointsType(BreakpointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cal Data Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cal Data Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalDataMemTraitsType(CalDataMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cal Data Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cal Data Zone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalDataZoneType(CalDataZoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksumType(ChecksumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeMemTraitsType(CodeMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSectorType(CodeSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Fuse Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Fuse Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigFuseMemTraitsType(ConfigFuseMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Fuse Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Fuse Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigFuseSectorType(ConfigFuseSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMemTraitsType(DataMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSpaceType(DataSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCR Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCR Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCRDefType(DCRDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCR Field Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCR Field Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCRFieldDefType(DCRFieldDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCR Field Semantic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCR Field Semantic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCRFieldSemanticType(DCRFieldSemanticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCR Mode List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCR Mode List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCRModeListType(DCRModeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCR Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCR Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCRModeType(DCRModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device ID Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device ID Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceIDMemTraitsType(DeviceIDMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device ID Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device ID Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceIDSectorType(DeviceIDSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEVID To Rev Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEVID To Rev Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEVIDToRevType(DEVIDToRevType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPR Data Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPR Data Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPRDataSectorType(DPRDataSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EE Data Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EE Data Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEDataMemTraitsType(EEDataMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EE Data Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EE Data Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEDataSectorType(EEDataSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emulator Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emulator Zone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmulatorZoneType(EmulatorZoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPR Data Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPR Data Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPRDataSectorType(GPRDataSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Illegal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Illegal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIllegalType(IllegalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joined SFR Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joined SFR Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinedSFRDefType(JoinedSFRDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latches Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latches Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatchesType(LatchesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LCD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LCD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLCDType(LCDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyAliasType(LegacyAliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemTraitsType(MemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrationAliasType(MigrationAliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirror Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirror Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMirrorType(MirrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Exclude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Exclude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleExcludeType(ModuleExcludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleImportType(ModuleImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Macro Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Macro Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMacroType(ModuleMacroType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRefType(ModuleRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Muxed SFR Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Muxed SFR Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuxedSFRDefType(MuxedSFRDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NMMR Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NMMR Place Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNMMRPlaceType(NMMRPlaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oscillator Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oscillator Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscillatorModeType(OscillatorModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oscillator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oscillator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscillatorType(OscillatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePICType(PICType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinListType(PinListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinType(PinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerType(PowerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programming Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programming Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgrammingType(ProgrammingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramSpaceType(ProgramSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regardless Of Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regardless Of Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegardlessOfModeType(RegardlessOfModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select SFR Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select SFR Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectSFRType(SelectSFRType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Data Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Data Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRDataSectorType(SFRDataSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRDefType(SFRDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Field Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Field Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRFieldDefType(SFRFieldDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Field Semantic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Field Semantic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRFieldSemanticType(SFRFieldSemanticType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Mode List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Mode List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRModeListType(SFRModeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFR Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFR Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFRModeType(SFRModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stim Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stim Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimInfoType(StimInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestMemTraitsType(TestMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Zone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Zone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestZoneType(TestZoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User ID Mem Traits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User ID Mem Traits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIDMemTraitsType(UserIDMemTraitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User ID Sector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User ID Sector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIDSectorType(UserIDSectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDDType(VDDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Pin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Pin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualPinType(VirtualPinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPPType(VPPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitType(WaitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Watchdog Timer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Watchdog Timer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWatchdogTimerType(WatchdogTimerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EdcSwitch
