/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

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
 * @see hu.modembed.model.pic.PicFactory
 * @model kind="package"
 * @generated
 */
public interface PicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.modembed/pic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicPackage eINSTANCE = hu.modembed.model.pic.impl.PicPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.PICConfigurationModelImpl <em>PIC Configuration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.PICConfigurationModelImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICConfigurationModel()
	 * @generated
	 */
	int PIC_CONFIGURATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_MODEL__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_MODEL__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_MODEL__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Config Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_MODEL__CONFIG_WORDS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PIC Configuration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_MODEL_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.ConfigWordImpl <em>Config Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.ConfigWordImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigWord()
	 * @generated
	 */
	int CONFIG_WORD = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__ADDRESS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__SIZE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__DEFAULT_VALUE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__FIELDS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Impl Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__IMPL_MASK = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Config Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.ConfigFieldImpl <em>Config Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.ConfigFieldImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigField()
	 * @generated
	 */
	int CONFIG_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__LITERALS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__SIZE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__START = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Config Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.ConfigLiteralImpl <em>Config Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.ConfigLiteralImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigLiteral()
	 * @generated
	 */
	int CONFIG_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL__VALUE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.PICConfigurationValueModelImpl <em>PIC Configuration Value Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.PICConfigurationValueModelImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICConfigurationValueModel()
	 * @generated
	 */
	int PIC_CONFIGURATION_VALUE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL__VALUES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL__DEFINITION = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PIC Configuration Value Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CONFIGURATION_VALUE_MODEL_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.ConfigurationSelectionImpl <em>Configuration Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.ConfigurationSelectionImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigurationSelection()
	 * @generated
	 */
	int CONFIGURATION_SELECTION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__FIELD = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION__SELECTION = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SELECTION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.PICConfigurationModel <em>PIC Configuration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Configuration Model</em>'.
	 * @see hu.modembed.model.pic.PICConfigurationModel
	 * @generated
	 */
	EClass getPICConfigurationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.PICConfigurationModel#getConfigWords <em>Config Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Words</em>'.
	 * @see hu.modembed.model.pic.PICConfigurationModel#getConfigWords()
	 * @see #getPICConfigurationModel()
	 * @generated
	 */
	EReference getPICConfigurationModel_ConfigWords();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.ConfigWord <em>Config Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Word</em>'.
	 * @see hu.modembed.model.pic.ConfigWord
	 * @generated
	 */
	EClass getConfigWord();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigWord#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hu.modembed.model.pic.ConfigWord#getAddress()
	 * @see #getConfigWord()
	 * @generated
	 */
	EAttribute getConfigWord_Address();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigWord#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.modembed.model.pic.ConfigWord#getSize()
	 * @see #getConfigWord()
	 * @generated
	 */
	EAttribute getConfigWord_Size();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigWord#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see hu.modembed.model.pic.ConfigWord#getDefaultValue()
	 * @see #getConfigWord()
	 * @generated
	 */
	EAttribute getConfigWord_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.ConfigWord#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see hu.modembed.model.pic.ConfigWord#getFields()
	 * @see #getConfigWord()
	 * @generated
	 */
	EReference getConfigWord_Fields();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigWord#getImplMask <em>Impl Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl Mask</em>'.
	 * @see hu.modembed.model.pic.ConfigWord#getImplMask()
	 * @see #getConfigWord()
	 * @generated
	 */
	EAttribute getConfigWord_ImplMask();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.ConfigField <em>Config Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Field</em>'.
	 * @see hu.modembed.model.pic.ConfigField
	 * @generated
	 */
	EClass getConfigField();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.ConfigField#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see hu.modembed.model.pic.ConfigField#getLiterals()
	 * @see #getConfigField()
	 * @generated
	 */
	EReference getConfigField_Literals();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.modembed.model.pic.ConfigField#getSize()
	 * @see #getConfigField()
	 * @generated
	 */
	EAttribute getConfigField_Size();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigField#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hu.modembed.model.pic.ConfigField#getStart()
	 * @see #getConfigField()
	 * @generated
	 */
	EAttribute getConfigField_Start();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.ConfigLiteral <em>Config Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Literal</em>'.
	 * @see hu.modembed.model.pic.ConfigLiteral
	 * @generated
	 */
	EClass getConfigLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.pic.ConfigLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.pic.ConfigLiteral#getValue()
	 * @see #getConfigLiteral()
	 * @generated
	 */
	EAttribute getConfigLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.PICConfigurationValueModel <em>PIC Configuration Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Configuration Value Model</em>'.
	 * @see hu.modembed.model.pic.PICConfigurationValueModel
	 * @generated
	 */
	EClass getPICConfigurationValueModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.PICConfigurationValueModel#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hu.modembed.model.pic.PICConfigurationValueModel#getValues()
	 * @see #getPICConfigurationValueModel()
	 * @generated
	 */
	EReference getPICConfigurationValueModel_Values();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.PICConfigurationValueModel#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see hu.modembed.model.pic.PICConfigurationValueModel#getDefinition()
	 * @see #getPICConfigurationValueModel()
	 * @generated
	 */
	EReference getPICConfigurationValueModel_Definition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.ConfigurationSelection <em>Configuration Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Selection</em>'.
	 * @see hu.modembed.model.pic.ConfigurationSelection
	 * @generated
	 */
	EClass getConfigurationSelection();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.ConfigurationSelection#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see hu.modembed.model.pic.ConfigurationSelection#getField()
	 * @see #getConfigurationSelection()
	 * @generated
	 */
	EReference getConfigurationSelection_Field();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.pic.ConfigurationSelection#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see hu.modembed.model.pic.ConfigurationSelection#getSelection()
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
	PicFactory getPicFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.PICConfigurationModelImpl <em>PIC Configuration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.PICConfigurationModelImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICConfigurationModel()
		 * @generated
		 */
		EClass PIC_CONFIGURATION_MODEL = eINSTANCE.getPICConfigurationModel();

		/**
		 * The meta object literal for the '<em><b>Config Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CONFIGURATION_MODEL__CONFIG_WORDS = eINSTANCE.getPICConfigurationModel_ConfigWords();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.ConfigWordImpl <em>Config Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.ConfigWordImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigWord()
		 * @generated
		 */
		EClass CONFIG_WORD = eINSTANCE.getConfigWord();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_WORD__ADDRESS = eINSTANCE.getConfigWord_Address();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_WORD__SIZE = eINSTANCE.getConfigWord_Size();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_WORD__DEFAULT_VALUE = eINSTANCE.getConfigWord_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_WORD__FIELDS = eINSTANCE.getConfigWord_Fields();

		/**
		 * The meta object literal for the '<em><b>Impl Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_WORD__IMPL_MASK = eINSTANCE.getConfigWord_ImplMask();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.ConfigFieldImpl <em>Config Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.ConfigFieldImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigField()
		 * @generated
		 */
		EClass CONFIG_FIELD = eINSTANCE.getConfigField();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_FIELD__LITERALS = eINSTANCE.getConfigField_Literals();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FIELD__SIZE = eINSTANCE.getConfigField_Size();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FIELD__START = eINSTANCE.getConfigField_Start();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.ConfigLiteralImpl <em>Config Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.ConfigLiteralImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigLiteral()
		 * @generated
		 */
		EClass CONFIG_LITERAL = eINSTANCE.getConfigLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_LITERAL__VALUE = eINSTANCE.getConfigLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.PICConfigurationValueModelImpl <em>PIC Configuration Value Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.PICConfigurationValueModelImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICConfigurationValueModel()
		 * @generated
		 */
		EClass PIC_CONFIGURATION_VALUE_MODEL = eINSTANCE.getPICConfigurationValueModel();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CONFIGURATION_VALUE_MODEL__VALUES = eINSTANCE.getPICConfigurationValueModel_Values();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CONFIGURATION_VALUE_MODEL__DEFINITION = eINSTANCE.getPICConfigurationValueModel_Definition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.ConfigurationSelectionImpl <em>Configuration Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.ConfigurationSelectionImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getConfigurationSelection()
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

} //PicPackage
