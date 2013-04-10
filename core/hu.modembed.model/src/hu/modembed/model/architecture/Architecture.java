/**
 */
package hu.modembed.model.architecture;

import hu.modembed.model.abstraction.types.Type;

import hu.modembed.model.core.RootElement;

import hu.modembed.model.core.assembler.InstructionSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.Architecture#getHeapPointerType <em>Heap Pointer Type</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.Architecture#getCodePointerType <em>Code Pointer Type</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.Architecture#getInstructionSet <em>Instruction Set</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.Architecture#getMemory <em>Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.architecture.ArchitecturePackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends RootElement {
	/**
	 * Returns the value of the '<em><b>Heap Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heap Pointer Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Pointer Type</em>' reference.
	 * @see #setHeapPointerType(Type)
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getArchitecture_HeapPointerType()
	 * @model
	 * @generated
	 */
	Type getHeapPointerType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.Architecture#getHeapPointerType <em>Heap Pointer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Pointer Type</em>' reference.
	 * @see #getHeapPointerType()
	 * @generated
	 */
	void setHeapPointerType(Type value);

	/**
	 * Returns the value of the '<em><b>Code Pointer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Pointer Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Pointer Type</em>' reference.
	 * @see #setCodePointerType(Type)
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getArchitecture_CodePointerType()
	 * @model
	 * @generated
	 */
	Type getCodePointerType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.Architecture#getCodePointerType <em>Code Pointer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Pointer Type</em>' reference.
	 * @see #getCodePointerType()
	 * @generated
	 */
	void setCodePointerType(Type value);

	/**
	 * Returns the value of the '<em><b>Instruction Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Set</em>' reference.
	 * @see #setInstructionSet(InstructionSet)
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getArchitecture_InstructionSet()
	 * @model
	 * @generated
	 */
	InstructionSet getInstructionSet();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.Architecture#getInstructionSet <em>Instruction Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Set</em>' reference.
	 * @see #getInstructionSet()
	 * @generated
	 */
	void setInstructionSet(InstructionSet value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.architecture.MemorySection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference list.
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getArchitecture_Memory()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemorySection> getMemory();

} // Architecture
