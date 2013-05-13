/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.BehaviorCall#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getBehaviorCall()
 * @model
 * @generated
 */
public interface BehaviorCall extends SequentialAction {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getBehaviorCall_Reference()
	 * @model required="true"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.BehaviorCall#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // BehaviorCall
