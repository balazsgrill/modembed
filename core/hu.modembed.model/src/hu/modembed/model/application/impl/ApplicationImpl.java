/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.impl;

import hu.modembed.model.application.Application;
import hu.modembed.model.application.ApplicationPackage;
import hu.modembed.model.application.Component;
import hu.modembed.model.application.Port;

import hu.modembed.model.application.interface_.Operation;

import hu.modembed.model.core.impl.PackagedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.application.impl.ApplicationImpl#getMainComp <em>Main Comp</em>}</li>
 *   <li>{@link hu.modembed.model.application.impl.ApplicationImpl#getMainPort <em>Main Port</em>}</li>
 *   <li>{@link hu.modembed.model.application.impl.ApplicationImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends PackagedElementImpl implements Application {
	/**
	 * The cached value of the '{@link #getMainComp() <em>Main Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainComp()
	 * @generated
	 * @ordered
	 */
	protected Component mainComp;

	/**
	 * The cached value of the '{@link #getMainPort() <em>Main Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPort()
	 * @generated
	 * @ordered
	 */
	protected Port mainPort;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Operation main;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getMainComp() {
		if (mainComp != null && mainComp.eIsProxy()) {
			InternalEObject oldMainComp = (InternalEObject)mainComp;
			mainComp = (Component)eResolveProxy(oldMainComp);
			if (mainComp != oldMainComp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__MAIN_COMP, oldMainComp, mainComp));
			}
		}
		return mainComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetMainComp() {
		return mainComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainComp(Component newMainComp) {
		Component oldMainComp = mainComp;
		mainComp = newMainComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__MAIN_COMP, oldMainComp, mainComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getMainPort() {
		if (mainPort != null && mainPort.eIsProxy()) {
			InternalEObject oldMainPort = (InternalEObject)mainPort;
			mainPort = (Port)eResolveProxy(oldMainPort);
			if (mainPort != oldMainPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__MAIN_PORT, oldMainPort, mainPort));
			}
		}
		return mainPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetMainPort() {
		return mainPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPort(Port newMainPort) {
		Port oldMainPort = mainPort;
		mainPort = newMainPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__MAIN_PORT, oldMainPort, mainPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMain() {
		if (main != null && main.eIsProxy()) {
			InternalEObject oldMain = (InternalEObject)main;
			main = (Operation)eResolveProxy(oldMain);
			if (main != oldMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__MAIN, oldMain, main));
			}
		}
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Operation newMain) {
		Operation oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION__MAIN_COMP:
				if (resolve) return getMainComp();
				return basicGetMainComp();
			case ApplicationPackage.APPLICATION__MAIN_PORT:
				if (resolve) return getMainPort();
				return basicGetMainPort();
			case ApplicationPackage.APPLICATION__MAIN:
				if (resolve) return getMain();
				return basicGetMain();
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
			case ApplicationPackage.APPLICATION__MAIN_COMP:
				setMainComp((Component)newValue);
				return;
			case ApplicationPackage.APPLICATION__MAIN_PORT:
				setMainPort((Port)newValue);
				return;
			case ApplicationPackage.APPLICATION__MAIN:
				setMain((Operation)newValue);
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
			case ApplicationPackage.APPLICATION__MAIN_COMP:
				setMainComp((Component)null);
				return;
			case ApplicationPackage.APPLICATION__MAIN_PORT:
				setMainPort((Port)null);
				return;
			case ApplicationPackage.APPLICATION__MAIN:
				setMain((Operation)null);
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
			case ApplicationPackage.APPLICATION__MAIN_COMP:
				return mainComp != null;
			case ApplicationPackage.APPLICATION__MAIN_PORT:
				return mainPort != null;
			case ApplicationPackage.APPLICATION__MAIN:
				return main != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
