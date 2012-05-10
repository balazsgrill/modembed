/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DataSpaceType;
import crownking.edc.EdcPackage;
import crownking.edc.RegardlessOfModeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DataSpaceTypeImpl#getRegardlessOfMode <em>Regardless Of Mode</em>}</li>
 *   <li>{@link crownking.edc.impl.DataSpaceTypeImpl#getTraditionalModeOnly <em>Traditional Mode Only</em>}</li>
 *   <li>{@link crownking.edc.impl.DataSpaceTypeImpl#getExtendedModeOnly <em>Extended Mode Only</em>}</li>
 *   <li>{@link crownking.edc.impl.DataSpaceTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSpaceTypeImpl extends EObjectImpl implements DataSpaceType {
	/**
	 * The cached value of the '{@link #getRegardlessOfMode() <em>Regardless Of Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegardlessOfMode()
	 * @generated
	 * @ordered
	 */
	protected RegardlessOfModeType regardlessOfMode;

	/**
	 * The default value of the '{@link #getTraditionalModeOnly() <em>Traditional Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraditionalModeOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADITIONAL_MODE_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraditionalModeOnly() <em>Traditional Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraditionalModeOnly()
	 * @generated
	 * @ordered
	 */
	protected String traditionalModeOnly = TRADITIONAL_MODE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedModeOnly() <em>Extended Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedModeOnly()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_MODE_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedModeOnly() <em>Extended Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedModeOnly()
	 * @generated
	 * @ordered
	 */
	protected String extendedModeOnly = EXTENDED_MODE_ONLY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDataSpaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegardlessOfModeType getRegardlessOfMode() {
		return regardlessOfMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegardlessOfMode(RegardlessOfModeType newRegardlessOfMode, NotificationChain msgs) {
		RegardlessOfModeType oldRegardlessOfMode = regardlessOfMode;
		regardlessOfMode = newRegardlessOfMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE, oldRegardlessOfMode, newRegardlessOfMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegardlessOfMode(RegardlessOfModeType newRegardlessOfMode) {
		if (newRegardlessOfMode != regardlessOfMode) {
			NotificationChain msgs = null;
			if (regardlessOfMode != null)
				msgs = ((InternalEObject)regardlessOfMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE, null, msgs);
			if (newRegardlessOfMode != null)
				msgs = ((InternalEObject)newRegardlessOfMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE, null, msgs);
			msgs = basicSetRegardlessOfMode(newRegardlessOfMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE, newRegardlessOfMode, newRegardlessOfMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraditionalModeOnly() {
		return traditionalModeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraditionalModeOnly(String newTraditionalModeOnly) {
		String oldTraditionalModeOnly = traditionalModeOnly;
		traditionalModeOnly = newTraditionalModeOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY, oldTraditionalModeOnly, traditionalModeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedModeOnly() {
		return extendedModeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedModeOnly(String newExtendedModeOnly) {
		String oldExtendedModeOnly = extendedModeOnly;
		extendedModeOnly = newExtendedModeOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_SPACE_TYPE__EXTENDED_MODE_ONLY, oldExtendedModeOnly, extendedModeOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_SPACE_TYPE__ENDADDR, oldEndaddr, endaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE:
				return basicSetRegardlessOfMode(null, msgs);
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
			case EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE:
				return getRegardlessOfMode();
			case EdcPackage.DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY:
				return getTraditionalModeOnly();
			case EdcPackage.DATA_SPACE_TYPE__EXTENDED_MODE_ONLY:
				return getExtendedModeOnly();
			case EdcPackage.DATA_SPACE_TYPE__ENDADDR:
				return getEndaddr();
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
			case EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE:
				setRegardlessOfMode((RegardlessOfModeType)newValue);
				return;
			case EdcPackage.DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY:
				setTraditionalModeOnly((String)newValue);
				return;
			case EdcPackage.DATA_SPACE_TYPE__EXTENDED_MODE_ONLY:
				setExtendedModeOnly((String)newValue);
				return;
			case EdcPackage.DATA_SPACE_TYPE__ENDADDR:
				setEndaddr((String)newValue);
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
			case EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE:
				setRegardlessOfMode((RegardlessOfModeType)null);
				return;
			case EdcPackage.DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY:
				setTraditionalModeOnly(TRADITIONAL_MODE_ONLY_EDEFAULT);
				return;
			case EdcPackage.DATA_SPACE_TYPE__EXTENDED_MODE_ONLY:
				setExtendedModeOnly(EXTENDED_MODE_ONLY_EDEFAULT);
				return;
			case EdcPackage.DATA_SPACE_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
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
			case EdcPackage.DATA_SPACE_TYPE__REGARDLESS_OF_MODE:
				return regardlessOfMode != null;
			case EdcPackage.DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY:
				return TRADITIONAL_MODE_ONLY_EDEFAULT == null ? traditionalModeOnly != null : !TRADITIONAL_MODE_ONLY_EDEFAULT.equals(traditionalModeOnly);
			case EdcPackage.DATA_SPACE_TYPE__EXTENDED_MODE_ONLY:
				return EXTENDED_MODE_ONLY_EDEFAULT == null ? extendedModeOnly != null : !EXTENDED_MODE_ONLY_EDEFAULT.equals(extendedModeOnly);
			case EdcPackage.DATA_SPACE_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
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
		result.append(" (traditionalModeOnly: ");
		result.append(traditionalModeOnly);
		result.append(", extendedModeOnly: ");
		result.append(extendedModeOnly);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(')');
		return result.toString();
	}

} //DataSpaceTypeImpl
