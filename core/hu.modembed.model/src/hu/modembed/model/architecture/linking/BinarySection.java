/**
 */
package hu.modembed.model.architecture.linking;

import hu.modembed.model.core.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.linking.BinarySection#getElement <em>Element</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.BinarySection#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinarySection()
 * @model
 * @generated
 */
public interface BinarySection extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(LinkingElement)
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinarySection_Element()
	 * @model
	 * @generated
	 */
	LinkingElement getElement();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.BinarySection#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(LinkingElement value);

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
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinarySection_Address()
	 * @model required="true"
	 * @generated
	 */
	long getAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.BinarySection#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(long value);

} // BinarySection
