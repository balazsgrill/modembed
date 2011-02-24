/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SFR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.SFR#getKey <em>Key</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getAddr <em>Addr</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getSize <em>Size</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getFlags <em>Flags</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getAccess <em>Access</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getReset <em>Reset</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getBits <em>Bits</em>}</li>
 *   <li>{@link microchip.device.memory.SFR#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getSFR()
 * @model
 * @generated
 */
public interface SFR extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(int)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Addr()
	 * @model
	 * @generated
	 */
	int getAddr();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(String)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Flags()
	 * @model
	 * @generated
	 */
	String getFlags();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Access()
	 * @model
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' containment reference.
	 * @see #setReset(Reset)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Reset()
	 * @model containment="true"
	 * @generated
	 */
	Reset getReset();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getReset <em>Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' containment reference.
	 * @see #getReset()
	 * @generated
	 */
	void setReset(Reset value);

	/**
	 * Returns the value of the '<em><b>Bits</b></em>' containment reference list.
	 * The list contents are of type {@link microchip.device.memory.Bit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits</em>' containment reference list.
	 * @see microchip.device.memory.MemoryPackage#getSFR_Bits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bit> getBits();

	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' containment reference.
	 * @see #setStimulus(Stimulus)
	 * @see microchip.device.memory.MemoryPackage#getSFR_Stimulus()
	 * @model containment="true"
	 * @generated
	 */
	Stimulus getStimulus();

	/**
	 * Sets the value of the '{@link microchip.device.memory.SFR#getStimulus <em>Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' containment reference.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(Stimulus value);

} // SFR
