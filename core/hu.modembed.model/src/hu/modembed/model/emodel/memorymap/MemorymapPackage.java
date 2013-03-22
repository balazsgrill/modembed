/**
 */
package hu.modembed.model.emodel.memorymap;

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
 * @see hu.modembed.model.emodel.memorymap.MemorymapFactory
 * @model kind="package"
 * @generated
 */
public interface MemorymapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memorymap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emodel/1.0/memorymap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "memorymap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemorymapPackage eINSTANCE = hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.memorymap.impl.MemoryMapImpl <em>Memory Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.memorymap.impl.MemoryMapImpl
	 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getMemoryMap()
	 * @generated
	 */
	int MEMORY_MAP = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP__ROOT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MAP_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl <em>Heap Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl
	 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getHeapLevel()
	 * @generated
	 */
	int HEAP_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_LEVEL__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_LEVEL__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_LEVEL__MAPPINGS = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_LEVEL__SUB_LEVELS = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heap Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_LEVEL_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.memorymap.impl.HeapVariableMappingImpl <em>Heap Variable Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.memorymap.impl.HeapVariableMappingImpl
	 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getHeapVariableMapping()
	 * @generated
	 */
	int HEAP_VARIABLE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_MAPPING__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_MAPPING__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_MAPPING__VARIABLE = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_MAPPING__ADDRESS = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heap Variable Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_MAPPING_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.memorymap.MemoryMap <em>Memory Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Map</em>'.
	 * @see hu.modembed.model.emodel.memorymap.MemoryMap
	 * @generated
	 */
	EClass getMemoryMap();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.memorymap.MemoryMap#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see hu.modembed.model.emodel.memorymap.MemoryMap#getRoot()
	 * @see #getMemoryMap()
	 * @generated
	 */
	EReference getMemoryMap_Root();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.memorymap.HeapLevel <em>Heap Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heap Level</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapLevel
	 * @generated
	 */
	EClass getHeapLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.memorymap.HeapLevel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapLevel#getMappings()
	 * @see #getHeapLevel()
	 * @generated
	 */
	EReference getHeapLevel_Mappings();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.memorymap.HeapLevel#getSubLevels <em>Sub Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Levels</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapLevel#getSubLevels()
	 * @see #getHeapLevel()
	 * @generated
	 */
	EReference getHeapLevel_SubLevels();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping <em>Heap Variable Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heap Variable Mapping</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapVariableMapping
	 * @generated
	 */
	EClass getHeapVariableMapping();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapVariableMapping#getVariable()
	 * @see #getHeapVariableMapping()
	 * @generated
	 */
	EReference getHeapVariableMapping_Variable();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hu.modembed.model.emodel.memorymap.HeapVariableMapping#getAddress()
	 * @see #getHeapVariableMapping()
	 * @generated
	 */
	EAttribute getHeapVariableMapping_Address();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MemorymapFactory getMemorymapFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.memorymap.impl.MemoryMapImpl <em>Memory Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.memorymap.impl.MemoryMapImpl
		 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getMemoryMap()
		 * @generated
		 */
		EClass MEMORY_MAP = eINSTANCE.getMemoryMap();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_MAP__ROOT = eINSTANCE.getMemoryMap_Root();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl <em>Heap Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.memorymap.impl.HeapLevelImpl
		 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getHeapLevel()
		 * @generated
		 */
		EClass HEAP_LEVEL = eINSTANCE.getHeapLevel();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAP_LEVEL__MAPPINGS = eINSTANCE.getHeapLevel_Mappings();

		/**
		 * The meta object literal for the '<em><b>Sub Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAP_LEVEL__SUB_LEVELS = eINSTANCE.getHeapLevel_SubLevels();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.memorymap.impl.HeapVariableMappingImpl <em>Heap Variable Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.memorymap.impl.HeapVariableMappingImpl
		 * @see hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl#getHeapVariableMapping()
		 * @generated
		 */
		EClass HEAP_VARIABLE_MAPPING = eINSTANCE.getHeapVariableMapping();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAP_VARIABLE_MAPPING__VARIABLE = eINSTANCE.getHeapVariableMapping_Variable();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAP_VARIABLE_MAPPING__ADDRESS = eINSTANCE.getHeapVariableMapping_Address();

	}

} //MemorymapPackage
