/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

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
 * @see pic.PicFactory
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
	String eNS_URI = "http://gb.hu/embedded/pic";

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
	PicPackage eINSTANCE = pic.impl.PicPackageImpl.init();

	/**
	 * The meta object id for the '{@link pic.impl.ConfigurationBitsImpl <em>Configuration Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pic.impl.ConfigurationBitsImpl
	 * @see pic.impl.PicPackageImpl#getConfigurationBits()
	 * @generated
	 */
	int CONFIGURATION_BITS = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_BITS__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_BITS__WORDS = 1;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_BITS__WORDSIZE = 2;

	/**
	 * The number of structural features of the '<em>Configuration Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_BITS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pic.impl.ConfigurationWordImpl <em>Configuration Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pic.impl.ConfigurationWordImpl
	 * @see pic.impl.PicPackageImpl#getConfigurationWord()
	 * @generated
	 */
	int CONFIGURATION_WORD = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WORD__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WORD__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Configuration Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_WORD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pic.impl.ConfigurationFieldImpl <em>Configuration Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pic.impl.ConfigurationFieldImpl
	 * @see pic.impl.PicPackageImpl#getConfigurationField()
	 * @generated
	 */
	int CONFIGURATION_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FIELD__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Start Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FIELD__START_BIT = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FIELD__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Configuration Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pic.impl.PicCPUTypeImpl <em>CPU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pic.impl.PicCPUTypeImpl
	 * @see pic.impl.PicPackageImpl#getPicCPUType()
	 * @generated
	 */
	int PIC_CPU_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CPU_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CPU_TYPE__CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>CPU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_CPU_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link pic.ConfigurationBits <em>Configuration Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Bits</em>'.
	 * @see pic.ConfigurationBits
	 * @generated
	 */
	EClass getConfigurationBits();

	/**
	 * Returns the meta object for the containment reference '{@link pic.ConfigurationBits#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheme</em>'.
	 * @see pic.ConfigurationBits#getScheme()
	 * @see #getConfigurationBits()
	 * @generated
	 */
	EReference getConfigurationBits_Scheme();

	/**
	 * Returns the meta object for the containment reference list '{@link pic.ConfigurationBits#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see pic.ConfigurationBits#getWords()
	 * @see #getConfigurationBits()
	 * @generated
	 */
	EReference getConfigurationBits_Words();

	/**
	 * Returns the meta object for the attribute '{@link pic.ConfigurationBits#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see pic.ConfigurationBits#getWordsize()
	 * @see #getConfigurationBits()
	 * @generated
	 */
	EAttribute getConfigurationBits_Wordsize();

	/**
	 * Returns the meta object for class '{@link pic.ConfigurationWord <em>Configuration Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Word</em>'.
	 * @see pic.ConfigurationWord
	 * @generated
	 */
	EClass getConfigurationWord();

	/**
	 * Returns the meta object for the attribute '{@link pic.ConfigurationWord#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see pic.ConfigurationWord#getAddress()
	 * @see #getConfigurationWord()
	 * @generated
	 */
	EAttribute getConfigurationWord_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link pic.ConfigurationWord#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see pic.ConfigurationWord#getFields()
	 * @see #getConfigurationWord()
	 * @generated
	 */
	EReference getConfigurationWord_Fields();

	/**
	 * Returns the meta object for class '{@link pic.ConfigurationField <em>Configuration Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Field</em>'.
	 * @see pic.ConfigurationField
	 * @generated
	 */
	EClass getConfigurationField();

	/**
	 * Returns the meta object for the reference '{@link pic.ConfigurationField#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see pic.ConfigurationField#getParameter()
	 * @see #getConfigurationField()
	 * @generated
	 */
	EReference getConfigurationField_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link pic.ConfigurationField#getStartBit <em>Start Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Bit</em>'.
	 * @see pic.ConfigurationField#getStartBit()
	 * @see #getConfigurationField()
	 * @generated
	 */
	EAttribute getConfigurationField_StartBit();

	/**
	 * Returns the meta object for the attribute '{@link pic.ConfigurationField#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see pic.ConfigurationField#getLength()
	 * @see #getConfigurationField()
	 * @generated
	 */
	EAttribute getConfigurationField_Length();

	/**
	 * Returns the meta object for class '{@link pic.PicCPUType <em>CPU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Type</em>'.
	 * @see pic.PicCPUType
	 * @generated
	 */
	EClass getPicCPUType();

	/**
	 * Returns the meta object for the attribute '{@link pic.PicCPUType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pic.PicCPUType#getName()
	 * @see #getPicCPUType()
	 * @generated
	 */
	EAttribute getPicCPUType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link pic.PicCPUType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see pic.PicCPUType#getConfiguration()
	 * @see #getPicCPUType()
	 * @generated
	 */
	EReference getPicCPUType_Configuration();

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
		 * The meta object literal for the '{@link pic.impl.ConfigurationBitsImpl <em>Configuration Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pic.impl.ConfigurationBitsImpl
		 * @see pic.impl.PicPackageImpl#getConfigurationBits()
		 * @generated
		 */
		EClass CONFIGURATION_BITS = eINSTANCE.getConfigurationBits();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_BITS__SCHEME = eINSTANCE.getConfigurationBits_Scheme();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_BITS__WORDS = eINSTANCE.getConfigurationBits_Words();

		/**
		 * The meta object literal for the '<em><b>Wordsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_BITS__WORDSIZE = eINSTANCE.getConfigurationBits_Wordsize();

		/**
		 * The meta object literal for the '{@link pic.impl.ConfigurationWordImpl <em>Configuration Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pic.impl.ConfigurationWordImpl
		 * @see pic.impl.PicPackageImpl#getConfigurationWord()
		 * @generated
		 */
		EClass CONFIGURATION_WORD = eINSTANCE.getConfigurationWord();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_WORD__ADDRESS = eINSTANCE.getConfigurationWord_Address();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_WORD__FIELDS = eINSTANCE.getConfigurationWord_Fields();

		/**
		 * The meta object literal for the '{@link pic.impl.ConfigurationFieldImpl <em>Configuration Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pic.impl.ConfigurationFieldImpl
		 * @see pic.impl.PicPackageImpl#getConfigurationField()
		 * @generated
		 */
		EClass CONFIGURATION_FIELD = eINSTANCE.getConfigurationField();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_FIELD__PARAMETER = eINSTANCE.getConfigurationField_Parameter();

		/**
		 * The meta object literal for the '<em><b>Start Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_FIELD__START_BIT = eINSTANCE.getConfigurationField_StartBit();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_FIELD__LENGTH = eINSTANCE.getConfigurationField_Length();

		/**
		 * The meta object literal for the '{@link pic.impl.PicCPUTypeImpl <em>CPU Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pic.impl.PicCPUTypeImpl
		 * @see pic.impl.PicPackageImpl#getPicCPUType()
		 * @generated
		 */
		EClass PIC_CPU_TYPE = eINSTANCE.getPicCPUType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIC_CPU_TYPE__NAME = eINSTANCE.getPicCPUType_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_CPU_TYPE__CONFIGURATION = eINSTANCE.getPicCPUType_Configuration();

	}

} //PicPackage
