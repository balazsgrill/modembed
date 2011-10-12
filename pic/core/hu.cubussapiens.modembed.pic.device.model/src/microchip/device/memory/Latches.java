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
 * A representation of the model object '<em><b>Latches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Latches#getPgm <em>Pgm</em>}</li>
 *   <li>{@link microchip.device.memory.Latches#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.device.memory.Latches#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.device.memory.Latches#getCfg <em>Cfg</em>}</li>
 *   <li>{@link microchip.device.memory.Latches#getRowerase <em>Rowerase</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getLatches()
 * @model
 * @generated
 */
public interface Latches extends EObject {
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
	 * @see microchip.device.memory.MemoryPackage#getLatches_Pgm()
	 * @model unsettable="true"
	 * @generated
	 */
	int getPgm();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Latches#getPgm <em>Pgm</em>}' attribute.
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
	 * Unsets the value of the '{@link microchip.device.memory.Latches#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPgm()
	 * @see #getPgm()
	 * @see #setPgm(int)
	 * @generated
	 */
	void unsetPgm();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Latches#getPgm <em>Pgm</em>}' attribute is set.
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
	 * @see microchip.device.memory.MemoryPackage#getLatches_Eedata()
	 * @model unsettable="true"
	 * @generated
	 */
	int getEedata();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Latches#getEedata <em>Eedata</em>}' attribute.
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
	 * Unsets the value of the '{@link microchip.device.memory.Latches#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEedata()
	 * @see #getEedata()
	 * @see #setEedata(int)
	 * @generated
	 */
	void unsetEedata();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Latches#getEedata <em>Eedata</em>}' attribute is set.
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
	 * @see microchip.device.memory.MemoryPackage#getLatches_Userid()
	 * @model unsettable="true"
	 * @generated
	 */
	int getUserid();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Latches#getUserid <em>Userid</em>}' attribute.
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
	 * Unsets the value of the '{@link microchip.device.memory.Latches#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserid()
	 * @see #getUserid()
	 * @see #setUserid(int)
	 * @generated
	 */
	void unsetUserid();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Latches#getUserid <em>Userid</em>}' attribute is set.
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
	 * @see microchip.device.memory.MemoryPackage#getLatches_Cfg()
	 * @model unsettable="true"
	 * @generated
	 */
	int getCfg();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Latches#getCfg <em>Cfg</em>}' attribute.
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
	 * Unsets the value of the '{@link microchip.device.memory.Latches#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCfg()
	 * @see #getCfg()
	 * @see #setCfg(int)
	 * @generated
	 */
	void unsetCfg();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Latches#getCfg <em>Cfg</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rowerase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowerase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowerase</em>' attribute.
	 * @see #isSetRowerase()
	 * @see #unsetRowerase()
	 * @see #setRowerase(int)
	 * @see microchip.device.memory.MemoryPackage#getLatches_Rowerase()
	 * @model unsettable="true"
	 * @generated
	 */
	int getRowerase();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Latches#getRowerase <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowerase</em>' attribute.
	 * @see #isSetRowerase()
	 * @see #unsetRowerase()
	 * @see #getRowerase()
	 * @generated
	 */
	void setRowerase(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.memory.Latches#getRowerase <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowerase()
	 * @see #getRowerase()
	 * @see #setRowerase(int)
	 * @generated
	 */
	void unsetRowerase();

	/**
	 * Returns whether the value of the '{@link microchip.device.memory.Latches#getRowerase <em>Rowerase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowerase</em>' attribute is set.
	 * @see #unsetRowerase()
	 * @see #getRowerase()
	 * @see #setRowerase(int)
	 * @generated
	 */
	boolean isSetRowerase();

} // Latches
