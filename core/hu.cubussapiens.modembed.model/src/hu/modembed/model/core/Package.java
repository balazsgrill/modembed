/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.Package#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.CorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackagedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.core.PackagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see hu.modembed.model.core.CorePackage#getPackage_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackagedElement> getContents();

} // Package
