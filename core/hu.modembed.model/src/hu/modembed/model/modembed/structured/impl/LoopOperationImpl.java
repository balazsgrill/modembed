/**
 */
package hu.modembed.model.modembed.structured.impl;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;
import hu.modembed.model.modembed.structured.LoopOperation;
import hu.modembed.model.modembed.structured.Operation;
import hu.modembed.model.modembed.structured.StructuredPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.LoopOperationImpl#getEntryCondition <em>Entry Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.LoopOperationImpl#getExitCondition <em>Exit Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.LoopOperationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopOperationImpl extends OperationImpl implements LoopOperation {
	/**
	 * The cached value of the '{@link #getEntryCondition() <em>Entry Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression entryCondition;

	/**
	 * The cached value of the '{@link #getExitCondition() <em>Exit Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression exitCondition;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Operation body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredPackage.Literals.LOOP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEntryCondition() {
		return entryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryCondition(Expression newEntryCondition, NotificationChain msgs) {
		Expression oldEntryCondition = entryCondition;
		entryCondition = newEntryCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION, oldEntryCondition, newEntryCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryCondition(Expression newEntryCondition) {
		if (newEntryCondition != entryCondition) {
			NotificationChain msgs = null;
			if (entryCondition != null)
				msgs = ((InternalEObject)entryCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION, null, msgs);
			if (newEntryCondition != null)
				msgs = ((InternalEObject)newEntryCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION, null, msgs);
			msgs = basicSetEntryCondition(newEntryCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION, newEntryCondition, newEntryCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExitCondition() {
		return exitCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitCondition(Expression newExitCondition, NotificationChain msgs) {
		Expression oldExitCondition = exitCondition;
		exitCondition = newExitCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__EXIT_CONDITION, oldExitCondition, newExitCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitCondition(Expression newExitCondition) {
		if (newExitCondition != exitCondition) {
			NotificationChain msgs = null;
			if (exitCondition != null)
				msgs = ((InternalEObject)exitCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__EXIT_CONDITION, null, msgs);
			if (newExitCondition != null)
				msgs = ((InternalEObject)newExitCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__EXIT_CONDITION, null, msgs);
			msgs = basicSetExitCondition(newExitCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__EXIT_CONDITION, newExitCondition, newExitCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Operation newBody, NotificationChain msgs) {
		Operation oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Operation newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.LOOP_OPERATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.LOOP_OPERATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
				return basicSetEntryCondition(null, msgs);
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
				return basicSetExitCondition(null, msgs);
			case StructuredPackage.LOOP_OPERATION__BODY:
				return basicSetBody(null, msgs);
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
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
				return getEntryCondition();
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
				return getExitCondition();
			case StructuredPackage.LOOP_OPERATION__BODY:
				return getBody();
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
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
				setEntryCondition((Expression)newValue);
				return;
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
				setExitCondition((Expression)newValue);
				return;
			case StructuredPackage.LOOP_OPERATION__BODY:
				setBody((Operation)newValue);
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
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
				setEntryCondition((Expression)null);
				return;
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
				setExitCondition((Expression)null);
				return;
			case StructuredPackage.LOOP_OPERATION__BODY:
				setBody((Operation)null);
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
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
				return entryCondition != null;
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
				return exitCondition != null;
			case StructuredPackage.LOOP_OPERATION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopOperationImpl
