/**
 */
package hu.modembed.model.core.assembler.code;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembler Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.code.AssemblerObject#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.code.CodePackage#getAssemblerObject()
 * @model
 * @generated
 */
public interface AssemblerObject extends RootElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.core.assembler.code.InstructionCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.modembed.model.core.assembler.code.CodePackage#getAssemblerObject_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionCall> getInstructions();

} // AssemblerObject
