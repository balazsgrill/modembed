/**
 */
package hu.modembed.model.architecture;

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
 * @see hu.modembed.model.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = hu.modembed.model.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.impl.ArchitectureImpl
	 * @see hu.modembed.model.architecture.impl.ArchitecturePackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Heap Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__HEAP_POINTER_TYPE = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__CODE_POINTER_TYPE = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instruction Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__INSTRUCTION_SET = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__MEMORY = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.impl.MemorySectionImpl <em>Memory Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.impl.MemorySectionImpl
	 * @see hu.modembed.model.architecture.impl.ArchitecturePackageImpl#getMemorySection()
	 * @generated
	 */
	int MEMORY_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SECTION__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SECTION__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SECTION__PROGRAM = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_SECTION_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see hu.modembed.model.architecture.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.Architecture#getHeapPointerType <em>Heap Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heap Pointer Type</em>'.
	 * @see hu.modembed.model.architecture.Architecture#getHeapPointerType()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_HeapPointerType();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.Architecture#getCodePointerType <em>Code Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code Pointer Type</em>'.
	 * @see hu.modembed.model.architecture.Architecture#getCodePointerType()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_CodePointerType();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.Architecture#getInstructionSet <em>Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction Set</em>'.
	 * @see hu.modembed.model.architecture.Architecture#getInstructionSet()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_InstructionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.architecture.Architecture#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory</em>'.
	 * @see hu.modembed.model.architecture.Architecture#getMemory()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Memory();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.MemorySection <em>Memory Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Section</em>'.
	 * @see hu.modembed.model.architecture.MemorySection
	 * @generated
	 */
	EClass getMemorySection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.architecture.MemorySection#isProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see hu.modembed.model.architecture.MemorySection#isProgram()
	 * @see #getMemorySection()
	 * @generated
	 */
	EAttribute getMemorySection_Program();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.architecture.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.impl.ArchitectureImpl
		 * @see hu.modembed.model.architecture.impl.ArchitecturePackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Heap Pointer Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__HEAP_POINTER_TYPE = eINSTANCE.getArchitecture_HeapPointerType();

		/**
		 * The meta object literal for the '<em><b>Code Pointer Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__CODE_POINTER_TYPE = eINSTANCE.getArchitecture_CodePointerType();

		/**
		 * The meta object literal for the '<em><b>Instruction Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__INSTRUCTION_SET = eINSTANCE.getArchitecture_InstructionSet();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__MEMORY = eINSTANCE.getArchitecture_Memory();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.impl.MemorySectionImpl <em>Memory Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.impl.MemorySectionImpl
		 * @see hu.modembed.model.architecture.impl.ArchitecturePackageImpl#getMemorySection()
		 * @generated
		 */
		EClass MEMORY_SECTION = eINSTANCE.getMemorySection();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_SECTION__PROGRAM = eINSTANCE.getMemorySection_Program();

	}

} //ArchitecturePackage
