/**
 */
package hu.modembed.model.modembed.core.object;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.LinkMapping#getObject <em>Object</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.LinkMapping#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getLinkMapping()
 * @model
 * @generated
 */
public interface LinkMapping extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(AssemblerObject)
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getLinkMapping_Object()
	 * @model
	 * @generated
	 */
	AssemblerObject getObject();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.object.LinkMapping#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(AssemblerObject value);

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
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getLinkMapping_StartAddress()
	 * @model
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.object.LinkMapping#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

} // LinkMapping
