/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AdjustPointType;
import crownking.edc.DCRFieldDefType;
import crownking.edc.DCRModeType;
import crownking.edc.EdcPackage;

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
 * An implementation of the model object '<em><b>DCR Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DCRModeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRModeTypeImpl#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRModeTypeImpl#getDCRFieldDef <em>DCR Field Def</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRModeTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCRModeTypeImpl extends EObjectImpl implements DCRModeType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected DCRModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDCRModeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdcPackage.DCR_MODE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjustPointType> getAdjustPoint() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRModeType_AdjustPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCRFieldDefType> getDCRFieldDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRModeType_DCRFieldDef());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_MODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DCR_MODE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_MODE_TYPE__ADJUST_POINT:
				return ((InternalEList<?>)getAdjustPoint()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_MODE_TYPE__DCR_FIELD_DEF:
				return ((InternalEList<?>)getDCRFieldDef()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.DCR_MODE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.DCR_MODE_TYPE__ADJUST_POINT:
				return getAdjustPoint();
			case EdcPackage.DCR_MODE_TYPE__DCR_FIELD_DEF:
				return getDCRFieldDef();
			case EdcPackage.DCR_MODE_TYPE__ID:
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
			case EdcPackage.DCR_MODE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.DCR_MODE_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				getAdjustPoint().addAll((Collection<? extends AdjustPointType>)newValue);
				return;
			case EdcPackage.DCR_MODE_TYPE__DCR_FIELD_DEF:
				getDCRFieldDef().clear();
				getDCRFieldDef().addAll((Collection<? extends DCRFieldDefType>)newValue);
				return;
			case EdcPackage.DCR_MODE_TYPE__ID:
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
			case EdcPackage.DCR_MODE_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.DCR_MODE_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				return;
			case EdcPackage.DCR_MODE_TYPE__DCR_FIELD_DEF:
				getDCRFieldDef().clear();
				return;
			case EdcPackage.DCR_MODE_TYPE__ID:
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
			case EdcPackage.DCR_MODE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdcPackage.DCR_MODE_TYPE__ADJUST_POINT:
				return !getAdjustPoint().isEmpty();
			case EdcPackage.DCR_MODE_TYPE__DCR_FIELD_DEF:
				return !getDCRFieldDef().isEmpty();
			case EdcPackage.DCR_MODE_TYPE__ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DCRModeTypeImpl
