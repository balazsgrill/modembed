/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programming Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ProgrammingType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getWait <em>Wait</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getLatches <em>Latches</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getCsumadd <em>Csumadd</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getErasealgo <em>Erasealgo</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getHaschecksum <em>Haschecksum</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getHasrowerasecmd <em>Hasrowerasecmd</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getHasvppfirst <em>Hasvppfirst</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getLvpthresh <em>Lvpthresh</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getMemtech <em>Memtech</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getOvrpgm <em>Ovrpgm</em>}</li>
 *   <li>{@link crownking.edc.ProgrammingType#getTries <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getProgrammingType()
 * @model extendedMetaData="name='ProgrammingType' kind='mixed'"
 * @generated
 */
public interface ProgrammingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getProgrammingType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' containment reference.
	 * @see #setWait(WaitType)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Wait()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Wait' namespace='##targetNamespace'"
	 * @generated
	 */
	WaitType getWait();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getWait <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' containment reference.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(WaitType value);

	/**
	 * Returns the value of the '<em><b>Latches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latches</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latches</em>' containment reference.
	 * @see #setLatches(LatchesType)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Latches()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Latches' namespace='##targetNamespace'"
	 * @generated
	 */
	LatchesType getLatches();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getLatches <em>Latches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latches</em>' containment reference.
	 * @see #getLatches()
	 * @generated
	 */
	void setLatches(LatchesType value);

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
	 * @see #setBoundary(byte)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Boundary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='boundary'"
	 * @generated
	 */
	byte getBoundary();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see #isSetBoundary()
	 * @see #unsetBoundary()
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.ProgrammingType#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoundary()
	 * @see #getBoundary()
	 * @see #setBoundary(byte)
	 * @generated
	 */
	void unsetBoundary();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ProgrammingType#getBoundary <em>Boundary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boundary</em>' attribute is set.
	 * @see #unsetBoundary()
	 * @see #getBoundary()
	 * @see #setBoundary(byte)
	 * @generated
	 */
	boolean isSetBoundary();

	/**
	 * Returns the value of the '<em><b>Csumadd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csumadd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csumadd</em>' attribute.
	 * @see #setCsumadd(String)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Csumadd()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='csumadd'"
	 * @generated
	 */
	String getCsumadd();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getCsumadd <em>Csumadd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csumadd</em>' attribute.
	 * @see #getCsumadd()
	 * @generated
	 */
	void setCsumadd(String value);

	/**
	 * Returns the value of the '<em><b>Erasealgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erasealgo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erasealgo</em>' attribute.
	 * @see #isSetErasealgo()
	 * @see #unsetErasealgo()
	 * @see #setErasealgo(byte)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Erasealgo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='erasealgo'"
	 * @generated
	 */
	byte getErasealgo();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getErasealgo <em>Erasealgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasealgo</em>' attribute.
	 * @see #isSetErasealgo()
	 * @see #unsetErasealgo()
	 * @see #getErasealgo()
	 * @generated
	 */
	void setErasealgo(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.ProgrammingType#getErasealgo <em>Erasealgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetErasealgo()
	 * @see #getErasealgo()
	 * @see #setErasealgo(byte)
	 * @generated
	 */
	void unsetErasealgo();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ProgrammingType#getErasealgo <em>Erasealgo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Erasealgo</em>' attribute is set.
	 * @see #unsetErasealgo()
	 * @see #getErasealgo()
	 * @see #setErasealgo(byte)
	 * @generated
	 */
	boolean isSetErasealgo();

	/**
	 * Returns the value of the '<em><b>Haschecksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Haschecksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haschecksum</em>' attribute.
	 * @see #setHaschecksum(String)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Haschecksum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='haschecksum'"
	 * @generated
	 */
	String getHaschecksum();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getHaschecksum <em>Haschecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haschecksum</em>' attribute.
	 * @see #getHaschecksum()
	 * @generated
	 */
	void setHaschecksum(String value);

	/**
	 * Returns the value of the '<em><b>Hasrowerasecmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasrowerasecmd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasrowerasecmd</em>' attribute.
	 * @see #setHasrowerasecmd(String)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Hasrowerasecmd()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hasrowerasecmd'"
	 * @generated
	 */
	String getHasrowerasecmd();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getHasrowerasecmd <em>Hasrowerasecmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasrowerasecmd</em>' attribute.
	 * @see #getHasrowerasecmd()
	 * @generated
	 */
	void setHasrowerasecmd(String value);

	/**
	 * Returns the value of the '<em><b>Hasvppfirst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasvppfirst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasvppfirst</em>' attribute.
	 * @see #setHasvppfirst(String)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Hasvppfirst()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hasvppfirst'"
	 * @generated
	 */
	String getHasvppfirst();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getHasvppfirst <em>Hasvppfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasvppfirst</em>' attribute.
	 * @see #getHasvppfirst()
	 * @generated
	 */
	void setHasvppfirst(String value);

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
	 * @see crownking.edc.EdcPackage#getProgrammingType_Lvpthresh()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='lvpthresh'"
	 * @generated
	 */
	float getLvpthresh();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getLvpthresh <em>Lvpthresh</em>}' attribute.
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
	 * Unsets the value of the '{@link crownking.edc.ProgrammingType#getLvpthresh <em>Lvpthresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLvpthresh()
	 * @see #getLvpthresh()
	 * @see #setLvpthresh(float)
	 * @generated
	 */
	void unsetLvpthresh();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ProgrammingType#getLvpthresh <em>Lvpthresh</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Memtech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memtech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memtech</em>' attribute.
	 * @see #setMemtech(String)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Memtech()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='memtech'"
	 * @generated
	 */
	String getMemtech();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getMemtech <em>Memtech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memtech</em>' attribute.
	 * @see #getMemtech()
	 * @generated
	 */
	void setMemtech(String value);

	/**
	 * Returns the value of the '<em><b>Ovrpgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ovrpgm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovrpgm</em>' attribute.
	 * @see #isSetOvrpgm()
	 * @see #unsetOvrpgm()
	 * @see #setOvrpgm(byte)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Ovrpgm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='ovrpgm'"
	 * @generated
	 */
	byte getOvrpgm();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getOvrpgm <em>Ovrpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ovrpgm</em>' attribute.
	 * @see #isSetOvrpgm()
	 * @see #unsetOvrpgm()
	 * @see #getOvrpgm()
	 * @generated
	 */
	void setOvrpgm(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.ProgrammingType#getOvrpgm <em>Ovrpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOvrpgm()
	 * @see #getOvrpgm()
	 * @see #setOvrpgm(byte)
	 * @generated
	 */
	void unsetOvrpgm();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ProgrammingType#getOvrpgm <em>Ovrpgm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ovrpgm</em>' attribute is set.
	 * @see #unsetOvrpgm()
	 * @see #getOvrpgm()
	 * @see #setOvrpgm(byte)
	 * @generated
	 */
	boolean isSetOvrpgm();

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
	 * @see #setTries(byte)
	 * @see crownking.edc.EdcPackage#getProgrammingType_Tries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='tries'"
	 * @generated
	 */
	byte getTries();

	/**
	 * Sets the value of the '{@link crownking.edc.ProgrammingType#getTries <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tries</em>' attribute.
	 * @see #isSetTries()
	 * @see #unsetTries()
	 * @see #getTries()
	 * @generated
	 */
	void setTries(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.ProgrammingType#getTries <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTries()
	 * @see #getTries()
	 * @see #setTries(byte)
	 * @generated
	 */
	void unsetTries();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ProgrammingType#getTries <em>Tries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tries</em>' attribute is set.
	 * @see #unsetTries()
	 * @see #getTries()
	 * @see #setTries(byte)
	 * @generated
	 */
	boolean isSetTries();

} // ProgrammingType
