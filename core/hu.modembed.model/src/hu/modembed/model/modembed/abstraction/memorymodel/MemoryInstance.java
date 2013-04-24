/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel;

import hu.modembed.model.modembed.infrastructure.AttributeValueContainer;
import hu.modembed.model.modembed.infrastructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryInstance()
 * @model
 * @generated
 */
public interface MemoryInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MemoryType)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	MemoryType getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MemoryType value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryInstance_StartAddress()
	 * @model required="true"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryInstance_Size()
	 * @model required="true"
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributeValueContainer)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryInstance_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributeValueContainer getAttributes();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeValueContainer value);

} // MemoryInstance
