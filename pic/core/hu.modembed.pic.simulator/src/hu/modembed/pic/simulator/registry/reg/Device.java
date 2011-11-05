/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.pic.simulator.registry.reg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.pic.simulator.registry.reg.Device#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.pic.simulator.registry.reg.Device#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
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
	 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.pic.simulator.registry.reg.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see hu.modembed.pic.simulator.registry.reg.RegPackage#getDevice_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link hu.modembed.pic.simulator.registry.reg.Device#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Device
