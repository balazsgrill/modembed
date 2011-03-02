/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory;

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
 * @see memory.MemoryFactory
 * @model kind="package"
 * @generated
 */
public interface MemoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gb.hu/embedded/memory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemoryPackage eINSTANCE = memory.impl.MemoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link memory.impl.RAMModelImpl <em>RAM Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memory.impl.RAMModelImpl
	 * @see memory.impl.MemoryPackageImpl#getRAMModel()
	 * @generated
	 */
	int RAM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MODEL__SEGMENTS = 0;

	/**
	 * The number of structural features of the '<em>RAM Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link memory.impl.MemoryModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memory.impl.MemoryModelImpl
	 * @see memory.impl.MemoryPackageImpl#getMemoryModel()
	 * @generated
	 */
	int MEMORY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MODEL__RAM = 0;

	/**
	 * The feature id for the '<em><b>Prog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MODEL__PROG = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link memory.impl.MemSegmentImpl <em>Mem Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memory.impl.MemSegmentImpl
	 * @see memory.impl.MemoryPackageImpl#getMemSegment()
	 * @generated
	 */
	int MEM_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Start Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SEGMENT__START_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SEGMENT__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Mem Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link memory.impl.ProgModelImpl <em>Prog Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memory.impl.ProgModelImpl
	 * @see memory.impl.MemoryPackageImpl#getProgModel()
	 * @generated
	 */
	int PROG_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Start Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL__START_ADDR = MEM_SEGMENT__START_ADDR;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL__SIZE = MEM_SEGMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Reset Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL__RESET_VECTOR = MEM_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prog Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL_FEATURE_COUNT = MEM_SEGMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link memory.RAMModel <em>RAM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Model</em>'.
	 * @see memory.RAMModel
	 * @generated
	 */
	EClass getRAMModel();

	/**
	 * Returns the meta object for the containment reference list '{@link memory.RAMModel#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see memory.RAMModel#getSegments()
	 * @see #getRAMModel()
	 * @generated
	 */
	EReference getRAMModel_Segments();

	/**
	 * Returns the meta object for class '{@link memory.MemoryModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see memory.MemoryModel
	 * @generated
	 */
	EClass getMemoryModel();

	/**
	 * Returns the meta object for the containment reference '{@link memory.MemoryModel#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ram</em>'.
	 * @see memory.MemoryModel#getRam()
	 * @see #getMemoryModel()
	 * @generated
	 */
	EReference getMemoryModel_Ram();

	/**
	 * Returns the meta object for the reference '{@link memory.MemoryModel#getProg <em>Prog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prog</em>'.
	 * @see memory.MemoryModel#getProg()
	 * @see #getMemoryModel()
	 * @generated
	 */
	EReference getMemoryModel_Prog();

	/**
	 * Returns the meta object for class '{@link memory.MemSegment <em>Mem Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem Segment</em>'.
	 * @see memory.MemSegment
	 * @generated
	 */
	EClass getMemSegment();

	/**
	 * Returns the meta object for the attribute '{@link memory.MemSegment#getStartAddr <em>Start Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Addr</em>'.
	 * @see memory.MemSegment#getStartAddr()
	 * @see #getMemSegment()
	 * @generated
	 */
	EAttribute getMemSegment_StartAddr();

	/**
	 * Returns the meta object for the attribute '{@link memory.MemSegment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see memory.MemSegment#getSize()
	 * @see #getMemSegment()
	 * @generated
	 */
	EAttribute getMemSegment_Size();

	/**
	 * Returns the meta object for class '{@link memory.ProgModel <em>Prog Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog Model</em>'.
	 * @see memory.ProgModel
	 * @generated
	 */
	EClass getProgModel();

	/**
	 * Returns the meta object for the attribute '{@link memory.ProgModel#getResetVector <em>Reset Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Vector</em>'.
	 * @see memory.ProgModel#getResetVector()
	 * @see #getProgModel()
	 * @generated
	 */
	EAttribute getProgModel_ResetVector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MemoryFactory getMemoryFactory();

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
		 * The meta object literal for the '{@link memory.impl.RAMModelImpl <em>RAM Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memory.impl.RAMModelImpl
		 * @see memory.impl.MemoryPackageImpl#getRAMModel()
		 * @generated
		 */
		EClass RAM_MODEL = eINSTANCE.getRAMModel();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAM_MODEL__SEGMENTS = eINSTANCE.getRAMModel_Segments();

		/**
		 * The meta object literal for the '{@link memory.impl.MemoryModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memory.impl.MemoryModelImpl
		 * @see memory.impl.MemoryPackageImpl#getMemoryModel()
		 * @generated
		 */
		EClass MEMORY_MODEL = eINSTANCE.getMemoryModel();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_MODEL__RAM = eINSTANCE.getMemoryModel_Ram();

		/**
		 * The meta object literal for the '<em><b>Prog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_MODEL__PROG = eINSTANCE.getMemoryModel_Prog();

		/**
		 * The meta object literal for the '{@link memory.impl.MemSegmentImpl <em>Mem Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memory.impl.MemSegmentImpl
		 * @see memory.impl.MemoryPackageImpl#getMemSegment()
		 * @generated
		 */
		EClass MEM_SEGMENT = eINSTANCE.getMemSegment();

		/**
		 * The meta object literal for the '<em><b>Start Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_SEGMENT__START_ADDR = eINSTANCE.getMemSegment_StartAddr();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_SEGMENT__SIZE = eINSTANCE.getMemSegment_Size();

		/**
		 * The meta object literal for the '{@link memory.impl.ProgModelImpl <em>Prog Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memory.impl.ProgModelImpl
		 * @see memory.impl.MemoryPackageImpl#getProgModel()
		 * @generated
		 */
		EClass PROG_MODEL = eINSTANCE.getProgModel();

		/**
		 * The meta object literal for the '<em><b>Reset Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROG_MODEL__RESET_VECTOR = eINSTANCE.getProgModel_ResetVector();

	}

} //MemoryPackage
