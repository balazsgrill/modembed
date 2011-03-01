/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly.impl;

import embedded.assembly.AssemblyPackage;
import embedded.assembly.Field;
import embedded.assembly.FieldType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link embedded.assembly.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link embedded.assembly.impl.FieldImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link embedded.assembly.impl.FieldImpl#getParamshift <em>Paramshift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends SectionImpl implements Field {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FieldType TYPE_EDEFAULT = FieldType.LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FieldType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamshift() <em>Paramshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamshift()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMSHIFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParamshift() <em>Paramshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamshift()
	 * @generated
	 * @ordered
	 */
	protected int paramshift = PARAMSHIFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FieldType newType) {
		FieldType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.FIELD__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParamshift() {
		return paramshift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamshift(int newParamshift) {
		int oldParamshift = paramshift;
		paramshift = newParamshift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.FIELD__PARAMSHIFT, oldParamshift, paramshift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.FIELD__TYPE:
				return getType();
			case AssemblyPackage.FIELD__PARAMETER:
				return getParameter();
			case AssemblyPackage.FIELD__PARAMSHIFT:
				return getParamshift();
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
			case AssemblyPackage.FIELD__TYPE:
				setType((FieldType)newValue);
				return;
			case AssemblyPackage.FIELD__PARAMETER:
				setParameter((String)newValue);
				return;
			case AssemblyPackage.FIELD__PARAMSHIFT:
				setParamshift((Integer)newValue);
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
			case AssemblyPackage.FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AssemblyPackage.FIELD__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case AssemblyPackage.FIELD__PARAMSHIFT:
				setParamshift(PARAMSHIFT_EDEFAULT);
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
			case AssemblyPackage.FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case AssemblyPackage.FIELD__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case AssemblyPackage.FIELD__PARAMSHIFT:
				return paramshift != PARAMSHIFT_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", paramshift: ");
		result.append(paramshift);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
