/**
 */
package hu.modembed.model.emodel.memorymap;

import hu.modembed.model.core.MODembedElement;

import hu.modembed.model.emodel.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heap Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getVariable <em>Variable</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapVariableMapping()
 * @model
 * @generated
 */
public interface HeapVariableMapping extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapVariableMapping_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

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
	 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapVariableMapping_Address()
	 * @model required="true"
	 * @generated
	 */
	long getAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.memorymap.HeapVariableMapping#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(long value);

} // HeapVariableMapping
