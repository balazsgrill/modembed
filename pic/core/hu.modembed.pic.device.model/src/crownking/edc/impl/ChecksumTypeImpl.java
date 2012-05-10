/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AliasListType8;
import crownking.edc.ChecksumType;
import crownking.edc.EdcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checksum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getChecksumalgo <em>Checksumalgo</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.ChecksumTypeImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChecksumTypeImpl extends EObjectImpl implements ChecksumType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getBeginaddr() <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginaddr()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGINADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginaddr() <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginaddr()
	 * @generated
	 * @ordered
	 */
	protected String beginaddr = BEGINADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecksumalgo() <em>Checksumalgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumalgo()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSUMALGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksumalgo() <em>Checksumalgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksumalgo()
	 * @generated
	 * @ordered
	 */
	protected String checksumalgo = CHECKSUMALGO_EDEFAULT;

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
	 * The default value of the '{@link #getEndaddr() <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndaddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndaddr() <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndaddr()
	 * @generated
	 * @ordered
	 */
	protected String endaddr = ENDADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIslanghidden() <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslanghidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISLANGHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslanghidden() <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslanghidden()
	 * @generated
	 * @ordered
	 */
	protected String islanghidden = ISLANGHIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected String when = WHEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChecksumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getChecksumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.CHECKSUM_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasListType8 getAliasList() {
		return (AliasListType8)getMixed().get(EdcPackage.eINSTANCE.getChecksumType_AliasList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasList(AliasListType8 newAliasList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EdcPackage.eINSTANCE.getChecksumType_AliasList(), newAliasList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasList(AliasListType8 newAliasList) {
		((FeatureMap.Internal)getMixed()).set(EdcPackage.eINSTANCE.getChecksumType_AliasList(), newAliasList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumType getChecksum() {
		return (ChecksumType)getMixed().get(EdcPackage.eINSTANCE.getChecksumType_Checksum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChecksum(ChecksumType newChecksum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EdcPackage.eINSTANCE.getChecksumType_Checksum(), newChecksum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(ChecksumType newChecksum) {
		((FeatureMap.Internal)getMixed()).set(EdcPackage.eINSTANCE.getChecksumType_Checksum(), newChecksum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeginaddr() {
		return beginaddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginaddr(String newBeginaddr) {
		String oldBeginaddr = beginaddr;
		beginaddr = newBeginaddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__BEGINADDR, oldBeginaddr, beginaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksumalgo() {
		return checksumalgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksumalgo(String newChecksumalgo) {
		String oldChecksumalgo = checksumalgo;
		checksumalgo = newChecksumalgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__CHECKSUMALGO, oldChecksumalgo, checksumalgo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__CNAME, oldCname, cname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndaddr() {
		return endaddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndaddr(String newEndaddr) {
		String oldEndaddr = endaddr;
		endaddr = newEndaddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__ENDADDR, oldEndaddr, endaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIslanghidden() {
		return islanghidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslanghidden(String newIslanghidden) {
		String oldIslanghidden = islanghidden;
		islanghidden = newIslanghidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__ISLANGHIDDEN, oldIslanghidden, islanghidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(String newWhen) {
		String oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CHECKSUM_TYPE__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.CHECKSUM_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.CHECKSUM_TYPE__ALIAS_LIST:
				return basicSetAliasList(null, msgs);
			case EdcPackage.CHECKSUM_TYPE__CHECKSUM:
				return basicSetChecksum(null, msgs);
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
			case EdcPackage.CHECKSUM_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.CHECKSUM_TYPE__ALIAS_LIST:
				return getAliasList();
			case EdcPackage.CHECKSUM_TYPE__CHECKSUM:
				return getChecksum();
			case EdcPackage.CHECKSUM_TYPE__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.CHECKSUM_TYPE__CHECKSUMALGO:
				return getChecksumalgo();
			case EdcPackage.CHECKSUM_TYPE__CNAME:
				return getCname();
			case EdcPackage.CHECKSUM_TYPE__DESC:
				return getDesc();
			case EdcPackage.CHECKSUM_TYPE__ENDADDR:
				return getEndaddr();
			case EdcPackage.CHECKSUM_TYPE__ISLANGHIDDEN:
				return getIslanghidden();
			case EdcPackage.CHECKSUM_TYPE__WHEN:
				return getWhen();
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
			case EdcPackage.CHECKSUM_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__ALIAS_LIST:
				setAliasList((AliasListType8)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__CHECKSUM:
				setChecksum((ChecksumType)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__CHECKSUMALGO:
				setChecksumalgo((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__CNAME:
				setCname((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__ISLANGHIDDEN:
				setIslanghidden((String)newValue);
				return;
			case EdcPackage.CHECKSUM_TYPE__WHEN:
				setWhen((String)newValue);
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
			case EdcPackage.CHECKSUM_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.CHECKSUM_TYPE__ALIAS_LIST:
				setAliasList((AliasListType8)null);
				return;
			case EdcPackage.CHECKSUM_TYPE__CHECKSUM:
				setChecksum((ChecksumType)null);
				return;
			case EdcPackage.CHECKSUM_TYPE__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__CHECKSUMALGO:
				setChecksumalgo(CHECKSUMALGO_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__ISLANGHIDDEN:
				setIslanghidden(ISLANGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.CHECKSUM_TYPE__WHEN:
				setWhen(WHEN_EDEFAULT);
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
			case EdcPackage.CHECKSUM_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.CHECKSUM_TYPE__ALIAS_LIST:
				return getAliasList() != null;
			case EdcPackage.CHECKSUM_TYPE__CHECKSUM:
				return getChecksum() != null;
			case EdcPackage.CHECKSUM_TYPE__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.CHECKSUM_TYPE__CHECKSUMALGO:
				return CHECKSUMALGO_EDEFAULT == null ? checksumalgo != null : !CHECKSUMALGO_EDEFAULT.equals(checksumalgo);
			case EdcPackage.CHECKSUM_TYPE__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case EdcPackage.CHECKSUM_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.CHECKSUM_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.CHECKSUM_TYPE__ISLANGHIDDEN:
				return ISLANGHIDDEN_EDEFAULT == null ? islanghidden != null : !ISLANGHIDDEN_EDEFAULT.equals(islanghidden);
			case EdcPackage.CHECKSUM_TYPE__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", beginaddr: ");
		result.append(beginaddr);
		result.append(", checksumalgo: ");
		result.append(checksumalgo);
		result.append(", cname: ");
		result.append(cname);
		result.append(", desc: ");
		result.append(desc);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(", islanghidden: ");
		result.append(islanghidden);
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //ChecksumTypeImpl
