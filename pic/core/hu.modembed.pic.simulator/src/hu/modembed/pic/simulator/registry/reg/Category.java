/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.pic.simulator.registry.reg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.pic.simulator.registry.reg.Category#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.pic.simulator.registry.reg.Category#getSubcategories <em>Subcategories</em>}</li>
 *   <li>{@link hu.modembed.pic.simulator.registry.reg.Category#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.pic.simulator.registry.reg.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subcategories</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.pic.simulator.registry.reg.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcategories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategories</em>' containment reference list.
	 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getCategory_Subcategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getSubcategories();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.pic.simulator.registry.reg.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getCategory_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

} // Category
