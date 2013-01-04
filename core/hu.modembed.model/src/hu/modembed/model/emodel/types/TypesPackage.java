/**
 */
package hu.modembed.model.emodel.types;

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
 * @see hu.modembed.model.emodel.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emodel/1.0/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = hu.modembed.model.emodel.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.TypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.PrimitiveTypeDefinitionImpl <em>Primitive Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.PrimitiveTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getPrimitiveTypeDefinition()
	 * @generated
	 */
	int PRIMITIVE_TYPE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DEFINITION__ORIGINS = TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DEFINITION__DESCRIPTION = TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Primitive Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.CompositeTypeDefinitionImpl <em>Composite Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.CompositeTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getCompositeTypeDefinition()
	 * @generated
	 */
	int COMPOSITE_TYPE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_DEFINITION__ORIGINS = TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_DEFINITION__DESCRIPTION = TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Composite Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.UnsignedTypeDefinitionImpl <em>Unsigned Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.UnsignedTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getUnsignedTypeDefinition()
	 * @generated
	 */
	int UNSIGNED_TYPE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_TYPE_DEFINITION__ORIGINS = PRIMITIVE_TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_TYPE_DEFINITION__DESCRIPTION = PRIMITIVE_TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_TYPE_DEFINITION__BITS = PRIMITIVE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unsigned Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_TYPE_DEFINITION_FEATURE_COUNT = PRIMITIVE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.ReferenceTypeDefinitionImpl <em>Reference Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.ReferenceTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getReferenceTypeDefinition()
	 * @generated
	 */
	int REFERENCE_TYPE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_DEFINITION__ORIGINS = COMPOSITE_TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_DEFINITION__DESCRIPTION = COMPOSITE_TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_DEFINITION__TYPE = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_DEFINITION_FEATURE_COUNT = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.PointerTypeDefinitionImpl <em>Pointer Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.PointerTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getPointerTypeDefinition()
	 * @generated
	 */
	int POINTER_TYPE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_DEFINITION__ORIGINS = COMPOSITE_TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_DEFINITION__DESCRIPTION = COMPOSITE_TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pointer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_DEFINITION__POINTER_TYPE = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_DEFINITION_FEATURE_COUNT = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.ArrayDefinitionImpl <em>Array Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.ArrayDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getArrayDefinition()
	 * @generated
	 */
	int ARRAY_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION__ORIGINS = POINTER_TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION__DESCRIPTION = POINTER_TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pointer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION__POINTER_TYPE = POINTER_TYPE_DEFINITION__POINTER_TYPE;

	/**
	 * The number of structural features of the '<em>Array Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEFINITION_FEATURE_COUNT = POINTER_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.StructureTypeDefinitionImpl <em>Structure Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.StructureTypeDefinitionImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getStructureTypeDefinition()
	 * @generated
	 */
	int STRUCTURE_TYPE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DEFINITION__ORIGINS = COMPOSITE_TYPE_DEFINITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DEFINITION__DESCRIPTION = COMPOSITE_TYPE_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DEFINITION__ELEMENTS = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_DEFINITION_FEATURE_COUNT = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.types.impl.StructureTypeElementImpl <em>Structure Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.types.impl.StructureTypeElementImpl
	 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getStructureTypeElement()
	 * @generated
	 */
	int STRUCTURE_TYPE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_ELEMENT__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_ELEMENT__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_ELEMENT__TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.PrimitiveTypeDefinition <em>Primitive Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.PrimitiveTypeDefinition
	 * @generated
	 */
	EClass getPrimitiveTypeDefinition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.CompositeTypeDefinition <em>Composite Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.CompositeTypeDefinition
	 * @generated
	 */
	EClass getCompositeTypeDefinition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.UnsignedTypeDefinition <em>Unsigned Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.UnsignedTypeDefinition
	 * @generated
	 */
	EClass getUnsignedTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.types.UnsignedTypeDefinition#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see hu.modembed.model.emodel.types.UnsignedTypeDefinition#getBits()
	 * @see #getUnsignedTypeDefinition()
	 * @generated
	 */
	EAttribute getUnsignedTypeDefinition_Bits();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.ReferenceTypeDefinition <em>Reference Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.ReferenceTypeDefinition
	 * @generated
	 */
	EClass getReferenceTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.types.ReferenceTypeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.modembed.model.emodel.types.ReferenceTypeDefinition#getType()
	 * @see #getReferenceTypeDefinition()
	 * @generated
	 */
	EReference getReferenceTypeDefinition_Type();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.PointerTypeDefinition <em>Pointer Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.PointerTypeDefinition
	 * @generated
	 */
	EClass getPointerTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.types.PointerTypeDefinition#getPointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer Type</em>'.
	 * @see hu.modembed.model.emodel.types.PointerTypeDefinition#getPointerType()
	 * @see #getPointerTypeDefinition()
	 * @generated
	 */
	EReference getPointerTypeDefinition_PointerType();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.ArrayDefinition <em>Array Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Definition</em>'.
	 * @see hu.modembed.model.emodel.types.ArrayDefinition
	 * @generated
	 */
	EClass getArrayDefinition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.StructureTypeDefinition <em>Structure Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type Definition</em>'.
	 * @see hu.modembed.model.emodel.types.StructureTypeDefinition
	 * @generated
	 */
	EClass getStructureTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.types.StructureTypeDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.modembed.model.emodel.types.StructureTypeDefinition#getElements()
	 * @see #getStructureTypeDefinition()
	 * @generated
	 */
	EReference getStructureTypeDefinition_Elements();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.types.StructureTypeElement <em>Structure Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type Element</em>'.
	 * @see hu.modembed.model.emodel.types.StructureTypeElement
	 * @generated
	 */
	EClass getStructureTypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.types.StructureTypeElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.emodel.types.StructureTypeElement#getType()
	 * @see #getStructureTypeElement()
	 * @generated
	 */
	EReference getStructureTypeElement_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.TypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.PrimitiveTypeDefinitionImpl <em>Primitive Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.PrimitiveTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getPrimitiveTypeDefinition()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_DEFINITION = eINSTANCE.getPrimitiveTypeDefinition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.CompositeTypeDefinitionImpl <em>Composite Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.CompositeTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getCompositeTypeDefinition()
		 * @generated
		 */
		EClass COMPOSITE_TYPE_DEFINITION = eINSTANCE.getCompositeTypeDefinition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.UnsignedTypeDefinitionImpl <em>Unsigned Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.UnsignedTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getUnsignedTypeDefinition()
		 * @generated
		 */
		EClass UNSIGNED_TYPE_DEFINITION = eINSTANCE.getUnsignedTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSIGNED_TYPE_DEFINITION__BITS = eINSTANCE.getUnsignedTypeDefinition_Bits();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.ReferenceTypeDefinitionImpl <em>Reference Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.ReferenceTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getReferenceTypeDefinition()
		 * @generated
		 */
		EClass REFERENCE_TYPE_DEFINITION = eINSTANCE.getReferenceTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE_DEFINITION__TYPE = eINSTANCE.getReferenceTypeDefinition_Type();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.PointerTypeDefinitionImpl <em>Pointer Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.PointerTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getPointerTypeDefinition()
		 * @generated
		 */
		EClass POINTER_TYPE_DEFINITION = eINSTANCE.getPointerTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Pointer Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_TYPE_DEFINITION__POINTER_TYPE = eINSTANCE.getPointerTypeDefinition_PointerType();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.ArrayDefinitionImpl <em>Array Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.ArrayDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getArrayDefinition()
		 * @generated
		 */
		EClass ARRAY_DEFINITION = eINSTANCE.getArrayDefinition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.StructureTypeDefinitionImpl <em>Structure Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.StructureTypeDefinitionImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getStructureTypeDefinition()
		 * @generated
		 */
		EClass STRUCTURE_TYPE_DEFINITION = eINSTANCE.getStructureTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TYPE_DEFINITION__ELEMENTS = eINSTANCE.getStructureTypeDefinition_Elements();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.types.impl.StructureTypeElementImpl <em>Structure Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.types.impl.StructureTypeElementImpl
		 * @see hu.modembed.model.emodel.types.impl.TypesPackageImpl#getStructureTypeElement()
		 * @generated
		 */
		EClass STRUCTURE_TYPE_ELEMENT = eINSTANCE.getStructureTypeElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TYPE_ELEMENT__TYPE = eINSTANCE.getStructureTypeElement_Type();

	}

} //TypesPackage
