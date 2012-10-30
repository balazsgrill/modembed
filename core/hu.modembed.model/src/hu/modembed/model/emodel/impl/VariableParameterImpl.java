/**
 */
package hu.modembed.model.emodel.impl;

import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.Variable;
import hu.modembed.model.emodel.VariableParameter;

import hu.modembed.model.emodel.types.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableParameterImpl extends FunctionParameterImpl implements VariableParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmodelPackage.Literals.VARIABLE_PARAMETER;
	}

} //VariableParameterImpl
