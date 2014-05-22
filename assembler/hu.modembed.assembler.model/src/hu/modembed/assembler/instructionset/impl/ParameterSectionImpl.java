/**
 */
package hu.modembed.assembler.instructionset.impl;

import hu.modembed.assembler.instructionset.InstructionParameter;
import hu.modembed.assembler.instructionset.InstructionsetPackage;
import hu.modembed.assembler.instructionset.ParameterSection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.impl.ParameterSectionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSectionImpl extends InstructionSectionImpl implements ParameterSection {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected InstructionParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionsetPackage.Literals.PARAMETER_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (InstructionParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionsetPackage.PARAMETER_SECTION__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(InstructionParameter newParameter) {
		InstructionParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionsetPackage.PARAMETER_SECTION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstructionsetPackage.PARAMETER_SECTION__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case InstructionsetPackage.PARAMETER_SECTION__PARAMETER:
				setParameter((InstructionParameter)newValue);
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
			case InstructionsetPackage.PARAMETER_SECTION__PARAMETER:
				setParameter((InstructionParameter)null);
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
			case InstructionsetPackage.PARAMETER_SECTION__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterSectionImpl
