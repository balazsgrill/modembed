/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryFactoryImpl extends EFactoryImpl implements MemoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MemoryFactory init() {
		try {
			MemoryFactory theMemoryFactory = (MemoryFactory)EPackage.Registry.INSTANCE.getEFactory("http://microchip.com/device/memory"); 
			if (theMemoryFactory != null) {
				return theMemoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MemoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MemoryPackage.PROGRAMMING: return createProgramming();
			case MemoryPackage.WAIT: return createWait();
			case MemoryPackage.LATCHES: return createLatches();
			case MemoryPackage.MEM_REGION: return createMemRegion();
			case MemoryPackage.DEV_ID: return createDevID();
			case MemoryPackage.SFR: return createSFR();
			case MemoryPackage.RESET: return createReset();
			case MemoryPackage.BIT: return createBit();
			case MemoryPackage.STIMULUS: return createStimulus();
			case MemoryPackage.MIRROR_REGS: return createMirrorRegs();
			case MemoryPackage.UNUSED_REGS: return createUnusedRegs();
			case MemoryPackage.QBIT: return createQBit();
			case MemoryPackage.BREAKPOINTS: return createBreakpoints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programming createProgramming() {
		ProgrammingImpl programming = new ProgrammingImpl();
		return programming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latches createLatches() {
		LatchesImpl latches = new LatchesImpl();
		return latches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion createMemRegion() {
		MemRegionImpl memRegion = new MemRegionImpl();
		return memRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevID createDevID() {
		DevIDImpl devID = new DevIDImpl();
		return devID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFR createSFR() {
		SFRImpl sfr = new SFRImpl();
		return sfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset createReset() {
		ResetImpl reset = new ResetImpl();
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bit createBit() {
		BitImpl bit = new BitImpl();
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus createStimulus() {
		StimulusImpl stimulus = new StimulusImpl();
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorRegs createMirrorRegs() {
		MirrorRegsImpl mirrorRegs = new MirrorRegsImpl();
		return mirrorRegs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnusedRegs createUnusedRegs() {
		UnusedRegsImpl unusedRegs = new UnusedRegsImpl();
		return unusedRegs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBit createQBit() {
		QBitImpl qBit = new QBitImpl();
		return qBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoints createBreakpoints() {
		BreakpointsImpl breakpoints = new BreakpointsImpl();
		return breakpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPackage getMemoryPackage() {
		return (MemoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MemoryPackage getPackage() {
		return MemoryPackage.eINSTANCE;
	}

} //MemoryFactoryImpl
