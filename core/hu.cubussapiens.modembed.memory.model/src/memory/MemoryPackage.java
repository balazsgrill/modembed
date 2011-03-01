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
	 * The meta object id for the '{@link memory.impl.GenericRAMSegmentImpl <em>Generic RAM Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memory.impl.GenericRAMSegmentImpl
	 * @see memory.impl.MemoryPackageImpl#getGenericRAMSegment()
	 * @generated
	 */
	int GENERIC_RAM_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Start Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RAM_SEGMENT__START_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RAM_SEGMENT__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Generic RAM Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RAM_SEGMENT_FEATURE_COUNT = 2;

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
	int PROG_MODEL__START_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Reset Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL__RESET_VECTOR = 2;

	/**
	 * The number of structural features of the '<em>Prog Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_MODEL_FEATURE_COUNT = 3;


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
	 * Returns the meta object for class '{@link memory.GenericRAMSegment <em>Generic RAM Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic RAM Segment</em>'.
	 * @see memory.GenericRAMSegment
	 * @generated
	 */
	EClass getGenericRAMSegment();

	/**
	 * Returns the meta object for the attribute '{@link memory.GenericRAMSegment#getStartAddr <em>Start Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Addr</em>'.
	 * @see memory.GenericRAMSegment#getStartAddr()
	 * @see #getGenericRAMSegment()
	 * @generated
	 */
	EAttribute getGenericRAMSegment_StartAddr();

	/**
	 * Returns the meta object for the attribute '{@link memory.GenericRAMSegment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see memory.GenericRAMSegment#getSize()
	 * @see #getGenericRAMSegment()
	 * @generated
	 */
	EAttribute getGenericRAMSegment_Size();

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
	 * Returns the meta object for the attribute '{@link memory.ProgModel#getStartAddr <em>Start Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Addr</em>'.
	 * @see memory.ProgModel#getStartAddr()
	 * @see #getProgModel()
	 * @generated
	 */
	EAttribute getProgModel_StartAddr();

	/**
	 * Returns the meta object for the attribute '{@link memory.ProgModel#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see memory.ProgModel#getSize()
	 * @see #getProgModel()
	 * @generated
	 */
	EAttribute getProgModel_Size();

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
		 * The meta object literal for the '{@link memory.impl.GenericRAMSegmentImpl <em>Generic RAM Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memory.impl.GenericRAMSegmentImpl
		 * @see memory.impl.MemoryPackageImpl#getGenericRAMSegment()
		 * @generated
		 */
		EClass GENERIC_RAM_SEGMENT = eINSTANCE.getGenericRAMSegment();

		/**
		 * The meta object literal for the '<em><b>Start Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_RAM_SEGMENT__START_ADDR = eINSTANCE.getGenericRAMSegment_StartAddr();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_RAM_SEGMENT__SIZE = eINSTANCE.getGenericRAMSegment_Size();

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
		 * The meta object literal for the '<em><b>Start Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROG_MODEL__START_ADDR = eINSTANCE.getProgModel_StartAddr();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROG_MODEL__SIZE = eINSTANCE.getProgModel_Size();

		/**
		 * The meta object literal for the '<em><b>Reset Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROG_MODEL__RESET_VECTOR = eINSTANCE.getProgModel_ResetVector();

	}

} //MemoryPackage
