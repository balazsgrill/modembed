/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getMemInstance <em>Mem Instance</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolMappingRule()
 * @model
 * @generated
 */
public interface SymbolMappingRule extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Mem Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Instance</em>' reference.
	 * @see #setMemInstance(MemoryInstance)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolMappingRule_MemInstance()
	 * @model
	 * @generated
	 */
	MemoryInstance getMemInstance();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getMemInstance <em>Mem Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Instance</em>' reference.
	 * @see #getMemInstance()
	 * @generated
	 */
	void setMemInstance(MemoryInstance value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolMappingRule_StartAddress()
	 * @model
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(long)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolMappingRule_EndAddress()
	 * @model
	 * @generated
	 */
	long getEndAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(long value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' attribute list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolMappingRule_Classes()
	 * @model
	 * @generated
	 */
	EList<String> getClasses();

} // SymbolMappingRule
