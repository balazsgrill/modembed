/**
 */
package hu.modembed.model.modembed.structured.impl;

import hu.modembed.model.modembed.structured.ConditionalOperation;
import hu.modembed.model.modembed.structured.Operation;
import hu.modembed.model.modembed.structured.StructuredPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalOperationImpl extends OperationImpl implements ConditionalOperation {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected hu.modembed.model.modembed.infrastructure.expressions.Expression condition;

	/**
	 * The cached value of the '{@link #getTrueBranch() <em>True Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation trueBranch;

	/**
	 * The cached value of the '{@link #getFalseBranch() <em>False Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseBranch()
	 * @generated
	 * @ordered
	 */
	protected Operation falseBranch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredPackage.Literals.CONDITIONAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.modembed.model.modembed.infrastructure.expressions.Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(hu.modembed.model.modembed.infrastructure.expressions.Expression newCondition, NotificationChain msgs) {
		hu.modembed.model.modembed.infrastructure.expressions.Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(hu.modembed.model.modembed.infrastructure.expressions.Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getTrueBranch() {
		return trueBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueBranch(Operation newTrueBranch, NotificationChain msgs) {
		Operation oldTrueBranch = trueBranch;
		trueBranch = newTrueBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH, oldTrueBranch, newTrueBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueBranch(Operation newTrueBranch) {
		if (newTrueBranch != trueBranch) {
			NotificationChain msgs = null;
			if (trueBranch != null)
				msgs = ((InternalEObject)trueBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH, null, msgs);
			if (newTrueBranch != null)
				msgs = ((InternalEObject)newTrueBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH, null, msgs);
			msgs = basicSetTrueBranch(newTrueBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH, newTrueBranch, newTrueBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getFalseBranch() {
		return falseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalseBranch(Operation newFalseBranch, NotificationChain msgs) {
		Operation oldFalseBranch = falseBranch;
		falseBranch = newFalseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH, oldFalseBranch, newFalseBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseBranch(Operation newFalseBranch) {
		if (newFalseBranch != falseBranch) {
			NotificationChain msgs = null;
			if (falseBranch != null)
				msgs = ((InternalEObject)falseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH, null, msgs);
			if (newFalseBranch != null)
				msgs = ((InternalEObject)newFalseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH, null, msgs);
			msgs = basicSetFalseBranch(newFalseBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH, newFalseBranch, newFalseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredPackage.CONDITIONAL_OPERATION__CONDITION:
				return basicSetCondition(null, msgs);
			case StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH:
				return basicSetTrueBranch(null, msgs);
			case StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH:
				return basicSetFalseBranch(null, msgs);
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
			case StructuredPackage.CONDITIONAL_OPERATION__CONDITION:
				return getCondition();
			case StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH:
				return getTrueBranch();
			case StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH:
				return getFalseBranch();
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
			case StructuredPackage.CONDITIONAL_OPERATION__CONDITION:
				setCondition((hu.modembed.model.modembed.infrastructure.expressions.Expression)newValue);
				return;
			case StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH:
				setTrueBranch((Operation)newValue);
				return;
			case StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH:
				setFalseBranch((Operation)newValue);
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
			case StructuredPackage.CONDITIONAL_OPERATION__CONDITION:
				setCondition((hu.modembed.model.modembed.infrastructure.expressions.Expression)null);
				return;
			case StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH:
				setTrueBranch((Operation)null);
				return;
			case StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH:
				setFalseBranch((Operation)null);
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
			case StructuredPackage.CONDITIONAL_OPERATION__CONDITION:
				return condition != null;
			case StructuredPackage.CONDITIONAL_OPERATION__TRUE_BRANCH:
				return trueBranch != null;
			case StructuredPackage.CONDITIONAL_OPERATION__FALSE_BRANCH:
				return falseBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalOperationImpl
