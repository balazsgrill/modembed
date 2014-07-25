/**
 */
package application.impl;

import application.ApplicationPackage;
import application.InterfaceOfModule;
import application.MappedImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.MappedImplementationImpl#getImplementedInterface <em>Implemented Interface</em>}</li>
 *   <li>{@link application.impl.MappedImplementationImpl#getExpectedInterface <em>Expected Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedImplementationImpl extends InterfaceImplementationMappingImpl implements MappedImplementation {
	/**
	 * The cached value of the '{@link #getImplementedInterface() <em>Implemented Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceOfModule implementedInterface;

	/**
	 * The cached value of the '{@link #getExpectedInterface() <em>Expected Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceOfModule expectedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MAPPED_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfModule getImplementedInterface() {
		return implementedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementedInterface(InterfaceOfModule newImplementedInterface, NotificationChain msgs) {
		InterfaceOfModule oldImplementedInterface = implementedInterface;
		implementedInterface = newImplementedInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE, oldImplementedInterface, newImplementedInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedInterface(InterfaceOfModule newImplementedInterface) {
		if (newImplementedInterface != implementedInterface) {
			NotificationChain msgs = null;
			if (implementedInterface != null)
				msgs = ((InternalEObject)implementedInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE, null, msgs);
			if (newImplementedInterface != null)
				msgs = ((InternalEObject)newImplementedInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE, null, msgs);
			msgs = basicSetImplementedInterface(newImplementedInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE, newImplementedInterface, newImplementedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfModule getExpectedInterface() {
		return expectedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedInterface(InterfaceOfModule newExpectedInterface, NotificationChain msgs) {
		InterfaceOfModule oldExpectedInterface = expectedInterface;
		expectedInterface = newExpectedInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE, oldExpectedInterface, newExpectedInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedInterface(InterfaceOfModule newExpectedInterface) {
		if (newExpectedInterface != expectedInterface) {
			NotificationChain msgs = null;
			if (expectedInterface != null)
				msgs = ((InternalEObject)expectedInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE, null, msgs);
			if (newExpectedInterface != null)
				msgs = ((InternalEObject)newExpectedInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE, null, msgs);
			msgs = basicSetExpectedInterface(newExpectedInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE, newExpectedInterface, newExpectedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				return basicSetImplementedInterface(null, msgs);
			case ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE:
				return basicSetExpectedInterface(null, msgs);
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
			case ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				return getImplementedInterface();
			case ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE:
				return getExpectedInterface();
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
			case ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				setImplementedInterface((InterfaceOfModule)newValue);
				return;
			case ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE:
				setExpectedInterface((InterfaceOfModule)newValue);
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
			case ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				setImplementedInterface((InterfaceOfModule)null);
				return;
			case ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE:
				setExpectedInterface((InterfaceOfModule)null);
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
			case ApplicationPackage.MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				return implementedInterface != null;
			case ApplicationPackage.MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE:
				return expectedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //MappedImplementationImpl
