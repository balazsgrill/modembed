/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.WaitType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getCfg <em>Cfg</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getEedata <em>Eedata</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getErase <em>Erase</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getLverase <em>Lverase</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getLvpgm <em>Lvpgm</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getPgm <em>Pgm</em>}</li>
 *   <li>{@link crownking.edc.WaitType#getUserid <em>Userid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getWaitType()
 * @model extendedMetaData="name='WaitType' kind='simple'"
 * @generated
 */
public interface WaitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see crownking.edc.EdcPackage#getWaitType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see #setCfg(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Cfg()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='cfg'"
	 * @generated
	 */
	short getCfg();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfg</em>' attribute.
	 * @see #isSetCfg()
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @generated
	 */
	void setCfg(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCfg()
	 * @see #getCfg()
	 * @see #setCfg(short)
	 * @generated
	 */
	void unsetCfg();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getCfg <em>Cfg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cfg</em>' attribute is set.
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @see #setCfg(short)
	 * @generated
	 */
	boolean isSetCfg();

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
	 * @see #setEedata(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Eedata()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='eedata'"
	 * @generated
	 */
	short getEedata();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eedata</em>' attribute.
	 * @see #isSetEedata()
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @generated
	 */
	void setEedata(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEedata()
	 * @see #getEedata()
	 * @see #setEedata(short)
	 * @generated
	 */
	void unsetEedata();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getEedata <em>Eedata</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eedata</em>' attribute is set.
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @see #setEedata(short)
	 * @generated
	 */
	boolean isSetEedata();

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
	 * @see #setErase(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Erase()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='erase'"
	 * @generated
	 */
	short getErase();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getErase <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erase</em>' attribute.
	 * @see #isSetErase()
	 * @see #unsetErase()
	 * @see #getErase()
	 * @generated
	 */
	void setErase(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getErase <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErase()
	 * @see #getErase()
	 * @see #setErase(short)
	 * @generated
	 */
	void unsetErase();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getErase <em>Erase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Erase</em>' attribute is set.
	 * @see #unsetErase()
	 * @see #getErase()
	 * @see #setErase(short)
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
	 * @see #setLverase(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Lverase()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='lverase'"
	 * @generated
	 */
	short getLverase();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getLverase <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lverase</em>' attribute.
	 * @see #isSetLverase()
	 * @see #unsetLverase()
	 * @see #getLverase()
	 * @generated
	 */
	void setLverase(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getLverase <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLverase()
	 * @see #getLverase()
	 * @see #setLverase(short)
	 * @generated
	 */
	void unsetLverase();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getLverase <em>Lverase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lverase</em>' attribute is set.
	 * @see #unsetLverase()
	 * @see #getLverase()
	 * @see #setLverase(short)
	 * @generated
	 */
	boolean isSetLverase();

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
	 * @see #setLvpgm(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Lvpgm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='lvpgm'"
	 * @generated
	 */
	short getLvpgm();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getLvpgm <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lvpgm</em>' attribute.
	 * @see #isSetLvpgm()
	 * @see #unsetLvpgm()
	 * @see #getLvpgm()
	 * @generated
	 */
	void setLvpgm(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getLvpgm <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLvpgm()
	 * @see #getLvpgm()
	 * @see #setLvpgm(short)
	 * @generated
	 */
	void unsetLvpgm();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getLvpgm <em>Lvpgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lvpgm</em>' attribute is set.
	 * @see #unsetLvpgm()
	 * @see #getLvpgm()
	 * @see #setLvpgm(short)
	 * @generated
	 */
	boolean isSetLvpgm();

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
	 * @see #setPgm(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Pgm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='pgm'"
	 * @generated
	 */
	short getPgm();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgm</em>' attribute.
	 * @see #isSetPgm()
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @generated
	 */
	void setPgm(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPgm()
	 * @see #getPgm()
	 * @see #setPgm(short)
	 * @generated
	 */
	void unsetPgm();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getPgm <em>Pgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pgm</em>' attribute is set.
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @see #setPgm(short)
	 * @generated
	 */
	boolean isSetPgm();

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
	 * @see #setUserid(short)
	 * @see crownking.edc.EdcPackage#getWaitType_Userid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='userid'"
	 * @generated
	 */
	short getUserid();

	/**
	 * Sets the value of the '{@link crownking.edc.WaitType#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userid</em>' attribute.
	 * @see #isSetUserid()
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @generated
	 */
	void setUserid(short value);

	/**
	 * Unsets the value of the '{@link crownking.edc.WaitType#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserid()
	 * @see #getUserid()
	 * @see #setUserid(short)
	 * @generated
	 */
	void unsetUserid();

	/**
	 * Returns whether the value of the '{@link crownking.edc.WaitType#getUserid <em>Userid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Userid</em>' attribute is set.
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @see #setUserid(short)
	 * @generated
	 */
	boolean isSetUserid();

} // WaitType
