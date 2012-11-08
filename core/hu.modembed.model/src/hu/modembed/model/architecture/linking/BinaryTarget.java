/**
 */
package hu.modembed.model.architecture.linking;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.linking.BinaryTarget#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.BinaryTarget#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinaryTarget()
 * @model
 * @generated
 */
public interface BinaryTarget extends RootElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Raw"</code>.
	 * The literals are from the enumeration {@link hu.modembed.model.architecture.linking.BinaryTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.modembed.model.architecture.linking.BinaryTargetType
	 * @see #setType(BinaryTargetType)
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinaryTarget_Type()
	 * @model default="Raw" required="true"
	 * @generated
	 */
	BinaryTargetType getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.BinaryTarget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.modembed.model.architecture.linking.BinaryTargetType
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryTargetType value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.architecture.linking.BinarySection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinaryTarget_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinarySection> getSections();

} // BinaryTarget
