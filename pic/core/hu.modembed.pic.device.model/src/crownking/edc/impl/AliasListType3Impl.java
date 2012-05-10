/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AliasListType3;
import crownking.edc.AliasListType8;
import crownking.edc.ChecksumType;
import crownking.edc.EdcPackage;
import crownking.edc.LegacyAliasType;
import crownking.edc.MigrationAliasType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias List Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getLegacyAlias <em>Legacy Alias</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getMigrationAlias <em>Migration Alias</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getChecksumalgo <em>Checksumalgo</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getOscmodeidref <em>Oscmodeidref</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType3Impl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasListType3Impl extends EObjectImpl implements AliasListType3 {
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
	 * The default value of the '{@link #getIshidden() <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIshidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIshidden() <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIshidden()
	 * @generated
	 * @ordered
	 */
	protected String ishidden = ISHIDDEN_EDEFAULT;

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
	 * The default value of the '{@link #getOscmodeidref() <em>Oscmodeidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscmodeidref()
	 * @generated
	 * @ordered
	 */
	protected static final byte OSCMODEIDREF_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getOscmodeidref() <em>Oscmodeidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscmodeidref()
	 * @generated
	 * @ordered
	 */
	protected byte oscmodeidref = OSCMODEIDREF_EDEFAULT;

	/**
	 * This is true if the Oscmodeidref attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oscmodeidrefESet;

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
	protected AliasListType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getAliasListType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.ALIAS_LIST_TYPE3__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(EdcPackage.eINSTANCE.getAliasListType3_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyAliasType> getLegacyAlias() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType3_LegacyAlias());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MigrationAliasType> getMigrationAlias() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType3_MigrationAlias());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasListType8> getAliasList() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType3_AliasList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChecksumType> getChecksum() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType3_Checksum());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__BEGINADDR, oldBeginaddr, beginaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__CHECKSUMALGO, oldChecksumalgo, checksumalgo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__CNAME, oldCname, cname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__DESC, oldDesc, desc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__ENDADDR, oldEndaddr, endaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIshidden() {
		return ishidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIshidden(String newIshidden) {
		String oldIshidden = ishidden;
		ishidden = newIshidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__ISHIDDEN, oldIshidden, ishidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__ISLANGHIDDEN, oldIslanghidden, islanghidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getOscmodeidref() {
		return oscmodeidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscmodeidref(byte newOscmodeidref) {
		byte oldOscmodeidref = oscmodeidref;
		oscmodeidref = newOscmodeidref;
		boolean oldOscmodeidrefESet = oscmodeidrefESet;
		oscmodeidrefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF, oldOscmodeidref, oscmodeidref, !oldOscmodeidrefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOscmodeidref() {
		byte oldOscmodeidref = oscmodeidref;
		boolean oldOscmodeidrefESet = oscmodeidrefESet;
		oscmodeidref = OSCMODEIDREF_EDEFAULT;
		oscmodeidrefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF, oldOscmodeidref, OSCMODEIDREF_EDEFAULT, oldOscmodeidrefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOscmodeidref() {
		return oscmodeidrefESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.ALIAS_LIST_TYPE3__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.ALIAS_LIST_TYPE3__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE3__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE3__LEGACY_ALIAS:
				return ((InternalEList<?>)getLegacyAlias()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE3__MIGRATION_ALIAS:
				return ((InternalEList<?>)getMigrationAlias()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE3__ALIAS_LIST:
				return ((InternalEList<?>)getAliasList()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUM:
				return ((InternalEList<?>)getChecksum()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.ALIAS_LIST_TYPE3__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.ALIAS_LIST_TYPE3__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.ALIAS_LIST_TYPE3__LEGACY_ALIAS:
				return getLegacyAlias();
			case EdcPackage.ALIAS_LIST_TYPE3__MIGRATION_ALIAS:
				return getMigrationAlias();
			case EdcPackage.ALIAS_LIST_TYPE3__ALIAS_LIST:
				return getAliasList();
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUM:
				return getChecksum();
			case EdcPackage.ALIAS_LIST_TYPE3__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUMALGO:
				return getChecksumalgo();
			case EdcPackage.ALIAS_LIST_TYPE3__CNAME:
				return getCname();
			case EdcPackage.ALIAS_LIST_TYPE3__DESC:
				return getDesc();
			case EdcPackage.ALIAS_LIST_TYPE3__ENDADDR:
				return getEndaddr();
			case EdcPackage.ALIAS_LIST_TYPE3__ISHIDDEN:
				return getIshidden();
			case EdcPackage.ALIAS_LIST_TYPE3__ISLANGHIDDEN:
				return getIslanghidden();
			case EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF:
				return getOscmodeidref();
			case EdcPackage.ALIAS_LIST_TYPE3__WHEN:
				return getWhen();
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
			case EdcPackage.ALIAS_LIST_TYPE3__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__LEGACY_ALIAS:
				getLegacyAlias().clear();
				getLegacyAlias().addAll((Collection<? extends LegacyAliasType>)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__MIGRATION_ALIAS:
				getMigrationAlias().clear();
				getMigrationAlias().addAll((Collection<? extends MigrationAliasType>)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ALIAS_LIST:
				getAliasList().clear();
				getAliasList().addAll((Collection<? extends AliasListType8>)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUM:
				getChecksum().clear();
				getChecksum().addAll((Collection<? extends ChecksumType>)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUMALGO:
				setChecksumalgo((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CNAME:
				setCname((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ISHIDDEN:
				setIshidden((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ISLANGHIDDEN:
				setIslanghidden((String)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF:
				setOscmodeidref((Byte)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__WHEN:
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
			case EdcPackage.ALIAS_LIST_TYPE3__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__LEGACY_ALIAS:
				getLegacyAlias().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__MIGRATION_ALIAS:
				getMigrationAlias().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ALIAS_LIST:
				getAliasList().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUM:
				getChecksum().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUMALGO:
				setChecksumalgo(CHECKSUMALGO_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ISHIDDEN:
				setIshidden(ISHIDDEN_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__ISLANGHIDDEN:
				setIslanghidden(ISLANGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF:
				unsetOscmodeidref();
				return;
			case EdcPackage.ALIAS_LIST_TYPE3__WHEN:
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
			case EdcPackage.ALIAS_LIST_TYPE3__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__GROUP:
				return !getGroup().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__LEGACY_ALIAS:
				return !getLegacyAlias().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__MIGRATION_ALIAS:
				return !getMigrationAlias().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__ALIAS_LIST:
				return !getAliasList().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUM:
				return !getChecksum().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE3__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.ALIAS_LIST_TYPE3__CHECKSUMALGO:
				return CHECKSUMALGO_EDEFAULT == null ? checksumalgo != null : !CHECKSUMALGO_EDEFAULT.equals(checksumalgo);
			case EdcPackage.ALIAS_LIST_TYPE3__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case EdcPackage.ALIAS_LIST_TYPE3__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.ALIAS_LIST_TYPE3__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.ALIAS_LIST_TYPE3__ISHIDDEN:
				return ISHIDDEN_EDEFAULT == null ? ishidden != null : !ISHIDDEN_EDEFAULT.equals(ishidden);
			case EdcPackage.ALIAS_LIST_TYPE3__ISLANGHIDDEN:
				return ISLANGHIDDEN_EDEFAULT == null ? islanghidden != null : !ISLANGHIDDEN_EDEFAULT.equals(islanghidden);
			case EdcPackage.ALIAS_LIST_TYPE3__OSCMODEIDREF:
				return isSetOscmodeidref();
			case EdcPackage.ALIAS_LIST_TYPE3__WHEN:
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
		result.append(", ishidden: ");
		result.append(ishidden);
		result.append(", islanghidden: ");
		result.append(islanghidden);
		result.append(", oscmodeidref: ");
		if (oscmodeidrefESet) result.append(oscmodeidref); else result.append("<unset>");
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //AliasListType3Impl
