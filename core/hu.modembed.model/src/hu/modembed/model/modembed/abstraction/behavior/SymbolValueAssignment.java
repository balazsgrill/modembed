/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.infrastructure.MODembedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getIndirection <em>Indirection</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolValueAssignment()
 * @model
 * @generated
 */
public interface SymbolValueAssignment extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolValueAssignment_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeDefinition)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolValueAssignment_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolValueAssignment_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Indirection</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indirection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirection</em>' reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolValueAssignment_Indirection()
	 * @model
	 * @generated
	 */
	EList<MemoryInstance> getIndirection();

} // SymbolValueAssignment
