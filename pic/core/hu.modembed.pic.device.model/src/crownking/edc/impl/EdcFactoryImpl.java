/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdcFactoryImpl extends EFactoryImpl implements EdcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdcFactory init() {
		try {
			EdcFactory theEdcFactory = (EdcFactory)EPackage.Registry.INSTANCE.getEFactory("http://crownking/edc"); 
			if (theEdcFactory != null) {
				return theEdcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EdcPackage.ADJUST_POINT_TYPE: return createAdjustPointType();
			case EdcPackage.ALIAS_LIST_TYPE: return createAliasListType();
			case EdcPackage.ALIAS_LIST_TYPE1: return createAliasListType1();
			case EdcPackage.ALIAS_LIST_TYPE2: return createAliasListType2();
			case EdcPackage.ALIAS_LIST_TYPE3: return createAliasListType3();
			case EdcPackage.ALIAS_LIST_TYPE4: return createAliasListType4();
			case EdcPackage.ALIAS_LIST_TYPE5: return createAliasListType5();
			case EdcPackage.ALIAS_LIST_TYPE6: return createAliasListType6();
			case EdcPackage.ALIAS_LIST_TYPE7: return createAliasListType7();
			case EdcPackage.ALIAS_LIST_TYPE8: return createAliasListType8();
			case EdcPackage.ARCH_DEF_TYPE: return createArchDefType();
			case EdcPackage.BACKBUG_VECTOR_SECTOR_TYPE: return createBACKBUGVectorSectorType();
			case EdcPackage.BACKGROUND_DEBUG_MEM_TRAITS_TYPE: return createBackgroundDebugMemTraitsType();
			case EdcPackage.BREAKPOINTS_TYPE: return createBreakpointsType();
			case EdcPackage.CAL_DATA_MEM_TRAITS_TYPE: return createCalDataMemTraitsType();
			case EdcPackage.CAL_DATA_ZONE_TYPE: return createCalDataZoneType();
			case EdcPackage.CHECKSUM_TYPE: return createChecksumType();
			case EdcPackage.CODE_MEM_TRAITS_TYPE: return createCodeMemTraitsType();
			case EdcPackage.CODE_SECTOR_TYPE: return createCodeSectorType();
			case EdcPackage.CONFIG_FUSE_MEM_TRAITS_TYPE: return createConfigFuseMemTraitsType();
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE: return createConfigFuseSectorType();
			case EdcPackage.DATA_MEM_TRAITS_TYPE: return createDataMemTraitsType();
			case EdcPackage.DATA_SPACE_TYPE: return createDataSpaceType();
			case EdcPackage.DCR_DEF_TYPE: return createDCRDefType();
			case EdcPackage.DCR_FIELD_DEF_TYPE: return createDCRFieldDefType();
			case EdcPackage.DCR_FIELD_SEMANTIC_TYPE: return createDCRFieldSemanticType();
			case EdcPackage.DCR_MODE_LIST_TYPE: return createDCRModeListType();
			case EdcPackage.DCR_MODE_TYPE: return createDCRModeType();
			case EdcPackage.DEVICE_ID_MEM_TRAITS_TYPE: return createDeviceIDMemTraitsType();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE: return createDeviceIDSectorType();
			case EdcPackage.DEVID_TO_REV_TYPE: return createDEVIDToRevType();
			case EdcPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case EdcPackage.DPR_DATA_SECTOR_TYPE: return createDPRDataSectorType();
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE: return createEEDataMemTraitsType();
			case EdcPackage.EE_DATA_SECTOR_TYPE: return createEEDataSectorType();
			case EdcPackage.EMULATOR_ZONE_TYPE: return createEmulatorZoneType();
			case EdcPackage.GPR_DATA_SECTOR_TYPE: return createGPRDataSectorType();
			case EdcPackage.ILLEGAL_TYPE: return createIllegalType();
			case EdcPackage.IMPORT_TYPE: return createImportType();
			case EdcPackage.JOINED_SFR_DEF_TYPE: return createJoinedSFRDefType();
			case EdcPackage.LATCHES_TYPE: return createLatchesType();
			case EdcPackage.LCD_TYPE: return createLCDType();
			case EdcPackage.LEGACY_ALIAS_TYPE: return createLegacyAliasType();
			case EdcPackage.MEM_TRAITS_TYPE: return createMemTraitsType();
			case EdcPackage.MIGRATION_ALIAS_TYPE: return createMigrationAliasType();
			case EdcPackage.MIRROR_TYPE: return createMirrorType();
			case EdcPackage.MODULE_EXCLUDE_TYPE: return createModuleExcludeType();
			case EdcPackage.MODULE_IMPORT_TYPE: return createModuleImportType();
			case EdcPackage.MODULE_MACRO_TYPE: return createModuleMacroType();
			case EdcPackage.MODULE_REF_TYPE: return createModuleRefType();
			case EdcPackage.MUXED_SFR_DEF_TYPE: return createMuxedSFRDefType();
			case EdcPackage.NMMR_PLACE_TYPE: return createNMMRPlaceType();
			case EdcPackage.OSCILLATOR_MODE_TYPE: return createOscillatorModeType();
			case EdcPackage.OSCILLATOR_TYPE: return createOscillatorType();
			case EdcPackage.PIC_TYPE: return createPICType();
			case EdcPackage.PIN_LIST_TYPE: return createPinListType();
			case EdcPackage.PIN_TYPE: return createPinType();
			case EdcPackage.POWER_TYPE: return createPowerType();
			case EdcPackage.PROGRAMMING_TYPE: return createProgrammingType();
			case EdcPackage.PROGRAM_SPACE_TYPE: return createProgramSpaceType();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE: return createRegardlessOfModeType();
			case EdcPackage.SELECT_SFR_TYPE: return createSelectSFRType();
			case EdcPackage.SFR_DATA_SECTOR_TYPE: return createSFRDataSectorType();
			case EdcPackage.SFR_DEF_TYPE: return createSFRDefType();
			case EdcPackage.SFR_FIELD_DEF_TYPE: return createSFRFieldDefType();
			case EdcPackage.SFR_FIELD_SEMANTIC_TYPE: return createSFRFieldSemanticType();
			case EdcPackage.SFR_MODE_LIST_TYPE: return createSFRModeListType();
			case EdcPackage.SFR_MODE_TYPE: return createSFRModeType();
			case EdcPackage.STIM_INFO_TYPE: return createStimInfoType();
			case EdcPackage.TEST_MEM_TRAITS_TYPE: return createTestMemTraitsType();
			case EdcPackage.TEST_ZONE_TYPE: return createTestZoneType();
			case EdcPackage.USER_ID_MEM_TRAITS_TYPE: return createUserIDMemTraitsType();
			case EdcPackage.USER_ID_SECTOR_TYPE: return createUserIDSectorType();
			case EdcPackage.VDD_TYPE: return createVDDType();
			case EdcPackage.VIRTUAL_PIN_TYPE: return createVirtualPinType();
			case EdcPackage.VPP_TYPE: return createVPPType();
			case EdcPackage.WAIT_TYPE: return createWaitType();
			case EdcPackage.WATCHDOG_TIMER_TYPE: return createWatchdogTimerType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustPointType createAdjustPointType() {
		AdjustPointTypeImpl adjustPointType = new AdjustPointTypeImpl();
		return adjustPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType createAliasListType() {
		AliasListTypeImpl aliasListType = new AliasListTypeImpl();
		return aliasListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType1 createAliasListType1() {
		AliasListType1Impl aliasListType1 = new AliasListType1Impl();
		return aliasListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType2 createAliasListType2() {
		AliasListType2Impl aliasListType2 = new AliasListType2Impl();
		return aliasListType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType3 createAliasListType3() {
		AliasListType3Impl aliasListType3 = new AliasListType3Impl();
		return aliasListType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType4 createAliasListType4() {
		AliasListType4Impl aliasListType4 = new AliasListType4Impl();
		return aliasListType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType5 createAliasListType5() {
		AliasListType5Impl aliasListType5 = new AliasListType5Impl();
		return aliasListType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType6 createAliasListType6() {
		AliasListType6Impl aliasListType6 = new AliasListType6Impl();
		return aliasListType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType7 createAliasListType7() {
		AliasListType7Impl aliasListType7 = new AliasListType7Impl();
		return aliasListType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType8 createAliasListType8() {
		AliasListType8Impl aliasListType8 = new AliasListType8Impl();
		return aliasListType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchDefType createArchDefType() {
		ArchDefTypeImpl archDefType = new ArchDefTypeImpl();
		return archDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACKBUGVectorSectorType createBACKBUGVectorSectorType() {
		BACKBUGVectorSectorTypeImpl backbugVectorSectorType = new BACKBUGVectorSectorTypeImpl();
		return backbugVectorSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundDebugMemTraitsType createBackgroundDebugMemTraitsType() {
		BackgroundDebugMemTraitsTypeImpl backgroundDebugMemTraitsType = new BackgroundDebugMemTraitsTypeImpl();
		return backgroundDebugMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakpointsType createBreakpointsType() {
		BreakpointsTypeImpl breakpointsType = new BreakpointsTypeImpl();
		return breakpointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalDataMemTraitsType createCalDataMemTraitsType() {
		CalDataMemTraitsTypeImpl calDataMemTraitsType = new CalDataMemTraitsTypeImpl();
		return calDataMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalDataZoneType createCalDataZoneType() {
		CalDataZoneTypeImpl calDataZoneType = new CalDataZoneTypeImpl();
		return calDataZoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumType createChecksumType() {
		ChecksumTypeImpl checksumType = new ChecksumTypeImpl();
		return checksumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeMemTraitsType createCodeMemTraitsType() {
		CodeMemTraitsTypeImpl codeMemTraitsType = new CodeMemTraitsTypeImpl();
		return codeMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSectorType createCodeSectorType() {
		CodeSectorTypeImpl codeSectorType = new CodeSectorTypeImpl();
		return codeSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFuseMemTraitsType createConfigFuseMemTraitsType() {
		ConfigFuseMemTraitsTypeImpl configFuseMemTraitsType = new ConfigFuseMemTraitsTypeImpl();
		return configFuseMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFuseSectorType createConfigFuseSectorType() {
		ConfigFuseSectorTypeImpl configFuseSectorType = new ConfigFuseSectorTypeImpl();
		return configFuseSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMemTraitsType createDataMemTraitsType() {
		DataMemTraitsTypeImpl dataMemTraitsType = new DataMemTraitsTypeImpl();
		return dataMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpaceType createDataSpaceType() {
		DataSpaceTypeImpl dataSpaceType = new DataSpaceTypeImpl();
		return dataSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRDefType createDCRDefType() {
		DCRDefTypeImpl dcrDefType = new DCRDefTypeImpl();
		return dcrDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRFieldDefType createDCRFieldDefType() {
		DCRFieldDefTypeImpl dcrFieldDefType = new DCRFieldDefTypeImpl();
		return dcrFieldDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRFieldSemanticType createDCRFieldSemanticType() {
		DCRFieldSemanticTypeImpl dcrFieldSemanticType = new DCRFieldSemanticTypeImpl();
		return dcrFieldSemanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRModeListType createDCRModeListType() {
		DCRModeListTypeImpl dcrModeListType = new DCRModeListTypeImpl();
		return dcrModeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRModeType createDCRModeType() {
		DCRModeTypeImpl dcrModeType = new DCRModeTypeImpl();
		return dcrModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIDMemTraitsType createDeviceIDMemTraitsType() {
		DeviceIDMemTraitsTypeImpl deviceIDMemTraitsType = new DeviceIDMemTraitsTypeImpl();
		return deviceIDMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIDSectorType createDeviceIDSectorType() {
		DeviceIDSectorTypeImpl deviceIDSectorType = new DeviceIDSectorTypeImpl();
		return deviceIDSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVIDToRevType createDEVIDToRevType() {
		DEVIDToRevTypeImpl devidToRevType = new DEVIDToRevTypeImpl();
		return devidToRevType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPRDataSectorType createDPRDataSectorType() {
		DPRDataSectorTypeImpl dprDataSectorType = new DPRDataSectorTypeImpl();
		return dprDataSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEDataMemTraitsType createEEDataMemTraitsType() {
		EEDataMemTraitsTypeImpl eeDataMemTraitsType = new EEDataMemTraitsTypeImpl();
		return eeDataMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEDataSectorType createEEDataSectorType() {
		EEDataSectorTypeImpl eeDataSectorType = new EEDataSectorTypeImpl();
		return eeDataSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmulatorZoneType createEmulatorZoneType() {
		EmulatorZoneTypeImpl emulatorZoneType = new EmulatorZoneTypeImpl();
		return emulatorZoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPRDataSectorType createGPRDataSectorType() {
		GPRDataSectorTypeImpl gprDataSectorType = new GPRDataSectorTypeImpl();
		return gprDataSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllegalType createIllegalType() {
		IllegalTypeImpl illegalType = new IllegalTypeImpl();
		return illegalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType() {
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinedSFRDefType createJoinedSFRDefType() {
		JoinedSFRDefTypeImpl joinedSFRDefType = new JoinedSFRDefTypeImpl();
		return joinedSFRDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatchesType createLatchesType() {
		LatchesTypeImpl latchesType = new LatchesTypeImpl();
		return latchesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCDType createLCDType() {
		LCDTypeImpl lcdType = new LCDTypeImpl();
		return lcdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAliasType createLegacyAliasType() {
		LegacyAliasTypeImpl legacyAliasType = new LegacyAliasTypeImpl();
		return legacyAliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemTraitsType createMemTraitsType() {
		MemTraitsTypeImpl memTraitsType = new MemTraitsTypeImpl();
		return memTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationAliasType createMigrationAliasType() {
		MigrationAliasTypeImpl migrationAliasType = new MigrationAliasTypeImpl();
		return migrationAliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorType createMirrorType() {
		MirrorTypeImpl mirrorType = new MirrorTypeImpl();
		return mirrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleExcludeType createModuleExcludeType() {
		ModuleExcludeTypeImpl moduleExcludeType = new ModuleExcludeTypeImpl();
		return moduleExcludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleImportType createModuleImportType() {
		ModuleImportTypeImpl moduleImportType = new ModuleImportTypeImpl();
		return moduleImportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMacroType createModuleMacroType() {
		ModuleMacroTypeImpl moduleMacroType = new ModuleMacroTypeImpl();
		return moduleMacroType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRefType createModuleRefType() {
		ModuleRefTypeImpl moduleRefType = new ModuleRefTypeImpl();
		return moduleRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuxedSFRDefType createMuxedSFRDefType() {
		MuxedSFRDefTypeImpl muxedSFRDefType = new MuxedSFRDefTypeImpl();
		return muxedSFRDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NMMRPlaceType createNMMRPlaceType() {
		NMMRPlaceTypeImpl nmmrPlaceType = new NMMRPlaceTypeImpl();
		return nmmrPlaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscillatorModeType createOscillatorModeType() {
		OscillatorModeTypeImpl oscillatorModeType = new OscillatorModeTypeImpl();
		return oscillatorModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscillatorType createOscillatorType() {
		OscillatorTypeImpl oscillatorType = new OscillatorTypeImpl();
		return oscillatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICType createPICType() {
		PICTypeImpl picType = new PICTypeImpl();
		return picType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinListType createPinListType() {
		PinListTypeImpl pinListType = new PinListTypeImpl();
		return pinListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinType createPinType() {
		PinTypeImpl pinType = new PinTypeImpl();
		return pinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerType createPowerType() {
		PowerTypeImpl powerType = new PowerTypeImpl();
		return powerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingType createProgrammingType() {
		ProgrammingTypeImpl programmingType = new ProgrammingTypeImpl();
		return programmingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSpaceType createProgramSpaceType() {
		ProgramSpaceTypeImpl programSpaceType = new ProgramSpaceTypeImpl();
		return programSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegardlessOfModeType createRegardlessOfModeType() {
		RegardlessOfModeTypeImpl regardlessOfModeType = new RegardlessOfModeTypeImpl();
		return regardlessOfModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectSFRType createSelectSFRType() {
		SelectSFRTypeImpl selectSFRType = new SelectSFRTypeImpl();
		return selectSFRType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRDataSectorType createSFRDataSectorType() {
		SFRDataSectorTypeImpl sfrDataSectorType = new SFRDataSectorTypeImpl();
		return sfrDataSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRDefType createSFRDefType() {
		SFRDefTypeImpl sfrDefType = new SFRDefTypeImpl();
		return sfrDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRFieldDefType createSFRFieldDefType() {
		SFRFieldDefTypeImpl sfrFieldDefType = new SFRFieldDefTypeImpl();
		return sfrFieldDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRFieldSemanticType createSFRFieldSemanticType() {
		SFRFieldSemanticTypeImpl sfrFieldSemanticType = new SFRFieldSemanticTypeImpl();
		return sfrFieldSemanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRModeListType createSFRModeListType() {
		SFRModeListTypeImpl sfrModeListType = new SFRModeListTypeImpl();
		return sfrModeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRModeType createSFRModeType() {
		SFRModeTypeImpl sfrModeType = new SFRModeTypeImpl();
		return sfrModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimInfoType createStimInfoType() {
		StimInfoTypeImpl stimInfoType = new StimInfoTypeImpl();
		return stimInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMemTraitsType createTestMemTraitsType() {
		TestMemTraitsTypeImpl testMemTraitsType = new TestMemTraitsTypeImpl();
		return testMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestZoneType createTestZoneType() {
		TestZoneTypeImpl testZoneType = new TestZoneTypeImpl();
		return testZoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIDMemTraitsType createUserIDMemTraitsType() {
		UserIDMemTraitsTypeImpl userIDMemTraitsType = new UserIDMemTraitsTypeImpl();
		return userIDMemTraitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIDSectorType createUserIDSectorType() {
		UserIDSectorTypeImpl userIDSectorType = new UserIDSectorTypeImpl();
		return userIDSectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDDType createVDDType() {
		VDDTypeImpl vddType = new VDDTypeImpl();
		return vddType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualPinType createVirtualPinType() {
		VirtualPinTypeImpl virtualPinType = new VirtualPinTypeImpl();
		return virtualPinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPPType createVPPType() {
		VPPTypeImpl vppType = new VPPTypeImpl();
		return vppType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitType createWaitType() {
		WaitTypeImpl waitType = new WaitTypeImpl();
		return waitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WatchdogTimerType createWatchdogTimerType() {
		WatchdogTimerTypeImpl watchdogTimerType = new WatchdogTimerTypeImpl();
		return watchdogTimerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdcPackage getEdcPackage() {
		return (EdcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdcPackage getPackage() {
		return EdcPackage.eINSTANCE;
	}

} //EdcFactoryImpl
