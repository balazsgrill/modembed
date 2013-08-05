/**
 */
package hu.modembed.model.modembed.structured.impl;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.impl.NamedElementImpl;

import hu.modembed.model.modembed.structured.Operation;
import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredPackage;
import hu.modembed.model.modembed.structured.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredFunctionImpl extends NamedElementImpl implements StructuredFunction {
	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition resultType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> parameters;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Operation implementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredPackage.Literals.STRUCTURED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultType(TypeDefinition newResultType, NotificationChain msgs) {
		TypeDefinition oldResultType = resultType;
		resultType = newResultType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE, oldResultType, newResultType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(TypeDefinition newResultType) {
		if (newResultType != resultType) {
			NotificationChain msgs = null;
			if (resultType != null)
				msgs = ((InternalEObject)resultType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE, null, msgs);
			if (newResultType != null)
				msgs = ((InternalEObject)newResultType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE, null, msgs);
			msgs = basicSetResultType(newResultType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE, newResultType, newResultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(Operation newImplementation, NotificationChain msgs) {
		Operation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(Operation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION, null, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION, null, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE:
				return basicSetResultType(null, msgs);
			case StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
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
			case StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE:
				return getResultType();
			case StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS:
				return getParameters();
			case StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION:
				return getImplementation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE:
				setResultType((TypeDefinition)newValue);
				return;
			case StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION:
				setImplementation((Operation)newValue);
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
			case StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE:
				setResultType((TypeDefinition)null);
				return;
			case StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION:
				setImplementation((Operation)null);
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
			case StructuredPackage.STRUCTURED_FUNCTION__RESULT_TYPE:
				return resultType != null;
			case StructuredPackage.STRUCTURED_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StructuredPackage.STRUCTURED_FUNCTION__IMPLEMENTATION:
				return implementation != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredFunctionImpl
