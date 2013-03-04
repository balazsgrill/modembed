/**
 */
package hu.modembed.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.ModelOrigin#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.CorePackage#getModelOrigin()
 * @model
 * @generated
 */
public interface ModelOrigin extends Origin {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(MODembedElement)
	 * @see hu.modembed.model.core.CorePackage#getModelOrigin_Element()
	 * @model required="true"
	 * @generated
	 */
	MODembedElement getElement();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.ModelOrigin#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(MODembedElement value);

} // ModelOrigin
