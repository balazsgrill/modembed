/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;

import microchip.device.generic.GenericPackage;
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
 * @see microchip.device.memory.MemoryFactory
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
	String eNS_URI = "http://microchip.com/device/memory";

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
	MemoryPackage eINSTANCE = microchip.device.memory.impl.MemoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.ProgrammingImpl <em>Programming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.ProgrammingImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getProgramming()
	 * @generated
	 */
	int PROGRAMMING = 0;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__WAIT = 0;

	/**
	 * The feature id for the '<em><b>Latches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__LATCHES = 1;

	/**
	 * The feature id for the '<em><b>Memtech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__MEMTECH = 2;

	/**
	 * The feature id for the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__TRIES = 3;

	/**
	 * The feature id for the '<em><b>Lvpthresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__LVPTHRESH = 4;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__BOUNDARY = 5;

	/**
	 * The feature id for the '<em><b>Panelsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING__PANELSIZE = 6;

	/**
	 * The number of structural features of the '<em>Programming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.WaitImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 1;

	/**
	 * The feature id for the '<em><b>Pgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__PGM = 0;

	/**
	 * The feature id for the '<em><b>Lvpgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__LVPGM = 1;

	/**
	 * The feature id for the '<em><b>Eedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__EEDATA = 2;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__CFG = 3;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__USERID = 4;

	/**
	 * The feature id for the '<em><b>Erase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ERASE = 5;

	/**
	 * The feature id for the '<em><b>Lverase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__LVERASE = 6;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.LatchesImpl <em>Latches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.LatchesImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getLatches()
	 * @generated
	 */
	int LATCHES = 2;

	/**
	 * The feature id for the '<em><b>Pgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES__PGM = 0;

	/**
	 * The feature id for the '<em><b>Eedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES__EEDATA = 1;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES__USERID = 2;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES__CFG = 3;

	/**
	 * The feature id for the '<em><b>Rowerase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES__ROWERASE = 4;

	/**
	 * The number of structural features of the '<em>Latches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.MemRegionImpl <em>Mem Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.MemRegionImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getMemRegion()
	 * @generated
	 */
	int MEM_REGION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_REGION__START = GenericPackage.INT_RANGE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_REGION__END = GenericPackage.INT_RANGE__END;

	/**
	 * The number of structural features of the '<em>Mem Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_REGION_FEATURE_COUNT = GenericPackage.INT_RANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.DevIDImpl <em>Dev ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.DevIDImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getDevID()
	 * @generated
	 */
	int DEV_ID = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_ID__START = MEM_REGION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_ID__END = MEM_REGION__END;

	/**
	 * The feature id for the '<em><b>Idmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_ID__IDMASK = MEM_REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_ID__ID = MEM_REGION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dev ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_ID_FEATURE_COUNT = MEM_REGION_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.SFRImpl <em>SFR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.SFRImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getSFR()
	 * @generated
	 */
	int SFR = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__ADDR = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__FLAGS = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__RESET = 5;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__BITS = 6;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR__STIMULUS = 7;

	/**
	 * The number of structural features of the '<em>SFR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.ResetImpl <em>Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.ResetImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getReset()
	 * @generated
	 */
	int RESET = 6;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__POR = 0;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET__MCLR = 1;

	/**
	 * The number of structural features of the '<em>Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.BitImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 7;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__NAMES = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__TAG = 2;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.StimulusImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 8;

	/**
	 * The feature id for the '<em><b>Scl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__SCL = 0;

	/**
	 * The feature id for the '<em><b>Pcfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__PCFILES = 1;

	/**
	 * The feature id for the '<em><b>Regfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__REGFILES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.MirrorRegsImpl <em>Mirror Regs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.MirrorRegsImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getMirrorRegs()
	 * @generated
	 */
	int MIRROR_REGS = 9;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_REGS__REGIONS = 0;

	/**
	 * The number of structural features of the '<em>Mirror Regs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_REGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.UnusedRegsImpl <em>Unused Regs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.UnusedRegsImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getUnusedRegs()
	 * @generated
	 */
	int UNUSED_REGS = 10;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNUSED_REGS__START = MEM_REGION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNUSED_REGS__END = MEM_REGION__END;

	/**
	 * The number of structural features of the '<em>Unused Regs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNUSED_REGS_FEATURE_COUNT = MEM_REGION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.QBitImpl <em>QBit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.QBitImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getQBit()
	 * @generated
	 */
	int QBIT = 11;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBIT__NAMES = BIT__NAMES;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBIT__WIDTH = BIT__WIDTH;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBIT__TAG = BIT__TAG;

	/**
	 * The number of structural features of the '<em>QBit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBIT_FEATURE_COUNT = BIT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link microchip.device.memory.impl.BreakpointsImpl <em>Breakpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.memory.impl.BreakpointsImpl
	 * @see microchip.device.memory.impl.MemoryPackageImpl#getBreakpoints()
	 * @generated
	 */
	int BREAKPOINTS = 12;

	/**
	 * The feature id for the '<em><b>Numhwbp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS__NUMHWBP = 0;

	/**
	 * The feature id for the '<em><b>Datacapture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS__DATACAPTURE = 1;

	/**
	 * The feature id for the '<em><b>Idbyte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS__IDBYTE = 2;

	/**
	 * The number of structural features of the '<em>Breakpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Programming <em>Programming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programming</em>'.
	 * @see microchip.device.memory.Programming
	 * @generated
	 */
	EClass getProgramming();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.memory.Programming#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see microchip.device.memory.Programming#getWait()
	 * @see #getProgramming()
	 * @generated
	 */
	EReference getProgramming_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.memory.Programming#getLatches <em>Latches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latches</em>'.
	 * @see microchip.device.memory.Programming#getLatches()
	 * @see #getProgramming()
	 * @generated
	 */
	EReference getProgramming_Latches();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Programming#getMemtech <em>Memtech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memtech</em>'.
	 * @see microchip.device.memory.Programming#getMemtech()
	 * @see #getProgramming()
	 * @generated
	 */
	EAttribute getProgramming_Memtech();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Programming#getTries <em>Tries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tries</em>'.
	 * @see microchip.device.memory.Programming#getTries()
	 * @see #getProgramming()
	 * @generated
	 */
	EAttribute getProgramming_Tries();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Programming#getLvpthresh <em>Lvpthresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvpthresh</em>'.
	 * @see microchip.device.memory.Programming#getLvpthresh()
	 * @see #getProgramming()
	 * @generated
	 */
	EAttribute getProgramming_Lvpthresh();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Programming#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary</em>'.
	 * @see microchip.device.memory.Programming#getBoundary()
	 * @see #getProgramming()
	 * @generated
	 */
	EAttribute getProgramming_Boundary();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Programming#getPanelsize <em>Panelsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Panelsize</em>'.
	 * @see microchip.device.memory.Programming#getPanelsize()
	 * @see #getProgramming()
	 * @generated
	 */
	EAttribute getProgramming_Panelsize();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see microchip.device.memory.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getPgm <em>Pgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgm</em>'.
	 * @see microchip.device.memory.Wait#getPgm()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Pgm();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getLvpgm <em>Lvpgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvpgm</em>'.
	 * @see microchip.device.memory.Wait#getLvpgm()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Lvpgm();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getEedata <em>Eedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eedata</em>'.
	 * @see microchip.device.memory.Wait#getEedata()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Eedata();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfg</em>'.
	 * @see microchip.device.memory.Wait#getCfg()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userid</em>'.
	 * @see microchip.device.memory.Wait#getUserid()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Userid();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getErase <em>Erase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erase</em>'.
	 * @see microchip.device.memory.Wait#getErase()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Erase();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Wait#getLverase <em>Lverase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lverase</em>'.
	 * @see microchip.device.memory.Wait#getLverase()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Lverase();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Latches <em>Latches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latches</em>'.
	 * @see microchip.device.memory.Latches
	 * @generated
	 */
	EClass getLatches();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Latches#getPgm <em>Pgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgm</em>'.
	 * @see microchip.device.memory.Latches#getPgm()
	 * @see #getLatches()
	 * @generated
	 */
	EAttribute getLatches_Pgm();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Latches#getEedata <em>Eedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eedata</em>'.
	 * @see microchip.device.memory.Latches#getEedata()
	 * @see #getLatches()
	 * @generated
	 */
	EAttribute getLatches_Eedata();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Latches#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userid</em>'.
	 * @see microchip.device.memory.Latches#getUserid()
	 * @see #getLatches()
	 * @generated
	 */
	EAttribute getLatches_Userid();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Latches#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfg</em>'.
	 * @see microchip.device.memory.Latches#getCfg()
	 * @see #getLatches()
	 * @generated
	 */
	EAttribute getLatches_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Latches#getRowerase <em>Rowerase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowerase</em>'.
	 * @see microchip.device.memory.Latches#getRowerase()
	 * @see #getLatches()
	 * @generated
	 */
	EAttribute getLatches_Rowerase();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.MemRegion <em>Mem Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem Region</em>'.
	 * @see microchip.device.memory.MemRegion
	 * @generated
	 */
	EClass getMemRegion();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.DevID <em>Dev ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev ID</em>'.
	 * @see microchip.device.memory.DevID
	 * @generated
	 */
	EClass getDevID();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.DevID#getIdmask <em>Idmask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idmask</em>'.
	 * @see microchip.device.memory.DevID#getIdmask()
	 * @see #getDevID()
	 * @generated
	 */
	EAttribute getDevID_Idmask();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.DevID#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see microchip.device.memory.DevID#getId()
	 * @see #getDevID()
	 * @generated
	 */
	EAttribute getDevID_Id();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.SFR <em>SFR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR</em>'.
	 * @see microchip.device.memory.SFR
	 * @generated
	 */
	EClass getSFR();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.SFR#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see microchip.device.memory.SFR#getKey()
	 * @see #getSFR()
	 * @generated
	 */
	EAttribute getSFR_Key();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.SFR#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see microchip.device.memory.SFR#getAddr()
	 * @see #getSFR()
	 * @generated
	 */
	EAttribute getSFR_Addr();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.SFR#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see microchip.device.memory.SFR#getSize()
	 * @see #getSFR()
	 * @generated
	 */
	EAttribute getSFR_Size();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.SFR#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see microchip.device.memory.SFR#getFlags()
	 * @see #getSFR()
	 * @generated
	 */
	EAttribute getSFR_Flags();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.SFR#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see microchip.device.memory.SFR#getAccess()
	 * @see #getSFR()
	 * @generated
	 */
	EAttribute getSFR_Access();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.memory.SFR#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset</em>'.
	 * @see microchip.device.memory.SFR#getReset()
	 * @see #getSFR()
	 * @generated
	 */
	EReference getSFR_Reset();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.device.memory.SFR#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bits</em>'.
	 * @see microchip.device.memory.SFR#getBits()
	 * @see #getSFR()
	 * @generated
	 */
	EReference getSFR_Bits();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.memory.SFR#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus</em>'.
	 * @see microchip.device.memory.SFR#getStimulus()
	 * @see #getSFR()
	 * @generated
	 */
	EReference getSFR_Stimulus();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Reset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset</em>'.
	 * @see microchip.device.memory.Reset
	 * @generated
	 */
	EClass getReset();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Reset#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see microchip.device.memory.Reset#getPor()
	 * @see #getReset()
	 * @generated
	 */
	EAttribute getReset_Por();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Reset#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see microchip.device.memory.Reset#getMclr()
	 * @see #getReset()
	 * @generated
	 */
	EAttribute getReset_Mclr();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see microchip.device.memory.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Bit#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Names</em>'.
	 * @see microchip.device.memory.Bit#getNames()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Names();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Bit#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see microchip.device.memory.Bit#getWidth()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Width();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Bit#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see microchip.device.memory.Bit#getTag()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Tag();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see microchip.device.memory.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Stimulus#getScl <em>Scl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scl</em>'.
	 * @see microchip.device.memory.Stimulus#getScl()
	 * @see #getStimulus()
	 * @generated
	 */
	EAttribute getStimulus_Scl();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Stimulus#getPcfiles <em>Pcfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pcfiles</em>'.
	 * @see microchip.device.memory.Stimulus#getPcfiles()
	 * @see #getStimulus()
	 * @generated
	 */
	EAttribute getStimulus_Pcfiles();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Stimulus#getRegfiles <em>Regfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regfiles</em>'.
	 * @see microchip.device.memory.Stimulus#getRegfiles()
	 * @see #getStimulus()
	 * @generated
	 */
	EAttribute getStimulus_Regfiles();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Stimulus#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see microchip.device.memory.Stimulus#getType()
	 * @see #getStimulus()
	 * @generated
	 */
	EAttribute getStimulus_Type();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.MirrorRegs <em>Mirror Regs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mirror Regs</em>'.
	 * @see microchip.device.memory.MirrorRegs
	 * @generated
	 */
	EClass getMirrorRegs();

	/**
	 * Returns the meta object for the containment reference list '{@link microchip.device.memory.MirrorRegs#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see microchip.device.memory.MirrorRegs#getRegions()
	 * @see #getMirrorRegs()
	 * @generated
	 */
	EReference getMirrorRegs_Regions();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.UnusedRegs <em>Unused Regs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unused Regs</em>'.
	 * @see microchip.device.memory.UnusedRegs
	 * @generated
	 */
	EClass getUnusedRegs();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.QBit <em>QBit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QBit</em>'.
	 * @see microchip.device.memory.QBit
	 * @generated
	 */
	EClass getQBit();

	/**
	 * Returns the meta object for class '{@link microchip.device.memory.Breakpoints <em>Breakpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakpoints</em>'.
	 * @see microchip.device.memory.Breakpoints
	 * @generated
	 */
	EClass getBreakpoints();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Breakpoints#getNumhwbp <em>Numhwbp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numhwbp</em>'.
	 * @see microchip.device.memory.Breakpoints#getNumhwbp()
	 * @see #getBreakpoints()
	 * @generated
	 */
	EAttribute getBreakpoints_Numhwbp();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Breakpoints#getDatacapture <em>Datacapture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacapture</em>'.
	 * @see microchip.device.memory.Breakpoints#getDatacapture()
	 * @see #getBreakpoints()
	 * @generated
	 */
	EAttribute getBreakpoints_Datacapture();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.memory.Breakpoints#getIdbyte <em>Idbyte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbyte</em>'.
	 * @see microchip.device.memory.Breakpoints#getIdbyte()
	 * @see #getBreakpoints()
	 * @generated
	 */
	EAttribute getBreakpoints_Idbyte();

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
		 * The meta object literal for the '{@link microchip.device.memory.impl.ProgrammingImpl <em>Programming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.ProgrammingImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getProgramming()
		 * @generated
		 */
		EClass PROGRAMMING = eINSTANCE.getProgramming();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMMING__WAIT = eINSTANCE.getProgramming_Wait();

		/**
		 * The meta object literal for the '<em><b>Latches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMMING__LATCHES = eINSTANCE.getProgramming_Latches();

		/**
		 * The meta object literal for the '<em><b>Memtech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING__MEMTECH = eINSTANCE.getProgramming_Memtech();

		/**
		 * The meta object literal for the '<em><b>Tries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING__TRIES = eINSTANCE.getProgramming_Tries();

		/**
		 * The meta object literal for the '<em><b>Lvpthresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING__LVPTHRESH = eINSTANCE.getProgramming_Lvpthresh();

		/**
		 * The meta object literal for the '<em><b>Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING__BOUNDARY = eINSTANCE.getProgramming_Boundary();

		/**
		 * The meta object literal for the '<em><b>Panelsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING__PANELSIZE = eINSTANCE.getProgramming_Panelsize();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.WaitImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Pgm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__PGM = eINSTANCE.getWait_Pgm();

		/**
		 * The meta object literal for the '<em><b>Lvpgm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__LVPGM = eINSTANCE.getWait_Lvpgm();

		/**
		 * The meta object literal for the '<em><b>Eedata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__EEDATA = eINSTANCE.getWait_Eedata();

		/**
		 * The meta object literal for the '<em><b>Cfg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__CFG = eINSTANCE.getWait_Cfg();

		/**
		 * The meta object literal for the '<em><b>Userid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__USERID = eINSTANCE.getWait_Userid();

		/**
		 * The meta object literal for the '<em><b>Erase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__ERASE = eINSTANCE.getWait_Erase();

		/**
		 * The meta object literal for the '<em><b>Lverase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__LVERASE = eINSTANCE.getWait_Lverase();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.LatchesImpl <em>Latches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.LatchesImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getLatches()
		 * @generated
		 */
		EClass LATCHES = eINSTANCE.getLatches();

		/**
		 * The meta object literal for the '<em><b>Pgm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATCHES__PGM = eINSTANCE.getLatches_Pgm();

		/**
		 * The meta object literal for the '<em><b>Eedata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATCHES__EEDATA = eINSTANCE.getLatches_Eedata();

		/**
		 * The meta object literal for the '<em><b>Userid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATCHES__USERID = eINSTANCE.getLatches_Userid();

		/**
		 * The meta object literal for the '<em><b>Cfg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATCHES__CFG = eINSTANCE.getLatches_Cfg();

		/**
		 * The meta object literal for the '<em><b>Rowerase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATCHES__ROWERASE = eINSTANCE.getLatches_Rowerase();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.MemRegionImpl <em>Mem Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.MemRegionImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getMemRegion()
		 * @generated
		 */
		EClass MEM_REGION = eINSTANCE.getMemRegion();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.DevIDImpl <em>Dev ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.DevIDImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getDevID()
		 * @generated
		 */
		EClass DEV_ID = eINSTANCE.getDevID();

		/**
		 * The meta object literal for the '<em><b>Idmask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_ID__IDMASK = eINSTANCE.getDevID_Idmask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_ID__ID = eINSTANCE.getDevID_Id();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.SFRImpl <em>SFR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.SFRImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getSFR()
		 * @generated
		 */
		EClass SFR = eINSTANCE.getSFR();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFR__KEY = eINSTANCE.getSFR_Key();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFR__ADDR = eINSTANCE.getSFR_Addr();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFR__SIZE = eINSTANCE.getSFR_Size();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFR__FLAGS = eINSTANCE.getSFR_Flags();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFR__ACCESS = eINSTANCE.getSFR_Access();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFR__RESET = eINSTANCE.getSFR_Reset();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFR__BITS = eINSTANCE.getSFR_Bits();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFR__STIMULUS = eINSTANCE.getSFR_Stimulus();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.ResetImpl <em>Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.ResetImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getReset()
		 * @generated
		 */
		EClass RESET = eINSTANCE.getReset();

		/**
		 * The meta object literal for the '<em><b>Por</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET__POR = eINSTANCE.getReset_Por();

		/**
		 * The meta object literal for the '<em><b>Mclr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET__MCLR = eINSTANCE.getReset_Mclr();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.BitImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__NAMES = eINSTANCE.getBit_Names();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__WIDTH = eINSTANCE.getBit_Width();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__TAG = eINSTANCE.getBit_Tag();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.StimulusImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '<em><b>Scl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS__SCL = eINSTANCE.getStimulus_Scl();

		/**
		 * The meta object literal for the '<em><b>Pcfiles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS__PCFILES = eINSTANCE.getStimulus_Pcfiles();

		/**
		 * The meta object literal for the '<em><b>Regfiles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS__REGFILES = eINSTANCE.getStimulus_Regfiles();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS__TYPE = eINSTANCE.getStimulus_Type();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.MirrorRegsImpl <em>Mirror Regs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.MirrorRegsImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getMirrorRegs()
		 * @generated
		 */
		EClass MIRROR_REGS = eINSTANCE.getMirrorRegs();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIRROR_REGS__REGIONS = eINSTANCE.getMirrorRegs_Regions();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.UnusedRegsImpl <em>Unused Regs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.UnusedRegsImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getUnusedRegs()
		 * @generated
		 */
		EClass UNUSED_REGS = eINSTANCE.getUnusedRegs();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.QBitImpl <em>QBit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.QBitImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getQBit()
		 * @generated
		 */
		EClass QBIT = eINSTANCE.getQBit();

		/**
		 * The meta object literal for the '{@link microchip.device.memory.impl.BreakpointsImpl <em>Breakpoints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.memory.impl.BreakpointsImpl
		 * @see microchip.device.memory.impl.MemoryPackageImpl#getBreakpoints()
		 * @generated
		 */
		EClass BREAKPOINTS = eINSTANCE.getBreakpoints();

		/**
		 * The meta object literal for the '<em><b>Numhwbp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINTS__NUMHWBP = eINSTANCE.getBreakpoints_Numhwbp();

		/**
		 * The meta object literal for the '<em><b>Datacapture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINTS__DATACAPTURE = eINSTANCE.getBreakpoints_Datacapture();

		/**
		 * The meta object literal for the '<em><b>Idbyte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKPOINTS__IDBYTE = eINSTANCE.getBreakpoints_Idbyte();

	}

} //MemoryPackage
