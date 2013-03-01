/**
 */
package hu.modembed.model.pic.configValue;

import hu.modembed.model.core.CorePackage;

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
 * @see hu.modembed.model.pic.configValue.ConfigValueFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigValuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configValue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.modembed/pic/configValue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configValue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigValuePackage eINSTANCE = hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl <em>PIC Configuration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl
	 * @see hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl#getPICConfigurationValue()
	 * @generated
	 */
	int PIC_CONFIGURATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE__VALUES = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE__DEFINITION = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PIC Configuration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.configValue.impl.ConfigurationSelectionImpl <em>Configuration Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.configValue.impl.ConfigurationSelectionImpl
	 * @see hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl#getConfigurationSelection()
	 * @generated
	 */
	int CONFIGURATION_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__FIELD = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__SELECTION = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.configValue.PICConfigurationValue <em>PIC Configuration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Configuration Value</em>'.
	 * @see hu.modembed.model.pic.configValue.PICConfigurationValue
	 * @generated
	 */
	EClass getPICConfigurationValue();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.configValue.PICConfigurationValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hu.modembed.model.pic.configValue.PICConfigurationValue#getValues()
	 * @see #getPICConfigurationValue()
	 * @generated
	 */
	EReference getPICConfigurationValue_Values();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.configValue.PICConfigurationValue#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see hu.modembed.model.pic.configValue.PICConfigurationValue#getDefinition()
	 * @see #getPICConfigurationValue()
	 * @generated
	 */
	EReference getPICConfigurationValue_Definition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.configValue.ConfigurationSelection <em>Configuration Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Selection</em>'.
	 * @see hu.modembed.model.pic.configValue.ConfigurationSelection
	 * @generated
	 */
	EClass getConfigurationSelection();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.configValue.ConfigurationSelection#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see hu.modembed.model.pic.configValue.ConfigurationSelection#getField()
	 * @see #getConfigurationSelection()
	 * @generated
	 */
	EReference getConfigurationSelection_Field();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.configValue.ConfigurationSelection#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see hu.modembed.model.pic.configValue.ConfigurationSelection#getSelection()
	 * @see #getConfigurationSelection()
	 * @generated
	 */
	EReference getConfigurationSelection_Selection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigValueFactory getConfigValueFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl <em>PIC Configuration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.configValue.impl.PICConfigurationValueImpl
		 * @see hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl#getPICConfigurationValue()
		 * @generated
		 */
		EClass PIC_CONFIGURATION_VALUE = eINSTANCE.getPICConfigurationValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CONFIGURATION_VALUE__VALUES = eINSTANCE.getPICConfigurationValue_Values();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CONFIGURATION_VALUE__DEFINITION = eINSTANCE.getPICConfigurationValue_Definition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.configValue.impl.ConfigurationSelectionImpl <em>Configuration Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.configValue.impl.ConfigurationSelectionImpl
		 * @see hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl#getConfigurationSelection()
		 * @generated
		 */
		EClass CONFIGURATION_SELECTION = eINSTANCE.getConfigurationSelection();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SELECTION__FIELD = eINSTANCE.getConfigurationSelection_Field();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SELECTION__SELECTION = eINSTANCE.getConfigurationSelection_Selection();

	}

} //ConfigValuePackage
