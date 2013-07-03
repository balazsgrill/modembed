/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Behavior Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getDevice <em>Device</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getSymbolMappings <em>Symbol Mappings</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getBehaviorModels <em>Behavior Models</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getInitSequence <em>Init Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehaviorModule()
 * @model
 * @generated
 */
public interface SequentialBehaviorModule extends RootElement {
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
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehaviorModule_Device()
	 * @model
	 * @generated
	 */
	DeviceAbstraction getDevice();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(DeviceAbstraction value);

	/**
	 * Returns the value of the '<em><b>Symbol Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Mappings</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehaviorModule_SymbolMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolAssignment> getSymbolMappings();

	/**
	 * Returns the value of the '<em><b>Behavior Models</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Models</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehaviorModule_BehaviorModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequentialBehaviorPart> getBehaviorModels();

	/**
	 * Returns the value of the '<em><b>Init Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Sequence</em>' containment reference.
	 * @see #setInitSequence(SequentialBehaviorPart)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehaviorModule_InitSequence()
	 * @model containment="true"
	 * @generated
	 */
	SequentialBehaviorPart getInitSequence();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule#getInitSequence <em>Init Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Sequence</em>' containment reference.
	 * @see #getInitSequence()
	 * @generated
	 */
	void setInitSequence(SequentialBehaviorPart value);

} // SequentialBehaviorModule
