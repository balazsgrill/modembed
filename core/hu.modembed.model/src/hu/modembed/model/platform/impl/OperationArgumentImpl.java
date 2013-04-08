/**
 */
package hu.modembed.model.platform.impl;

import hu.modembed.model.core.impl.NamedElementImpl;

import hu.modembed.model.emodel.types.TypeDefinition;
import hu.modembed.model.platform.OperationArgument;
import hu.modembed.model.platform.PlatformPackage;

import org.eclipse.emf.common.notify.Notification;
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
 *   <li>{@link hu.modembed.model.platform.impl.OperationArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.platform.impl.OperationArgumentImpl#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationArgumentImpl extends NamedElementImpl implements OperationArgument {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;
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
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDefinition)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.OPERATION_ARGUMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDefinition newType) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.OPERATION_ARGUMENT__TYPE, oldType, type));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.OPERATION_ARGUMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
