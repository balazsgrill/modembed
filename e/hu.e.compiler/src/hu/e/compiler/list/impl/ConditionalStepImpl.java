/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.impl;

import hu.e.compiler.list.ConditionalStep;
import hu.e.compiler.list.ListPackage;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ScriptStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.compiler.list.impl.ConditionalStepImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.e.compiler.list.impl.ConditionalStepImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link hu.e.compiler.list.impl.ConditionalStepImpl#getFail <em>Fail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalStepImpl extends ProgramStepImpl implements ConditionalStep {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ScriptStep condition;

	/**
	 * The cached value of the '{@link #getSuccess() <em>Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccess()
	 * @generated
	 * @ordered
	 */
	protected ProgramStep success;

	/**
	 * The cached value of the '{@link #getFail() <em>Fail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFail()
	 * @generated
	 * @ordered
	 */
	protected ProgramStep fail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListPackage.Literals.CONDITIONAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptStep getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (ScriptStep)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ListPackage.CONDITIONAL_STEP__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptStep basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ScriptStep newCondition) {
		ScriptStep oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.CONDITIONAL_STEP__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramStep getSuccess() {
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccess(ProgramStep newSuccess, NotificationChain msgs) {
		ProgramStep oldSuccess = success;
		success = newSuccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListPackage.CONDITIONAL_STEP__SUCCESS, oldSuccess, newSuccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(ProgramStep newSuccess) {
		if (newSuccess != success) {
			NotificationChain msgs = null;
			if (success != null)
				msgs = ((InternalEObject)success).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListPackage.CONDITIONAL_STEP__SUCCESS, null, msgs);
			if (newSuccess != null)
				msgs = ((InternalEObject)newSuccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListPackage.CONDITIONAL_STEP__SUCCESS, null, msgs);
			msgs = basicSetSuccess(newSuccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.CONDITIONAL_STEP__SUCCESS, newSuccess, newSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramStep getFail() {
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFail(ProgramStep newFail, NotificationChain msgs) {
		ProgramStep oldFail = fail;
		fail = newFail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListPackage.CONDITIONAL_STEP__FAIL, oldFail, newFail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFail(ProgramStep newFail) {
		if (newFail != fail) {
			NotificationChain msgs = null;
			if (fail != null)
				msgs = ((InternalEObject)fail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListPackage.CONDITIONAL_STEP__FAIL, null, msgs);
			if (newFail != null)
				msgs = ((InternalEObject)newFail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListPackage.CONDITIONAL_STEP__FAIL, null, msgs);
			msgs = basicSetFail(newFail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ListPackage.CONDITIONAL_STEP__FAIL, newFail, newFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListPackage.CONDITIONAL_STEP__SUCCESS:
				return basicSetSuccess(null, msgs);
			case ListPackage.CONDITIONAL_STEP__FAIL:
				return basicSetFail(null, msgs);
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
			case ListPackage.CONDITIONAL_STEP__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case ListPackage.CONDITIONAL_STEP__SUCCESS:
				return getSuccess();
			case ListPackage.CONDITIONAL_STEP__FAIL:
				return getFail();
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
			case ListPackage.CONDITIONAL_STEP__CONDITION:
				setCondition((ScriptStep)newValue);
				return;
			case ListPackage.CONDITIONAL_STEP__SUCCESS:
				setSuccess((ProgramStep)newValue);
				return;
			case ListPackage.CONDITIONAL_STEP__FAIL:
				setFail((ProgramStep)newValue);
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
			case ListPackage.CONDITIONAL_STEP__CONDITION:
				setCondition((ScriptStep)null);
				return;
			case ListPackage.CONDITIONAL_STEP__SUCCESS:
				setSuccess((ProgramStep)null);
				return;
			case ListPackage.CONDITIONAL_STEP__FAIL:
				setFail((ProgramStep)null);
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
			case ListPackage.CONDITIONAL_STEP__CONDITION:
				return condition != null;
			case ListPackage.CONDITIONAL_STEP__SUCCESS:
				return success != null;
			case ListPackage.CONDITIONAL_STEP__FAIL:
				return fail != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStepImpl
