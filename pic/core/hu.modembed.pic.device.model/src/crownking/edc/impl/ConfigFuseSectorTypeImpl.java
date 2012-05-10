/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.ConfigFuseSectorType;
import crownking.edc.DCRDefType;
import crownking.edc.EdcPackage;

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
 * An implementation of the model object '<em><b>Config Fuse Sector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.ConfigFuseSectorTypeImpl#getDCRDef <em>DCR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.ConfigFuseSectorTypeImpl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.ConfigFuseSectorTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.ConfigFuseSectorTypeImpl#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigFuseSectorTypeImpl extends EObjectImpl implements ConfigFuseSectorType {
	/**
	 * The cached value of the '{@link #getDCRDef() <em>DCR Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCRDef()
	 * @generated
	 * @ordered
	 */
	protected EList<DCRDefType> dCRDef;

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
	 * The default value of the '{@link #getRegionid() <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionid()
	 * @generated
	 * @ordered
	 */
	protected static final String REGIONID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionid() <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionid()
	 * @generated
	 * @ordered
	 */
	protected String regionid = REGIONID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigFuseSectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getConfigFuseSectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCRDefType> getDCRDef() {
		if (dCRDef == null) {
			dCRDef = new EObjectContainmentEList<DCRDefType>(DCRDefType.class, this, EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF);
		}
		return dCRDef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CONFIG_FUSE_SECTOR_TYPE__BEGINADDR, oldBeginaddr, beginaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CONFIG_FUSE_SECTOR_TYPE__ENDADDR, oldEndaddr, endaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionid() {
		return regionid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionid(String newRegionid) {
		String oldRegionid = regionid;
		regionid = newRegionid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.CONFIG_FUSE_SECTOR_TYPE__REGIONID, oldRegionid, regionid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF:
				return ((InternalEList<?>)getDCRDef()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF:
				return getDCRDef();
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__ENDADDR:
				return getEndaddr();
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__REGIONID:
				return getRegionid();
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
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF:
				getDCRDef().clear();
				getDCRDef().addAll((Collection<? extends DCRDefType>)newValue);
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__REGIONID:
				setRegionid((String)newValue);
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
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF:
				getDCRDef().clear();
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__REGIONID:
				setRegionid(REGIONID_EDEFAULT);
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
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__DCR_DEF:
				return dCRDef != null && !dCRDef.isEmpty();
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.CONFIG_FUSE_SECTOR_TYPE__REGIONID:
				return REGIONID_EDEFAULT == null ? regionid != null : !REGIONID_EDEFAULT.equals(regionid);
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
		result.append(" (beginaddr: ");
		result.append(beginaddr);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(", regionid: ");
		result.append(regionid);
		result.append(')');
		return result.toString();
	}

} //ConfigFuseSectorTypeImpl
