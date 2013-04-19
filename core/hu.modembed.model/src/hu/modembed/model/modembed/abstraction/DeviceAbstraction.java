/**
 */
package hu.modembed.model.modembed.abstraction;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryInstances <em>Memory Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction()
 * @model
 * @generated
 */
public interface DeviceAbstraction extends RootElement {
	/**
	 * Returns the value of the '<em><b>Memory Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Types</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction_MemoryTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryType> getMemoryTypes();

	/**
	 * Returns the value of the '<em><b>Memory Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Instances</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction_MemoryInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryInstance> getMemoryInstances();

} // DeviceAbstraction
