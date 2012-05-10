/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DCRDefType;
import crownking.edc.DCRModeListType;
import crownking.edc.EdcPackage;
import crownking.edc.IllegalType;

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
 * An implementation of the model object '<em><b>DCR Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getIllegal <em>Illegal</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getDCRModeList <em>DCR Mode List</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getUnimplval <em>Unimplval</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getUnused <em>Unused</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRDefTypeImpl#getUseinchecksum <em>Useinchecksum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCRDefTypeImpl extends EObjectImpl implements DCRDefType {
	/**
	 * The default value of the '{@link #getAliasList() <em>Alias List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasList() <em>Alias List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasList()
	 * @generated
	 * @ordered
	 */
	protected String aliasList = ALIAS_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIllegal() <em>Illegal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegal()
	 * @generated
	 * @ordered
	 */
	protected EList<IllegalType> illegal;

	/**
	 * The cached value of the '{@link #getDCRModeList() <em>DCR Mode List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCRModeList()
	 * @generated
	 * @ordered
	 */
	protected DCRModeListType dCRModeList;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected String impl = IMPL_EDEFAULT;

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
	 * The default value of the '{@link #getNzwidth() <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String NZWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNzwidth() <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzwidth()
	 * @generated
	 * @ordered
	 */
	protected String nzwidth = NZWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnimplval() <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnimplval()
	 * @generated
	 * @ordered
	 */
	protected static final byte UNIMPLVAL_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUnimplval() <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnimplval()
	 * @generated
	 * @ordered
	 */
	protected byte unimplval = UNIMPLVAL_EDEFAULT;

	/**
	 * This is true if the Unimplval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unimplvalESet;

	/**
	 * The default value of the '{@link #getUnused() <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnused()
	 * @generated
	 * @ordered
	 */
	protected static final String UNUSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnused() <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnused()
	 * @generated
	 * @ordered
	 */
	protected String unused = UNUSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseinchecksum() <em>Useinchecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseinchecksum()
	 * @generated
	 * @ordered
	 */
	protected static final String USEINCHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseinchecksum() <em>Useinchecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseinchecksum()
	 * @generated
	 * @ordered
	 */
	protected String useinchecksum = USEINCHECKSUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCRDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDCRDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasList() {
		return aliasList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasList(String newAliasList) {
		String oldAliasList = aliasList;
		aliasList = newAliasList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__ALIAS_LIST, oldAliasList, aliasList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllegalType> getIllegal() {
		if (illegal == null) {
			illegal = new EObjectContainmentEList<IllegalType>(IllegalType.class, this, EdcPackage.DCR_DEF_TYPE__ILLEGAL);
		}
		return illegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRModeListType getDCRModeList() {
		return dCRModeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDCRModeList(DCRModeListType newDCRModeList, NotificationChain msgs) {
		DCRModeListType oldDCRModeList = dCRModeList;
		dCRModeList = newDCRModeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST, oldDCRModeList, newDCRModeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDCRModeList(DCRModeListType newDCRModeList) {
		if (newDCRModeList != dCRModeList) {
			NotificationChain msgs = null;
			if (dCRModeList != null)
				msgs = ((InternalEObject)dCRModeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST, null, msgs);
			if (newDCRModeList != null)
				msgs = ((InternalEObject)newDCRModeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST, null, msgs);
			msgs = basicSetDCRModeList(newDCRModeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST, newDCRModeList, newDCRModeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__CNAME, oldCname, cname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpl(String newImpl) {
		String oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__IMPL, oldImpl, impl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNzwidth() {
		return nzwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNzwidth(String newNzwidth) {
		String oldNzwidth = nzwidth;
		nzwidth = newNzwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__NZWIDTH, oldNzwidth, nzwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUnimplval() {
		return unimplval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnimplval(byte newUnimplval) {
		byte oldUnimplval = unimplval;
		unimplval = newUnimplval;
		boolean oldUnimplvalESet = unimplvalESet;
		unimplvalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__UNIMPLVAL, oldUnimplval, unimplval, !oldUnimplvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnimplval() {
		byte oldUnimplval = unimplval;
		boolean oldUnimplvalESet = unimplvalESet;
		unimplval = UNIMPLVAL_EDEFAULT;
		unimplvalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.DCR_DEF_TYPE__UNIMPLVAL, oldUnimplval, UNIMPLVAL_EDEFAULT, oldUnimplvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnimplval() {
		return unimplvalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnused() {
		return unused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnused(String newUnused) {
		String oldUnused = unused;
		unused = newUnused;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__UNUSED, oldUnused, unused));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseinchecksum() {
		return useinchecksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseinchecksum(String newUseinchecksum) {
		String oldUseinchecksum = useinchecksum;
		useinchecksum = newUseinchecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_DEF_TYPE__USEINCHECKSUM, oldUseinchecksum, useinchecksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DCR_DEF_TYPE__ILLEGAL:
				return ((InternalEList<?>)getIllegal()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST:
				return basicSetDCRModeList(null, msgs);
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
			case EdcPackage.DCR_DEF_TYPE__ALIAS_LIST:
				return getAliasList();
			case EdcPackage.DCR_DEF_TYPE__ILLEGAL:
				return getIllegal();
			case EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST:
				return getDCRModeList();
			case EdcPackage.DCR_DEF_TYPE__ACCESS:
				return getAccess();
			case EdcPackage.DCR_DEF_TYPE__CNAME:
				return getCname();
			case EdcPackage.DCR_DEF_TYPE__DEFAULT:
				return getDefault();
			case EdcPackage.DCR_DEF_TYPE__DESC:
				return getDesc();
			case EdcPackage.DCR_DEF_TYPE__IMPL:
				return getImpl();
			case EdcPackage.DCR_DEF_TYPE__NAME:
				return getName();
			case EdcPackage.DCR_DEF_TYPE__NZWIDTH:
				return getNzwidth();
			case EdcPackage.DCR_DEF_TYPE__UNIMPLVAL:
				return getUnimplval();
			case EdcPackage.DCR_DEF_TYPE__UNUSED:
				return getUnused();
			case EdcPackage.DCR_DEF_TYPE__USEINCHECKSUM:
				return getUseinchecksum();
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
			case EdcPackage.DCR_DEF_TYPE__ALIAS_LIST:
				setAliasList((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__ILLEGAL:
				getIllegal().clear();
				getIllegal().addAll((Collection<? extends IllegalType>)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST:
				setDCRModeList((DCRModeListType)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__ACCESS:
				setAccess((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__CNAME:
				setCname((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__DEFAULT:
				setDefault((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__IMPL:
				setImpl((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__NZWIDTH:
				setNzwidth((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__UNIMPLVAL:
				setUnimplval((Byte)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__UNUSED:
				setUnused((String)newValue);
				return;
			case EdcPackage.DCR_DEF_TYPE__USEINCHECKSUM:
				setUseinchecksum((String)newValue);
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
			case EdcPackage.DCR_DEF_TYPE__ALIAS_LIST:
				setAliasList(ALIAS_LIST_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__ILLEGAL:
				getIllegal().clear();
				return;
			case EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST:
				setDCRModeList((DCRModeListType)null);
				return;
			case EdcPackage.DCR_DEF_TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__IMPL:
				setImpl(IMPL_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__NZWIDTH:
				setNzwidth(NZWIDTH_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__UNIMPLVAL:
				unsetUnimplval();
				return;
			case EdcPackage.DCR_DEF_TYPE__UNUSED:
				setUnused(UNUSED_EDEFAULT);
				return;
			case EdcPackage.DCR_DEF_TYPE__USEINCHECKSUM:
				setUseinchecksum(USEINCHECKSUM_EDEFAULT);
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
			case EdcPackage.DCR_DEF_TYPE__ALIAS_LIST:
				return ALIAS_LIST_EDEFAULT == null ? aliasList != null : !ALIAS_LIST_EDEFAULT.equals(aliasList);
			case EdcPackage.DCR_DEF_TYPE__ILLEGAL:
				return illegal != null && !illegal.isEmpty();
			case EdcPackage.DCR_DEF_TYPE__DCR_MODE_LIST:
				return dCRModeList != null;
			case EdcPackage.DCR_DEF_TYPE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case EdcPackage.DCR_DEF_TYPE__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case EdcPackage.DCR_DEF_TYPE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case EdcPackage.DCR_DEF_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.DCR_DEF_TYPE__IMPL:
				return IMPL_EDEFAULT == null ? impl != null : !IMPL_EDEFAULT.equals(impl);
			case EdcPackage.DCR_DEF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdcPackage.DCR_DEF_TYPE__NZWIDTH:
				return NZWIDTH_EDEFAULT == null ? nzwidth != null : !NZWIDTH_EDEFAULT.equals(nzwidth);
			case EdcPackage.DCR_DEF_TYPE__UNIMPLVAL:
				return isSetUnimplval();
			case EdcPackage.DCR_DEF_TYPE__UNUSED:
				return UNUSED_EDEFAULT == null ? unused != null : !UNUSED_EDEFAULT.equals(unused);
			case EdcPackage.DCR_DEF_TYPE__USEINCHECKSUM:
				return USEINCHECKSUM_EDEFAULT == null ? useinchecksum != null : !USEINCHECKSUM_EDEFAULT.equals(useinchecksum);
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
		result.append(" (aliasList: ");
		result.append(aliasList);
		result.append(", access: ");
		result.append(access);
		result.append(", cname: ");
		result.append(cname);
		result.append(", default: ");
		result.append(default_);
		result.append(", desc: ");
		result.append(desc);
		result.append(", impl: ");
		result.append(impl);
		result.append(", name: ");
		result.append(name);
		result.append(", nzwidth: ");
		result.append(nzwidth);
		result.append(", unimplval: ");
		if (unimplvalESet) result.append(unimplval); else result.append("<unset>");
		result.append(", unused: ");
		result.append(unused);
		result.append(", useinchecksum: ");
		result.append(useinchecksum);
		result.append(')');
		return result.toString();
	}

} //DCRDefTypeImpl
