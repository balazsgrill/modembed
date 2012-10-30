/**
 */
package hu.modembed.model.emodel.impl;

import hu.modembed.model.core.impl.NamedElementImpl;
import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.FunctionParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FunctionParameterImpl extends NamedElementImpl implements FunctionParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmodelPackage.Literals.FUNCTION_PARAMETER;
	}

} //FunctionParameterImpl
