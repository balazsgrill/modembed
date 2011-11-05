/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microchip.device.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://microchip.com/device/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = microchip.device.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link microchip.device.config.impl.CfgBitsImpl <em>Cfg Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.config.impl.CfgBitsImpl
	 * @see microchip.device.config.impl.ConfigPackageImpl#getCfgBits()
	 * @generated
	 */
	int CFG_BITS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS__ADDR = 1;

	/**
	 * The feature id for the '<em><b>Unused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS__UNUSED = 2;

	/**
	 * The feature id for the '<em><b>Illegals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS__ILLEGALS = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS__FIELDS = 4;

	/**
	 * The number of structural features of the '<em>Cfg Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_BITS_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link microchip.device.config.impl.IllegalImpl <em>Illegal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.config.impl.IllegalImpl
	 * @see microchip.device.config.impl.ConfigPackageImpl#getIllegal()
	 * @generated
	 */
	int ILLEGAL = 1;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL__MASK = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL__MSG = 2;

	/**
	 * The number of structural features of the '<em>Illegal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link microchip.device.config.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.config.impl.FieldImpl
	 * @see microchip.device.config.impl.ConfigPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__KEY = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MASK = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESC = 2;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SETTINGS = 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link microchip.device.config.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.config.impl.SettingImpl
	 * @see microchip.device.config.impl.ConfigPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 3;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__REQ = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__DESC = 2;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__CHECKSUM = 3;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link microchip.device.config.impl.ChecksumImpl <em>Checksum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.config.impl.ChecksumImpl
	 * @see microchip.device.config.impl.ConfigPackageImpl#getChecksum()
	 * @generated
	 */
	int CHECKSUM = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Protregion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__PROTREGION = 1;

	/**
	 * The number of structural features of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link microchip.device.config.CfgBits <em>Cfg Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cfg Bits</em>'.
	 * @see microchip.device.config.CfgBits
	 * @generated
	 */
	EClass getCfgBits();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.CfgBits#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see microchip.device.config.CfgBits#getKey()
	 * @see #getCfgBits()
	 * @generated
	 */
	EAttribute getCfgBits_Key();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.CfgBits#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see microchip.device.config.CfgBits#getAddr()
	 * @see #getCfgBits()
	 * @generated
	 */
	EAttribute getCfgBits_Addr();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.CfgBits#getUnused <em>Unused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unused</em>'.
	 * @see microchip.device.config.CfgBits#getUnused()
	 * @see #getCfgBits()
	 * @generated
	 */
	EAttribute getCfgBits_Unused();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.device.config.CfgBits#getIllegals <em>Illegals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illegals</em>'.
	 * @see microchip.device.config.CfgBits#getIllegals()
	 * @see #getCfgBits()
	 * @generated
	 */
	EReference getCfgBits_Illegals();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.device.config.CfgBits#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see microchip.device.config.CfgBits#getFields()
	 * @see #getCfgBits()
	 * @generated
	 */
	EReference getCfgBits_Fields();

	/**
	 * Returns the meta object for class '{@link microchip.device.config.Illegal <em>Illegal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Illegal</em>'.
	 * @see microchip.device.config.Illegal
	 * @generated
	 */
	EClass getIllegal();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Illegal#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see microchip.device.config.Illegal#getMask()
	 * @see #getIllegal()
	 * @generated
	 */
	EAttribute getIllegal_Mask();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Illegal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see microchip.device.config.Illegal#getValue()
	 * @see #getIllegal()
	 * @generated
	 */
	EAttribute getIllegal_Value();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Illegal#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see microchip.device.config.Illegal#getMsg()
	 * @see #getIllegal()
	 * @generated
	 */
	EAttribute getIllegal_Msg();

	/**
	 * Returns the meta object for class '{@link microchip.device.config.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see microchip.device.config.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Field#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see microchip.device.config.Field#getKey()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Key();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Field#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see microchip.device.config.Field#getMask()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Mask();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Field#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see microchip.device.config.Field#getDesc()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.device.config.Field#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see microchip.device.config.Field#getSettings()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Settings();

	/**
	 * Returns the meta object for class '{@link microchip.device.config.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see microchip.device.config.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Setting#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see microchip.device.config.Setting#getReq()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Req();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Setting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see microchip.device.config.Setting#getValue()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Value();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Setting#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see microchip.device.config.Setting#getDesc()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.config.Setting#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checksum</em>'.
	 * @see microchip.device.config.Setting#getChecksum()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Checksum();

	/**
	 * Returns the meta object for class '{@link microchip.device.config.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum</em>'.
	 * @see microchip.device.config.Checksum
	 * @generated
	 */
	EClass getChecksum();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.config.Checksum#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see microchip.device.config.Checksum#getType()
	 * @see #getChecksum()
	 * @generated
	 */
	EAttribute getChecksum_Type();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.config.Checksum#getProtregion <em>Protregion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protregion</em>'.
	 * @see microchip.device.config.Checksum#getProtregion()
	 * @see #getChecksum()
	 * @generated
	 */
	EReference getChecksum_Protregion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microchip.device.config.impl.CfgBitsImpl <em>Cfg Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.config.impl.CfgBitsImpl
		 * @see microchip.device.config.impl.ConfigPackageImpl#getCfgBits()
		 * @generated
		 */
		EClass CFG_BITS = eINSTANCE.getCfgBits();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFG_BITS__KEY = eINSTANCE.getCfgBits_Key();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFG_BITS__ADDR = eINSTANCE.getCfgBits_Addr();

		/**
		 * The meta object literal for the '<em><b>Unused</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFG_BITS__UNUSED = eINSTANCE.getCfgBits_Unused();

		/**
		 * The meta object literal for the '<em><b>Illegals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFG_BITS__ILLEGALS = eINSTANCE.getCfgBits_Illegals();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFG_BITS__FIELDS = eINSTANCE.getCfgBits_Fields();

		/**
		 * The meta object literal for the '{@link microchip.device.config.impl.IllegalImpl <em>Illegal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.config.impl.IllegalImpl
		 * @see microchip.device.config.impl.ConfigPackageImpl#getIllegal()
		 * @generated
		 */
		EClass ILLEGAL = eINSTANCE.getIllegal();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILLEGAL__MASK = eINSTANCE.getIllegal_Mask();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILLEGAL__VALUE = eINSTANCE.getIllegal_Value();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ILLEGAL__MSG = eINSTANCE.getIllegal_Msg();

		/**
		 * The meta object literal for the '{@link microchip.device.config.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.config.impl.FieldImpl
		 * @see microchip.device.config.impl.ConfigPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__KEY = eINSTANCE.getField_Key();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MASK = eINSTANCE.getField_Mask();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DESC = eINSTANCE.getField_Desc();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SETTINGS = eINSTANCE.getField_Settings();

		/**
		 * The meta object literal for the '{@link microchip.device.config.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.config.impl.SettingImpl
		 * @see microchip.device.config.impl.ConfigPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__REQ = eINSTANCE.getSetting_Req();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__VALUE = eINSTANCE.getSetting_Value();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__DESC = eINSTANCE.getSetting_Desc();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__CHECKSUM = eINSTANCE.getSetting_Checksum();

		/**
		 * The meta object literal for the '{@link microchip.device.config.impl.ChecksumImpl <em>Checksum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.config.impl.ChecksumImpl
		 * @see microchip.device.config.impl.ConfigPackageImpl#getChecksum()
		 * @generated
		 */
		EClass CHECKSUM = eINSTANCE.getChecksum();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSUM__TYPE = eINSTANCE.getChecksum_Type();

		/**
		 * The meta object literal for the '<em><b>Protregion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKSUM__PROTREGION = eINSTANCE.getChecksum_Protregion();

	}

} //ConfigPackage
