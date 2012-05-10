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
 * A representation of the model object '<em><b>Latches Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.LatchesType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.LatchesType#getCfg <em>Cfg</em>}</li>
 *   <li>{@link crownking.edc.LatchesType#getEedata <em>Eedata</em>}</li>
 *   <li>{@link crownking.edc.LatchesType#getPgm <em>Pgm</em>}</li>
 *   <li>{@link crownking.edc.LatchesType#getRowerase <em>Rowerase</em>}</li>
 *   <li>{@link crownking.edc.LatchesType#getUserid <em>Userid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getLatchesType()
 * @model extendedMetaData="name='LatchesType' kind='simple'"
 * @generated
 */
public interface LatchesType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getLatchesType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getValue <em>Value</em>}' attribute.
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
	 * @see #setCfg(byte)
	 * @see crownking.edc.EdcPackage#getLatchesType_Cfg()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='cfg'"
	 * @generated
	 */
	byte getCfg();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfg</em>' attribute.
	 * @see #isSetCfg()
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @generated
	 */
	void setCfg(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.LatchesType#getCfg <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCfg()
	 * @see #getCfg()
	 * @see #setCfg(byte)
	 * @generated
	 */
	void unsetCfg();

	/**
	 * Returns whether the value of the '{@link crownking.edc.LatchesType#getCfg <em>Cfg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cfg</em>' attribute is set.
	 * @see #unsetCfg()
	 * @see #getCfg()
	 * @see #setCfg(byte)
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
	 * @see #setEedata(byte)
	 * @see crownking.edc.EdcPackage#getLatchesType_Eedata()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='eedata'"
	 * @generated
	 */
	byte getEedata();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eedata</em>' attribute.
	 * @see #isSetEedata()
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @generated
	 */
	void setEedata(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.LatchesType#getEedata <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEedata()
	 * @see #getEedata()
	 * @see #setEedata(byte)
	 * @generated
	 */
	void unsetEedata();

	/**
	 * Returns whether the value of the '{@link crownking.edc.LatchesType#getEedata <em>Eedata</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eedata</em>' attribute is set.
	 * @see #unsetEedata()
	 * @see #getEedata()
	 * @see #setEedata(byte)
	 * @generated
	 */
	boolean isSetEedata();

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
	 * @see #setPgm(byte)
	 * @see crownking.edc.EdcPackage#getLatchesType_Pgm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='pgm'"
	 * @generated
	 */
	byte getPgm();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgm</em>' attribute.
	 * @see #isSetPgm()
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @generated
	 */
	void setPgm(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.LatchesType#getPgm <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPgm()
	 * @see #getPgm()
	 * @see #setPgm(byte)
	 * @generated
	 */
	void unsetPgm();

	/**
	 * Returns whether the value of the '{@link crownking.edc.LatchesType#getPgm <em>Pgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pgm</em>' attribute is set.
	 * @see #unsetPgm()
	 * @see #getPgm()
	 * @see #setPgm(byte)
	 * @generated
	 */
	boolean isSetPgm();

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
	 * @see #setRowerase(byte)
	 * @see crownking.edc.EdcPackage#getLatchesType_Rowerase()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='rowerase'"
	 * @generated
	 */
	byte getRowerase();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getRowerase <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowerase</em>' attribute.
	 * @see #isSetRowerase()
	 * @see #unsetRowerase()
	 * @see #getRowerase()
	 * @generated
	 */
	void setRowerase(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.LatchesType#getRowerase <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowerase()
	 * @see #getRowerase()
	 * @see #setRowerase(byte)
	 * @generated
	 */
	void unsetRowerase();

	/**
	 * Returns whether the value of the '{@link crownking.edc.LatchesType#getRowerase <em>Rowerase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowerase</em>' attribute is set.
	 * @see #unsetRowerase()
	 * @see #getRowerase()
	 * @see #setRowerase(byte)
	 * @generated
	 */
	boolean isSetRowerase();

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
	 * @see #setUserid(byte)
	 * @see crownking.edc.EdcPackage#getLatchesType_Userid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='userid'"
	 * @generated
	 */
	byte getUserid();

	/**
	 * Sets the value of the '{@link crownking.edc.LatchesType#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userid</em>' attribute.
	 * @see #isSetUserid()
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @generated
	 */
	void setUserid(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.LatchesType#getUserid <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserid()
	 * @see #getUserid()
	 * @see #setUserid(byte)
	 * @generated
	 */
	void unsetUserid();

	/**
	 * Returns whether the value of the '{@link crownking.edc.LatchesType#getUserid <em>Userid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Userid</em>' attribute is set.
	 * @see #unsetUserid()
	 * @see #getUserid()
	 * @see #setUserid(byte)
	 * @generated
	 */
	boolean isSetUserid();

} // LatchesType
