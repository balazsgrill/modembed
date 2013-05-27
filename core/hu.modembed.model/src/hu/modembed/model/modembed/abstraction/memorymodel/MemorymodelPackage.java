/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel;

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
 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory
 * @model kind="package"
 * @generated
 */
public interface MemorymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memorymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/abstraction/memorymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "memmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemorymodelPackage eINSTANCE = hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl <em>Memory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl#getMemoryType()
	 * @generated
	 */
	int MEMORY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__ANNOTATIONS = InfrastructurePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__ATTRIBUTES = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__ACCESS_COST = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__CONTENT_VOLATILE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>For Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__FOR_DATA = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__FOR_PROGRAM = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryInstanceImpl <em>Memory Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryInstanceImpl
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl#getMemoryInstance()
	 * @generated
	 */
	int MEMORY_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__ANNOTATIONS = InfrastructurePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__START_ADDRESS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__SIZE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE__ATTRIBUTES = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memory Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTANCE_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Type</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType
	 * @generated
	 */
	EClass getMemoryType();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAttributes()
	 * @see #getMemoryType()
	 * @generated
	 */
	EReference getMemoryType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAccessCost <em>Access Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Cost</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAccessCost()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_AccessCost();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isContentVolatile <em>Content Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Volatile</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isContentVolatile()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_ContentVolatile();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForData <em>For Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Data</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForData()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_ForData();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForProgram <em>For Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Program</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForProgram()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_ForProgram();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance <em>Memory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Instance</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance
	 * @generated
	 */
	EClass getMemoryInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getType()
	 * @see #getMemoryInstance()
	 * @generated
	 */
	EReference getMemoryInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getStartAddress()
	 * @see #getMemoryInstance()
	 * @generated
	 */
	EAttribute getMemoryInstance_StartAddress();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getSize()
	 * @see #getMemoryInstance()
	 * @generated
	 */
	EAttribute getMemoryInstance_Size();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getAttributes()
	 * @see #getMemoryInstance()
	 * @generated
	 */
	EReference getMemoryInstance_Attributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MemorymodelFactory getMemorymodelFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl <em>Memory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl
		 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl#getMemoryType()
		 * @generated
		 */
		EClass MEMORY_TYPE = eINSTANCE.getMemoryType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_TYPE__ATTRIBUTES = eINSTANCE.getMemoryType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Access Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_TYPE__ACCESS_COST = eINSTANCE.getMemoryType_AccessCost();

		/**
		 * The meta object literal for the '<em><b>Content Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_TYPE__CONTENT_VOLATILE = eINSTANCE.getMemoryType_ContentVolatile();

		/**
		 * The meta object literal for the '<em><b>For Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_TYPE__FOR_DATA = eINSTANCE.getMemoryType_ForData();

		/**
		 * The meta object literal for the '<em><b>For Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_TYPE__FOR_PROGRAM = eINSTANCE.getMemoryType_ForProgram();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryInstanceImpl <em>Memory Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryInstanceImpl
		 * @see hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl#getMemoryInstance()
		 * @generated
		 */
		EClass MEMORY_INSTANCE = eINSTANCE.getMemoryInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_INSTANCE__TYPE = eINSTANCE.getMemoryInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_INSTANCE__START_ADDRESS = eINSTANCE.getMemoryInstance_StartAddress();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_INSTANCE__SIZE = eINSTANCE.getMemoryInstance_Size();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_INSTANCE__ATTRIBUTES = eINSTANCE.getMemoryInstance_Attributes();

	}

} //MemorymodelPackage
