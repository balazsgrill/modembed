/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.core.CorePackage;

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
	 * The meta object id for the '{@link hu.modembed.model.pic.impl.PICArchitectureImpl <em>PIC Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.pic.impl.PICArchitectureImpl
	 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICArchitecture()
	 * @generated
	 */
	int PIC_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__ORIGINS = ArchitecturePackage.ARCHITECTURE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__DESCRIPTION = ArchitecturePackage.ARCHITECTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__NAME = ArchitecturePackage.ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Heap Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__HEAP_POINTER_TYPE = ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE;

	/**
	 * The feature id for the '<em><b>Code Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__CODE_POINTER_TYPE = ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE;

	/**
	 * The feature id for the '<em><b>Instruction Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__INSTRUCTION_SET = ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__MEMORY = ArchitecturePackage.ARCHITECTURE__MEMORY;

	/**
	 * The feature id for the '<em><b>Config Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE__CONFIG_WORDS = ArchitecturePackage.ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PIC Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_ARCHITECTURE_FEATURE_COUNT = ArchitecturePackage.ARCHITECTURE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__ADDRESS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__DEFAULT_VALUE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD__FIELDS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Config Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_WORD_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__LITERALS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__SIZE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD__START = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Config Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FIELD_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Config Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LITERAL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.pic.PICArchitecture <em>PIC Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Architecture</em>'.
	 * @see hu.modembed.model.pic.PICArchitecture
	 * @generated
	 */
	EClass getPICArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.pic.PICArchitecture#getConfigWords <em>Config Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Words</em>'.
	 * @see hu.modembed.model.pic.PICArchitecture#getConfigWords()
	 * @see #getPICArchitecture()
	 * @generated
	 */
	EReference getPICArchitecture_ConfigWords();

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
		 * The meta object literal for the '{@link hu.modembed.model.pic.impl.PICArchitectureImpl <em>PIC Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.pic.impl.PICArchitectureImpl
		 * @see hu.modembed.model.pic.impl.PicPackageImpl#getPICArchitecture()
		 * @generated
		 */
		EClass PIC_ARCHITECTURE = eINSTANCE.getPICArchitecture();

		/**
		 * The meta object literal for the '<em><b>Config Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_ARCHITECTURE__CONFIG_WORDS = eINSTANCE.getPICArchitecture_ConfigWords();

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

	}

} //PicPackage
