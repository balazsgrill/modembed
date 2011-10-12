/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.MicrochipPackage;
import microchip.device.DevicePackage;

import microchip.device.config.ConfigPackage;

import microchip.device.config.impl.ConfigPackageImpl;

import microchip.device.generic.GenericPackage;

import microchip.device.generic.impl.GenericPackageImpl;

import microchip.device.impl.DevicePackageImpl;

import microchip.device.memory.Bit;
import microchip.device.memory.Breakpoints;
import microchip.device.memory.DevID;
import microchip.device.memory.Latches;
import microchip.device.memory.MemRegion;
import microchip.device.memory.MemoryFactory;
import microchip.device.memory.MemoryPackage;
import microchip.device.memory.MirrorRegs;
import microchip.device.memory.Programming;
import microchip.device.memory.QBit;
import microchip.device.memory.Reset;
import microchip.device.memory.Stimulus;
import microchip.device.memory.UnusedRegs;
import microchip.device.memory.Wait;

import microchip.impl.MicrochipPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryPackageImpl extends EPackageImpl implements MemoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mirrorRegsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unusedRegsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qBitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakpointsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see microchip.device.memory.MemoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MemoryPackageImpl() {
		super(eNS_URI, MemoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MemoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MemoryPackage init() {
		if (isInited) return (MemoryPackage)EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI);

		// Obtain or create and register package
		MemoryPackageImpl theMemoryPackage = (MemoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MemoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MemoryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MicrochipPackageImpl theMicrochipPackage = (MicrochipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) instanceof MicrochipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) : MicrochipPackage.eINSTANCE);
		DevicePackageImpl theDevicePackage = (DevicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI) instanceof DevicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI) : DevicePackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);
		GenericPackageImpl theGenericPackage = (GenericPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI) instanceof GenericPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI) : GenericPackage.eINSTANCE);

		// Create package meta-data objects
		theMemoryPackage.createPackageContents();
		theMicrochipPackage.createPackageContents();
		theDevicePackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theGenericPackage.createPackageContents();

		// Initialize created meta-data
		theMemoryPackage.initializePackageContents();
		theMicrochipPackage.initializePackageContents();
		theDevicePackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theGenericPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMemoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MemoryPackage.eNS_URI, theMemoryPackage);
		return theMemoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramming() {
		return programmingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramming_Wait() {
		return (EReference)programmingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramming_Latches() {
		return (EReference)programmingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramming_Memtech() {
		return (EAttribute)programmingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramming_Tries() {
		return (EAttribute)programmingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramming_Lvpthresh() {
		return (EAttribute)programmingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramming_Boundary() {
		return (EAttribute)programmingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramming_Panelsize() {
		return (EAttribute)programmingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Pgm() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Lvpgm() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Eedata() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Cfg() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Userid() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Erase() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Lverase() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatches() {
		return latchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatches_Pgm() {
		return (EAttribute)latchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatches_Eedata() {
		return (EAttribute)latchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatches_Userid() {
		return (EAttribute)latchesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatches_Cfg() {
		return (EAttribute)latchesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatches_Rowerase() {
		return (EAttribute)latchesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemRegion() {
		return memRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevID() {
		return devIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevID_Idmask() {
		return (EAttribute)devIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevID_Id() {
		return (EAttribute)devIDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFR() {
		return sfrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFR_Key() {
		return (EAttribute)sfrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFR_Addr() {
		return (EAttribute)sfrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFR_Size() {
		return (EAttribute)sfrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFR_Flags() {
		return (EAttribute)sfrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSFR_Access() {
		return (EAttribute)sfrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFR_Reset() {
		return (EReference)sfrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFR_Bits() {
		return (EReference)sfrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSFR_Stimulus() {
		return (EReference)sfrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReset() {
		return resetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReset_Por() {
		return (EAttribute)resetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReset_Mclr() {
		return (EAttribute)resetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBit() {
		return bitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBit_Names() {
		return (EAttribute)bitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBit_Width() {
		return (EAttribute)bitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBit_Tag() {
		return (EAttribute)bitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulus() {
		return stimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimulus_Scl() {
		return (EAttribute)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimulus_Pcfiles() {
		return (EAttribute)stimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimulus_Regfiles() {
		return (EAttribute)stimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimulus_Type() {
		return (EAttribute)stimulusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMirrorRegs() {
		return mirrorRegsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMirrorRegs_Regions() {
		return (EReference)mirrorRegsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnusedRegs() {
		return unusedRegsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQBit() {
		return qBitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakpoints() {
		return breakpointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoints_Numhwbp() {
		return (EAttribute)breakpointsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoints_Datacapture() {
		return (EAttribute)breakpointsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBreakpoints_Idbyte() {
		return (EAttribute)breakpointsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryFactory getMemoryFactory() {
		return (MemoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programmingEClass = createEClass(PROGRAMMING);
		createEReference(programmingEClass, PROGRAMMING__WAIT);
		createEReference(programmingEClass, PROGRAMMING__LATCHES);
		createEAttribute(programmingEClass, PROGRAMMING__MEMTECH);
		createEAttribute(programmingEClass, PROGRAMMING__TRIES);
		createEAttribute(programmingEClass, PROGRAMMING__LVPTHRESH);
		createEAttribute(programmingEClass, PROGRAMMING__BOUNDARY);
		createEAttribute(programmingEClass, PROGRAMMING__PANELSIZE);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__PGM);
		createEAttribute(waitEClass, WAIT__LVPGM);
		createEAttribute(waitEClass, WAIT__EEDATA);
		createEAttribute(waitEClass, WAIT__CFG);
		createEAttribute(waitEClass, WAIT__USERID);
		createEAttribute(waitEClass, WAIT__ERASE);
		createEAttribute(waitEClass, WAIT__LVERASE);

		latchesEClass = createEClass(LATCHES);
		createEAttribute(latchesEClass, LATCHES__PGM);
		createEAttribute(latchesEClass, LATCHES__EEDATA);
		createEAttribute(latchesEClass, LATCHES__USERID);
		createEAttribute(latchesEClass, LATCHES__CFG);
		createEAttribute(latchesEClass, LATCHES__ROWERASE);

		memRegionEClass = createEClass(MEM_REGION);

		devIDEClass = createEClass(DEV_ID);
		createEAttribute(devIDEClass, DEV_ID__IDMASK);
		createEAttribute(devIDEClass, DEV_ID__ID);

		sfrEClass = createEClass(SFR);
		createEAttribute(sfrEClass, SFR__KEY);
		createEAttribute(sfrEClass, SFR__ADDR);
		createEAttribute(sfrEClass, SFR__SIZE);
		createEAttribute(sfrEClass, SFR__FLAGS);
		createEAttribute(sfrEClass, SFR__ACCESS);
		createEReference(sfrEClass, SFR__RESET);
		createEReference(sfrEClass, SFR__BITS);
		createEReference(sfrEClass, SFR__STIMULUS);

		resetEClass = createEClass(RESET);
		createEAttribute(resetEClass, RESET__POR);
		createEAttribute(resetEClass, RESET__MCLR);

		bitEClass = createEClass(BIT);
		createEAttribute(bitEClass, BIT__NAMES);
		createEAttribute(bitEClass, BIT__WIDTH);
		createEAttribute(bitEClass, BIT__TAG);

		stimulusEClass = createEClass(STIMULUS);
		createEAttribute(stimulusEClass, STIMULUS__SCL);
		createEAttribute(stimulusEClass, STIMULUS__PCFILES);
		createEAttribute(stimulusEClass, STIMULUS__REGFILES);
		createEAttribute(stimulusEClass, STIMULUS__TYPE);

		mirrorRegsEClass = createEClass(MIRROR_REGS);
		createEReference(mirrorRegsEClass, MIRROR_REGS__REGIONS);

		unusedRegsEClass = createEClass(UNUSED_REGS);

		qBitEClass = createEClass(QBIT);

		breakpointsEClass = createEClass(BREAKPOINTS);
		createEAttribute(breakpointsEClass, BREAKPOINTS__NUMHWBP);
		createEAttribute(breakpointsEClass, BREAKPOINTS__DATACAPTURE);
		createEAttribute(breakpointsEClass, BREAKPOINTS__IDBYTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericPackage theGenericPackage = (GenericPackage)EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		memRegionEClass.getESuperTypes().add(theGenericPackage.getIntRange());
		devIDEClass.getESuperTypes().add(this.getMemRegion());
		unusedRegsEClass.getESuperTypes().add(this.getMemRegion());
		qBitEClass.getESuperTypes().add(this.getBit());

		// Initialize classes and features; add operations and parameters
		initEClass(programmingEClass, Programming.class, "Programming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramming_Wait(), this.getWait(), null, "wait", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramming_Latches(), this.getLatches(), null, "latches", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramming_Memtech(), ecorePackage.getEString(), "memtech", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramming_Tries(), ecorePackage.getEInt(), "tries", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramming_Lvpthresh(), ecorePackage.getEFloat(), "lvpthresh", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramming_Boundary(), ecorePackage.getEInt(), "boundary", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramming_Panelsize(), ecorePackage.getEInt(), "panelsize", null, 0, 1, Programming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Pgm(), ecorePackage.getEInt(), "pgm", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Lvpgm(), ecorePackage.getEInt(), "lvpgm", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Eedata(), ecorePackage.getEInt(), "eedata", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Cfg(), ecorePackage.getEInt(), "cfg", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Userid(), ecorePackage.getEInt(), "userid", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Erase(), ecorePackage.getEInt(), "erase", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWait_Lverase(), ecorePackage.getEInt(), "lverase", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latchesEClass, Latches.class, "Latches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatches_Pgm(), ecorePackage.getEInt(), "pgm", null, 0, 1, Latches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatches_Eedata(), ecorePackage.getEInt(), "eedata", null, 0, 1, Latches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatches_Userid(), ecorePackage.getEInt(), "userid", null, 0, 1, Latches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatches_Cfg(), ecorePackage.getEInt(), "cfg", null, 0, 1, Latches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatches_Rowerase(), ecorePackage.getEInt(), "rowerase", null, 0, 1, Latches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memRegionEClass, MemRegion.class, "MemRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(devIDEClass, DevID.class, "DevID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevID_Idmask(), ecorePackage.getEInt(), "idmask", null, 0, 1, DevID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevID_Id(), ecorePackage.getEInt(), "id", null, 0, 1, DevID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sfrEClass, microchip.device.memory.SFR.class, "SFR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSFR_Key(), ecorePackage.getEString(), "key", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSFR_Addr(), ecorePackage.getEInt(), "addr", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSFR_Size(), ecorePackage.getEInt(), "size", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSFR_Flags(), ecorePackage.getEString(), "flags", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSFR_Access(), ecorePackage.getEString(), "access", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSFR_Reset(), this.getReset(), null, "reset", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSFR_Bits(), this.getBit(), null, "bits", null, 0, -1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSFR_Stimulus(), this.getStimulus(), null, "stimulus", null, 0, 1, microchip.device.memory.SFR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetEClass, Reset.class, "Reset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReset_Por(), ecorePackage.getEString(), "por", null, 0, 1, Reset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReset_Mclr(), ecorePackage.getEString(), "mclr", null, 0, 1, Reset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitEClass, Bit.class, "Bit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBit_Names(), ecorePackage.getEString(), "names", null, 0, 1, Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBit_Width(), ecorePackage.getEString(), "width", null, 0, 1, Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBit_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEClass, Stimulus.class, "Stimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStimulus_Scl(), ecorePackage.getEString(), "scl", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStimulus_Pcfiles(), ecorePackage.getEString(), "pcfiles", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStimulus_Regfiles(), ecorePackage.getEString(), "regfiles", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStimulus_Type(), ecorePackage.getEString(), "type", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mirrorRegsEClass, MirrorRegs.class, "MirrorRegs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMirrorRegs_Regions(), this.getMemRegion(), null, "regions", null, 0, -1, MirrorRegs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unusedRegsEClass, UnusedRegs.class, "UnusedRegs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qBitEClass, QBit.class, "QBit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakpointsEClass, Breakpoints.class, "Breakpoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBreakpoints_Numhwbp(), ecorePackage.getEInt(), "numhwbp", null, 0, 1, Breakpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoints_Datacapture(), ecorePackage.getEString(), "datacapture", null, 0, 1, Breakpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBreakpoints_Idbyte(), ecorePackage.getEString(), "idbyte", null, 0, 1, Breakpoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MemoryPackageImpl
