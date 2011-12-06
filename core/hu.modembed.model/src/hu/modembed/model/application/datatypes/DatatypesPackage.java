/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.datatypes;

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
 * @see hu.modembed.model.application.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/application/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.DatatypeImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = CorePackage.PACKAGED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = CorePackage.PACKAGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.AtomicTypeImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getAtomicType()
	 * @generated
	 */
	int ATOMIC_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE__QUALIFIED_NAME = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.StructuredTypeImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructuredType()
	 * @generated
	 */
	int STRUCTURED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The number of structural features of the '<em>Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.ArrayTypeImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = STRUCTURED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BASE_TYPE = STRUCTURED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LENGTH = STRUCTURED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = STRUCTURED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.StructTypeImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructType()
	 * @generated
	 */
	int STRUCT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__NAME = STRUCTURED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__ELEMENTS = STRUCTURED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_FEATURE_COUNT = STRUCTURED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.datatypes.impl.StructElementImpl <em>Struct Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.datatypes.impl.StructElementImpl
	 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructElement()
	 * @generated
	 */
	int STRUCT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ELEMENT__TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see hu.modembed.model.application.datatypes.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.AtomicType <em>Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Type</em>'.
	 * @see hu.modembed.model.application.datatypes.AtomicType
	 * @generated
	 */
	EClass getAtomicType();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.application.datatypes.AtomicType#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see hu.modembed.model.application.datatypes.AtomicType#getQualifiedName()
	 * @see #getAtomicType()
	 * @generated
	 */
	EAttribute getAtomicType_QualifiedName();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.StructuredType <em>Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Type</em>'.
	 * @see hu.modembed.model.application.datatypes.StructuredType
	 * @generated
	 */
	EClass getStructuredType();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see hu.modembed.model.application.datatypes.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.datatypes.ArrayType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see hu.modembed.model.application.datatypes.ArrayType#getBaseType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.application.datatypes.ArrayType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.modembed.model.application.datatypes.ArrayType#getLength()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Length();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see hu.modembed.model.application.datatypes.StructType
	 * @generated
	 */
	EClass getStructType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.application.datatypes.StructType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.modembed.model.application.datatypes.StructType#getElements()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_Elements();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.datatypes.StructElement <em>Struct Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Element</em>'.
	 * @see hu.modembed.model.application.datatypes.StructElement
	 * @generated
	 */
	EClass getStructElement();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.datatypes.StructElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.modembed.model.application.datatypes.StructElement#getType()
	 * @see #getStructElement()
	 * @generated
	 */
	EReference getStructElement_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.DatatypeImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.AtomicTypeImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getAtomicType()
		 * @generated
		 */
		EClass ATOMIC_TYPE = eINSTANCE.getAtomicType();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TYPE__QUALIFIED_NAME = eINSTANCE.getAtomicType_QualifiedName();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.StructuredTypeImpl <em>Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.StructuredTypeImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructuredType()
		 * @generated
		 */
		EClass STRUCTURED_TYPE = eINSTANCE.getStructuredType();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.ArrayTypeImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__BASE_TYPE = eINSTANCE.getArrayType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__LENGTH = eINSTANCE.getArrayType_Length();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.StructTypeImpl <em>Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.StructTypeImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructType()
		 * @generated
		 */
		EClass STRUCT_TYPE = eINSTANCE.getStructType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__ELEMENTS = eINSTANCE.getStructType_Elements();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.datatypes.impl.StructElementImpl <em>Struct Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.datatypes.impl.StructElementImpl
		 * @see hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl#getStructElement()
		 * @generated
		 */
		EClass STRUCT_ELEMENT = eINSTANCE.getStructElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_ELEMENT__TYPE = eINSTANCE.getStructElement_Type();

	}

} //DatatypesPackage
