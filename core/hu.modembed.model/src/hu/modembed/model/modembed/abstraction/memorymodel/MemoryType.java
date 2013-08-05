/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel;

import hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition;
import hu.modembed.model.modembed.infrastructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define a type of memory model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAccessCost <em>Access Cost</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isContentVolatile <em>Content Volatile</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForData <em>For Data</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForProgram <em>For Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType()
 * @model
 * @generated
 */
public interface MemoryType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributeContainerDefinition)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	AttributeContainerDefinition getAttributes();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributeContainerDefinition value);

	/**
	 * Returns the value of the '<em><b>Access Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Cost</em>' attribute.
	 * @see #setAccessCost(int)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType_AccessCost()
	 * @model
	 * @generated
	 */
	int getAccessCost();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#getAccessCost <em>Access Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Cost</em>' attribute.
	 * @see #getAccessCost()
	 * @generated
	 */
	void setAccessCost(int value);

	/**
	 * Returns the value of the '<em><b>Content Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Volatile</em>' attribute.
	 * @see #setContentVolatile(boolean)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType_ContentVolatile()
	 * @model
	 * @generated
	 */
	boolean isContentVolatile();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isContentVolatile <em>Content Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Volatile</em>' attribute.
	 * @see #isContentVolatile()
	 * @generated
	 */
	void setContentVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>For Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Data</em>' attribute.
	 * @see #setForData(boolean)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType_ForData()
	 * @model
	 * @generated
	 */
	boolean isForData();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForData <em>For Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Data</em>' attribute.
	 * @see #isForData()
	 * @generated
	 */
	void setForData(boolean value);

	/**
	 * Returns the value of the '<em><b>For Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Program</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Program</em>' attribute.
	 * @see #setForProgram(boolean)
	 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage#getMemoryType_ForProgram()
	 * @model
	 * @generated
	 */
	boolean isForProgram();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.memorymodel.MemoryType#isForProgram <em>For Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Program</em>' attribute.
	 * @see #isForProgram()
	 * @generated
	 */
	void setForProgram(boolean value);

} // MemoryType
