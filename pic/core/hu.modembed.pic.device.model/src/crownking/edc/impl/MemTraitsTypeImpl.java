/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.BackgroundDebugMemTraitsType;
import crownking.edc.CalDataMemTraitsType;
import crownking.edc.CodeMemTraitsType;
import crownking.edc.ConfigFuseMemTraitsType;
import crownking.edc.DataMemTraitsType;
import crownking.edc.DeviceIDMemTraitsType;
import crownking.edc.EEDataMemTraitsType;
import crownking.edc.EdcPackage;
import crownking.edc.MemTraitsType;
import crownking.edc.TestMemTraitsType;
import crownking.edc.UserIDMemTraitsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getCodeMemTraits <em>Code Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getCalDataMemTraits <em>Cal Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getBackgroundDebugMemTraits <em>Background Debug Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getTestMemTraits <em>Test Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getUserIDMemTraits <em>User ID Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getConfigFuseMemTraits <em>Config Fuse Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getDeviceIDMemTraits <em>Device ID Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getEEDataMemTraits <em>EE Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getDataMemTraits <em>Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getBankcount <em>Bankcount</em>}</li>
 *   <li>{@link crownking.edc.impl.MemTraitsTypeImpl#getHwstackdepth <em>Hwstackdepth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemTraitsTypeImpl extends EObjectImpl implements MemTraitsType {
	/**
	 * The cached value of the '{@link #getCodeMemTraits() <em>Code Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMemTraits()
	 * @generated
	 * @ordered
	 */
	protected CodeMemTraitsType codeMemTraits;

	/**
	 * The cached value of the '{@link #getCalDataMemTraits() <em>Cal Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalDataMemTraits()
	 * @generated
	 * @ordered
	 */
	protected CalDataMemTraitsType calDataMemTraits;

	/**
	 * The cached value of the '{@link #getBackgroundDebugMemTraits() <em>Background Debug Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundDebugMemTraits()
	 * @generated
	 * @ordered
	 */
	protected BackgroundDebugMemTraitsType backgroundDebugMemTraits;

	/**
	 * The cached value of the '{@link #getTestMemTraits() <em>Test Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMemTraits()
	 * @generated
	 * @ordered
	 */
	protected TestMemTraitsType testMemTraits;

	/**
	 * The cached value of the '{@link #getUserIDMemTraits() <em>User ID Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIDMemTraits()
	 * @generated
	 * @ordered
	 */
	protected UserIDMemTraitsType userIDMemTraits;

	/**
	 * The cached value of the '{@link #getConfigFuseMemTraits() <em>Config Fuse Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFuseMemTraits()
	 * @generated
	 * @ordered
	 */
	protected ConfigFuseMemTraitsType configFuseMemTraits;

	/**
	 * The cached value of the '{@link #getDeviceIDMemTraits() <em>Device ID Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIDMemTraits()
	 * @generated
	 * @ordered
	 */
	protected DeviceIDMemTraitsType deviceIDMemTraits;

	/**
	 * The cached value of the '{@link #getEEDataMemTraits() <em>EE Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEDataMemTraits()
	 * @generated
	 * @ordered
	 */
	protected EEDataMemTraitsType eEDataMemTraits;

	/**
	 * The cached value of the '{@link #getDataMemTraits() <em>Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMemTraits()
	 * @generated
	 * @ordered
	 */
	protected DataMemTraitsType dataMemTraits;

	/**
	 * The default value of the '{@link #getBankcount() <em>Bankcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankcount()
	 * @generated
	 * @ordered
	 */
	protected static final byte BANKCOUNT_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBankcount() <em>Bankcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankcount()
	 * @generated
	 * @ordered
	 */
	protected byte bankcount = BANKCOUNT_EDEFAULT;

	/**
	 * This is true if the Bankcount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bankcountESet;

	/**
	 * The default value of the '{@link #getHwstackdepth() <em>Hwstackdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwstackdepth()
	 * @generated
	 * @ordered
	 */
	protected static final byte HWSTACKDEPTH_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHwstackdepth() <em>Hwstackdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwstackdepth()
	 * @generated
	 * @ordered
	 */
	protected byte hwstackdepth = HWSTACKDEPTH_EDEFAULT;

	/**
	 * This is true if the Hwstackdepth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hwstackdepthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemTraitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getMemTraitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeMemTraitsType getCodeMemTraits() {
		return codeMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeMemTraits(CodeMemTraitsType newCodeMemTraits, NotificationChain msgs) {
		CodeMemTraitsType oldCodeMemTraits = codeMemTraits;
		codeMemTraits = newCodeMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS, oldCodeMemTraits, newCodeMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeMemTraits(CodeMemTraitsType newCodeMemTraits) {
		if (newCodeMemTraits != codeMemTraits) {
			NotificationChain msgs = null;
			if (codeMemTraits != null)
				msgs = ((InternalEObject)codeMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS, null, msgs);
			if (newCodeMemTraits != null)
				msgs = ((InternalEObject)newCodeMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS, null, msgs);
			msgs = basicSetCodeMemTraits(newCodeMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS, newCodeMemTraits, newCodeMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalDataMemTraitsType getCalDataMemTraits() {
		return calDataMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalDataMemTraits(CalDataMemTraitsType newCalDataMemTraits, NotificationChain msgs) {
		CalDataMemTraitsType oldCalDataMemTraits = calDataMemTraits;
		calDataMemTraits = newCalDataMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS, oldCalDataMemTraits, newCalDataMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalDataMemTraits(CalDataMemTraitsType newCalDataMemTraits) {
		if (newCalDataMemTraits != calDataMemTraits) {
			NotificationChain msgs = null;
			if (calDataMemTraits != null)
				msgs = ((InternalEObject)calDataMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS, null, msgs);
			if (newCalDataMemTraits != null)
				msgs = ((InternalEObject)newCalDataMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS, null, msgs);
			msgs = basicSetCalDataMemTraits(newCalDataMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS, newCalDataMemTraits, newCalDataMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundDebugMemTraitsType getBackgroundDebugMemTraits() {
		return backgroundDebugMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundDebugMemTraits(BackgroundDebugMemTraitsType newBackgroundDebugMemTraits, NotificationChain msgs) {
		BackgroundDebugMemTraitsType oldBackgroundDebugMemTraits = backgroundDebugMemTraits;
		backgroundDebugMemTraits = newBackgroundDebugMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS, oldBackgroundDebugMemTraits, newBackgroundDebugMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundDebugMemTraits(BackgroundDebugMemTraitsType newBackgroundDebugMemTraits) {
		if (newBackgroundDebugMemTraits != backgroundDebugMemTraits) {
			NotificationChain msgs = null;
			if (backgroundDebugMemTraits != null)
				msgs = ((InternalEObject)backgroundDebugMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS, null, msgs);
			if (newBackgroundDebugMemTraits != null)
				msgs = ((InternalEObject)newBackgroundDebugMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS, null, msgs);
			msgs = basicSetBackgroundDebugMemTraits(newBackgroundDebugMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS, newBackgroundDebugMemTraits, newBackgroundDebugMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMemTraitsType getTestMemTraits() {
		return testMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestMemTraits(TestMemTraitsType newTestMemTraits, NotificationChain msgs) {
		TestMemTraitsType oldTestMemTraits = testMemTraits;
		testMemTraits = newTestMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS, oldTestMemTraits, newTestMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestMemTraits(TestMemTraitsType newTestMemTraits) {
		if (newTestMemTraits != testMemTraits) {
			NotificationChain msgs = null;
			if (testMemTraits != null)
				msgs = ((InternalEObject)testMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS, null, msgs);
			if (newTestMemTraits != null)
				msgs = ((InternalEObject)newTestMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS, null, msgs);
			msgs = basicSetTestMemTraits(newTestMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS, newTestMemTraits, newTestMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIDMemTraitsType getUserIDMemTraits() {
		return userIDMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserIDMemTraits(UserIDMemTraitsType newUserIDMemTraits, NotificationChain msgs) {
		UserIDMemTraitsType oldUserIDMemTraits = userIDMemTraits;
		userIDMemTraits = newUserIDMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS, oldUserIDMemTraits, newUserIDMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIDMemTraits(UserIDMemTraitsType newUserIDMemTraits) {
		if (newUserIDMemTraits != userIDMemTraits) {
			NotificationChain msgs = null;
			if (userIDMemTraits != null)
				msgs = ((InternalEObject)userIDMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS, null, msgs);
			if (newUserIDMemTraits != null)
				msgs = ((InternalEObject)newUserIDMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS, null, msgs);
			msgs = basicSetUserIDMemTraits(newUserIDMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS, newUserIDMemTraits, newUserIDMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFuseMemTraitsType getConfigFuseMemTraits() {
		return configFuseMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigFuseMemTraits(ConfigFuseMemTraitsType newConfigFuseMemTraits, NotificationChain msgs) {
		ConfigFuseMemTraitsType oldConfigFuseMemTraits = configFuseMemTraits;
		configFuseMemTraits = newConfigFuseMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS, oldConfigFuseMemTraits, newConfigFuseMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigFuseMemTraits(ConfigFuseMemTraitsType newConfigFuseMemTraits) {
		if (newConfigFuseMemTraits != configFuseMemTraits) {
			NotificationChain msgs = null;
			if (configFuseMemTraits != null)
				msgs = ((InternalEObject)configFuseMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS, null, msgs);
			if (newConfigFuseMemTraits != null)
				msgs = ((InternalEObject)newConfigFuseMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS, null, msgs);
			msgs = basicSetConfigFuseMemTraits(newConfigFuseMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS, newConfigFuseMemTraits, newConfigFuseMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIDMemTraitsType getDeviceIDMemTraits() {
		return deviceIDMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceIDMemTraits(DeviceIDMemTraitsType newDeviceIDMemTraits, NotificationChain msgs) {
		DeviceIDMemTraitsType oldDeviceIDMemTraits = deviceIDMemTraits;
		deviceIDMemTraits = newDeviceIDMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS, oldDeviceIDMemTraits, newDeviceIDMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceIDMemTraits(DeviceIDMemTraitsType newDeviceIDMemTraits) {
		if (newDeviceIDMemTraits != deviceIDMemTraits) {
			NotificationChain msgs = null;
			if (deviceIDMemTraits != null)
				msgs = ((InternalEObject)deviceIDMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS, null, msgs);
			if (newDeviceIDMemTraits != null)
				msgs = ((InternalEObject)newDeviceIDMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS, null, msgs);
			msgs = basicSetDeviceIDMemTraits(newDeviceIDMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS, newDeviceIDMemTraits, newDeviceIDMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEDataMemTraitsType getEEDataMemTraits() {
		return eEDataMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEEDataMemTraits(EEDataMemTraitsType newEEDataMemTraits, NotificationChain msgs) {
		EEDataMemTraitsType oldEEDataMemTraits = eEDataMemTraits;
		eEDataMemTraits = newEEDataMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS, oldEEDataMemTraits, newEEDataMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEDataMemTraits(EEDataMemTraitsType newEEDataMemTraits) {
		if (newEEDataMemTraits != eEDataMemTraits) {
			NotificationChain msgs = null;
			if (eEDataMemTraits != null)
				msgs = ((InternalEObject)eEDataMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS, null, msgs);
			if (newEEDataMemTraits != null)
				msgs = ((InternalEObject)newEEDataMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS, null, msgs);
			msgs = basicSetEEDataMemTraits(newEEDataMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS, newEEDataMemTraits, newEEDataMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMemTraitsType getDataMemTraits() {
		return dataMemTraits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataMemTraits(DataMemTraitsType newDataMemTraits, NotificationChain msgs) {
		DataMemTraitsType oldDataMemTraits = dataMemTraits;
		dataMemTraits = newDataMemTraits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS, oldDataMemTraits, newDataMemTraits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMemTraits(DataMemTraitsType newDataMemTraits) {
		if (newDataMemTraits != dataMemTraits) {
			NotificationChain msgs = null;
			if (dataMemTraits != null)
				msgs = ((InternalEObject)dataMemTraits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS, null, msgs);
			if (newDataMemTraits != null)
				msgs = ((InternalEObject)newDataMemTraits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS, null, msgs);
			msgs = basicSetDataMemTraits(newDataMemTraits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS, newDataMemTraits, newDataMemTraits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBankcount() {
		return bankcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankcount(byte newBankcount) {
		byte oldBankcount = bankcount;
		bankcount = newBankcount;
		boolean oldBankcountESet = bankcountESet;
		bankcountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT, oldBankcount, bankcount, !oldBankcountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBankcount() {
		byte oldBankcount = bankcount;
		boolean oldBankcountESet = bankcountESet;
		bankcount = BANKCOUNT_EDEFAULT;
		bankcountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT, oldBankcount, BANKCOUNT_EDEFAULT, oldBankcountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBankcount() {
		return bankcountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHwstackdepth() {
		return hwstackdepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwstackdepth(byte newHwstackdepth) {
		byte oldHwstackdepth = hwstackdepth;
		hwstackdepth = newHwstackdepth;
		boolean oldHwstackdepthESet = hwstackdepthESet;
		hwstackdepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH, oldHwstackdepth, hwstackdepth, !oldHwstackdepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHwstackdepth() {
		byte oldHwstackdepth = hwstackdepth;
		boolean oldHwstackdepthESet = hwstackdepthESet;
		hwstackdepth = HWSTACKDEPTH_EDEFAULT;
		hwstackdepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH, oldHwstackdepth, HWSTACKDEPTH_EDEFAULT, oldHwstackdepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHwstackdepth() {
		return hwstackdepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS:
				return basicSetCodeMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS:
				return basicSetCalDataMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS:
				return basicSetBackgroundDebugMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS:
				return basicSetTestMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS:
				return basicSetUserIDMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS:
				return basicSetConfigFuseMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS:
				return basicSetDeviceIDMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS:
				return basicSetEEDataMemTraits(null, msgs);
			case EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS:
				return basicSetDataMemTraits(null, msgs);
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
			case EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS:
				return getCodeMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS:
				return getCalDataMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS:
				return getBackgroundDebugMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS:
				return getTestMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS:
				return getUserIDMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS:
				return getConfigFuseMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS:
				return getDeviceIDMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS:
				return getEEDataMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS:
				return getDataMemTraits();
			case EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT:
				return getBankcount();
			case EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH:
				return getHwstackdepth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS:
				setCodeMemTraits((CodeMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS:
				setCalDataMemTraits((CalDataMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS:
				setBackgroundDebugMemTraits((BackgroundDebugMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS:
				setTestMemTraits((TestMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS:
				setUserIDMemTraits((UserIDMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS:
				setConfigFuseMemTraits((ConfigFuseMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS:
				setDeviceIDMemTraits((DeviceIDMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS:
				setEEDataMemTraits((EEDataMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS:
				setDataMemTraits((DataMemTraitsType)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT:
				setBankcount((Byte)newValue);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH:
				setHwstackdepth((Byte)newValue);
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
			case EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS:
				setCodeMemTraits((CodeMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS:
				setCalDataMemTraits((CalDataMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS:
				setBackgroundDebugMemTraits((BackgroundDebugMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS:
				setTestMemTraits((TestMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS:
				setUserIDMemTraits((UserIDMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS:
				setConfigFuseMemTraits((ConfigFuseMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS:
				setDeviceIDMemTraits((DeviceIDMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS:
				setEEDataMemTraits((EEDataMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS:
				setDataMemTraits((DataMemTraitsType)null);
				return;
			case EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT:
				unsetBankcount();
				return;
			case EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH:
				unsetHwstackdepth();
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
			case EdcPackage.MEM_TRAITS_TYPE__CODE_MEM_TRAITS:
				return codeMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS:
				return calDataMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS:
				return backgroundDebugMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__TEST_MEM_TRAITS:
				return testMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS:
				return userIDMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS:
				return configFuseMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS:
				return deviceIDMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS:
				return eEDataMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__DATA_MEM_TRAITS:
				return dataMemTraits != null;
			case EdcPackage.MEM_TRAITS_TYPE__BANKCOUNT:
				return isSetBankcount();
			case EdcPackage.MEM_TRAITS_TYPE__HWSTACKDEPTH:
				return isSetHwstackdepth();
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
		result.append(" (bankcount: ");
		if (bankcountESet) result.append(bankcount); else result.append("<unset>");
		result.append(", hwstackdepth: ");
		if (hwstackdepthESet) result.append(hwstackdepth); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemTraitsTypeImpl
