/**
 */
package hu.modembed.model.abstraction.types.impl;

import hu.modembed.model.abstraction.types.PointerTypeDefinition;
import hu.modembed.model.abstraction.types.TypeDefinition;
import hu.modembed.model.abstraction.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.types.impl.PointerTypeDefinitionImpl#getPointerType <em>Pointer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerTypeDefinitionImpl extends CompositeTypeDefinitionImpl implements PointerTypeDefinition {
	/**
	 * The cached value of the '{@link #getPointerType() <em>Pointer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition pointerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.POINTER_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getPointerType() {
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointerType(TypeDefinition newPointerType, NotificationChain msgs) {
		TypeDefinition oldPointerType = pointerType;
		pointerType = newPointerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE, oldPointerType, newPointerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointerType(TypeDefinition newPointerType) {
		if (newPointerType != pointerType) {
			NotificationChain msgs = null;
			if (pointerType != null)
				msgs = ((InternalEObject)pointerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE, null, msgs);
			if (newPointerType != null)
				msgs = ((InternalEObject)newPointerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE, null, msgs);
			msgs = basicSetPointerType(newPointerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE, newPointerType, newPointerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE:
				return basicSetPointerType(null, msgs);
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
			case TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE:
				return getPointerType();
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
			case TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE:
				setPointerType((TypeDefinition)newValue);
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
			case TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE:
				setPointerType((TypeDefinition)null);
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
			case TypesPackage.POINTER_TYPE_DEFINITION__POINTER_TYPE:
				return pointerType != null;
		}
		return super.eIsSet(featureID);
	}

} //PointerTypeDefinitionImpl
