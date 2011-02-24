/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic.impl;

import modembedconfig.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pic.ConfigurationField;
import pic.PicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pic.impl.ConfigurationFieldImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link pic.impl.ConfigurationFieldImpl#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link pic.impl.ConfigurationFieldImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationFieldImpl extends EObjectImpl implements ConfigurationField {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The default value of the '{@link #getStartBit() <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBit()
	 * @generated
	 * @ordered
	 */
	protected static final int START_BIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartBit() <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBit()
	 * @generated
	 * @ordered
	 */
	protected int startBit = START_BIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicPackage.Literals.CONFIGURATION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicPackage.CONFIGURATION_FIELD__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_FIELD__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartBit() {
		return startBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBit(int newStartBit) {
		int oldStartBit = startBit;
		startBit = newStartBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_FIELD__START_BIT, oldStartBit, startBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_FIELD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicPackage.CONFIGURATION_FIELD__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case PicPackage.CONFIGURATION_FIELD__START_BIT:
				return getStartBit();
			case PicPackage.CONFIGURATION_FIELD__LENGTH:
				return getLength();
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
			case PicPackage.CONFIGURATION_FIELD__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case PicPackage.CONFIGURATION_FIELD__START_BIT:
				setStartBit((Integer)newValue);
				return;
			case PicPackage.CONFIGURATION_FIELD__LENGTH:
				setLength((Integer)newValue);
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
			case PicPackage.CONFIGURATION_FIELD__PARAMETER:
				setParameter((Parameter)null);
				return;
			case PicPackage.CONFIGURATION_FIELD__START_BIT:
				setStartBit(START_BIT_EDEFAULT);
				return;
			case PicPackage.CONFIGURATION_FIELD__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case PicPackage.CONFIGURATION_FIELD__PARAMETER:
				return parameter != null;
			case PicPackage.CONFIGURATION_FIELD__START_BIT:
				return startBit != START_BIT_EDEFAULT;
			case PicPackage.CONFIGURATION_FIELD__LENGTH:
				return length != LENGTH_EDEFAULT;
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
		result.append(" (startBit: ");
		result.append(startBit);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //ConfigurationFieldImpl
