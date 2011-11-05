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
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Wait#getPgm <em>Pgm</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getLvpgm <em>Lvpgm</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getCfg <em>Cfg</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getErase <em>Erase</em>}</li>
 *   <li>{@link microchip.device.memory.Wait#getLverase <em>Lverase</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends EObject {
	/**
	 * Returns the value of the '<em><b>Pgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgm</em>' attribute.
	 * @see #isSetPgm()
	 * @see #unsetPgm()
	 * @see #setPgm(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Pgm()
	 * @model unsettable="true"
	 * @generated
	 */
	int getPgm();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgm</em>' attribute.
	 * @see #isSetPgm()
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @generated
	 */
	void setPgm(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPgm()
	 * @see #getPgm()
	 * @see #setPgm(int)
	 * @generated
	 */
	void unsetPgm();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getPgm <em>Pgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pgm</em>' attribute is set.
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @see #setPgm(int)
	 * @generated
	 */
	boolean isSetPgm();

	/**
	 * Returns the value of the '<em><b>Lvpgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lvpgm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lvpgm</em>' attribute.
	 * @see #isSetLvpgm()
	 * @see #unsetLvpgm()
	 * @see #setLvpgm(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Lvpgm()
	 * @model unsettable="true"
	 * @generated
	 */
	int getLvpgm();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getLvpgm <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lvpgm</em>' attribute.
	 * @see #isSetLvpgm()
	 * @see #unsetLvpgm()
	 * @see #getLvpgm()
	 * @generated
	 */
	void setLvpgm(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getLvpgm <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLvpgm()
	 * @see #getLvpgm()
	 * @see #setLvpgm(int)
	 * @generated
	 */
	void unsetLvpgm();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getLvpgm <em>Lvpgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lvpgm</em>' attribute is set.
	 * @see #unsetLvpgm()
	 * @see #getLvpgm()
	 * @see #setLvpgm(int)
	 * @generated
	 */
	boolean isSetLvpgm();

	/**
	 * Returns the value of the '<em><b>Eedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eedata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eedata</em>' attribute.
	 * @see #isSetEedata()
	 * @see #unsetEedata()
	 * @see #setEedata(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Eedata()
	 * @model unsettable="true"
	 * @generated
	 */
	int getEedata();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eedata</em>' attribute.
	 * @see #isSetEedata()
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @generated
	 */
	void setEedata(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEedata()
	 * @see #getEedata()
	 * @see #setEedata(int)
	 * @generated
	 */
	void unsetEedata();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getEedata <em>Eedata</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eedata</em>' attribute is set.
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @see #setEedata(int)
	 * @generated
	 */
	boolean isSetEedata();

	/**
	 * Returns the value of the '<em><b>Cfg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfg</em>' attribute.
	 * @see #isSetCfg()
	 * @see #unsetCfg()
	 * @see #setCfg(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Cfg()
	 * @model unsettable="true"
	 * @generated
	 */
	int getCfg();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfg</em>' attribute.
	 * @see #isSetCfg()
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @generated
	 */
	void setCfg(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCfg()
	 * @see #getCfg()
	 * @see #setCfg(int)
	 * @generated
	 */
	void unsetCfg();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getCfg <em>Cfg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cfg</em>' attribute is set.
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @see #setCfg(int)
	 * @generated
	 */
	boolean isSetCfg();

	/**
	 * Returns the value of the '<em><b>Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userid</em>' attribute.
	 * @see #isSetUserid()
	 * @see #unsetUserid()
	 * @see #setUserid(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Userid()
	 * @model unsettable="true"
	 * @generated
	 */
	int getUserid();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userid</em>' attribute.
	 * @see #isSetUserid()
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @generated
	 */
	void setUserid(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserid()
	 * @see #getUserid()
	 * @see #setUserid(int)
	 * @generated
	 */
	void unsetUserid();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getUserid <em>Userid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Userid</em>' attribute is set.
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @see #setUserid(int)
	 * @generated
	 */
	boolean isSetUserid();

	/**
	 * Returns the value of the '<em><b>Erase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erase</em>' attribute.
	 * @see #isSetErase()
	 * @see #unsetErase()
	 * @see #setErase(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Erase()
	 * @model unsettable="true"
	 * @generated
	 */
	int getErase();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getErase <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erase</em>' attribute.
	 * @see #isSetErase()
	 * @see #unsetErase()
	 * @see #getErase()
	 * @generated
	 */
	void setErase(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getErase <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErase()
	 * @see #getErase()
	 * @see #setErase(int)
	 * @generated
	 */
	void unsetErase();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getErase <em>Erase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Erase</em>' attribute is set.
	 * @see #unsetErase()
	 * @see #getErase()
	 * @see #setErase(int)
	 * @generated
	 */
	boolean isSetErase();

	/**
	 * Returns the value of the '<em><b>Lverase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lverase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lverase</em>' attribute.
	 * @see #isSetLverase()
	 * @see #unsetLverase()
	 * @see #setLverase(int)
	 * @see microchip.device.memory.MemoryPackage#getWait_Lverase()
	 * @model unsettable="true"
	 * @generated
	 */
	int getLverase();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Wait#getLverase <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lverase</em>' attribute.
	 * @see #isSetLverase()
	 * @see #unsetLverase()
	 * @see #getLverase()
	 * @generated
	 */
	void setLverase(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Wait#getLverase <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLverase()
	 * @see #getLverase()
	 * @see #setLverase(int)
	 * @generated
	 */
	void unsetLverase();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Wait#getLverase <em>Lverase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lverase</em>' attribute is set.
	 * @see #unsetLverase()
	 * @see #getLverase()
	 * @see #setLverase(int)
	 * @generated
	 */
	boolean isSetLverase();

} // Wait
