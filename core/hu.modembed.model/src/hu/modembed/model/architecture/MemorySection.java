/**
 */
package hu.modembed.model.architecture;

import hu.modembed.model.core.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.MemorySection#isProgram <em>Program</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.MemorySection#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.MemorySection#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.architecture.ArchitecturePackage#getMemorySection()
 * @model
 * @generated
 */
public interface MemorySection extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' attribute.
	 * @see #setProgram(boolean)
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getMemorySection_Program()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isProgram();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.MemorySection#isProgram <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' attribute.
	 * @see #isProgram()
	 * @generated
	 */
	void setProgram(boolean value);

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
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getMemorySection_StartAddress()
	 * @model required="true"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.MemorySection#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(long)
	 * @see hu.modembed.model.architecture.ArchitecturePackage#getMemorySection_Length()
	 * @model required="true"
	 * @generated
	 */
	long getLength();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.MemorySection#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(long value);

} // MemorySection
