/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.datatypes.StructType#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.datatypes.DatatypesPackage#getStructType()
 * @model
 * @generated
 */
public interface StructType extends StructuredType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.datatypes.StructElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see hu.modembed.model.application.datatypes.DatatypesPackage#getStructType_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructElement> getElements();

} // StructType
