/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform.impl;

import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl#getMemtype <em>Memtype</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationArgumentImpl extends NamedElementImpl implements OperationArgument {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

	/**
	 * The cached value of the '{@link #getMemtype() <em>Memtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtype()
	 * @generated
	 * @ordered
	 */
	protected MemoryType memtype;

	/**
	 * The default value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int INDIRECTION_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected int indirectionLevel = INDIRECTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.OPERATION_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeDefinition newType, NotificationChain msgs) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.OPERATION_ARGUMENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDefinition newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.OPERATION_ARGUMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.OPERATION_ARGUMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.OPERATION_ARGUMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType getMemtype() {
		if (memtype != null && memtype.eIsProxy()) {
			InternalEObject oldMemtype = (InternalEObject)memtype;
			memtype = (MemoryType)eResolveProxy(oldMemtype);
			if (memtype != oldMemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.OPERATION_ARGUMENT__MEMTYPE, oldMemtype, memtype));
			}
		}
		return memtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType basicGetMemtype() {
		return memtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemtype(MemoryType newMemtype) {
		MemoryType oldMemtype = memtype;
		memtype = newMemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.OPERATION_ARGUMENT__MEMTYPE, oldMemtype, memtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndirectionLevel() {
		return indirectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndirectionLevel(int newIndirectionLevel) {
		int oldIndirectionLevel = indirectionLevel;
		indirectionLevel = newIndirectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL, oldIndirectionLevel, indirectionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				return basicSetType(null, msgs);
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
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				return getType();
			case PlatformPackage.OPERATION_ARGUMENT__MEMTYPE:
				if (resolve) return getMemtype();
				return basicGetMemtype();
			case PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL:
				return getIndirectionLevel();
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
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				setType((TypeDefinition)newValue);
				return;
			case PlatformPackage.OPERATION_ARGUMENT__MEMTYPE:
				setMemtype((MemoryType)newValue);
				return;
			case PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL:
				setIndirectionLevel((Integer)newValue);
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
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				setType((TypeDefinition)null);
				return;
			case PlatformPackage.OPERATION_ARGUMENT__MEMTYPE:
				setMemtype((MemoryType)null);
				return;
			case PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL:
				setIndirectionLevel(INDIRECTION_LEVEL_EDEFAULT);
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
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				return type != null;
			case PlatformPackage.OPERATION_ARGUMENT__MEMTYPE:
				return memtype != null;
			case PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL:
				return indirectionLevel != INDIRECTION_LEVEL_EDEFAULT;
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
		result.append(" (indirectionLevel: ");
		result.append(indirectionLevel);
		result.append(')');
		return result.toString();
	}

} //OperationArgumentImpl
