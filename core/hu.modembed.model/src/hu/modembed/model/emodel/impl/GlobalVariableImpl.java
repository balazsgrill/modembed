/**
 */
package hu.modembed.model.emodel.impl;

import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.GlobalVariable;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GlobalVariableImpl extends VariableImpl implements GlobalVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmodelPackage.Literals.GLOBAL_VARIABLE;
	}

} //GlobalVariableImpl
