/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.ArchDefType;
import crownking.edc.BreakpointsType;
import crownking.edc.DataSpaceType;
import crownking.edc.EdcPackage;
import crownking.edc.ImportType;
import crownking.edc.LCDType;
import crownking.edc.OscillatorType;
import crownking.edc.PICType;
import crownking.edc.PinListType;
import crownking.edc.PowerType;
import crownking.edc.ProgramSpaceType;
import crownking.edc.ProgrammingType;
import crownking.edc.WatchdogTimerType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIC Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getProgramming <em>Programming</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getArchDef <em>Arch Def</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getOscillator <em>Oscillator</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getWatchdogTimer <em>Watchdog Timer</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getBreakpoints <em>Breakpoints</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getLCD <em>LCD</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getProgramSpace <em>Program Space</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getDataSpace <em>Data Space</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getPinList <em>Pin List</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getDsid <em>Dsid</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getHasfreeze <em>Hasfreeze</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getInformedby <em>Informedby</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getIsextended <em>Isextended</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.impl.PICTypeImpl#getProcid <em>Procid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PICTypeImpl extends EObjectImpl implements PICType {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportType> import_;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected PowerType power;

	/**
	 * The cached value of the '{@link #getProgramming() <em>Programming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramming()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingType programming;

	/**
	 * The cached value of the '{@link #getArchDef() <em>Arch Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchDef()
	 * @generated
	 * @ordered
	 */
	protected ArchDefType archDef;

	/**
	 * The cached value of the '{@link #getOscillator() <em>Oscillator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscillator()
	 * @generated
	 * @ordered
	 */
	protected OscillatorType oscillator;

	/**
	 * The cached value of the '{@link #getWatchdogTimer() <em>Watchdog Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchdogTimer()
	 * @generated
	 * @ordered
	 */
	protected WatchdogTimerType watchdogTimer;

	/**
	 * The cached value of the '{@link #getBreakpoints() <em>Breakpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpoints()
	 * @generated
	 * @ordered
	 */
	protected BreakpointsType breakpoints;

	/**
	 * The cached value of the '{@link #getLCD() <em>LCD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCD()
	 * @generated
	 * @ordered
	 */
	protected LCDType lCD;

	/**
	 * The cached value of the '{@link #getProgramSpace() <em>Program Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSpace()
	 * @generated
	 * @ordered
	 */
	protected ProgramSpaceType programSpace;

	/**
	 * The cached value of the '{@link #getDataSpace() <em>Data Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpace()
	 * @generated
	 * @ordered
	 */
	protected DataSpaceType dataSpace;

	/**
	 * The cached value of the '{@link #getPinList() <em>Pin List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinList()
	 * @generated
	 * @ordered
	 */
	protected PinListType pinList;

	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected String arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDsid() <em>Dsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsid()
	 * @generated
	 * @ordered
	 */
	protected static final int DSID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDsid() <em>Dsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsid()
	 * @generated
	 * @ordered
	 */
	protected int dsid = DSID_EDEFAULT;

	/**
	 * This is true if the Dsid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dsidESet;

	/**
	 * The default value of the '{@link #getHasfreeze() <em>Hasfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasfreeze()
	 * @generated
	 * @ordered
	 */
	protected static final String HASFREEZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasfreeze() <em>Hasfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasfreeze()
	 * @generated
	 * @ordered
	 */
	protected String hasfreeze = HASFREEZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformedby() <em>Informedby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedby()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMEDBY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformedby() <em>Informedby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedby()
	 * @generated
	 * @ordered
	 */
	protected String informedby = INFORMEDBY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsextended() <em>Isextended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsextended()
	 * @generated
	 * @ordered
	 */
	protected static final String ISEXTENDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsextended() <em>Isextended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsextended()
	 * @generated
	 * @ordered
	 */
	protected String isextended = ISEXTENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcid() <em>Procid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcid()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcid() <em>Procid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcid()
	 * @generated
	 * @ordered
	 */
	protected String procid = PROCID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PICTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getPICType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportType> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<ImportType>(ImportType.class, this, EdcPackage.PIC_TYPE__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerType getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(PowerType newPower, NotificationChain msgs) {
		PowerType oldPower = power;
		power = newPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__POWER, oldPower, newPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(PowerType newPower) {
		if (newPower != power) {
			NotificationChain msgs = null;
			if (power != null)
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingType getProgramming() {
		return programming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramming(ProgrammingType newProgramming, NotificationChain msgs) {
		ProgrammingType oldProgramming = programming;
		programming = newProgramming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PROGRAMMING, oldProgramming, newProgramming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramming(ProgrammingType newProgramming) {
		if (newProgramming != programming) {
			NotificationChain msgs = null;
			if (programming != null)
				msgs = ((InternalEObject)programming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PROGRAMMING, null, msgs);
			if (newProgramming != null)
				msgs = ((InternalEObject)newProgramming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PROGRAMMING, null, msgs);
			msgs = basicSetProgramming(newProgramming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PROGRAMMING, newProgramming, newProgramming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchDefType getArchDef() {
		return archDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchDef(ArchDefType newArchDef, NotificationChain msgs) {
		ArchDefType oldArchDef = archDef;
		archDef = newArchDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__ARCH_DEF, oldArchDef, newArchDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchDef(ArchDefType newArchDef) {
		if (newArchDef != archDef) {
			NotificationChain msgs = null;
			if (archDef != null)
				msgs = ((InternalEObject)archDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__ARCH_DEF, null, msgs);
			if (newArchDef != null)
				msgs = ((InternalEObject)newArchDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__ARCH_DEF, null, msgs);
			msgs = basicSetArchDef(newArchDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__ARCH_DEF, newArchDef, newArchDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscillatorType getOscillator() {
		return oscillator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOscillator(OscillatorType newOscillator, NotificationChain msgs) {
		OscillatorType oldOscillator = oscillator;
		oscillator = newOscillator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__OSCILLATOR, oldOscillator, newOscillator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscillator(OscillatorType newOscillator) {
		if (newOscillator != oscillator) {
			NotificationChain msgs = null;
			if (oscillator != null)
				msgs = ((InternalEObject)oscillator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__OSCILLATOR, null, msgs);
			if (newOscillator != null)
				msgs = ((InternalEObject)newOscillator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__OSCILLATOR, null, msgs);
			msgs = basicSetOscillator(newOscillator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__OSCILLATOR, newOscillator, newOscillator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WatchdogTimerType getWatchdogTimer() {
		return watchdogTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWatchdogTimer(WatchdogTimerType newWatchdogTimer, NotificationChain msgs) {
		WatchdogTimerType oldWatchdogTimer = watchdogTimer;
		watchdogTimer = newWatchdogTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__WATCHDOG_TIMER, oldWatchdogTimer, newWatchdogTimer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatchdogTimer(WatchdogTimerType newWatchdogTimer) {
		if (newWatchdogTimer != watchdogTimer) {
			NotificationChain msgs = null;
			if (watchdogTimer != null)
				msgs = ((InternalEObject)watchdogTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__WATCHDOG_TIMER, null, msgs);
			if (newWatchdogTimer != null)
				msgs = ((InternalEObject)newWatchdogTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__WATCHDOG_TIMER, null, msgs);
			msgs = basicSetWatchdogTimer(newWatchdogTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__WATCHDOG_TIMER, newWatchdogTimer, newWatchdogTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakpointsType getBreakpoints() {
		return breakpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreakpoints(BreakpointsType newBreakpoints, NotificationChain msgs) {
		BreakpointsType oldBreakpoints = breakpoints;
		breakpoints = newBreakpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__BREAKPOINTS, oldBreakpoints, newBreakpoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoints(BreakpointsType newBreakpoints) {
		if (newBreakpoints != breakpoints) {
			NotificationChain msgs = null;
			if (breakpoints != null)
				msgs = ((InternalEObject)breakpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__BREAKPOINTS, null, msgs);
			if (newBreakpoints != null)
				msgs = ((InternalEObject)newBreakpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__BREAKPOINTS, null, msgs);
			msgs = basicSetBreakpoints(newBreakpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__BREAKPOINTS, newBreakpoints, newBreakpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCDType getLCD() {
		return lCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCD(LCDType newLCD, NotificationChain msgs) {
		LCDType oldLCD = lCD;
		lCD = newLCD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__LCD, oldLCD, newLCD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCD(LCDType newLCD) {
		if (newLCD != lCD) {
			NotificationChain msgs = null;
			if (lCD != null)
				msgs = ((InternalEObject)lCD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__LCD, null, msgs);
			if (newLCD != null)
				msgs = ((InternalEObject)newLCD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__LCD, null, msgs);
			msgs = basicSetLCD(newLCD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__LCD, newLCD, newLCD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSpaceType getProgramSpace() {
		return programSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramSpace(ProgramSpaceType newProgramSpace, NotificationChain msgs) {
		ProgramSpaceType oldProgramSpace = programSpace;
		programSpace = newProgramSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PROGRAM_SPACE, oldProgramSpace, newProgramSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramSpace(ProgramSpaceType newProgramSpace) {
		if (newProgramSpace != programSpace) {
			NotificationChain msgs = null;
			if (programSpace != null)
				msgs = ((InternalEObject)programSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PROGRAM_SPACE, null, msgs);
			if (newProgramSpace != null)
				msgs = ((InternalEObject)newProgramSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PROGRAM_SPACE, null, msgs);
			msgs = basicSetProgramSpace(newProgramSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PROGRAM_SPACE, newProgramSpace, newProgramSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpaceType getDataSpace() {
		return dataSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSpace(DataSpaceType newDataSpace, NotificationChain msgs) {
		DataSpaceType oldDataSpace = dataSpace;
		dataSpace = newDataSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__DATA_SPACE, oldDataSpace, newDataSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSpace(DataSpaceType newDataSpace) {
		if (newDataSpace != dataSpace) {
			NotificationChain msgs = null;
			if (dataSpace != null)
				msgs = ((InternalEObject)dataSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__DATA_SPACE, null, msgs);
			if (newDataSpace != null)
				msgs = ((InternalEObject)newDataSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__DATA_SPACE, null, msgs);
			msgs = basicSetDataSpace(newDataSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__DATA_SPACE, newDataSpace, newDataSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinListType getPinList() {
		return pinList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPinList(PinListType newPinList, NotificationChain msgs) {
		PinListType oldPinList = pinList;
		pinList = newPinList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PIN_LIST, oldPinList, newPinList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinList(PinListType newPinList) {
		if (newPinList != pinList) {
			NotificationChain msgs = null;
			if (pinList != null)
				msgs = ((InternalEObject)pinList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PIN_LIST, null, msgs);
			if (newPinList != null)
				msgs = ((InternalEObject)newPinList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.PIC_TYPE__PIN_LIST, null, msgs);
			msgs = basicSetPinList(newPinList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PIN_LIST, newPinList, newPinList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArch(String newArch) {
		String oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDsid() {
		return dsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsid(int newDsid) {
		int oldDsid = dsid;
		dsid = newDsid;
		boolean oldDsidESet = dsidESet;
		dsidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__DSID, oldDsid, dsid, !oldDsidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDsid() {
		int oldDsid = dsid;
		boolean oldDsidESet = dsidESet;
		dsid = DSID_EDEFAULT;
		dsidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PIC_TYPE__DSID, oldDsid, DSID_EDEFAULT, oldDsidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDsid() {
		return dsidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasfreeze() {
		return hasfreeze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasfreeze(String newHasfreeze) {
		String oldHasfreeze = hasfreeze;
		hasfreeze = newHasfreeze;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__HASFREEZE, oldHasfreeze, hasfreeze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformedby() {
		return informedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformedby(String newInformedby) {
		String oldInformedby = informedby;
		informedby = newInformedby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__INFORMEDBY, oldInformedby, informedby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsextended() {
		return isextended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsextended(String newIsextended) {
		String oldIsextended = isextended;
		isextended = newIsextended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__ISEXTENDED, oldIsextended, isextended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcid() {
		return procid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcid(String newProcid) {
		String oldProcid = procid;
		procid = newProcid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PIC_TYPE__PROCID, oldProcid, procid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.PIC_TYPE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case EdcPackage.PIC_TYPE__POWER:
				return basicSetPower(null, msgs);
			case EdcPackage.PIC_TYPE__PROGRAMMING:
				return basicSetProgramming(null, msgs);
			case EdcPackage.PIC_TYPE__ARCH_DEF:
				return basicSetArchDef(null, msgs);
			case EdcPackage.PIC_TYPE__OSCILLATOR:
				return basicSetOscillator(null, msgs);
			case EdcPackage.PIC_TYPE__WATCHDOG_TIMER:
				return basicSetWatchdogTimer(null, msgs);
			case EdcPackage.PIC_TYPE__BREAKPOINTS:
				return basicSetBreakpoints(null, msgs);
			case EdcPackage.PIC_TYPE__LCD:
				return basicSetLCD(null, msgs);
			case EdcPackage.PIC_TYPE__PROGRAM_SPACE:
				return basicSetProgramSpace(null, msgs);
			case EdcPackage.PIC_TYPE__DATA_SPACE:
				return basicSetDataSpace(null, msgs);
			case EdcPackage.PIC_TYPE__PIN_LIST:
				return basicSetPinList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.PIC_TYPE__IMPORT:
				return getImport();
			case EdcPackage.PIC_TYPE__POWER:
				return getPower();
			case EdcPackage.PIC_TYPE__PROGRAMMING:
				return getProgramming();
			case EdcPackage.PIC_TYPE__ARCH_DEF:
				return getArchDef();
			case EdcPackage.PIC_TYPE__OSCILLATOR:
				return getOscillator();
			case EdcPackage.PIC_TYPE__WATCHDOG_TIMER:
				return getWatchdogTimer();
			case EdcPackage.PIC_TYPE__BREAKPOINTS:
				return getBreakpoints();
			case EdcPackage.PIC_TYPE__LCD:
				return getLCD();
			case EdcPackage.PIC_TYPE__PROGRAM_SPACE:
				return getProgramSpace();
			case EdcPackage.PIC_TYPE__DATA_SPACE:
				return getDataSpace();
			case EdcPackage.PIC_TYPE__PIN_LIST:
				return getPinList();
			case EdcPackage.PIC_TYPE__ARCH:
				return getArch();
			case EdcPackage.PIC_TYPE__DESC:
				return getDesc();
			case EdcPackage.PIC_TYPE__DSID:
				return getDsid();
			case EdcPackage.PIC_TYPE__HASFREEZE:
				return getHasfreeze();
			case EdcPackage.PIC_TYPE__INFORMEDBY:
				return getInformedby();
			case EdcPackage.PIC_TYPE__ISEXTENDED:
				return getIsextended();
			case EdcPackage.PIC_TYPE__NAME:
				return getName();
			case EdcPackage.PIC_TYPE__PROCID:
				return getProcid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdcPackage.PIC_TYPE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportType>)newValue);
				return;
			case EdcPackage.PIC_TYPE__POWER:
				setPower((PowerType)newValue);
				return;
			case EdcPackage.PIC_TYPE__PROGRAMMING:
				setProgramming((ProgrammingType)newValue);
				return;
			case EdcPackage.PIC_TYPE__ARCH_DEF:
				setArchDef((ArchDefType)newValue);
				return;
			case EdcPackage.PIC_TYPE__OSCILLATOR:
				setOscillator((OscillatorType)newValue);
				return;
			case EdcPackage.PIC_TYPE__WATCHDOG_TIMER:
				setWatchdogTimer((WatchdogTimerType)newValue);
				return;
			case EdcPackage.PIC_TYPE__BREAKPOINTS:
				setBreakpoints((BreakpointsType)newValue);
				return;
			case EdcPackage.PIC_TYPE__LCD:
				setLCD((LCDType)newValue);
				return;
			case EdcPackage.PIC_TYPE__PROGRAM_SPACE:
				setProgramSpace((ProgramSpaceType)newValue);
				return;
			case EdcPackage.PIC_TYPE__DATA_SPACE:
				setDataSpace((DataSpaceType)newValue);
				return;
			case EdcPackage.PIC_TYPE__PIN_LIST:
				setPinList((PinListType)newValue);
				return;
			case EdcPackage.PIC_TYPE__ARCH:
				setArch((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__DSID:
				setDsid((Integer)newValue);
				return;
			case EdcPackage.PIC_TYPE__HASFREEZE:
				setHasfreeze((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__INFORMEDBY:
				setInformedby((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__ISEXTENDED:
				setIsextended((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdcPackage.PIC_TYPE__PROCID:
				setProcid((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdcPackage.PIC_TYPE__IMPORT:
				getImport().clear();
				return;
			case EdcPackage.PIC_TYPE__POWER:
				setPower((PowerType)null);
				return;
			case EdcPackage.PIC_TYPE__PROGRAMMING:
				setProgramming((ProgrammingType)null);
				return;
			case EdcPackage.PIC_TYPE__ARCH_DEF:
				setArchDef((ArchDefType)null);
				return;
			case EdcPackage.PIC_TYPE__OSCILLATOR:
				setOscillator((OscillatorType)null);
				return;
			case EdcPackage.PIC_TYPE__WATCHDOG_TIMER:
				setWatchdogTimer((WatchdogTimerType)null);
				return;
			case EdcPackage.PIC_TYPE__BREAKPOINTS:
				setBreakpoints((BreakpointsType)null);
				return;
			case EdcPackage.PIC_TYPE__LCD:
				setLCD((LCDType)null);
				return;
			case EdcPackage.PIC_TYPE__PROGRAM_SPACE:
				setProgramSpace((ProgramSpaceType)null);
				return;
			case EdcPackage.PIC_TYPE__DATA_SPACE:
				setDataSpace((DataSpaceType)null);
				return;
			case EdcPackage.PIC_TYPE__PIN_LIST:
				setPinList((PinListType)null);
				return;
			case EdcPackage.PIC_TYPE__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__DSID:
				unsetDsid();
				return;
			case EdcPackage.PIC_TYPE__HASFREEZE:
				setHasfreeze(HASFREEZE_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__INFORMEDBY:
				setInformedby(INFORMEDBY_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__ISEXTENDED:
				setIsextended(ISEXTENDED_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdcPackage.PIC_TYPE__PROCID:
				setProcid(PROCID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdcPackage.PIC_TYPE__IMPORT:
				return import_ != null && !import_.isEmpty();
			case EdcPackage.PIC_TYPE__POWER:
				return power != null;
			case EdcPackage.PIC_TYPE__PROGRAMMING:
				return programming != null;
			case EdcPackage.PIC_TYPE__ARCH_DEF:
				return archDef != null;
			case EdcPackage.PIC_TYPE__OSCILLATOR:
				return oscillator != null;
			case EdcPackage.PIC_TYPE__WATCHDOG_TIMER:
				return watchdogTimer != null;
			case EdcPackage.PIC_TYPE__BREAKPOINTS:
				return breakpoints != null;
			case EdcPackage.PIC_TYPE__LCD:
				return lCD != null;
			case EdcPackage.PIC_TYPE__PROGRAM_SPACE:
				return programSpace != null;
			case EdcPackage.PIC_TYPE__DATA_SPACE:
				return dataSpace != null;
			case EdcPackage.PIC_TYPE__PIN_LIST:
				return pinList != null;
			case EdcPackage.PIC_TYPE__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case EdcPackage.PIC_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.PIC_TYPE__DSID:
				return isSetDsid();
			case EdcPackage.PIC_TYPE__HASFREEZE:
				return HASFREEZE_EDEFAULT == null ? hasfreeze != null : !HASFREEZE_EDEFAULT.equals(hasfreeze);
			case EdcPackage.PIC_TYPE__INFORMEDBY:
				return INFORMEDBY_EDEFAULT == null ? informedby != null : !INFORMEDBY_EDEFAULT.equals(informedby);
			case EdcPackage.PIC_TYPE__ISEXTENDED:
				return ISEXTENDED_EDEFAULT == null ? isextended != null : !ISEXTENDED_EDEFAULT.equals(isextended);
			case EdcPackage.PIC_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdcPackage.PIC_TYPE__PROCID:
				return PROCID_EDEFAULT == null ? procid != null : !PROCID_EDEFAULT.equals(procid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (arch: ");
		result.append(arch);
		result.append(", desc: ");
		result.append(desc);
		result.append(", dsid: ");
		if (dsidESet) result.append(dsid); else result.append("<unset>");
		result.append(", hasfreeze: ");
		result.append(hasfreeze);
		result.append(", informedby: ");
		result.append(informedby);
		result.append(", isextended: ");
		result.append(isextended);
		result.append(", name: ");
		result.append(name);
		result.append(", procid: ");
		result.append(procid);
		result.append(')');
		return result.toString();
	}

} //PICTypeImpl
