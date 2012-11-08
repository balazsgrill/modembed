/**
 */
package hu.modembed.model.architecture.linking;

import hu.modembed.model.architecture.Architecture;

import hu.modembed.model.emodel.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Linking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.linking.ProgramLinking#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.ProgramLinking#getMainFunction <em>Main Function</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.linking.ProgramLinking#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.architecture.linking.LinkingPackage#getProgramLinking()
 * @model
 * @generated
 */
public interface ProgramLinking extends LinkingElement {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' reference.
	 * @see #setArchitecture(Architecture)
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getProgramLinking_Architecture()
	 * @model
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.ProgramLinking#getArchitecture <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Main Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Function</em>' reference.
	 * @see #setMainFunction(Function)
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getProgramLinking_MainFunction()
	 * @model
	 * @generated
	 */
	Function getMainFunction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.ProgramLinking#getMainFunction <em>Main Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Function</em>' reference.
	 * @see #getMainFunction()
	 * @generated
	 */
	void setMainFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see hu.modembed.model.architecture.linking.LinkingPackage#getProgramLinking_StartAddress()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.architecture.linking.ProgramLinking#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

} // ProgramLinking
