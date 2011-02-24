/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Programming#getWait <em>Wait</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getLatches <em>Latches</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getMemtech <em>Memtech</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getTries <em>Tries</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getLvpthresh <em>Lvpthresh</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link microchip.device.memory.Programming#getPanelsize <em>Panelsize</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getProgramming()
 * @model
 * @generated
 */
public interface Programming extends EObject {
	/**
	 * Returns the value of the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' containment reference.
	 * @see #setWait(Wait)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Wait()
	 * @model containment="true"
	 * @generated
	 */
	Wait getWait();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getWait <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' containment reference.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(Wait value);

	/**
	 * Returns the value of the '<em><b>Latches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latches</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latches</em>' containment reference.
	 * @see #setLatches(Latches)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Latches()
	 * @model containment="true"
	 * @generated
	 */
	Latches getLatches();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getLatches <em>Latches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latches</em>' containment reference.
	 * @see #getLatches()
	 * @generated
	 */
	void setLatches(Latches value);

	/**
	 * Returns the value of the '<em><b>Memtech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memtech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memtech</em>' attribute.
	 * @see #setMemtech(String)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Memtech()
	 * @model
	 * @generated
	 */
	String getMemtech();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getMemtech <em>Memtech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memtech</em>' attribute.
	 * @see #getMemtech()
	 * @generated
	 */
	void setMemtech(String value);

	/**
	 * Returns the value of the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tries</em>' attribute.
	 * @see #isSetTries()
	 * @see #unsetTries()
	 * @see #setTries(int)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Tries()
	 * @model unsettable="true"
	 * @generated
	 */
	int getTries();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getTries <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tries</em>' attribute.
	 * @see #isSetTries()
	 * @see #unsetTries()
	 * @see #getTries()
	 * @generated
	 */
	void setTries(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Programming#getTries <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTries()
	 * @see #getTries()
	 * @see #setTries(int)
	 * @generated
	 */
	void unsetTries();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Programming#getTries <em>Tries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tries</em>' attribute is set.
	 * @see #unsetTries()
	 * @see #getTries()
	 * @see #setTries(int)
	 * @generated
	 */
	boolean isSetTries();

	/**
	 * Returns the value of the '<em><b>Lvpthresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lvpthresh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lvpthresh</em>' attribute.
	 * @see #isSetLvpthresh()
	 * @see #unsetLvpthresh()
	 * @see #setLvpthresh(float)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Lvpthresh()
	 * @model unsettable="true"
	 * @generated
	 */
	float getLvpthresh();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getLvpthresh <em>Lvpthresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lvpthresh</em>' attribute.
	 * @see #isSetLvpthresh()
	 * @see #unsetLvpthresh()
	 * @see #getLvpthresh()
	 * @generated
	 */
	void setLvpthresh(float value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Programming#getLvpthresh <em>Lvpthresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLvpthresh()
	 * @see #getLvpthresh()
	 * @see #setLvpthresh(float)
	 * @generated
	 */
	void unsetLvpthresh();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Programming#getLvpthresh <em>Lvpthresh</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lvpthresh</em>' attribute is set.
	 * @see #unsetLvpthresh()
	 * @see #getLvpthresh()
	 * @see #setLvpthresh(float)
	 * @generated
	 */
	boolean isSetLvpthresh();

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary</em>' attribute.
	 * @see #isSetBoundary()
	 * @see #unsetBoundary()
	 * @see #setBoundary(int)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Boundary()
	 * @model unsettable="true"
	 * @generated
	 */
	int getBoundary();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see #isSetBoundary()
	 * @see #unsetBoundary()
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Programming#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoundary()
	 * @see #getBoundary()
	 * @see #setBoundary(int)
	 * @generated
	 */
	void unsetBoundary();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Programming#getBoundary <em>Boundary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boundary</em>' attribute is set.
	 * @see #unsetBoundary()
	 * @see #getBoundary()
	 * @see #setBoundary(int)
	 * @generated
	 */
	boolean isSetBoundary();

	/**
	 * Returns the value of the '<em><b>Panelsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panelsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panelsize</em>' attribute.
	 * @see #setPanelsize(int)
	 * @see microchip.device.memory.MemoryPackage#getProgramming_Panelsize()
	 * @model
	 * @generated
	 */
	int getPanelsize();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Programming#getPanelsize <em>Panelsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panelsize</em>' attribute.
	 * @see #getPanelsize()
	 * @generated
	 */
	void setPanelsize(int value);

} // Programming
