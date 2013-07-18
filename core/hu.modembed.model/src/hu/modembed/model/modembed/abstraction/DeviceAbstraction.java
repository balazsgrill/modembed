/**
 */
package hu.modembed.model.modembed.abstraction;

import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

import hu.modembed.model.modembed.core.instructionset.InstructionSet;

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
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getInstructionset <em>Instructionset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryInstances <em>Memory Instances</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction()
 * @model
 * @generated
 */
public interface DeviceAbstraction extends RootElement {
	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(DeviceAbstraction)
	 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction_Ancestor()
	 * @model
	 * @generated
	 */
	DeviceAbstraction getAncestor();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(DeviceAbstraction value);

	/**
	 * Returns the value of the '<em><b>Instructionset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructionset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructionset</em>' reference.
	 * @see #setInstructionset(InstructionSet)
	 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction_Instructionset()
	 * @model
	 * @generated
	 */
	InstructionSet getInstructionset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getInstructionset <em>Instructionset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionset</em>' reference.
	 * @see #getInstructionset()
	 * @generated
	 */
	void setInstructionset(InstructionSet value);

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

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.AbstractionPackage#getDeviceAbstraction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinition> getOperation();

} // DeviceAbstraction
