/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.MemoryAssignment#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getMemoryAssignment()
 * @model
 * @generated
 */
public interface MemoryAssignment extends ReferableValue {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see hu.e.compiler.list.ListPackage#getMemoryAssignment_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.MemoryAssignment#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // MemoryAssignment
