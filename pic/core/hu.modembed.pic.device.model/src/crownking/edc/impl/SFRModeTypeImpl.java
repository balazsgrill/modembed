/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AdjustPointType;
import crownking.edc.EdcPackage;
import crownking.edc.SFRFieldDefType;
import crownking.edc.SFRModeType;

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
 * An implementation of the model object '<em><b>SFR Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.SFRModeTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeTypeImpl#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeTypeImpl#getSFRFieldDef <em>SFR Field Def</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SFRModeTypeImpl extends EObjectImpl implements SFRModeType {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFRModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getSFRModeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.SFR_MODE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(EdcPackage.eINSTANCE.getSFRModeType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjustPointType> getAdjustPoint() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRModeType_AdjustPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRFieldDefType> getSFRFieldDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRModeType_SFRFieldDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_MODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.SFR_MODE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_MODE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_MODE_TYPE__ADJUST_POINT:
				return ((InternalEList<?>)getAdjustPoint()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_MODE_TYPE__SFR_FIELD_DEF:
				return ((InternalEList<?>)getSFRFieldDef()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.SFR_MODE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.SFR_MODE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.SFR_MODE_TYPE__ADJUST_POINT:
				return getAdjustPoint();
			case EdcPackage.SFR_MODE_TYPE__SFR_FIELD_DEF:
				return getSFRFieldDef();
			case EdcPackage.SFR_MODE_TYPE__ID:
				return getId();
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
			case EdcPackage.SFR_MODE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.SFR_MODE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.SFR_MODE_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				getAdjustPoint().addAll((Collection<? extends AdjustPointType>)newValue);
				return;
			case EdcPackage.SFR_MODE_TYPE__SFR_FIELD_DEF:
				getSFRFieldDef().clear();
				getSFRFieldDef().addAll((Collection<? extends SFRFieldDefType>)newValue);
				return;
			case EdcPackage.SFR_MODE_TYPE__ID:
				setId((String)newValue);
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
			case EdcPackage.SFR_MODE_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.SFR_MODE_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.SFR_MODE_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				return;
			case EdcPackage.SFR_MODE_TYPE__SFR_FIELD_DEF:
				getSFRFieldDef().clear();
				return;
			case EdcPackage.SFR_MODE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case EdcPackage.SFR_MODE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.SFR_MODE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case EdcPackage.SFR_MODE_TYPE__ADJUST_POINT:
				return !getAdjustPoint().isEmpty();
			case EdcPackage.SFR_MODE_TYPE__SFR_FIELD_DEF:
				return !getSFRFieldDef().isEmpty();
			case EdcPackage.SFR_MODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SFRModeTypeImpl
