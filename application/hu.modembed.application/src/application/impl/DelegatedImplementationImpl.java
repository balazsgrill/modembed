/**
 */
package application.impl;

import application.ApplicationInterface;
import application.ApplicationPackage;
import application.DelegatedImplementation;
import application.InterfaceOfModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegated Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.DelegatedImplementationImpl#getOuterInterface <em>Outer Interface</em>}</li>
 *   <li>{@link application.impl.DelegatedImplementationImpl#getInnerInterface <em>Inner Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegatedImplementationImpl extends InterfaceImplementationMappingImpl implements DelegatedImplementation {
	/**
	 * The cached value of the '{@link #getOuterInterface() <em>Outer Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterInterface()
	 * @generated
	 * @ordered
	 */
	protected ApplicationInterface outerInterface;

	/**
	 * The cached value of the '{@link #getInnerInterface() <em>Inner Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceOfModule innerInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegatedImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.DELEGATED_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInterface getOuterInterface() {
		if (outerInterface != null && outerInterface.eIsProxy()) {
			InternalEObject oldOuterInterface = (InternalEObject)outerInterface;
			outerInterface = (ApplicationInterface)eResolveProxy(oldOuterInterface);
			if (outerInterface != oldOuterInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE, oldOuterInterface, outerInterface));
			}
		}
		return outerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInterface basicGetOuterInterface() {
		return outerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterInterface(ApplicationInterface newOuterInterface) {
		ApplicationInterface oldOuterInterface = outerInterface;
		outerInterface = newOuterInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE, oldOuterInterface, outerInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfModule getInnerInterface() {
		return innerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerInterface(InterfaceOfModule newInnerInterface, NotificationChain msgs) {
		InterfaceOfModule oldInnerInterface = innerInterface;
		innerInterface = newInnerInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE, oldInnerInterface, newInnerInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerInterface(InterfaceOfModule newInnerInterface) {
		if (newInnerInterface != innerInterface) {
			NotificationChain msgs = null;
			if (innerInterface != null)
				msgs = ((InternalEObject)innerInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE, null, msgs);
			if (newInnerInterface != null)
				msgs = ((InternalEObject)newInnerInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE, null, msgs);
			msgs = basicSetInnerInterface(newInnerInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE, newInnerInterface, newInnerInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE:
				return basicSetInnerInterface(null, msgs);
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
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE:
				if (resolve) return getOuterInterface();
				return basicGetOuterInterface();
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE:
				return getInnerInterface();
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
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE:
				setOuterInterface((ApplicationInterface)newValue);
				return;
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE:
				setInnerInterface((InterfaceOfModule)newValue);
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
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE:
				setOuterInterface((ApplicationInterface)null);
				return;
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE:
				setInnerInterface((InterfaceOfModule)null);
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
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__OUTER_INTERFACE:
				return outerInterface != null;
			case ApplicationPackage.DELEGATED_IMPLEMENTATION__INNER_INTERFACE:
				return innerInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegatedImplementationImpl
