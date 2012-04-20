/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.impl;

import hu.e.compiler.list.ListPackage;
import hu.e.compiler.list.ScriptStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.compiler.list.impl.ScriptStepImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptStepImpl extends ProgramStepImpl implements ScriptStep {
	/**
	 * The default value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected String execute = EXECUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListPackage.Literals.SCRIPT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(String newExecute) {
		String oldExecute = execute;
		execute = newExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.SCRIPT_STEP__EXECUTE, oldExecute, execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListPackage.SCRIPT_STEP__EXECUTE:
				return getExecute();
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
			case ListPackage.SCRIPT_STEP__EXECUTE:
				setExecute((String)newValue);
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
			case ListPackage.SCRIPT_STEP__EXECUTE:
				setExecute(EXECUTE_EDEFAULT);
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
			case ListPackage.SCRIPT_STEP__EXECUTE:
				return EXECUTE_EDEFAULT == null ? execute != null : !EXECUTE_EDEFAULT.equals(execute);
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
		result.append(" (execute: ");
		result.append(execute);
		result.append(')');
		return result.toString();
	}

} //ScriptStepImpl
