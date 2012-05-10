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
 * A representation of the model object '<em><b>VPP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.VPPType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.VPPType#getDefaultvoltage <em>Defaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.VPPType#getMaxvoltage <em>Maxvoltage</em>}</li>
 *   <li>{@link crownking.edc.VPPType#getMinvoltage <em>Minvoltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getVPPType()
 * @model extendedMetaData="name='VPPType' kind='simple'"
 * @generated
 */
public interface VPPType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getVPPType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.VPPType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Defaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaultvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvoltage</em>' attribute.
	 * @see #isSetDefaultvoltage()
	 * @see #unsetDefaultvoltage()
	 * @see #setDefaultvoltage(float)
	 * @see crownking.edc.EdcPackage#getVPPType_Defaultvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='defaultvoltage'"
	 * @generated
	 */
	float getDefaultvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VPPType#getDefaultvoltage <em>Defaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvoltage</em>' attribute.
	 * @see #isSetDefaultvoltage()
	 * @see #unsetDefaultvoltage()
	 * @see #getDefaultvoltage()
	 * @generated
	 */
	void setDefaultvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VPPType#getDefaultvoltage <em>Defaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultvoltage()
	 * @see #getDefaultvoltage()
	 * @see #setDefaultvoltage(float)
	 * @generated
	 */
	void unsetDefaultvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VPPType#getDefaultvoltage <em>Defaultvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defaultvoltage</em>' attribute is set.
	 * @see #unsetDefaultvoltage()
	 * @see #getDefaultvoltage()
	 * @see #setDefaultvoltage(float)
	 * @generated
	 */
	boolean isSetDefaultvoltage();

	/**
	 * Returns the value of the '<em><b>Maxvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxvoltage</em>' attribute.
	 * @see #isSetMaxvoltage()
	 * @see #unsetMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @see crownking.edc.EdcPackage#getVPPType_Maxvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='maxvoltage'"
	 * @generated
	 */
	float getMaxvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VPPType#getMaxvoltage <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxvoltage</em>' attribute.
	 * @see #isSetMaxvoltage()
	 * @see #unsetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @generated
	 */
	void setMaxvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VPPType#getMaxvoltage <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @generated
	 */
	void unsetMaxvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VPPType#getMaxvoltage <em>Maxvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxvoltage</em>' attribute is set.
	 * @see #unsetMaxvoltage()
	 * @see #getMaxvoltage()
	 * @see #setMaxvoltage(float)
	 * @generated
	 */
	boolean isSetMaxvoltage();

	/**
	 * Returns the value of the '<em><b>Minvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minvoltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minvoltage</em>' attribute.
	 * @see #isSetMinvoltage()
	 * @see #unsetMinvoltage()
	 * @see #setMinvoltage(float)
	 * @see crownking.edc.EdcPackage#getVPPType_Minvoltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='minvoltage'"
	 * @generated
	 */
	float getMinvoltage();

	/**
	 * Sets the value of the '{@link crownking.edc.VPPType#getMinvoltage <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minvoltage</em>' attribute.
	 * @see #isSetMinvoltage()
	 * @see #unsetMinvoltage()
	 * @see #getMinvoltage()
	 * @generated
	 */
	void setMinvoltage(float value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VPPType#getMinvoltage <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinvoltage()
	 * @see #getMinvoltage()
	 * @see #setMinvoltage(float)
	 * @generated
	 */
	void unsetMinvoltage();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VPPType#getMinvoltage <em>Minvoltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minvoltage</em>' attribute is set.
	 * @see #unsetMinvoltage()
	 * @see #getMinvoltage()
	 * @see #setMinvoltage(float)
	 * @generated
	 */
	boolean isSetMinvoltage();

} // VPPType
