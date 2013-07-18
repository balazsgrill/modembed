/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;

import hu.modembed.model.modembed.infrastructure.RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Sequential Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getRootSequentialBehavior()
 * @model
 * @generated
 */
public interface RootSequentialBehavior extends RootElement, SequentialBehavior {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(DeviceAbstraction)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getRootSequentialBehavior_Device()
	 * @model
	 * @generated
	 */
	DeviceAbstraction getDevice();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(DeviceAbstraction value);

} // RootSequentialBehavior
