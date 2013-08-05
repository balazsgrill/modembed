/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Address Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment#getMemoryInstance <em>Memory Instance</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAddressAssignment()
 * @model
 * @generated
 */
public interface SymbolAddressAssignment extends SymbolAssignment {
	/**
	 * Returns the value of the '<em><b>Memory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Instance</em>' reference.
	 * @see #setMemoryInstance(MemoryInstance)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAddressAssignment_MemoryInstance()
	 * @model required="true"
	 * @generated
	 */
	MemoryInstance getMemoryInstance();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment#getMemoryInstance <em>Memory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Instance</em>' reference.
	 * @see #getMemoryInstance()
	 * @generated
	 */
	void setMemoryInstance(MemoryInstance value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(long)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAddressAssignment_Address()
	 * @model required="true"
	 * @generated
	 */
	long getAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(long value);

} // SymbolAddressAssignment
